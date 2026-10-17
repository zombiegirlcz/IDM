package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.u9;

/* JADX INFO: loaded from: classes20.dex */
public final class i1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9 f267065c;

    public i1() {
        super(370, 371);
        this.f267065c = new u9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `user_action`");
        this.f267065c.onPostMigrate(sQLiteConnection);
    }
}
