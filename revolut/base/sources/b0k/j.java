package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f11688c = new j();

    private j() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `wealth_news`", "CREATE TABLE IF NOT EXISTS `wealth_news` (`id` TEXT NOT NULL, `assetType` TEXT NOT NULL, `title` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `htmlBody` TEXT, `publishedDate` INTEGER NOT NULL, `source` TEXT NOT NULL, `lengthInMins` INTEGER, `isTopStory` INTEGER NOT NULL, `mainSymbol` TEXT NOT NULL, `relatedSymbols` TEXT NOT NULL, `keywords` TEXT, PRIMARY KEY(`id`, `isTopStory`))");
    }
}
