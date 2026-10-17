package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d7 f301823c = new d7();

    private d7() {
        super(275, 276);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `crypto_referral_reward_rate` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `crypto_referral_reward_promised_amount_amount` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `crypto_referral_reward_promised_amount_currency` TEXT DEFAULT NULL");
    }
}
