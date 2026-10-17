package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class l2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2 f202445c = new l2();

    private l2() {
        super(41, 42);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP INDEX IF EXISTS `index_trading_banners_id`", "DROP TABLE IF EXISTS `trading_banners`", "CREATE TABLE IF NOT EXISTS `trading_banners` (\n    `id` TEXT NOT NULL,\n    `icon` TEXT,\n    `title` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `subtitle` TEXT,\n    `closeable` INTEGER NOT NULL,\n    `uriActionEmbeddedEntity` TEXT,\n    `contentActionEmbeddedEntity` TEXT,\n    PRIMARY KEY(`id`)\n)");
    }
}
