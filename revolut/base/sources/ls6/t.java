package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f199644c = new t();

    private t() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("CREATE TABLE IF NOT EXISTS `customers` (`id` TEXT NOT NULL, `full_name` TEXT, `email` TEXT,`phone` TEXT , `vat_number` TEXT, `address` TEXT, `created_date` INTEGER NOT NULL,`updated_date` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
