package is6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls6.q f168133c;

    public r() {
        super(35, 36);
        this.f168133c = new ls6.q();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `orders_metadata`");
        this.f168133c.onPostMigrate(sQLiteConnection);
    }
}
