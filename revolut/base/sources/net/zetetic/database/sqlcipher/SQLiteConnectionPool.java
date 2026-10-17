package net.zetetic.database.sqlcipher;

import a0.d;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import net.zetetic.database.Logger;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteConnectionPool implements Closeable {
    public final SQLiteDatabaseConfiguration d;
    public int e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f214703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ConnectionWaiter f214704h;
    public ConnectionWaiter i;
    public SQLiteConnection k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CloseGuard f214700a = new CloseGuard();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f214701b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f214702c = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f214705j = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WeakHashMap f214706l = new WeakHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AcquiredConnectionStatus {
        private static final /* synthetic */ AcquiredConnectionStatus[] $VALUES;
        public static final AcquiredConnectionStatus DISCARD;
        public static final AcquiredConnectionStatus NORMAL;
        public static final AcquiredConnectionStatus RECONFIGURE;

        static {
            AcquiredConnectionStatus acquiredConnectionStatus = new AcquiredConnectionStatus("NORMAL", 0);
            NORMAL = acquiredConnectionStatus;
            AcquiredConnectionStatus acquiredConnectionStatus2 = new AcquiredConnectionStatus("RECONFIGURE", 1);
            RECONFIGURE = acquiredConnectionStatus2;
            AcquiredConnectionStatus acquiredConnectionStatus3 = new AcquiredConnectionStatus("DISCARD", 2);
            DISCARD = acquiredConnectionStatus3;
            $VALUES = new AcquiredConnectionStatus[]{acquiredConnectionStatus, acquiredConnectionStatus2, acquiredConnectionStatus3};
        }

        public static AcquiredConnectionStatus valueOf(String str) {
            return (AcquiredConnectionStatus) Enum.valueOf(AcquiredConnectionStatus.class, str);
        }

        public static AcquiredConnectionStatus[] values() {
            return (AcquiredConnectionStatus[]) $VALUES.clone();
        }
    }

    public static final class ConnectionWaiter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConnectionWaiter f214710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Thread f214711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f214712c;
        public int d;
        public boolean e;
        public String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f214713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SQLiteConnection f214714h;
        public RuntimeException i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f214715j;
    }

    public SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.d = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        p();
    }

    public static void f(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.g(false);
        } catch (RuntimeException e) {
            Logger.a("SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection, e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(false);
    }

    public final void d() {
        ArrayList arrayList = this.f214705j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f((SQLiteConnection) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final void finalize() throws Throwable {
        try {
            g(true);
        } finally {
            super.finalize();
        }
    }

    public final void g(boolean z) {
        CloseGuard closeGuard = this.f214700a;
        if (!z || closeGuard.f214676a != null) {
        }
        this.f214700a.f214676a = null;
        if (z) {
            return;
        }
        synchronized (this.f214701b) {
            try {
                q();
                this.f = false;
                d();
                SQLiteConnection sQLiteConnection = this.k;
                if (sQLiteConnection != null) {
                    f(sQLiteConnection);
                    this.k = null;
                }
                int size = this.f214706l.size();
                if (size != 0) {
                    Logger.b().b(4, "SQLiteConnectionPool", "The connection pool for " + this.d.f214730b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.", null);
                }
                t();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void h(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.k = (i & 1) != 0;
            this.f214706l.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e) {
            Logger.b().b(6, "SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i, null);
            f(sQLiteConnection);
            throw e;
        }
    }

    public final void i(int i, long j2) {
        int i2;
        String string;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb6 = new StringBuilder("The connection pool for database '");
        sb6.append(this.d.f214730b);
        sb6.append("' has been unable to grant a connection to thread ");
        sb6.append(threadCurrentThread.getId());
        sb6.append(" (");
        sb6.append(threadCurrentThread.getName());
        sb6.append(") with flags 0x");
        sb6.append(Integer.toHexString(i));
        sb6.append(" for ");
        sb6.append(j2 * 0.001f);
        sb6.append(" seconds.\n");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (this.f214706l.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it8 = this.f214706l.keySet().iterator();
            i2 = 0;
            while (it8.hasNext()) {
                SQLiteConnection.OperationLog operationLog = ((SQLiteConnection) it8.next()).i;
                synchronized (operationLog.f214692a) {
                    try {
                        SQLiteConnection.Operation operation = operationLog.f214692a[operationLog.f214693b];
                        if (operation == null || operation.f214690g) {
                            string = null;
                        } else {
                            StringBuilder sb9 = new StringBuilder();
                            operation.a(sb9);
                            string = sb9.toString();
                        }
                    } finally {
                    }
                }
                if (string != null) {
                    arrayList.add(string);
                    i3++;
                } else {
                    i2++;
                }
            }
        }
        int size = this.f214705j.size();
        if (this.k != null) {
            size++;
        }
        sb6.append("Connections: ");
        sb6.append(i3);
        sb6.append(" active, ");
        sb6.append(i2);
        sb6.append(" idle, ");
        sb6.append(size);
        sb6.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb6.append("\nRequests in progress:\n");
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                d.C(sb6, "  ", (String) it9.next(), "\n");
            }
        }
        Logger.b().b(5, "SQLiteConnectionPool", sb6.toString(), null);
    }

    public final void j(AcquiredConnectionStatus acquiredConnectionStatus) {
        WeakHashMap weakHashMap = this.f214706l;
        if (weakHashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(weakHashMap.size());
        for (Map.Entry entry : weakHashMap.entrySet()) {
            AcquiredConnectionStatus acquiredConnectionStatus2 = (AcquiredConnectionStatus) entry.getValue();
            if (acquiredConnectionStatus != acquiredConnectionStatus2 && acquiredConnectionStatus2 != AcquiredConnectionStatus.DISCARD) {
                arrayList.add((SQLiteConnection) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            weakHashMap.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
        }
    }

    public final SQLiteConnection k(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.f214703g;
        this.f214703g = i + 1;
        SQLiteConnection sQLiteConnection = new SQLiteConnection(this, sQLiteDatabaseConfiguration, i, z);
        try {
            sQLiteConnection.q();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            sQLiteConnection.g(false);
            throw e;
        }
    }

    public final void l(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.f214701b) {
            try {
                q();
                boolean z = ((sQLiteDatabaseConfiguration.f214731c ^ this.d.f214731c) & PKIFailureInfo.duplicateCertReq) != 0;
                if (z) {
                    if (!this.f214706l.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    d();
                }
                this.d.getClass();
                if (!Arrays.equals(sQLiteDatabaseConfiguration.f, this.d.f)) {
                    this.k.e(sQLiteDatabaseConfiguration.f);
                    this.d.a(sQLiteDatabaseConfiguration);
                    d();
                    m();
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.d;
                if (sQLiteDatabaseConfiguration2.f214731c != sQLiteDatabaseConfiguration.f214731c) {
                    if (z) {
                        d();
                        SQLiteConnection sQLiteConnection = this.k;
                        if (sQLiteConnection != null) {
                            f(sQLiteConnection);
                            this.k = null;
                        }
                    }
                    SQLiteConnection sQLiteConnectionK = k(sQLiteDatabaseConfiguration, true);
                    d();
                    SQLiteConnection sQLiteConnection2 = this.k;
                    if (sQLiteConnection2 != null) {
                        f(sQLiteConnection2);
                        this.k = null;
                    }
                    j(AcquiredConnectionStatus.DISCARD);
                    this.k = sQLiteConnectionK;
                    this.d.a(sQLiteDatabaseConfiguration);
                    p();
                } else {
                    sQLiteDatabaseConfiguration2.a(sQLiteDatabaseConfiguration);
                    p();
                    ArrayList arrayList = this.f214705j;
                    int size = arrayList.size();
                    while (true) {
                        int i = size - 1;
                        if (size <= this.e - 1) {
                            break;
                        }
                        f((SQLiteConnection) arrayList.remove(i));
                        size = i;
                    }
                    m();
                }
                t();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void m() {
        SQLiteConnection sQLiteConnection = this.k;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.d;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.s(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                Logger.a("SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.k, e);
                f(this.k);
                this.k = null;
            }
        }
        ArrayList arrayList = this.f214705j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.get(i);
            try {
                sQLiteConnection2.s(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e2) {
                Logger.a("SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e2);
                f(sQLiteConnection2);
                arrayList.remove(i);
                size--;
                i--;
            }
            i++;
        }
        j(AcquiredConnectionStatus.RECONFIGURE);
    }

    public final boolean n(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.s(this.d);
            } catch (RuntimeException e) {
                Logger.a("SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        f(sQLiteConnection);
        return false;
    }

    public final void o(SQLiteConnection sQLiteConnection) {
        synchronized (this.f214701b) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatus = (AcquiredConnectionStatus) this.f214706l.remove(sQLiteConnection);
                if (acquiredConnectionStatus == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.f) {
                    f(sQLiteConnection);
                } else if (sQLiteConnection.e) {
                    if (n(sQLiteConnection, acquiredConnectionStatus)) {
                        this.k = sQLiteConnection;
                    }
                    t();
                } else if (this.f214705j.size() >= this.e - 1) {
                    f(sQLiteConnection);
                } else {
                    if (n(sQLiteConnection, acquiredConnectionStatus)) {
                        this.f214705j.add(sQLiteConnection);
                    }
                    t();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void p() {
        if ((this.d.f214731c & PKIFailureInfo.duplicateCertReq) != 0) {
            this.e = 10;
        } else {
            this.e = 1;
        }
    }

    public final void q() {
        if (!this.f) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    public final SQLiteConnection r(int i, String str) {
        ArrayList arrayList = this.f214705j;
        int size = arrayList.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) arrayList.get(i2);
                if (sQLiteConnection.f214683g.get(str) != null) {
                    arrayList.remove(i2);
                    h(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.remove(size - 1);
            h(sQLiteConnection2, i);
            return sQLiteConnection2;
        }
        int size2 = this.f214706l.size();
        if (this.k != null) {
            size2++;
        }
        if (size2 >= this.e) {
            return null;
        }
        SQLiteConnection sQLiteConnectionK = k(this.d, false);
        h(sQLiteConnectionK, i);
        return sQLiteConnectionK;
    }

    public final SQLiteConnection s(int i) {
        SQLiteConnection sQLiteConnection = this.k;
        if (sQLiteConnection != null) {
            this.k = null;
            h(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator it8 = this.f214706l.keySet().iterator();
        while (it8.hasNext()) {
            if (((SQLiteConnection) it8.next()).e) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionK = k(this.d, true);
        h(sQLiteConnectionK, i);
        return sQLiteConnectionK;
    }

    public final void t() {
        SQLiteConnection sQLiteConnectionS;
        ConnectionWaiter connectionWaiter = this.i;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z3 = false;
        while (connectionWaiter != null) {
            boolean z4 = true;
            if (this.f) {
                try {
                    if (connectionWaiter.e || z) {
                        sQLiteConnectionS = null;
                    } else {
                        sQLiteConnectionS = r(connectionWaiter.f214713g, connectionWaiter.f);
                        if (sQLiteConnectionS == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnectionS == null && !z3 && (sQLiteConnectionS = s(connectionWaiter.f214713g)) == null) {
                        z3 = true;
                    }
                    if (sQLiteConnectionS != null) {
                        connectionWaiter.f214714h = sQLiteConnectionS;
                    } else if (z && z3) {
                        return;
                    } else {
                        z4 = false;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.i = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.f214710a;
            if (z4) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.f214710a = connectionWaiter3;
                } else {
                    this.i = connectionWaiter3;
                }
                connectionWaiter.f214710a = null;
                LockSupport.unpark(connectionWaiter.f214711b);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public final String toString() {
        return "SQLiteConnectionPool: " + this.d.f214729a;
    }
}
