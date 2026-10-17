package net.zetetic.database.sqlcipher;

import a0.d;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.Logger;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f214741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteDatabase.CursorFactory f214743c;
    public final int d;
    public final int e;
    public SQLiteDatabase f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f214744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f214745h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DatabaseErrorHandler f214746j;
    public final SQLiteDatabaseHook k;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f214745h) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f.g();
            this.f = null;
        }
    }

    public final SQLiteDatabase d(boolean z) {
        Context context = this.f214741a;
        SQLiteDatabase sQLiteDatabase = this.f;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.f = null;
            } else if (!z || !this.f.q()) {
                return this.f;
            }
        }
        if (this.f214745h) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseR = this.f;
        try {
            this.f214745h = true;
            String str = this.f214742b;
            if (sQLiteDatabaseR != null) {
                if (z && sQLiteDatabaseR.q()) {
                    sQLiteDatabaseR.w();
                }
            } else if (str == null) {
                sQLiteDatabaseR = SQLiteDatabase.r(268435456, ":memory:", null, null, null, new byte[0]);
            } else {
                try {
                    String path = !str.startsWith("file:") ? context.getDatabasePath(str).getPath() : str;
                    File file = new File(new File(path).getParent());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    sQLiteDatabaseR = SQLiteDatabase.r(this.i ? 805306368 : 268435456, path, this.f214746j, this.f214743c, this.k, this.f214744g);
                } catch (SQLiteException e) {
                    if (z) {
                        throw e;
                    }
                    Logger.a("SQLiteOpenHelper", "Couldn't open " + str + " for writing (will try read-only):", e);
                    sQLiteDatabaseR = SQLiteDatabase.r(1, context.getDatabasePath(str).getPath(), this.f214746j, this.f214743c, this.k, this.f214744g);
                }
            }
            f(sQLiteDatabaseR);
            int iP = sQLiteDatabaseR.p();
            int i = this.d;
            if (iP != i) {
                if (sQLiteDatabaseR.q()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseR.p() + " to " + i + ": " + str);
                }
                if (iP > 0 && iP < this.e) {
                    File file2 = new File(sQLiteDatabaseR.getPath());
                    sQLiteDatabaseR.g();
                    if (!SQLiteDatabase.i(file2)) {
                        throw new IllegalStateException("Unable to delete obsolete database " + str + " with version " + iP);
                    }
                    this.f214745h = false;
                    SQLiteDatabase sQLiteDatabaseD = d(z);
                    this.f214745h = false;
                    if (sQLiteDatabaseR != this.f) {
                        sQLiteDatabaseR.g();
                    }
                    return sQLiteDatabaseD;
                }
                sQLiteDatabaseR.h(true);
                try {
                    if (iP == 0) {
                        g(sQLiteDatabaseR);
                    } else if (iP > i) {
                        h(sQLiteDatabaseR, iP, i);
                    } else {
                        j(sQLiteDatabaseR, iP, i);
                    }
                    sQLiteDatabaseR.setVersion(i);
                    sQLiteDatabaseR.setTransactionSuccessful();
                    sQLiteDatabaseR.endTransaction();
                } catch (Throwable th10) {
                    sQLiteDatabaseR.endTransaction();
                    throw th10;
                }
            }
            i(sQLiteDatabaseR);
            if (sQLiteDatabaseR.q()) {
                Logger.b().b(5, "SQLiteOpenHelper", "Opened " + str + " in read-only mode", null);
            }
            this.f = sQLiteDatabaseR;
            this.f214745h = false;
            return sQLiteDatabaseR;
        } catch (Throwable th11) {
            this.f214745h = false;
            if (sQLiteDatabaseR != null && sQLiteDatabaseR != this.f) {
                sQLiteDatabaseR.g();
            }
            throw th11;
        }
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void g(SQLiteDatabase sQLiteDatabase);

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: getDatabaseName */
    public final String getName() {
        return this.f214742b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabaseD;
        synchronized (this) {
            sQLiteDatabaseD = d(false);
        }
        return sQLiteDatabaseD;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabaseD;
        synchronized (this) {
            sQLiteDatabaseD = d(true);
        }
        return sQLiteDatabaseD;
    }

    public void h(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException(d.g(i, i2, "Can't downgrade database from version ", " to "));
    }

    public void i(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void j(SQLiteDatabase sQLiteDatabase, int i, int i2);

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            try {
                if (this.i != z) {
                    SQLiteDatabase sQLiteDatabase = this.f;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.f.q()) {
                        if (z) {
                            this.f.l();
                        } else {
                            this.f.j();
                        }
                    }
                    this.i = z;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, cursorFactory, i, 0, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, new byte[0], cursorFactory, i, i2, databaseErrorHandler, (SQLiteDatabaseHook) null, false);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        if (i >= 1) {
            this.f214741a = context;
            this.f214742b = str;
            this.f214744g = bArr;
            this.f214743c = cursorFactory;
            this.d = i;
            this.f214746j = databaseErrorHandler;
            this.k = sQLiteDatabaseHook;
            this.i = z;
            this.e = Math.max(0, i2);
            return;
        }
        throw new IllegalArgumentException(d.n("Version must be >= 1, was ", i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SQLiteOpenHelper(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        byte[] bArr;
        if (str2 != null && str2.length() != 0) {
            ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(CharBuffer.wrap(str2));
            bArr = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr);
        } else {
            bArr = new byte[0];
        }
        this(context, str, bArr, cursorFactory, i, i2, databaseErrorHandler, sQLiteDatabaseHook, z);
    }
}
