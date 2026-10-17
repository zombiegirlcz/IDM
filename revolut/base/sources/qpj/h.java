package qpj;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bqj.a f248433c;

    public h() {
        super(16, 17);
        this.f248433c = new bqj.a();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transaction_links`");
        this.f248433c.onPostMigrate(sQLiteConnection);
    }
}
