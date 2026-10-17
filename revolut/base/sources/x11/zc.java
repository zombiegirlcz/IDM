package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class zc extends Migration {
    public zc() {
        super(73, 74);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER table `transactions` ADD COLUMN `rate_markup_amount` INTEGER DEFAULT NULL", "ALTER table `transactions` ADD COLUMN `rate_markup_amount_currency` TEXT DEFAULT NULL");
    }
}
