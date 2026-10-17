package net.zetetic.database;

import a10.b;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes14.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Logger.b().b(6, "DefaultDatabaseErrorHandler", "deleting the database file: ".concat(str), null);
        try {
            SQLiteDatabase.i(new File(str));
        } catch (Exception e) {
            Logger.b().b(5, "DefaultDatabaseErrorHandler", b.r(e, new StringBuilder("delete failed: ")), null);
        }
    }

    @Override // net.zetetic.database.DatabaseErrorHandler
    public final void a(SQLiteDatabase sQLiteDatabase) {
        List attachedDbs = null;
        Logger.b().b(6, "DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath(), null);
        if (SQLiteConnection.p()) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            b(sQLiteDatabase.getPath());
            return;
        }
        try {
            try {
                attachedDbs = sQLiteDatabase.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                sQLiteDatabase.g();
            } catch (SQLiteException unused2) {
            }
        } finally {
            if (attachedDbs != null) {
                Iterator it8 = attachedDbs.iterator();
                while (it8.hasNext()) {
                    b((String) ((Pair) it8.next()).second);
                }
            } else {
                b(sQLiteDatabase.getPath());
            }
        }
    }
}
