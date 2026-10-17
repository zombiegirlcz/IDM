package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class c1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f202390c = new c1();

    private c1() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n            CREATE TABLE IF NOT EXISTS collections_tmp (\n                id TEXT NOT NULL, \n                assetType TEXT NOT NULL, \n                title TEXT NOT NULL, \n                description TEXT, \n                backgroundImageLink TEXT, \n                avatarImageLink TEXT, \n                collections TEXT, \n                instruments TEXT, \n                PRIMARY KEY(id, assetType)\n            )\n            ", "INSERT INTO collections_tmp SELECT * FROM collections", "DROP TABLE IF EXISTS collections");
        supportSQLiteDatabase.execSQL("ALTER TABLE collections_tmp RENAME TO collections");
    }
}
