package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f13751c = new c();

    private c() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `hotels_campaign` (`id` TEXT NOT NULL, `image` TEXT NOT NULL, `startDate` TEXT NOT NULL, `endDate` TEXT NOT NULL, `name` TEXT NOT NULL, `discount` TEXT NOT NULL, `rank` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
