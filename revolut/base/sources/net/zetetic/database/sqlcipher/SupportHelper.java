package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes14.dex */
public class SupportHelper implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteOpenHelper f214760a;

    public SupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(configuration, bArr, sQLiteDatabaseHook, z, 0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f214760a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f214760a.f214742b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabaseD;
        SQLiteOpenHelper sQLiteOpenHelper = this.f214760a;
        synchronized (sQLiteOpenHelper) {
            sQLiteDatabaseD = sQLiteOpenHelper.d(false);
        }
        return sQLiteDatabaseD;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabaseD;
        SQLiteOpenHelper sQLiteOpenHelper = this.f214760a;
        synchronized (sQLiteOpenHelper) {
            sQLiteDatabaseD = sQLiteOpenHelper.d(true);
        }
        return sQLiteDatabaseD;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.f214760a.setWriteAheadLoggingEnabled(z);
    }

    public SupportHelper(final SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.f214760a = new SQLiteOpenHelper(configuration.context, configuration.name, bArr, configuration.callback.version, i, sQLiteDatabaseHook, z) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void f(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onConfigure(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void g(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onCreate(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void h(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.callback.onDowngrade(sQLiteDatabase, i2, i3);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void i(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onOpen(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void j(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.callback.onUpgrade(sQLiteDatabase, i2, i3);
            }
        };
    }
}
