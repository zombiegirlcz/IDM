package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f225096c = new s();

    private s() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n            CREATE TABLE IF NOT EXISTS `recommended_rewards` (\n                `id` TEXT PRIMARY KEY NOT NULL, \n                `primaryCategory` TEXT NOT NULL,  \n                `merchant` TEXT NOT NULL, \n                `description` TEXT NOT NULL, \n                `backgroundImageUrl` TEXT NOT NULL\n            )\n            ");
    }
}
