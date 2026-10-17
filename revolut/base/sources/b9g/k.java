package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f13764c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `hotels_property_type` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT, `totalProperties` INTEGER, `image` TEXT, PRIMARY KEY(`id`))");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
