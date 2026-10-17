package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qif.l f195499c;

    public a1() {
        super(9, 10);
        this.f195499c = new qif.l();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_extra_attributes` (`extra_attr_leg_id` TEXT NOT NULL, `extra_attr_pocket_origin_type` TEXT, `extra_attr_card_verification` INTEGER, `extra_attr_lounge_pass_ids` TEXT, `extra_attr_hotel_booking_id` TEXT, `extra_attr_user_offer_id` TEXT, `extra_attr_cashback_type` TEXT, `extra_attr_savings_vaults_bonus` INTEGER, `extra_attr_shops_brand_id` TEXT, `extra_attr_charity_id` TEXT, `extra_attr_user_comment` TEXT, `extra_attr_tax_recipient_id` TEXT, `extra_attr_bill_account_id` TEXT, `extra_attr_attrs` TEXT, PRIMARY KEY(`extra_attr_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_extra_attributes` (`extra_attr_leg_id`,`extra_attr_pocket_origin_type`,`extra_attr_card_verification`,`extra_attr_lounge_pass_ids`,`extra_attr_hotel_booking_id`,`extra_attr_user_offer_id`,`extra_attr_cashback_type`,`extra_attr_savings_vaults_bonus`,`extra_attr_shops_brand_id`,`extra_attr_charity_id`,`extra_attr_user_comment`,`extra_attr_tax_recipient_id`,`extra_attr_bill_account_id`,`extra_attr_attrs`) SELECT `extra_attr_leg_id`,`extra_attr_pocket_origin_type`,`extra_attr_card_verification`,`extra_attr_lounge_pass_ids`,`extra_attr_hotel_booking_id`,`extra_attr_user_offer_id`,`extra_attr_cashback_type`,`extra_attr_savings_vaults_bonus`,`extra_attr_shops_brand_id`,`extra_attr_charity_id`,`extra_attr_user_comment`,`extra_attr_tax_recipient_id`,`extra_attr_bill_account_id`,`extra_attr_attrs` FROM `extra_attributes`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `extra_attributes`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_extra_attributes` RENAME TO `extra_attributes`");
        this.f195499c.onPostMigrate(sQLiteConnection);
    }
}
