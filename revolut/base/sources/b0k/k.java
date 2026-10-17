package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f11689c = new k();

    private k() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `wealth_news`", "CREATE TABLE IF NOT EXISTS `wealth_news` (`id` TEXT NOT NULL, `assetType` TEXT NOT NULL, `title` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `htmlBody` TEXT, `publishedDate` INTEGER NOT NULL, `source` TEXT NOT NULL, `lengthInMins` INTEGER, `isTopStory` INTEGER NOT NULL, `mainSymbol` TEXT, `relatedSymbols` TEXT NOT NULL, `keywords` TEXT, PRIMARY KEY(`id`, `isTopStory`))");
    }
}
