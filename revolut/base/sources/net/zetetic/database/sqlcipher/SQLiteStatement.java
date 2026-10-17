package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteStatement extends SQLiteProgram implements SupportSQLiteStatement {
    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        d();
        try {
            try {
                this.f214748b.o().d(i(), this.f214749c, this.f214750g);
            } catch (SQLiteDatabaseCorruptException e) {
                j(e);
                throw e;
            }
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long executeInsert() {
        d();
        try {
            try {
                return this.f214748b.o().g(i(), this.f214749c, this.f214750g);
            } catch (SQLiteDatabaseCorruptException e) {
                j(e);
                throw e;
            }
        } finally {
            g();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        d();
        try {
            try {
                return this.f214748b.o().e(i(), this.f214749c, this.f214750g);
            } catch (SQLiteDatabaseCorruptException e) {
                j(e);
                throw e;
            }
        } finally {
            g();
        }
    }

    public final String toString() {
        return "SQLiteProgram: " + this.f214749c;
    }
}
