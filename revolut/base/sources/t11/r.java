package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.b9;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b9 f267072c;

    public r() {
        super(324, 325);
        this.f267072c = new b9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transaction_predefined_category`");
        this.f267072c.onPostMigrate(sQLiteConnection);
    }
}
