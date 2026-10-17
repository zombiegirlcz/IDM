package rx1;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yx1.b f258013c;

    public d() {
        super(13, 14);
        this.f258013c = new yx1.b();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `secondaryId_contacts` RENAME TO `qvik_contacts`");
        this.f258013c.onPostMigrate(sQLiteConnection);
    }
}
