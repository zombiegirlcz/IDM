package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteQuery extends SQLiteProgram {
    public final CancellationSignal i;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.i = cancellationSignal;
    }

    public final int k(CursorWindow cursorWindow, int i, int i2, boolean z) {
        d();
        try {
            try {
                cursorWindow.d();
            } catch (Throwable th10) {
                g();
                throw th10;
            }
        } catch (Throwable th11) {
            th = th11;
        }
        try {
        } catch (SQLiteDatabaseCorruptException e) {
            e = e;
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th12) {
            th = th12;
            Throwable th13 = th;
            cursorWindow.g();
            throw th13;
        }
        try {
            int iF = this.f214748b.o().f(this.f214749c, this.f214750g, cursorWindow, i, i2, z, i(), this.i);
            cursorWindow.g();
            g();
            return iF;
        } catch (SQLiteDatabaseCorruptException e4) {
            e = e4;
            SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
            j(sQLiteDatabaseCorruptException);
            throw sQLiteDatabaseCorruptException;
        } catch (SQLiteException e5) {
            e = e5;
            SQLiteException sQLiteException = e;
            Logger.b().b(6, "SQLiteQuery", "exception: " + sQLiteException.getMessage() + "; query: " + this.f214749c, null);
            throw sQLiteException;
        }
    }

    public final String toString() {
        return "SQLiteQuery: " + this.f214749c;
    }
}
