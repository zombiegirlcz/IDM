package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hb extends Migration {
    public hb() {
        super(53, 54);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `charities` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `pocket_id` TEXT NOT NULL, `brief` TEXT NOT NULL, `description` TEXT NOT NULL, `icon` TEXT NOT NULL, `banner` TEXT NOT NULL, `total_donation_amount` INTEGER NOT NULL, `total_donation_currency` TEXT NOT NULL, `my_donation_amount` INTEGER NOT NULL, `my_donation_currency` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
