package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.c9;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9 f267073c;

    public t() {
        super(326, 327);
        this.f267073c = new c9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `topup_match`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transaction_links`");
        this.f267073c.onPostMigrate(sQLiteConnection);
    }
}
