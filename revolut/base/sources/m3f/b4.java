package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b4 f202387c = new b4();

    private b4() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS collections (\n    `id` TEXT NOT NULL,\n    `assetType` TEXT NOT NULL, \n    `title` TEXT NOT NULL, \n    `description` TEXT, \n    `backgroundImageLink` TEXT NOT NULL, \n    `avatarImageLink` TEXT NOT NULL, \n    `collections` TEXT, \n    `instruments` TEXT, \n    PRIMARY KEY (`id`, `assetType`)\n)");
    }
}
