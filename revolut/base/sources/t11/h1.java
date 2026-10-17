package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.r9;

/* JADX INFO: loaded from: classes20.dex */
public final class h1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r9 f267064c;

    public h1() {
        super(369, 370);
        this.f267064c = new r9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `price_alert`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `auto_exchange`");
        this.f267064c.onPostMigrate(sQLiteConnection);
    }
}
