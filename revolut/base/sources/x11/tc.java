package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class tc extends Migration {
    public tc() {
        super(70, 71);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `trading_news` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `symbol` TEXT NOT NULL, `link` TEXT NOT NULL, `source` TEXT NOT NULL, `publishedDate` INTEGER NOT NULL, `imageLink` TEXT, `relatedSymbols` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE  INDEX `index_trading_news_symbol` ON `trading_news` (`symbol`)");
    }
}
