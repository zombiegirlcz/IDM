package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.a9;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9 f267070c;

    public p() {
        super(322, 323);
        this.f267070c = new a9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `money_requests`");
        this.f267070c.onPostMigrate(sQLiteConnection);
    }
}
