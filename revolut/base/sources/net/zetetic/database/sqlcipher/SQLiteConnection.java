package net.zetetic.database.sqlcipher;

import a0.d;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.WeakHashMap;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f214678m = new String[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f214679n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CloseGuard f214680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteConnectionPool f214681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteDatabaseConfiguration f214682c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PreparedStatementCache f214683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PreparedStatement f214684h;
    public final OperationLog i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f214685j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f214686l;

    public static final class Operation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f214687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f214688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f214689c;
        public String d;
        public String e;
        public ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f214690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public RuntimeException f214691h;
        public int i;

        public final void a(StringBuilder sb6) {
            sb6.append(this.d);
            if (this.f214690g) {
                sb6.append(" took ");
                sb6.append(this.f214689c - this.f214688b);
                sb6.append("ms");
            } else {
                sb6.append(" started ");
                sb6.append(System.currentTimeMillis() - this.f214687a);
                sb6.append("ms ago");
            }
            sb6.append(" - ");
            sb6.append(!this.f214690g ? "running" : this.f214691h != null ? "failed" : "succeeded");
            if (this.e != null) {
                sb6.append(", sql=\"");
                sb6.append(this.e.replaceAll("[\\s]*\\n+[\\s]*", " "));
                sb6.append("\"");
            }
            if (this.f214691h != null) {
                sb6.append(", exception=\"");
                sb6.append(this.f214691h.getMessage());
                sb6.append("\"");
            }
        }
    }

    public static final class OperationLog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Operation[] f214692a = new Operation[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f214693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f214694c;

        public final int a(String str, String str2, Object[] objArr) {
            int i;
            synchronized (this.f214692a) {
                try {
                    int i2 = (this.f214693b + 1) % 20;
                    Operation[] operationArr = this.f214692a;
                    Operation operation = operationArr[i2];
                    if (operation == null) {
                        operation = new Operation();
                        operationArr[i2] = operation;
                    } else {
                        operation.f214690g = false;
                        operation.f214691h = null;
                        ArrayList arrayList = operation.f;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.f214687a = System.currentTimeMillis();
                    operation.f214688b = SystemClock.uptimeMillis();
                    operation.d = str;
                    operation.e = str2;
                    if (objArr != null) {
                        ArrayList arrayList2 = operation.f;
                        if (arrayList2 == null) {
                            operation.f = new ArrayList();
                        } else {
                            arrayList2.clear();
                        }
                        for (Object obj2 : objArr) {
                            if (obj2 == null || !(obj2 instanceof byte[])) {
                                operation.f.add(obj2);
                            } else {
                                operation.f.add(SQLiteConnection.f214679n);
                            }
                        }
                    }
                    int i3 = this.f214694c;
                    this.f214694c = i3 + 1;
                    i = (i3 << 8) | i2;
                    operation.i = i;
                    this.f214693b = i2;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return i;
        }

        public final void b(int i) {
            synchronized (this.f214692a) {
                Operation operation = this.f214692a[i & 255];
                if (operation.i != i) {
                    operation = null;
                }
                if (operation != null) {
                    operation.f214689c = SystemClock.uptimeMillis();
                    operation.f214690g = true;
                }
            }
        }

        public final void c(int i) {
            synchronized (this.f214692a) {
                Operation operation = this.f214692a[i & 255];
                if (operation.i != i) {
                    operation = null;
                }
                if (operation != null) {
                    operation.f214689c = SystemClock.uptimeMillis();
                    operation.f214690g = true;
                }
            }
        }

        public final void d(RuntimeException runtimeException, int i) {
            synchronized (this.f214692a) {
                try {
                    Operation operation = this.f214692a[i & 255];
                    if (operation.i != i) {
                        operation = null;
                    }
                    if (operation != null) {
                        operation.f214691h = runtimeException;
                    }
                } finally {
                }
            }
        }
    }

    public static final class PreparedStatement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PreparedStatement f214695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f214696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f214697c;
        public int d;
        public boolean e;
        public boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f214698g;
    }

    public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            PreparedStatement preparedStatement3 = preparedStatement;
            preparedStatement3.f = false;
            if (preparedStatement3.f214698g) {
                return;
            }
            SQLiteConnection.this.o(preparedStatement3);
        }
    }

    public SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        CloseGuard closeGuard = new CloseGuard();
        this.f214680a = closeGuard;
        this.i = new OperationLog();
        this.f214681b = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.f214682c = sQLiteDatabaseConfiguration2;
        this.d = i;
        this.e = z;
        this.f = (sQLiteDatabaseConfiguration.f214731c & 1) != 0;
        this.f214683g = new PreparedStatementCache(sQLiteDatabaseConfiguration2.d);
        closeGuard.a();
    }

    public static String d(String str) {
        return str.equals("0") ? "OFF" : str.equals("1") ? "NORMAL" : str.equals("2") ? "FULL" : str;
    }

    private static native void nativeBindBlob(long j2, long j3, int i, byte[] bArr);

    private static native void nativeBindDouble(long j2, long j3, int i, double d);

    private static native void nativeBindLong(long j2, long j3, int i, long j5);

    private static native void nativeBindNull(long j2, long j3, int i);

    private static native void nativeBindString(long j2, long j3, int i, String str);

    private static native void nativeCancel(long j2);

    private static native void nativeClose(long j2);

    private static native void nativeExecute(long j2, long j3);

    private static native int nativeExecuteForBlobFileDescriptor(long j2, long j3);

    private static native int nativeExecuteForChangedRowCount(long j2, long j3);

    private static native long nativeExecuteForCursorWindow(long j2, long j3, long j5, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j2, long j3);

    private static native long nativeExecuteForLong(long j2, long j3);

    private static native String nativeExecuteForString(long j2, long j3);

    private static native void nativeExecuteRaw(long j2, long j3);

    private static native void nativeFinalizeStatement(long j2, long j3);

    private static native int nativeGetColumnCount(long j2, long j3);

    private static native String nativeGetColumnName(long j2, long j3, int i);

    private static native int nativeGetDbLookaside(long j2);

    private static native int nativeGetParameterCount(long j2, long j3);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j2, long j3);

    private static native int nativeKey(long j2, byte[] bArr);

    private static native long nativeOpen(String str, int i, String str2, boolean z, boolean z3);

    private static native long nativePrepareStatement(long j2, String str);

    private static native int nativeReKey(long j2, byte[] bArr);

    private static native void nativeRegisterCustomFunction(long j2, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j2, String str);

    private static native void nativeResetCancel(long j2, boolean z);

    private static native void nativeResetStatementAndClearBindings(long j2, long j3);

    public static boolean p() {
        return nativeHasCodec();
    }

    public final PreparedStatement a(String str) {
        boolean z;
        PreparedStatementCache preparedStatementCache = this.f214683g;
        PreparedStatement preparedStatement = preparedStatementCache.get(str);
        if (preparedStatement == null) {
            z = false;
        } else {
            if (!preparedStatement.f214698g) {
                return preparedStatement;
            }
            z = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.f214685j, str);
        try {
            int iNativeGetParameterCount = nativeGetParameterCount(this.f214685j, jNativePrepareStatement);
            int iA = DatabaseUtils.a(str);
            boolean zNativeIsReadOnly = nativeIsReadOnly(this.f214685j, jNativePrepareStatement);
            PreparedStatement preparedStatement2 = this.f214684h;
            if (preparedStatement2 != null) {
                this.f214684h = preparedStatement2.f214695a;
                preparedStatement2.f214695a = null;
                preparedStatement2.f = false;
            } else {
                preparedStatement2 = new PreparedStatement();
            }
            preparedStatement2.f214696b = str;
            preparedStatement2.f214697c = jNativePrepareStatement;
            preparedStatement2.d = iNativeGetParameterCount;
            preparedStatement2.e = zNativeIsReadOnly;
            if (!z && (iA == 2 || iA == 1)) {
                try {
                    preparedStatementCache.put(str, preparedStatement2);
                    preparedStatement2.f = true;
                } catch (RuntimeException e) {
                    e = e;
                    preparedStatement = preparedStatement2;
                    if (preparedStatement == null || !preparedStatement.f) {
                        nativeFinalizeStatement(this.f214685j, jNativePrepareStatement);
                    }
                    throw e;
                }
            }
            preparedStatement2.f214698g = true;
            return preparedStatement2;
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    public final void b(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i = this.f214686l + 1;
            this.f214686l = i;
            if (i == 1) {
                nativeResetCancel(this.f214685j, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    public final void c(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.d) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.d + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long j2 = preparedStatement.f214697c;
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            int iB = DatabaseUtils.b(obj2);
            if (iB == 0) {
                nativeBindNull(this.f214685j, j2, i + 1);
            } else if (iB == 1) {
                nativeBindLong(this.f214685j, j2, i + 1, ((Number) obj2).longValue());
            } else if (iB == 2) {
                nativeBindDouble(this.f214685j, j2, i + 1, ((Number) obj2).doubleValue());
            } else if (iB == 4) {
                nativeBindBlob(this.f214685j, j2, i + 1, (byte[]) obj2);
            } else if (obj2 instanceof Boolean) {
                nativeBindLong(this.f214685j, j2, i + 1, ((Boolean) obj2).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.f214685j, j2, i + 1, obj2.toString());
            }
        }
    }

    public final void e(byte[] bArr) {
        int iNativeReKey = nativeReKey(this.f214685j, bArr);
        Logger.b().b(4, "SQLiteConnection", d.n("Database rekey operation returned:", iNativeReKey), null);
        if (iNativeReKey != 0) {
            throw new SQLiteException(d.n("Failed to rekey database, result code:", iNativeReKey));
        }
    }

    public final void f(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i = this.f214686l - 1;
            this.f214686l = i;
            if (i == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.f214685j, false);
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.f214681b;
            if (this.f214685j != 0) {
                Logger.b().b(5, "SQLiteConnectionPool", "A SQLiteConnection object for database '" + sQLiteConnectionPool.d.f214730b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.", null);
                sQLiteConnectionPool.f214702c.set(true);
            }
            g(true);
        } finally {
            super.finalize();
        }
    }

    public final void g(boolean z) {
        CloseGuard closeGuard = this.f214680a;
        if (!z || closeGuard.f214676a != null) {
        }
        closeGuard.f214676a = null;
        if (this.f214685j != 0) {
            OperationLog operationLog = this.i;
            int iA = operationLog.a("close", null, null);
            try {
                this.f214683g.evictAll();
                nativeClose(this.f214685j);
                this.f214685j = 0L;
            } finally {
                operationLog.b(iA);
            }
        }
    }

    public final void h(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("execute", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    b(cancellationSignal);
                    try {
                        nativeExecute(this.f214685j, preparedStatementA.f214697c);
                    } finally {
                        f(cancellationSignal);
                    }
                } finally {
                    t(preparedStatementA);
                }
            } finally {
                operationLog.b(iA);
            }
        } catch (RuntimeException e) {
            operationLog.d(e, iA);
            throw e;
        }
    }

    public final int i(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForChangedRowCount(this.f214685j, preparedStatementA.f214697c);
                } finally {
                    t(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.c(iA);
        }
    }

    public final int j(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, CancellationSignal cancellationSignal) {
        OperationLog operationLog = this.i;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        cursorWindow.d();
        try {
            int iA = operationLog.a("executeForCursorWindow", str, objArr);
            try {
                try {
                    PreparedStatement preparedStatementA = a(str);
                    try {
                        x(preparedStatementA);
                        c(preparedStatementA, objArr);
                        b(cancellationSignal);
                        try {
                            long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.f214685j, preparedStatementA.f214697c, cursorWindow.f214668b, i, i2, z);
                            int i3 = (int) jNativeExecuteForCursorWindow;
                            cursorWindow.l();
                            cursorWindow.f214669c = (int) (jNativeExecuteForCursorWindow >> 32);
                            return i3;
                        } finally {
                            f(cancellationSignal);
                        }
                    } finally {
                        t(preparedStatementA);
                    }
                } finally {
                    operationLog.c(iA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            cursorWindow.g();
        }
    }

    public final long k(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForLastInsertedRowId(this.f214685j, preparedStatementA.f214697c);
                } finally {
                    t(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final long l(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForLong(this.f214685j, preparedStatementA.f214697c);
                } finally {
                    t(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final String m(String str) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForString", str, null);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, null);
                    return nativeExecuteForString(this.f214685j, preparedStatementA.f214697c);
                } finally {
                    t(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final void n(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeRaw", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    nativeExecuteRaw(this.f214685j, preparedStatementA.f214697c);
                } finally {
                    t(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.c(iA);
        }
    }

    public final void o(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.f214685j, preparedStatement.f214697c);
        preparedStatement.f214696b = null;
        preparedStatement.f214695a = this.f214684h;
        this.f214684h = preparedStatement;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        nativeCancel(this.f214685j);
    }

    public final void q() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f214682c;
        this.f214685j = nativeOpen(sQLiteDatabaseConfiguration.f214729a, sQLiteDatabaseConfiguration.f214731c, sQLiteDatabaseConfiguration.f214730b, SQLiteDebug.f214734a, SQLiteDebug.f214735b);
        SQLiteDatabaseHook sQLiteDatabaseHook = this.f214682c.f214732g;
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.i(this);
        }
        byte[] bArr = this.f214682c.f;
        if (bArr != null && bArr.length > 0) {
            Logger.b().b(4, "SQLiteConnection", d.n("Database keying operation returned:", nativeKey(this.f214685j, bArr)), null);
        }
        SQLiteDatabaseHook sQLiteDatabaseHook2 = this.f214682c.f214732g;
        if (sQLiteDatabaseHook2 != null) {
            sQLiteDatabaseHook2.a(this);
        }
        byte[] bArr2 = this.f214682c.f;
        if (bArr2 != null && bArr2.length > 0) {
            l("SELECT COUNT(*) FROM sqlite_schema;", null);
        }
        if (!this.f214682c.f214729a.equalsIgnoreCase(":memory:") && !this.f) {
            WeakHashMap weakHashMap = SQLiteDatabase.f214722j;
            if (!nativeHasCodec()) {
                synchronized (SQLiteGlobal.f214739a) {
                    try {
                        if (SQLiteGlobal.f214740b == 0) {
                            SQLiteGlobal.f214740b = new StatFs("/data").getBlockSize();
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                if (l("PRAGMA page_size", null) != 4096) {
                    h("PRAGMA page_size=4096", null, null);
                }
            }
        }
        if (!this.f) {
            this.f214682c.getClass();
            if (l("PRAGMA foreign_keys", null) != 0) {
                h(a.m(0L, "PRAGMA foreign_keys="), null, null);
            }
        }
        if (!this.f214682c.f214729a.equalsIgnoreCase(":memory:") && !this.f) {
            if (l("PRAGMA journal_size_limit", null) != 10000) {
                l("PRAGMA journal_size_limit=10000", null);
            }
        }
        if (!this.f214682c.f214729a.equalsIgnoreCase(":memory:") && !this.f) {
            long jMax = Math.max(1, 1000);
            if (l("PRAGMA wal_autocheckpoint", null) != jMax) {
                l("PRAGMA wal_autocheckpoint=" + jMax, null);
            }
        }
        w();
        if (!nativeHasCodec()) {
            v();
        }
        int size = this.f214682c.f214733h.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.f214685j, (SQLiteCustomFunction) this.f214682c.f214733h.get(i));
        }
    }

    public final void r(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        OperationLog operationLog = this.i;
        int iA = operationLog.a("prepare", str, null);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    sQLiteStatementInfo.f214757a = preparedStatementA.d;
                    sQLiteStatementInfo.f214759c = preparedStatementA.e;
                    int iNativeGetColumnCount = nativeGetColumnCount(this.f214685j, preparedStatementA.f214697c);
                    if (iNativeGetColumnCount == 0) {
                        sQLiteStatementInfo.f214758b = f214678m;
                    } else {
                        sQLiteStatementInfo.f214758b = new String[iNativeGetColumnCount];
                        for (int i = 0; i < iNativeGetColumnCount; i++) {
                            sQLiteStatementInfo.f214758b[i] = nativeGetColumnName(this.f214685j, preparedStatementA.f214697c, i);
                        }
                    }
                    t(preparedStatementA);
                } catch (Throwable th10) {
                    t(preparedStatementA);
                    throw th10;
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final void s(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2;
        this.k = false;
        int size = sQLiteDatabaseConfiguration.f214733h.size();
        int i = 0;
        while (true) {
            sQLiteDatabaseConfiguration2 = this.f214682c;
            if (i >= size) {
                break;
            }
            SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) sQLiteDatabaseConfiguration.f214733h.get(i);
            if (!sQLiteDatabaseConfiguration2.f214733h.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f214685j, sQLiteCustomFunction);
            }
            i++;
        }
        sQLiteDatabaseConfiguration2.getClass();
        boolean z = ((sQLiteDatabaseConfiguration.f214731c ^ sQLiteDatabaseConfiguration2.f214731c) & PKIFailureInfo.duplicateCertReq) != 0;
        boolean zEquals = sQLiteDatabaseConfiguration.e.equals(sQLiteDatabaseConfiguration2.e);
        sQLiteDatabaseConfiguration2.a(sQLiteDatabaseConfiguration);
        if (z) {
            w();
        }
        if (zEquals) {
            return;
        }
        v();
    }

    public final void t(PreparedStatement preparedStatement) {
        preparedStatement.f214698g = false;
        if (!preparedStatement.f) {
            o(preparedStatement);
            return;
        }
        try {
            nativeResetStatementAndClearBindings(this.f214685j, preparedStatement.f214697c);
        } catch (SQLiteException unused) {
            this.f214683g.remove(preparedStatement.f214696b);
        }
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("SQLiteConnection: ");
        sb6.append(this.f214682c.f214729a);
        sb6.append(" (");
        return j6.a.v(sb6, ")", this.d);
    }

    public final void u(String str) {
        String strM = m("PRAGMA journal_mode");
        if (strM.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (m("PRAGMA journal_mode=".concat(str)).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException unused) {
        }
        StringBuilder sb6 = new StringBuilder("Could not change the database journal mode of '");
        j6.a.D(sb6, this.f214682c.f214730b, "' from '", strM, "' to '");
        Logger.b().b(5, "SQLiteConnection", v0.a.i(sb6, str, "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode."), null);
    }

    public final void v() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f214682c;
        if ((sQLiteDatabaseConfiguration.f214731c & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.e.toString();
        nativeRegisterLocalizedCollators(this.f214685j, string);
        if (this.f) {
            return;
        }
        try {
            h("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String strM = m("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1");
            if (strM == null || !strM.equals(string)) {
                h("BEGIN", null, null);
                try {
                    h("DELETE FROM android_metadata", null, null);
                    h("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
                    h("REINDEX LOCALIZED", null, null);
                    h("COMMIT", null, null);
                } catch (Throwable th10) {
                    h("ROLLBACK", null, null);
                    throw th10;
                }
            }
        } catch (RuntimeException e) {
            throw new SQLiteException(j6.a.w(new StringBuilder("Failed to change locale for db '"), sQLiteDatabaseConfiguration.f214730b, "' to '", string, "'."), e);
        }
    }

    public final void w() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f214682c;
        if (sQLiteDatabaseConfiguration.f214729a.equalsIgnoreCase(":memory:") || this.f) {
            return;
        }
        if ((sQLiteDatabaseConfiguration.f214731c & PKIFailureInfo.duplicateCertReq) != 0) {
            u("WAL");
            if (d(m("PRAGMA synchronous")).equalsIgnoreCase(d("normal"))) {
                return;
            }
            h("PRAGMA synchronous=".concat("normal"), null, null);
            return;
        }
        u("delete");
        if (d(m("PRAGMA synchronous")).equalsIgnoreCase(d("normal"))) {
            return;
        }
        h("PRAGMA synchronous=".concat("normal"), null, null);
    }

    public final void x(PreparedStatement preparedStatement) {
        if (this.k && !preparedStatement.e) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }
}
