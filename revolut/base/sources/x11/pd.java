package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class pd extends Migration {
    public pd() {
        super(80, 81);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "\n            CREATE TABLE IF NOT EXISTS `trading_news_copy` \n            (\n                `id` TEXT NOT NULL, \n                `title` TEXT NOT NULL,\n                `symbol` TEXT NOT NULL, \n                `link` TEXT NOT NULL, \n                `source` TEXT NOT NULL, \n                `publishedDate` INTEGER NOT NULL, \n                `imageLink` TEXT,\n                `relatedSymbols` TEXT NOT NULL, \n                PRIMARY KEY(`id`, `symbol`)\n            )\n            ", "\n            INSERT INTO trading_news_copy (id, title, symbol, link, source, publishedDate, imageLink, relatedSymbols)\n            SELECT id, title, symbol, link, source, publishedDate, imageLink, relatedSymbols FROM trading_news\n            ", "DROP TABLE trading_news");
        supportSQLiteDatabase.execSQL("ALTER TABLE trading_news_copy RENAME TO trading_news;");
        supportSQLiteDatabase.execSQL("CREATE  INDEX `index_trading_news_symbol` ON `trading_news` (`symbol`)");
    }
}
