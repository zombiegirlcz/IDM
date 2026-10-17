package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f11683c = new e();

    private e() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `instrument_news` ( `id` TEXT NOT NULL,  `symbol` TEXT NOT NULL,  `assetType` TEXT NOT NULL,  `title` TEXT NOT NULL,  `link` TEXT NOT NULL,  `source` TEXT NOT NULL,  `publishedDate` INTEGER NOT NULL,  `imageLink` TEXT,  `tags`  TEXT NOT NULL DEFAULT '[]', `relatedSymbols` TEXT NOT NULL,  PRIMARY KEY(`id`, `symbol`))", "CREATE  INDEX `index_instrument_news_symbol` ON `instrument_news` (`symbol`)", "ALTER TABLE `market_news` ADD COLUMN `tags`  TEXT NOT NULL DEFAULT '[]'");
    }
}
