package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11680c = new b();

    private b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP TABLE IF EXISTS `wealth_news`");
        db8.execSQL(t.e("\n                CREATE TABLE IF NOT EXISTS `wealth_news` (\n                    `id` TEXT NOT NULL,\n                    `assetType` TEXT NOT NULL,\n                    `title` TEXT NOT NULL,\n                    `imageUrl` TEXT NOT NULL,\n                    `htmlBody` TEXT,\n                    `publishedDate` INTEGER NOT NULL,\n                    `source` TEXT NOT NULL,\n                    `lengthInMins` INTEGER,\n                    `isTopStory` INTEGER NOT NULL,\n                    `relatedSymbols` TEXT NOT NULL,\n                    `relatedCurrencies` TEXT NOT NULL,\n                    `keywords` TEXT,\n                    PRIMARY KEY(`id`, `isTopStory`)\n                )\n            "));
    }
}
