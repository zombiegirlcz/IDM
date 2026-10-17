package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f11684c = new f();

    private f() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `personalised_news` ( `id` TEXT NOT NULL, `assetType` TEXT NOT NULL,  `title` TEXT NOT NULL,  `link` TEXT NOT NULL,  `source` TEXT NOT NULL,  `publishedDate` INTEGER NOT NULL,  `imageLink` TEXT,  `tags`  TEXT NOT NULL DEFAULT '[]', `relatedSymbols` TEXT NOT NULL,  PRIMARY KEY(`id`))");
    }
}
