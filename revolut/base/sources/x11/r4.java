package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r4 f301991c = new r4();

    private r4() {
        super(221, 222);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_type` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_paymentMethod` TEXT DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_order_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_order_type` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_order_description` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_id` TEXT DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_fullName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_name` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_userName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_email` TEXT DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_phone` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_cardholderName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_bin` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_lastFour` TEXT DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_cardPresent` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_expiryMonth` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_expiryYear` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_binScheme` TEXT DEFAULT NULL");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_binMemberName` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_cardBrand` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_productCode` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_cardType` TEXT DEFAULT NULL");
        prk.o.C(supportSQLiteDatabase, "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_cardSubType` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `merchant_payment_customer_card_countryCode` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_acquiring` INTEGER DEFAULT NULL");
    }
}
