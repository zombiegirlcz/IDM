package xxf;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f309511c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `travel_favorite` (\n    `id` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `image` TEXT NOT NULL, \n    `type` TEXT NOT NULL, \n    PRIMARY KEY(`id`)\n)");
    }
}
