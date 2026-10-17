package net.zetetic.database.sqlcipher;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.Logger;
import net.zetetic.database.sqlcipher.SQLiteSession;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteDatabase extends SQLiteClosable implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final WeakHashMap f214722j = new WeakHashMap();
    public static final String[] k = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CursorFactory f214724c;
    public final DatabaseErrorHandler d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SQLiteDatabaseConfiguration f214725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SQLiteConnectionPool f214726h;
    public boolean i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f214723b = new ThreadLocal<SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        @Override // java.lang.ThreadLocal
        public final SQLiteSession initialValue() {
            SQLiteConnectionPool sQLiteConnectionPool;
            SQLiteDatabase sQLiteDatabase = SQLiteDatabase.this;
            synchronized (sQLiteDatabase.e) {
                sQLiteDatabase.x();
                sQLiteConnectionPool = sQLiteDatabase.f214726h;
            }
            return new SQLiteSession(sQLiteConnectionPool);
        }
    };
    public final Object e = new Object();
    public final CloseGuard f = new CloseGuard();

    /* JADX INFO: renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$2, reason: invalid class name */
    class AnonymousClass2 implements SQLiteTransactionListener {
    }

    /* JADX INFO: renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$3, reason: invalid class name */
    class AnonymousClass3 implements SQLiteTransactionListener {
    }

    public interface CursorFactory {
        Cursor a();
    }

    public interface CustomFunction {
        void a();
    }

    public SQLiteDatabase(int i, String str, DatabaseErrorHandler databaseErrorHandler, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, byte[] bArr) {
        this.f214724c = cursorFactory;
        this.d = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.f214725g = new SQLiteDatabaseConfiguration(str, i, bArr, sQLiteDatabaseHook);
    }

    public static boolean i(File file) {
        boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.4
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
        }
        return zDelete;
    }

    public static int n(boolean z) {
        int i = z ? 1 : 2;
        Looper looperMyLooper = Looper.myLooper();
        return (looperMyLooper == null || looperMyLooper != Looper.getMainLooper()) ? i : i | 4;
    }

    public static SQLiteDatabase r(int i, String str, DatabaseErrorHandler databaseErrorHandler, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(i, str, databaseErrorHandler, cursorFactory, sQLiteDatabaseHook, bArr);
        try {
            try {
                sQLiteDatabase.t();
                return sQLiteDatabase;
            } catch (SQLiteDatabaseCorruptException unused) {
                synchronized (sQLiteDatabase.e) {
                    EventLog.writeEvent(75004, sQLiteDatabase.f214725g.f214730b);
                    sQLiteDatabase.d.a(sQLiteDatabase);
                    sQLiteDatabase.t();
                    return sQLiteDatabase;
                }
            }
        } catch (SQLiteException e) {
            StringBuilder sb6 = new StringBuilder("Failed to open database '");
            synchronized (sQLiteDatabase.e) {
                sb6.append(sQLiteDatabase.f214725g.f214730b);
                sb6.append("'.");
                Logger.a("SQLiteDatabase", sb6.toString(), e);
                sQLiteDatabase.g();
                throw e;
            }
        }
    }

    public static SQLiteDatabase s(String str, String str2) {
        return r(0, str, null, null, null, (str2 == null || str2.length() == 0) ? new byte[0] : str2.getBytes(Charset.forName("UTF-8")));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        h(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        h(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String str) {
        d();
        try {
            return new SQLiteStatement(this, str, null, null);
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int delete(String str, String str2, Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = objArr[i].toString();
        }
        d();
        try {
            StringBuilder sb6 = new StringBuilder("DELETE FROM ");
            sb6.append(str);
            sb6.append(TextUtils.isEmpty(str2) ? "" : " WHERE " + str2);
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb6.toString(), strArr, null);
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
                g();
                return iExecuteUpdateDelete;
            } finally {
                sQLiteStatement.g();
            }
        } catch (Throwable th10) {
            g();
            throw th10;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void endTransaction() {
        d();
        try {
            o().c(null);
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str) {
        m(str, null);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void f() {
        k(false);
    }

    public final void finalize() throws Throwable {
        try {
            k(true);
        } finally {
            super.finalize();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List getAttachedDbs() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            try {
                Cursor cursorV = null;
                if (this.f214726h == null) {
                    return null;
                }
                if (!this.i) {
                    arrayList.add(new Pair("main", this.f214725g.f214729a));
                    return arrayList;
                }
                d();
                try {
                    try {
                        cursorV = v();
                        while (cursorV.moveToNext()) {
                            arrayList.add(new Pair(cursorV.getString(1), cursorV.getString(2)));
                        }
                        cursorV.close();
                        return arrayList;
                    } catch (Throwable th10) {
                        if (cursorV != null) {
                            cursorV.close();
                        }
                        throw th10;
                    }
                } finally {
                    g();
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        String str;
        synchronized (this.e) {
            str = this.f214725g.f214729a;
        }
        return str;
    }

    public final void h(boolean z) {
        d();
        try {
            o().b(z ? 2 : 1, n(false), null);
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        d();
        try {
            return o().e != null;
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long insert(String str, int i, ContentValues contentValues) {
        Object[] objArr;
        d();
        try {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("INSERT");
            sb6.append(k[i]);
            sb6.append(" INTO ");
            sb6.append(str);
            sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            int i2 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new Object[size];
                int i3 = 0;
                for (String str2 : contentValues.keySet()) {
                    sb6.append(i3 > 0 ? "," : "");
                    sb6.append(str2);
                    objArr[i3] = contentValues.get(str2);
                    i3++;
                }
                sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                sb6.append(" VALUES (");
                while (i2 < size) {
                    sb6.append(i2 > 0 ? ",?" : "?");
                    i2++;
                }
            } else {
                sb6.append("null) VALUES (NULL");
                objArr = null;
            }
            sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb6.toString(), objArr, null);
            try {
                long jExecuteInsert = sQLiteStatement.executeInsert();
                g();
                return jExecuteInsert;
            } finally {
                sQLiteStatement.g();
            }
        } catch (Throwable th10) {
            g();
            throw th10;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        boolean z;
        synchronized (this.e) {
            z = this.f214726h != null;
        }
        return z;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        boolean z;
        synchronized (this.e) {
            x();
            z = (this.f214725g.f214731c & PKIFailureInfo.duplicateCertReq) != 0;
        }
        return z;
    }

    public final void j() {
        synchronized (this.e) {
            try {
                x();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f214725g;
                int i = sQLiteDatabaseConfiguration.f214731c;
                if ((i & PKIFailureInfo.duplicateCertReq) == 0) {
                    return;
                }
                sQLiteDatabaseConfiguration.f214731c = i & (-536870913);
                try {
                    this.f214726h.l(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f214725g;
                    sQLiteDatabaseConfiguration2.f214731c = 536870912 | sQLiteDatabaseConfiguration2.f214731c;
                    throw e;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void k(boolean z) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.e) {
            try {
                CloseGuard closeGuard = this.f;
                if (closeGuard != null) {
                    if (z && closeGuard.f214676a != null) {
                    }
                    this.f.f214676a = null;
                }
                sQLiteConnectionPool = this.f214726h;
                this.f214726h = null;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z) {
            return;
        }
        WeakHashMap weakHashMap = f214722j;
        synchronized (weakHashMap) {
            weakHashMap.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.g(false);
        }
    }

    public final void l() {
        synchronized (this.e) {
            try {
                x();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f214725g;
                int i = sQLiteDatabaseConfiguration.f214731c;
                if ((i & PKIFailureInfo.duplicateCertReq) != 0) {
                    return;
                }
                boolean z = true;
                if ((i & 1) != 1) {
                    z = false;
                }
                if (z) {
                    return;
                }
                if (sQLiteDatabaseConfiguration.f214729a.equalsIgnoreCase(":memory:")) {
                    Logger.b().b(4, "SQLiteDatabase", "can't enable WAL for memory databases.", null);
                    return;
                }
                if (this.i) {
                    if (Logger.b().a("SQLiteDatabase", 3)) {
                        Logger.b().b(3, "SQLiteDatabase", "this database: " + this.f214725g.f214730b + " has attached databases. can't  enable WAL.", null);
                    }
                    return;
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f214725g;
                sQLiteDatabaseConfiguration2.f214731c |= PKIFailureInfo.duplicateCertReq;
                try {
                    this.f214726h.l(sQLiteDatabaseConfiguration2);
                } catch (RuntimeException e) {
                    this.f214725g.f214731c &= -536870913;
                    throw e;
                }
            } finally {
            }
        }
    }

    public final void m(String str, Object[] objArr) {
        boolean z;
        d();
        try {
            if (DatabaseUtils.a(str) == 3) {
                synchronized (this.e) {
                    try {
                        if (this.i) {
                            z = false;
                        } else {
                            z = true;
                            this.i = true;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                if (z) {
                    j();
                }
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr, null);
            try {
                sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.g();
            }
        } finally {
            g();
        }
    }

    public final SQLiteSession o() {
        return (SQLiteSession) this.f214723b.get();
    }

    public final int p() {
        d();
        try {
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, "PRAGMA user_version;", null, null);
            try {
                sQLiteStatement.d();
                try {
                    try {
                        long jH = sQLiteStatement.f214748b.o().h(sQLiteStatement.i(), sQLiteStatement.f214749c, sQLiteStatement.f214750g);
                        sQLiteStatement.g();
                        return Long.valueOf(jH).intValue();
                    } finally {
                        sQLiteStatement.g();
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    sQLiteStatement.j(e);
                    throw e;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        } finally {
            g();
        }
    }

    public final boolean q() {
        boolean z;
        synchronized (this.e) {
            z = true;
            if ((this.f214725g.f214731c & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        d();
        try {
            SQLiteSession.Transaction transaction = o().e;
            if (transaction == null) {
                throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
            }
            if (transaction.f214755b) {
                throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
            }
            transaction.f214755b = true;
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        m("PRAGMA user_version = " + i, null);
    }

    public final void t() {
        synchronized (this.e) {
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f214725g;
            if (sQLiteDatabaseConfiguration == null) {
                throw new IllegalArgumentException("configuration must not be null.");
            }
            SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
            sQLiteConnectionPool.k = sQLiteConnectionPool.k(sQLiteConnectionPool.d, true);
            sQLiteConnectionPool.f = true;
            sQLiteConnectionPool.f214700a.a();
            this.f214726h = sQLiteConnectionPool;
            this.f.a();
        }
        WeakHashMap weakHashMap = f214722j;
        synchronized (weakHashMap) {
            weakHashMap.put(this, null);
        }
    }

    public final String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    public final void u(Object... objArr) {
        d();
        try {
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, "select sqlcipher_export('migrated');", objArr, null);
            try {
                sQLiteStatement.d();
                try {
                    sQLiteStatement.f214748b.o().i(sQLiteStatement.i(), sQLiteStatement.f214749c, sQLiteStatement.f214750g);
                    sQLiteStatement.g();
                } catch (SQLiteDatabaseCorruptException e) {
                    sQLiteStatement.j(e);
                    throw e;
                }
            } catch (Throwable th10) {
                throw th10;
            } finally {
                sQLiteStatement.g();
            }
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int i2 = 0;
        int length = objArr == null ? 0 : objArr.length;
        String[] strArr = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr[i3] = objArr[i3].toString();
        }
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        d();
        try {
            StringBuilder sb6 = new StringBuilder(SyslogConstants.LOG_CLOCK);
            sb6.append("UPDATE ");
            sb6.append(k[i]);
            sb6.append(str);
            sb6.append(" SET ");
            int size = contentValues.size();
            int i5 = length + size;
            Object[] objArr2 = new Object[i5];
            for (String str3 : contentValues.keySet()) {
                sb6.append(i2 > 0 ? "," : "");
                sb6.append(str3);
                objArr2[i2] = contentValues.get(str3);
                sb6.append("=?");
                i2++;
            }
            for (int i6 = size; i6 < i5; i6++) {
                objArr2[i6] = strArr[i6 - size];
            }
            if (!TextUtils.isEmpty(str2)) {
                sb6.append(" WHERE ");
                sb6.append(str2);
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb6.toString(), objArr2, null);
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
                g();
                return iExecuteUpdateDelete;
            } finally {
                sQLiteStatement.g();
            }
        } catch (Throwable th10) {
            g();
            throw th10;
        }
    }

    public final Cursor v() {
        d();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, "pragma database_list;", null, null);
            CursorFactory cursorFactory = this.f214724c;
            String str = sQLiteDirectCursorDriver.f214737b;
            SQLiteQuery sQLiteQuery = new SQLiteQuery(sQLiteDirectCursorDriver.f214736a, sQLiteDirectCursorDriver.f214738c, sQLiteDirectCursorDriver.d);
            try {
                return cursorFactory == null ? new SQLiteCursor(sQLiteDirectCursorDriver, str, sQLiteQuery) : cursorFactory.a();
            } catch (RuntimeException e) {
                sQLiteQuery.g();
                throw e;
            }
        } finally {
            g();
        }
    }

    public final void w() {
        synchronized (this.e) {
            try {
                x();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f214725g;
                int i = sQLiteDatabaseConfiguration.f214731c;
                boolean z = true;
                if ((i & 1) != 1) {
                    z = false;
                }
                if (z) {
                    sQLiteDatabaseConfiguration.f214731c = i & (-2);
                    try {
                        this.f214726h.l(sQLiteDatabaseConfiguration);
                    } catch (RuntimeException e) {
                        this.f214725g.f214731c = i;
                        throw e;
                    }
                }
            } finally {
            }
        }
    }

    public final void x() {
        if (this.f214726h == null) {
            throw new IllegalStateException(a.i(new StringBuilder("The database '"), this.f214725g.f214730b, "' is not open."));
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str, Object[] objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        m(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        d();
        try {
            String query = supportSQLiteQuery.getQuery();
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, query, "", cancellationSignal);
            SQLiteQuery sQLiteQuery = new SQLiteQuery(this, query, cancellationSignal);
            supportSQLiteQuery.bindTo(sQLiteQuery);
            return new SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String str) {
        Cursor cursorA;
        d();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null, null);
            CursorFactory cursorFactory = this.f214724c;
            String str2 = sQLiteDirectCursorDriver.f214737b;
            SQLiteQuery sQLiteQuery = new SQLiteQuery(sQLiteDirectCursorDriver.f214736a, sQLiteDirectCursorDriver.f214738c, sQLiteDirectCursorDriver.d);
            try {
                if (cursorFactory == null) {
                    cursorA = new SQLiteCursor(sQLiteDirectCursorDriver, str2, sQLiteQuery);
                } else {
                    cursorA = cursorFactory.a();
                }
                return cursorA;
            } catch (RuntimeException e) {
                sQLiteQuery.g();
                throw e;
            }
        } finally {
            g();
        }
    }
}
