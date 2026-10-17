package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f11687c = new i();

    private i() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `wealth_news` (`id` TEXT NOT NULL, `assetType` TEXT NOT NULL, `title` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `htmlBody` TEXT, `publishedDate` INTEGER NOT NULL, `source` TEXT NOT NULL, `lengthInMins` INTEGER NOT NULL, `isTopStory` INTEGER NOT NULL, `mainSymbol` TEXT NOT NULL, `relatedSymbols` TEXT NOT NULL, `keywords` TEXT, PRIMARY KEY(`id`, `isTopStory`))");
    }
}
