package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f301888c = new j();

    private j() {
        super(LDSFile.EF_DG13_TAG, LDSFile.EF_DG14_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `transactions` ", "CREATE TABLE IF NOT EXISTS `transactions` (`leg_id` TEXT NOT NULL, `group_id` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `started_date` INTEGER NOT NULL, `updated_date` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `pocket_fee` INTEGER NOT NULL, `pocket_id` TEXT NOT NULL, `pocket_type` TEXT NOT NULL, `category` TEXT NOT NULL, `created_date` INTEGER NOT NULL, `completed_date` INTEGER, `counter_party_fee` INTEGER, `balance_on_completed` INTEGER, `description` TEXT, `status_reason_code` TEXT, `user_comment` TEXT, `user_rating` INTEGER, `reject_comment` TEXT, `logo` TEXT, `related_transaction_id` TEXT, `money_request_id` TEXT, `excluded_from_analytics` INTEGER, `exchange_rate` REAL, `fraud_state` TEXT, `pos_time` INTEGER, `offline` INTEGER, `ecommerce` INTEGER, `cashback_pocket_id` TEXT, `exchange_direction` TEXT, `top_up_entry_mode` TEXT, `transfer_link_id` TEXT, `gif_url` TEXT, `investment_holding_id` TEXT, `stop_order_id` TEXT, `lounge_pass_ids` TEXT, `rate_markup_amount` INTEGER, `rate_markup_amount_currency` TEXT, `countryCode` TEXT, `amount_with_fee` INTEGER NOT NULL, `analytics_group_id` TEXT NOT NULL, `merchant_id` TEXT, `merchant_name` TEXT, `merchant_mcc` TEXT, `merchant_category` TEXT, `merchant_city` TEXT, `merchant_country` TEXT, `merchant_address` TEXT, `merchant_state` TEXT, `merchant_postcode` TEXT, `merchant_logo` TEXT, `merchant_background_color` TEXT, `counter_party_amount` INTEGER, `counter_party_currency` TEXT, `counter_party_pocket_id` TEXT, `counter_party_pocket_type` TEXT, `card_id` TEXT, `card_last_four` TEXT, `card_label` TEXT, `auto_invest_target_pocket_id` TEXT, `auto_invest_strategy` TEXT, `standing_order_id` TEXT, `standing_order_period` TEXT, `standing_order_type` TEXT, `standing_order_start_date` TEXT, `standing_order_next_date` TEXT, `standing_order_recurring` INTEGER, `standing_order_estimated` INTEGER, `recipient_id` TEXT, `recipient_first_name` TEXT, `recipient_last_name` TEXT, `recipient_phone` TEXT, `recipient_username` TEXT, `recipient_country` TEXT, `recipient_pocket_id` TEXT, `recipient_pocket_type` TEXT, `sender_id` TEXT, `sender_first_name` TEXT, `sender_last_name` TEXT, `sender_phone` TEXT, `sender_username` TEXT, `sender_country` TEXT, `sender_pocket_id` TEXT, `sender_pocket_type` TEXT, `insurance_policy_id` TEXT, `insurance_billing_option` TEXT, `insurance_type` TEXT, `beneficiary_id` TEXT, `beneficiary_name` TEXT, `beneficiary_country` TEXT, `beneficiary_phone` TEXT, `vault_id` TEXT, `vault_expected_arrival` INTEGER, `vault_earned_interest` INTEGER, `localisedDescription` TEXT, PRIMARY KEY(`leg_id`))", "CREATE INDEX IF NOT EXISTS `index_transactions_group_id` ON `transactions` (`group_id`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_transactions_pocket_id` ON `transactions` (`pocket_id`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_transactions_related_transaction_id` ON `transactions` (`related_transaction_id`)");
    }
}
