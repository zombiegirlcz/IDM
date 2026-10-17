package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class r1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f202480c = new r1();

    private r1() {
        super(23, 24);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `trading_news_banners` \n    (\n        `id` TEXT NOT NULL,\n        `icon` TEXT, `title` TEXT NOT NULL, \n        `subtitle` TEXT, `closeable` INTEGER NOT NULL, \n        `uriActionEmbeddedEntity` TEXT, \n        `contentActionEmbeddedEntity` TEXT, \n        PRIMARY KEY(`id`)\n    )", "CREATE INDEX IF NOT EXISTS `index_trading_news_banners_id` ON `trading_news_banners` (`id`)");
    }
}
