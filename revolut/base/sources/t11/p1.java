package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.v9;

/* JADX INFO: loaded from: classes20.dex */
public final class p1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f267071c;

    public p1() {
        super(377, 378);
        this.f267071c = new v9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transactions_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `excluded_transactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `local_transactions_data`");
        this.f267071c.onPostMigrate(sQLiteConnection);
    }
}
