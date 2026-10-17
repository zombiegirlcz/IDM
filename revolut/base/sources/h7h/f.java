package h7h;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f149884c = new f();

    private f() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `collections`", "CREATE TABLE IF NOT EXISTS `collections` (\n    `id` TEXT NOT NULL,\n    `assetType` TEXT NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT,\n    `emoji` TEXT,\n    `backgroundImageLink` TEXT,\n    `avatarImageLink` TEXT,\n    `icon` TEXT,\n    `additionalInfoLink` TEXT,\n    `collections` TEXT,\n    `entries` TEXT,\n    `category` TEXT,\n    PRIMARY KEY(`id`, `assetType`)\n)");
    }
}
