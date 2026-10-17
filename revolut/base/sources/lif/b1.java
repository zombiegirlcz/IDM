package lif;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.FtsTableInfo;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class b1 extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionsDatabase_Impl f195500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(TransactionsDatabase_Impl transactionsDatabase_Impl) {
        super(62, "596b702048a40265ae72248772b0c236", "473510d3eb3309a16793b7f005178320");
        this.f195500a = transactionsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transactions` (`leg_id` TEXT NOT NULL, `group_id` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `created_date` INTEGER NOT NULL, `started_date` INTEGER NOT NULL, `updated_date` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `pocket_fee` INTEGER NOT NULL, `pocket_id` TEXT NOT NULL, `pocket_type` TEXT NOT NULL, `category` TEXT NOT NULL, `completed_date` INTEGER, `balance_on_completed` INTEGER, `description` TEXT, `status_reason_code` TEXT, `logo` TEXT, `related_transaction_id` TEXT, `amount_with_charges` INTEGER NOT NULL, `registered_identity_id` TEXT, `exchange_rate` REAL, `fraud_state` TEXT, `fraud_reason` TEXT, `ecommerce` INTEGER, `cardholderPresent` INTEGER, `cashback_pocket_id` TEXT, `exchange_direction` TEXT, `top_up_entry_mode` TEXT, `transfer_link_id` TEXT, `investment_holding_id` TEXT, `is_investment_auto_top_up` INTEGER NOT NULL, `localisedDescription` TEXT, `transparentPricing` INTEGER, `chargeback_eligible` INTEGER, `chargeback_state` TEXT, `accrued_loyalty_points` INTEGER, `accrued_loyalty_points_amount` REAL, `edt` TEXT, `group_key` TEXT, `country_code` TEXT, `amount_with_fee` INTEGER NOT NULL, `analytics_group_id` TEXT NOT NULL, `related_transactions_cache` TEXT, `calculated_balance` INTEGER, `recipient_key` TEXT, `sender_key` TEXT, `merchant_key` TEXT, `merchant_payment_id` TEXT, `cardOwnerId` TEXT, `topupMethod` TEXT, `warrant_reason` TEXT, `payment_counterparty_id` TEXT, `digitized_card_id` TEXT, `original_amount` INTEGER, `original_currency` TEXT, `payment_method` TEXT, `counterparty_details_group` TEXT, `splittable` INTEGER, `reward_reason` TEXT, `payment_initiation_type` TEXT, `counter_party_amount` INTEGER, `counter_party_currency` TEXT, `counter_party_pocket_id` TEXT, `counter_party_pocket_type` TEXT, `card_id` TEXT, `card_last_four` TEXT, `card_label` TEXT, `card_disposable` INTEGER, `card_pro` INTEGER, `card_credit` INTEGER, `auto_invest_target_pocket_id` TEXT, `auto_invest_strategy` TEXT, `auto_invest_target_type` TEXT, `standing_order_id` TEXT, `standing_order_period` TEXT, `standing_order_type` TEXT, `standing_order_start_date` TEXT, `standing_order_next_date` TEXT, `standing_order_recurring` INTEGER, `standing_order_estimated` INTEGER, `standing_order_low_balance_threshold_amount` INTEGER, `standing_order_low_balance_threshold_currency` TEXT, `standing_order_excess_balance_threshold_amount` INTEGER, `standing_order_excess_balance_threshold_currency` TEXT, `beneficiary_id` TEXT, `beneficiary_rootId` TEXT, `beneficiary_country` TEXT, `beneficiary_name` TEXT, `beneficiary_email` TEXT, `beneficiary_phone` TEXT, `beneficiary_fee_expected` INTEGER, `beneficiary_fee_actualAmount_amount` INTEGER, `beneficiary_fee_actualAmount_currency` TEXT, `alias_beneficiary_id` TEXT, `alias_beneficiary_country` TEXT, `alias_beneficiary_type` TEXT, `alias_beneficiary_account` TEXT, `vault_id` TEXT, `vault_expected_arrival` INTEGER, `vault_nav_price` INTEGER, `vault_earned_interest` INTEGER, `vault_deducted` TEXT, `vault_taxes` TEXT, `vault_withdrawal_principal` REAL, `vault_withdrawal_interest` REAL, `gift_id` TEXT, `gift_state` TEXT, `gift_direction` TEXT, `gift_iconImageUrl` TEXT, `crypto_withdraw_address_id` TEXT, `crypto_withdraw_transaction_hash` TEXT, `crypto_withdraw_failureCode` TEXT, `crypto_withdraw_state` TEXT, `crypto_withdraw_display_rate` REAL, `crypto_withdraw_display_currency` TEXT, `amount_breakdown_original_amount` INTEGER, `amount_breakdown_original_currency` TEXT, `amount_breakdown_surcharge_amount` INTEGER, `amount_breakdown_surcharge_currency` TEXT, `amount_breakdown_exchange_rate` REAL, `junior_junior_user_id` TEXT, `junior_transfer_intent` TEXT, `junior_p2p_transfer_request_id` TEXT, `junior_p2p_transfer_request_state` TEXT, `junior_p2p_transfer_request_sender_first_name` TEXT, `junior_p2p_transfer_request_sender_last_name` TEXT, `instalment_plan_facilityId` TEXT, `instalment_plan_feeRate` REAL, `instalment_plan_lateInterestRate` REAL, `instalment_plan_lateInterest` INTEGER, `instalment_plan_apr` REAL, `push_to_card_first_name` TEXT, `push_to_card_last_name` TEXT, `push_to_card_state` TEXT, `push_to_card_last_four` TEXT, `push_to_card_scheme` TEXT, `push_to_card_logo_url` TEXT, `doxgety_reward_rate` TEXT, `doxgety_reward_promised_amount_amount` INTEGER, `doxgety_reward_promised_amount_currency` TEXT, `joint_id` TEXT, `joint_initiator_legal_name` TEXT, `joint_initiator_image` TEXT, `joint_initiator_code` TEXT, `joint_extra_internal` INTEGER, `joint_extra_account_id` TEXT, `joint_extra_peer` TEXT, `collection_trading_order_id` TEXT, `collection_trading_collection_key` TEXT, `collection_trading_collection_name` TEXT, `collection_trading_avatar` TEXT, `collection_trading_icon` TEXT, `wealth_portfolio_id` TEXT, `wealth_account_type` TEXT, `referral_reward_rate` TEXT, `referral_reward_tax_breakdown` TEXT, `referral_reward_promised_amount_amount` INTEGER, `referral_reward_promised_amount_currency` TEXT, `referral_reward_taxDetails_grossAmount_amount` INTEGER, `referral_reward_taxDetails_grossAmount_currency` TEXT, `referral_reward_taxDetails_tax_amount` INTEGER, `referral_reward_taxDetails_tax_currency` TEXT, `paid_plan_transaction_plan_id` TEXT, `paid_plan_transaction_plan_tier` TEXT, `paid_plan_transaction_billing_cycle_id` TEXT, `fromAccount_accountInfo_type` TEXT, `fromAccount_accountInfo_pocketId` TEXT, `fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id` TEXT, `fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type` TEXT, `toAccount_accountInfo_type` TEXT, `toAccount_accountInfo_pocketId` TEXT, `toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id` TEXT, `toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type` TEXT, `apm_contact_id` TEXT, `apm_contact_phone` TEXT, `apm_contact_email` TEXT, `apm_contact_type` TEXT, `apm_contact_alias` TEXT, `apm_contact_contactName` TEXT, `apm_info_provider` TEXT, `charges_taxes_taxes_breakdown` TEXT, `charges_taxes_total_amount` INTEGER, `charges_taxes_total_currency` TEXT, `charges_fees_fees_breakdown` TEXT, `charges_fees_total_amount` INTEGER, `charges_fees_total_currency` TEXT, `equivalent_amount` INTEGER, `equivalent_currency` TEXT, PRIMARY KEY(`leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_transactions_group_id` ON `transactions` (`group_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_transactions_pocket_id` ON `transactions` (`pocket_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_transactions_started_date` ON `transactions` (`started_date`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_transactions_related_transaction_id` ON `transactions` (`related_transaction_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_details` (`leg_id` TEXT NOT NULL, `group_id` TEXT NOT NULL, `response` TEXT NOT NULL, PRIMARY KEY(`leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_transaction_details_group_id` ON `transaction_details` (`group_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transfer_users` (`transfer_user_key` TEXT NOT NULL, `transfer_user_id` TEXT, `transfer_user_legal_name` TEXT, `transfer_user_first_name` TEXT, `transfer_user_last_name` TEXT, `transfer_user_phone` TEXT, `transfer_user_username` TEXT, `transfer_user_code` TEXT, `transfer_user_country` TEXT, `transfer_user_pocket_id` TEXT, `transfer_user_pocket_type` TEXT, `transfer_user_appMode` TEXT, `transfer_user_type` TEXT, `transfer_user_businessName` TEXT, `transfer_user_individual_type` TEXT, PRIMARY KEY(`transfer_user_key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `merchants` (`merchant_table_key` TEXT NOT NULL, `merchant_merchant_identifier` TEXT, `merchant_identifier` TEXT, `merchant_blocked_merchant_id` TEXT, `merchant_name` TEXT, `merchant_mcc` TEXT, `merchant_category` TEXT, `merchant_city` TEXT, `merchant_country` TEXT, `merchant_address` TEXT, `merchant_state` TEXT, `merchant_postcode` TEXT, `merchant_logo` TEXT, `merchant_background_color` TEXT, `merchant_can_be_blocked` INTEGER, `merchant_block_eligibility` TEXT, `merchant_brand_id` TEXT, `merchant_scheme` TEXT, `merchant_location_latitude` REAL, `merchant_location_longitude` REAL, PRIMARY KEY(`merchant_table_key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `merchant_payments` (`merchant_payment_identifier` TEXT NOT NULL, `merchant_payment_type` TEXT, `merchant_payment_payment_method` TEXT, `merchant_payment_settle_on` INTEGER, `merchant_payment_order_id` TEXT, `merchant_payment_order_type` TEXT, `merchant_payment_order_description` TEXT, `merchant_payment_customer_id` TEXT, `merchant_payment_customer_full_name` TEXT, `merchant_payment_customer_name` TEXT, `merchant_payment_customer_user_name` TEXT, `merchant_payment_customer_email` TEXT, `merchant_payment_customer_phone` TEXT, `merchant_payment_customer_cardholder_name` TEXT, `merchant_payment_customer_card_bin` TEXT, `merchant_payment_customer_card_last_four` TEXT, `merchant_payment_customer_card_card_present` INTEGER, `merchant_payment_customer_card_expiry_month` INTEGER, `merchant_payment_customer_card_expiry_year` INTEGER, `merchant_payment_customer_card_bin_scheme` TEXT, `merchant_payment_customer_card_bin_member_name` TEXT, `merchant_payment_customer_card_card_brand` TEXT, `merchant_payment_customer_card_product_code` TEXT, `merchant_payment_customer_card_card_type` TEXT, `merchant_payment_customer_card_card_sub_type` TEXT, `merchant_payment_customer_card_country_code` TEXT, PRIMARY KEY(`merchant_payment_identifier`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `acquiring_cashback` (`acquiring_cashback_leg_id` TEXT NOT NULL, `acquiring_cashback_amount` INTEGER, `acquiring_cashback_currency` TEXT, `acquiring_cashback_payout_type` TEXT, `acquiring_cashback_payout_plan_rate` REAL, `acquiring_cashback_payout_plan_amount` INTEGER, `acquiring_cashback_payout_plan_currency` TEXT, `acquiring_cashback_payout_booster_rate` REAL, `acquiring_cashback_payout_booster_amount` INTEGER, `acquiring_cashback_payout_booster_currency` TEXT, PRIMARY KEY(`acquiring_cashback_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loans` (`loan_leg_id` TEXT NOT NULL, `loan_repayment_type` TEXT, `loan_repayment_mode` TEXT, `loan_name` TEXT, `loan_id` TEXT, `loan_regular_loan_amount` INTEGER, `loan_regular_interest_amount` INTEGER, `loan_regular_fee_amount` INTEGER, `loan_regular_principal_amount` INTEGER, `loan_outstanding_loan_amount` INTEGER, `loan_outstanding_interest_amount` INTEGER, `loan_outstanding_fee_amount` INTEGER, `loan_outstanding_principal_amount` INTEGER, `loan_overdue_loan_amount` INTEGER, `loan_overdue_interest_amount` INTEGER, `loan_overdue_fee_amount` INTEGER, `loan_overdue_principal_amount` INTEGER, `loan_penalty_amount` INTEGER, `loan_regularRescheduledPrincipalAmount` INTEGER, `loan_outstandingRescheduledPrincipalAmount` INTEGER, `loan_overdueRescheduledPrincipalAmount` INTEGER, `loan_bank_identifier` TEXT, `loan_account_number` TEXT, `loan_debtor_name` TEXT, `loan_product` TEXT, `loan_stampDuty_over_accrued_interest` INTEGER, `loan_stampDuty_over_late_interest` INTEGER, `loan_stampDuty_over_late_fee` INTEGER, `loan_stampDuty_total` INTEGER, PRIMARY KEY(`loan_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `extra_attributes` (`extra_attr_leg_id` TEXT NOT NULL, `extra_attr_pocket_origin_type` TEXT, `extra_attr_card_verification` INTEGER, `extra_attr_lounge_pass_ids` TEXT, `extra_attr_hotel_booking_id` TEXT, `extra_attr_user_offer_id` TEXT, `extra_attr_cashback_type` TEXT, `extra_attr_savings_vaults_bonus` INTEGER, `extra_attr_shops_brand_id` TEXT, `extra_attr_charity_id` TEXT, `extra_attr_user_comment` TEXT, `extra_attr_tax_recipient_id` TEXT, `extra_attr_bill_account_id` TEXT, `extra_external_regulator_type` TEXT, `extra_attr_acquiring_tax_payment` INTEGER, `extra_attr_can_be_marked_as_subscription` INTEGER, `extra_attr_staking_info_reward` INTEGER, `extra_attr_merchant_block_eligibility` TEXT, `extra_attr_transfer_reasons_catalogue` TEXT, `extra_attr_guardian_id` TEXT, `extra_attr_attrs` TEXT, `extra_attr_payment_authorisation_id` TEXT, `extra_attr_payment_authorisation_type` TEXT, `extra_attr_linked_exchange_details_counterparty_pocket_id` TEXT, `extra_attr_money_request_id` TEXT, `extra_attr_money_request_requester_id` TEXT, `extra_attr_money_request_requester_name` TEXT, `extra_attr_money_request_requester_code` TEXT, `extra_attr_mcy_top_up_funding_status` TEXT, `extra_attr_mcy_top_up_funds_transfer_expire_time` INTEGER, PRIMARY KEY(`extra_attr_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hidden` (`leg_id` TEXT NOT NULL, `hidden` INTEGER NOT NULL, PRIMARY KEY(`leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `excluded_transactions` (`excluded_transaction_id` TEXT NOT NULL, `included_amount` INTEGER, `included_amount_currency` TEXT, `excluded_type` TEXT, PRIMARY KEY(`excluded_transaction_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loading_state` (`id` TEXT NOT NULL, `value` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `crypto_deposits` (`crypto_deposit_leg_id` TEXT NOT NULL, `transaction_hash` TEXT, `below_minimum` INTEGER, `blockchain` TEXT, `deposit_state` TEXT, `source_address` TEXT, `display_rate` REAL, `display_currency` TEXT, PRIMARY KEY(`crypto_deposit_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `defi_metadata` (`defi_metadata_leg_id` TEXT NOT NULL, `defi_metadata_account_id` TEXT NOT NULL, `defi_metadata_account_scoped_asset_id` TEXT NOT NULL, `defi_metadata_counterpart_account_scoped_asset_id` TEXT, `defi_metadata_rate` TEXT, `defi_metadata_chain` TEXT, `defi_metadata_amount_value` TEXT NOT NULL, `defi_metadata_amount_currency` TEXT NOT NULL, `defi_metadata_fee_value` TEXT, `defi_metadata_fee_currency` TEXT, `defi_metadata_fiat_amount_value` TEXT, `defi_metadata_fiat_amount_currency` TEXT, `defi_metadata_fee_fiat_amount_value` TEXT, `defi_metadata_fee_fiat_amount_currency` TEXT, `defi_metadata_counterpart_fiat_amount_value` TEXT, `defi_metadata_counterpart_fiat_amount_currency` TEXT, `defi_metadata_counterpart_value` TEXT, `defi_metadata_counterpart_currency` TEXT, `defi_metadata_bundle_id` TEXT, `defi_metadata_bundle_link` TEXT, `defi_metadata_on_chain_tx_hash` TEXT, `defi_metadata_on_chain_tx_link` TEXT, `defi_metadata_recipient_wallet_address` TEXT, `defi_metadata_recipient_link` TEXT, `defi_metadata_sender_wallet_address` TEXT, `defi_metadata_sender_link` TEXT, PRIMARY KEY(`defi_metadata_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_defi_metadata_defi_metadata_account_scoped_asset_id` ON `defi_metadata` (`defi_metadata_account_scoped_asset_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `calculated_balance_state` (`id` TEXT NOT NULL, `value` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE VIRTUAL TABLE IF NOT EXISTS `search_indexes` USING FTS4(`leg_id` TEXT NOT NULL, `content_index` TEXT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `search_index_state` (`id` TEXT NOT NULL, `value` INTEGER, `value_string` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '596b702048a40265ae72248772b0c236')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transaction_details`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transfer_users`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `merchants`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `merchant_payments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `acquiring_cashback`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `loans`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `extra_attributes`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hidden`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `excluded_transactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `loading_state`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `crypto_deposits`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `defi_metadata`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `calculated_balance_state`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `search_indexes`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `search_index_state`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = TransactionsDatabase_Impl.f92033n;
        this.f195500a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(189);
        map.put("leg_id", new TableInfo.Column("leg_id", "TEXT", true, 1, null, 1));
        map.put("group_id", new TableInfo.Column("group_id", "TEXT", true, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("created_date", new TableInfo.Column("created_date", "INTEGER", true, 0, null, 1));
        map.put("started_date", new TableInfo.Column("started_date", "INTEGER", true, 0, null, 1));
        map.put("updated_date", new TableInfo.Column("updated_date", "INTEGER", true, 0, null, 1));
        map.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("pocket_fee", new TableInfo.Column("pocket_fee", "INTEGER", true, 0, null, 1));
        map.put("pocket_id", new TableInfo.Column("pocket_id", "TEXT", true, 0, null, 1));
        map.put("pocket_type", new TableInfo.Column("pocket_type", "TEXT", true, 0, null, 1));
        map.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, 1));
        map.put("completed_date", new TableInfo.Column("completed_date", "INTEGER", false, 0, null, 1));
        map.put("balance_on_completed", new TableInfo.Column("balance_on_completed", "INTEGER", false, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map.put("status_reason_code", new TableInfo.Column("status_reason_code", "TEXT", false, 0, null, 1));
        map.put("logo", new TableInfo.Column("logo", "TEXT", false, 0, null, 1));
        map.put("related_transaction_id", new TableInfo.Column("related_transaction_id", "TEXT", false, 0, null, 1));
        map.put("amount_with_charges", new TableInfo.Column("amount_with_charges", "INTEGER", true, 0, null, 1));
        map.put("registered_identity_id", new TableInfo.Column("registered_identity_id", "TEXT", false, 0, null, 1));
        map.put("exchange_rate", new TableInfo.Column("exchange_rate", "REAL", false, 0, null, 1));
        map.put("fraud_state", new TableInfo.Column("fraud_state", "TEXT", false, 0, null, 1));
        map.put("fraud_reason", new TableInfo.Column("fraud_reason", "TEXT", false, 0, null, 1));
        map.put("ecommerce", new TableInfo.Column("ecommerce", "INTEGER", false, 0, null, 1));
        map.put("cardholderPresent", new TableInfo.Column("cardholderPresent", "INTEGER", false, 0, null, 1));
        map.put("cashback_pocket_id", new TableInfo.Column("cashback_pocket_id", "TEXT", false, 0, null, 1));
        map.put("exchange_direction", new TableInfo.Column("exchange_direction", "TEXT", false, 0, null, 1));
        map.put("top_up_entry_mode", new TableInfo.Column("top_up_entry_mode", "TEXT", false, 0, null, 1));
        map.put("transfer_link_id", new TableInfo.Column("transfer_link_id", "TEXT", false, 0, null, 1));
        map.put("investment_holding_id", new TableInfo.Column("investment_holding_id", "TEXT", false, 0, null, 1));
        map.put("is_investment_auto_top_up", new TableInfo.Column("is_investment_auto_top_up", "INTEGER", true, 0, null, 1));
        map.put("localisedDescription", new TableInfo.Column("localisedDescription", "TEXT", false, 0, null, 1));
        map.put("transparentPricing", new TableInfo.Column("transparentPricing", "INTEGER", false, 0, null, 1));
        map.put("chargeback_eligible", new TableInfo.Column("chargeback_eligible", "INTEGER", false, 0, null, 1));
        map.put("chargeback_state", new TableInfo.Column("chargeback_state", "TEXT", false, 0, null, 1));
        map.put("accrued_loyalty_points", new TableInfo.Column("accrued_loyalty_points", "INTEGER", false, 0, null, 1));
        map.put("accrued_loyalty_points_amount", new TableInfo.Column("accrued_loyalty_points_amount", "REAL", false, 0, null, 1));
        map.put("edt", new TableInfo.Column("edt", "TEXT", false, 0, null, 1));
        map.put("group_key", new TableInfo.Column("group_key", "TEXT", false, 0, null, 1));
        map.put("country_code", new TableInfo.Column("country_code", "TEXT", false, 0, null, 1));
        map.put("amount_with_fee", new TableInfo.Column("amount_with_fee", "INTEGER", true, 0, null, 1));
        map.put("analytics_group_id", new TableInfo.Column("analytics_group_id", "TEXT", true, 0, null, 1));
        map.put("related_transactions_cache", new TableInfo.Column("related_transactions_cache", "TEXT", false, 0, null, 1));
        map.put("calculated_balance", new TableInfo.Column("calculated_balance", "INTEGER", false, 0, null, 1));
        map.put("recipient_key", new TableInfo.Column("recipient_key", "TEXT", false, 0, null, 1));
        map.put("sender_key", new TableInfo.Column("sender_key", "TEXT", false, 0, null, 1));
        map.put("merchant_key", new TableInfo.Column("merchant_key", "TEXT", false, 0, null, 1));
        map.put("merchant_payment_id", new TableInfo.Column("merchant_payment_id", "TEXT", false, 0, null, 1));
        map.put("cardOwnerId", new TableInfo.Column("cardOwnerId", "TEXT", false, 0, null, 1));
        map.put("topupMethod", new TableInfo.Column("topupMethod", "TEXT", false, 0, null, 1));
        map.put("warrant_reason", new TableInfo.Column("warrant_reason", "TEXT", false, 0, null, 1));
        map.put("payment_counterparty_id", new TableInfo.Column("payment_counterparty_id", "TEXT", false, 0, null, 1));
        map.put("digitized_card_id", new TableInfo.Column("digitized_card_id", "TEXT", false, 0, null, 1));
        map.put("original_amount", new TableInfo.Column("original_amount", "INTEGER", false, 0, null, 1));
        map.put("original_currency", new TableInfo.Column("original_currency", "TEXT", false, 0, null, 1));
        map.put("payment_method", new TableInfo.Column("payment_method", "TEXT", false, 0, null, 1));
        map.put("counterparty_details_group", new TableInfo.Column("counterparty_details_group", "TEXT", false, 0, null, 1));
        map.put("splittable", new TableInfo.Column("splittable", "INTEGER", false, 0, null, 1));
        map.put("reward_reason", new TableInfo.Column("reward_reason", "TEXT", false, 0, null, 1));
        map.put("payment_initiation_type", new TableInfo.Column("payment_initiation_type", "TEXT", false, 0, null, 1));
        map.put("counter_party_amount", new TableInfo.Column("counter_party_amount", "INTEGER", false, 0, null, 1));
        map.put("counter_party_currency", new TableInfo.Column("counter_party_currency", "TEXT", false, 0, null, 1));
        map.put("counter_party_pocket_id", new TableInfo.Column("counter_party_pocket_id", "TEXT", false, 0, null, 1));
        map.put("counter_party_pocket_type", new TableInfo.Column("counter_party_pocket_type", "TEXT", false, 0, null, 1));
        map.put("card_id", new TableInfo.Column("card_id", "TEXT", false, 0, null, 1));
        map.put("card_last_four", new TableInfo.Column("card_last_four", "TEXT", false, 0, null, 1));
        map.put("card_label", new TableInfo.Column("card_label", "TEXT", false, 0, null, 1));
        map.put("card_disposable", new TableInfo.Column("card_disposable", "INTEGER", false, 0, null, 1));
        map.put("card_pro", new TableInfo.Column("card_pro", "INTEGER", false, 0, null, 1));
        map.put("card_credit", new TableInfo.Column("card_credit", "INTEGER", false, 0, null, 1));
        map.put("auto_invest_target_pocket_id", new TableInfo.Column("auto_invest_target_pocket_id", "TEXT", false, 0, null, 1));
        map.put("auto_invest_strategy", new TableInfo.Column("auto_invest_strategy", "TEXT", false, 0, null, 1));
        map.put("auto_invest_target_type", new TableInfo.Column("auto_invest_target_type", "TEXT", false, 0, null, 1));
        map.put("standing_order_id", new TableInfo.Column("standing_order_id", "TEXT", false, 0, null, 1));
        map.put("standing_order_period", new TableInfo.Column("standing_order_period", "TEXT", false, 0, null, 1));
        map.put("standing_order_type", new TableInfo.Column("standing_order_type", "TEXT", false, 0, null, 1));
        map.put("standing_order_start_date", new TableInfo.Column("standing_order_start_date", "TEXT", false, 0, null, 1));
        map.put("standing_order_next_date", new TableInfo.Column("standing_order_next_date", "TEXT", false, 0, null, 1));
        map.put("standing_order_recurring", new TableInfo.Column("standing_order_recurring", "INTEGER", false, 0, null, 1));
        map.put("standing_order_estimated", new TableInfo.Column("standing_order_estimated", "INTEGER", false, 0, null, 1));
        map.put("standing_order_low_balance_threshold_amount", new TableInfo.Column("standing_order_low_balance_threshold_amount", "INTEGER", false, 0, null, 1));
        map.put("standing_order_low_balance_threshold_currency", new TableInfo.Column("standing_order_low_balance_threshold_currency", "TEXT", false, 0, null, 1));
        map.put("standing_order_excess_balance_threshold_amount", new TableInfo.Column("standing_order_excess_balance_threshold_amount", "INTEGER", false, 0, null, 1));
        map.put("standing_order_excess_balance_threshold_currency", new TableInfo.Column("standing_order_excess_balance_threshold_currency", "TEXT", false, 0, null, 1));
        map.put("beneficiary_id", new TableInfo.Column("beneficiary_id", "TEXT", false, 0, null, 1));
        map.put("beneficiary_rootId", new TableInfo.Column("beneficiary_rootId", "TEXT", false, 0, null, 1));
        map.put("beneficiary_country", new TableInfo.Column("beneficiary_country", "TEXT", false, 0, null, 1));
        map.put("beneficiary_name", new TableInfo.Column("beneficiary_name", "TEXT", false, 0, null, 1));
        map.put("beneficiary_email", new TableInfo.Column("beneficiary_email", "TEXT", false, 0, null, 1));
        map.put("beneficiary_phone", new TableInfo.Column("beneficiary_phone", "TEXT", false, 0, null, 1));
        map.put("beneficiary_fee_expected", new TableInfo.Column("beneficiary_fee_expected", "INTEGER", false, 0, null, 1));
        map.put("beneficiary_fee_actualAmount_amount", new TableInfo.Column("beneficiary_fee_actualAmount_amount", "INTEGER", false, 0, null, 1));
        map.put("beneficiary_fee_actualAmount_currency", new TableInfo.Column("beneficiary_fee_actualAmount_currency", "TEXT", false, 0, null, 1));
        map.put("alias_beneficiary_id", new TableInfo.Column("alias_beneficiary_id", "TEXT", false, 0, null, 1));
        map.put("alias_beneficiary_country", new TableInfo.Column("alias_beneficiary_country", "TEXT", false, 0, null, 1));
        map.put("alias_beneficiary_type", new TableInfo.Column("alias_beneficiary_type", "TEXT", false, 0, null, 1));
        map.put("alias_beneficiary_account", new TableInfo.Column("alias_beneficiary_account", "TEXT", false, 0, null, 1));
        map.put("vault_id", new TableInfo.Column("vault_id", "TEXT", false, 0, null, 1));
        map.put("vault_expected_arrival", new TableInfo.Column("vault_expected_arrival", "INTEGER", false, 0, null, 1));
        map.put("vault_nav_price", new TableInfo.Column("vault_nav_price", "INTEGER", false, 0, null, 1));
        map.put("vault_earned_interest", new TableInfo.Column("vault_earned_interest", "INTEGER", false, 0, null, 1));
        map.put("vault_deducted", new TableInfo.Column("vault_deducted", "TEXT", false, 0, null, 1));
        map.put("vault_taxes", new TableInfo.Column("vault_taxes", "TEXT", false, 0, null, 1));
        map.put("vault_withdrawal_principal", new TableInfo.Column("vault_withdrawal_principal", "REAL", false, 0, null, 1));
        map.put("vault_withdrawal_interest", new TableInfo.Column("vault_withdrawal_interest", "REAL", false, 0, null, 1));
        map.put("gift_id", new TableInfo.Column("gift_id", "TEXT", false, 0, null, 1));
        map.put("gift_state", new TableInfo.Column("gift_state", "TEXT", false, 0, null, 1));
        map.put("gift_direction", new TableInfo.Column("gift_direction", "TEXT", false, 0, null, 1));
        map.put("gift_iconImageUrl", new TableInfo.Column("gift_iconImageUrl", "TEXT", false, 0, null, 1));
        map.put("crypto_withdraw_address_id", new TableInfo.Column("crypto_withdraw_address_id", "TEXT", false, 0, null, 1));
        map.put("crypto_withdraw_transaction_hash", new TableInfo.Column("crypto_withdraw_transaction_hash", "TEXT", false, 0, null, 1));
        map.put("crypto_withdraw_failureCode", new TableInfo.Column("crypto_withdraw_failureCode", "TEXT", false, 0, null, 1));
        map.put("crypto_withdraw_state", new TableInfo.Column("crypto_withdraw_state", "TEXT", false, 0, null, 1));
        map.put("crypto_withdraw_display_rate", new TableInfo.Column("crypto_withdraw_display_rate", "REAL", false, 0, null, 1));
        map.put("crypto_withdraw_display_currency", new TableInfo.Column("crypto_withdraw_display_currency", "TEXT", false, 0, null, 1));
        map.put("amount_breakdown_original_amount", new TableInfo.Column("amount_breakdown_original_amount", "INTEGER", false, 0, null, 1));
        map.put("amount_breakdown_original_currency", new TableInfo.Column("amount_breakdown_original_currency", "TEXT", false, 0, null, 1));
        map.put("amount_breakdown_surcharge_amount", new TableInfo.Column("amount_breakdown_surcharge_amount", "INTEGER", false, 0, null, 1));
        map.put("amount_breakdown_surcharge_currency", new TableInfo.Column("amount_breakdown_surcharge_currency", "TEXT", false, 0, null, 1));
        map.put("amount_breakdown_exchange_rate", new TableInfo.Column("amount_breakdown_exchange_rate", "REAL", false, 0, null, 1));
        map.put("junior_junior_user_id", new TableInfo.Column("junior_junior_user_id", "TEXT", false, 0, null, 1));
        map.put("junior_transfer_intent", new TableInfo.Column("junior_transfer_intent", "TEXT", false, 0, null, 1));
        map.put("junior_p2p_transfer_request_id", new TableInfo.Column("junior_p2p_transfer_request_id", "TEXT", false, 0, null, 1));
        map.put("junior_p2p_transfer_request_state", new TableInfo.Column("junior_p2p_transfer_request_state", "TEXT", false, 0, null, 1));
        map.put("junior_p2p_transfer_request_sender_first_name", new TableInfo.Column("junior_p2p_transfer_request_sender_first_name", "TEXT", false, 0, null, 1));
        map.put("junior_p2p_transfer_request_sender_last_name", new TableInfo.Column("junior_p2p_transfer_request_sender_last_name", "TEXT", false, 0, null, 1));
        map.put("instalment_plan_facilityId", new TableInfo.Column("instalment_plan_facilityId", "TEXT", false, 0, null, 1));
        map.put("instalment_plan_feeRate", new TableInfo.Column("instalment_plan_feeRate", "REAL", false, 0, null, 1));
        map.put("instalment_plan_lateInterestRate", new TableInfo.Column("instalment_plan_lateInterestRate", "REAL", false, 0, null, 1));
        map.put("instalment_plan_lateInterest", new TableInfo.Column("instalment_plan_lateInterest", "INTEGER", false, 0, null, 1));
        map.put("instalment_plan_apr", new TableInfo.Column("instalment_plan_apr", "REAL", false, 0, null, 1));
        map.put("push_to_card_first_name", new TableInfo.Column("push_to_card_first_name", "TEXT", false, 0, null, 1));
        map.put("push_to_card_last_name", new TableInfo.Column("push_to_card_last_name", "TEXT", false, 0, null, 1));
        map.put("push_to_card_state", new TableInfo.Column("push_to_card_state", "TEXT", false, 0, null, 1));
        map.put("push_to_card_last_four", new TableInfo.Column("push_to_card_last_four", "TEXT", false, 0, null, 1));
        map.put("push_to_card_scheme", new TableInfo.Column("push_to_card_scheme", "TEXT", false, 0, null, 1));
        map.put("push_to_card_logo_url", new TableInfo.Column("push_to_card_logo_url", "TEXT", false, 0, null, 1));
        map.put("doxgety_reward_rate", new TableInfo.Column("doxgety_reward_rate", "TEXT", false, 0, null, 1));
        map.put("doxgety_reward_promised_amount_amount", new TableInfo.Column("doxgety_reward_promised_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("doxgety_reward_promised_amount_currency", new TableInfo.Column("doxgety_reward_promised_amount_currency", "TEXT", false, 0, null, 1));
        map.put("joint_id", new TableInfo.Column("joint_id", "TEXT", false, 0, null, 1));
        map.put("joint_initiator_legal_name", new TableInfo.Column("joint_initiator_legal_name", "TEXT", false, 0, null, 1));
        map.put("joint_initiator_image", new TableInfo.Column("joint_initiator_image", "TEXT", false, 0, null, 1));
        map.put("joint_initiator_code", new TableInfo.Column("joint_initiator_code", "TEXT", false, 0, null, 1));
        map.put("joint_extra_internal", new TableInfo.Column("joint_extra_internal", "INTEGER", false, 0, null, 1));
        map.put("joint_extra_account_id", new TableInfo.Column("joint_extra_account_id", "TEXT", false, 0, null, 1));
        map.put("joint_extra_peer", new TableInfo.Column("joint_extra_peer", "TEXT", false, 0, null, 1));
        map.put("collection_trading_order_id", new TableInfo.Column("collection_trading_order_id", "TEXT", false, 0, null, 1));
        map.put("collection_trading_collection_key", new TableInfo.Column("collection_trading_collection_key", "TEXT", false, 0, null, 1));
        map.put("collection_trading_collection_name", new TableInfo.Column("collection_trading_collection_name", "TEXT", false, 0, null, 1));
        map.put("collection_trading_avatar", new TableInfo.Column("collection_trading_avatar", "TEXT", false, 0, null, 1));
        map.put("collection_trading_icon", new TableInfo.Column("collection_trading_icon", "TEXT", false, 0, null, 1));
        map.put("wealth_portfolio_id", new TableInfo.Column("wealth_portfolio_id", "TEXT", false, 0, null, 1));
        map.put("wealth_account_type", new TableInfo.Column("wealth_account_type", "TEXT", false, 0, null, 1));
        map.put("referral_reward_rate", new TableInfo.Column("referral_reward_rate", "TEXT", false, 0, null, 1));
        map.put("referral_reward_tax_breakdown", new TableInfo.Column("referral_reward_tax_breakdown", "TEXT", false, 0, null, 1));
        map.put("referral_reward_promised_amount_amount", new TableInfo.Column("referral_reward_promised_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("referral_reward_promised_amount_currency", new TableInfo.Column("referral_reward_promised_amount_currency", "TEXT", false, 0, null, 1));
        map.put("referral_reward_taxDetails_grossAmount_amount", new TableInfo.Column("referral_reward_taxDetails_grossAmount_amount", "INTEGER", false, 0, null, 1));
        map.put("referral_reward_taxDetails_grossAmount_currency", new TableInfo.Column("referral_reward_taxDetails_grossAmount_currency", "TEXT", false, 0, null, 1));
        map.put("referral_reward_taxDetails_tax_amount", new TableInfo.Column("referral_reward_taxDetails_tax_amount", "INTEGER", false, 0, null, 1));
        map.put("referral_reward_taxDetails_tax_currency", new TableInfo.Column("referral_reward_taxDetails_tax_currency", "TEXT", false, 0, null, 1));
        map.put("paid_plan_transaction_plan_id", new TableInfo.Column("paid_plan_transaction_plan_id", "TEXT", false, 0, null, 1));
        map.put("paid_plan_transaction_plan_tier", new TableInfo.Column("paid_plan_transaction_plan_tier", "TEXT", false, 0, null, 1));
        map.put("paid_plan_transaction_billing_cycle_id", new TableInfo.Column("paid_plan_transaction_billing_cycle_id", "TEXT", false, 0, null, 1));
        map.put("fromAccount_accountInfo_type", new TableInfo.Column("fromAccount_accountInfo_type", "TEXT", false, 0, null, 1));
        map.put("fromAccount_accountInfo_pocketId", new TableInfo.Column("fromAccount_accountInfo_pocketId", "TEXT", false, 0, null, 1));
        map.put("fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id", new TableInfo.Column("fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id", "TEXT", false, 0, null, 1));
        map.put("fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type", new TableInfo.Column("fromAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type", "TEXT", false, 0, null, 1));
        map.put("toAccount_accountInfo_type", new TableInfo.Column("toAccount_accountInfo_type", "TEXT", false, 0, null, 1));
        map.put("toAccount_accountInfo_pocketId", new TableInfo.Column("toAccount_accountInfo_pocketId", "TEXT", false, 0, null, 1));
        map.put("toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id", new TableInfo.Column("toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_id", "TEXT", false, 0, null, 1));
        map.put("toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type", new TableInfo.Column("toAccount_accountInfoRelatedEntity_accountInfoRelatedEmbedded_type", "TEXT", false, 0, null, 1));
        map.put("apm_contact_id", new TableInfo.Column("apm_contact_id", "TEXT", false, 0, null, 1));
        map.put("apm_contact_phone", new TableInfo.Column("apm_contact_phone", "TEXT", false, 0, null, 1));
        map.put("apm_contact_email", new TableInfo.Column("apm_contact_email", "TEXT", false, 0, null, 1));
        map.put("apm_contact_type", new TableInfo.Column("apm_contact_type", "TEXT", false, 0, null, 1));
        map.put("apm_contact_alias", new TableInfo.Column("apm_contact_alias", "TEXT", false, 0, null, 1));
        map.put("apm_contact_contactName", new TableInfo.Column("apm_contact_contactName", "TEXT", false, 0, null, 1));
        map.put("apm_info_provider", new TableInfo.Column("apm_info_provider", "TEXT", false, 0, null, 1));
        map.put("charges_taxes_taxes_breakdown", new TableInfo.Column("charges_taxes_taxes_breakdown", "TEXT", false, 0, null, 1));
        map.put("charges_taxes_total_amount", new TableInfo.Column("charges_taxes_total_amount", "INTEGER", false, 0, null, 1));
        map.put("charges_taxes_total_currency", new TableInfo.Column("charges_taxes_total_currency", "TEXT", false, 0, null, 1));
        map.put("charges_fees_fees_breakdown", new TableInfo.Column("charges_fees_fees_breakdown", "TEXT", false, 0, null, 1));
        map.put("charges_fees_total_amount", new TableInfo.Column("charges_fees_total_amount", "INTEGER", false, 0, null, 1));
        map.put("charges_fees_total_currency", new TableInfo.Column("charges_fees_total_currency", "TEXT", false, 0, null, 1));
        map.put("equivalent_amount", new TableInfo.Column("equivalent_amount", "INTEGER", false, 0, null, 1));
        HashSet hashSetS = prk.o.s(map, "equivalent_currency", new TableInfo.Column("equivalent_currency", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(4);
        hashSet.add(new TableInfo.Index("index_transactions_group_id", false, Arrays.asList("group_id"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_transactions_pocket_id", false, Arrays.asList("pocket_id"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_transactions_started_date", false, Arrays.asList("started_date"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_transactions_related_transaction_id", false, Arrays.asList("related_transaction_id"), Arrays.asList("ASC")));
        TableInfo tableInfo = new TableInfo("transactions", map, hashSetS, hashSet);
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "transactions");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("transactions(com.revolut.feature.transactions.impl.data.new_arch.database.entity.TransactionEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(3);
        map2.put("leg_id", new TableInfo.Column("leg_id", "TEXT", true, 1, null, 1));
        map2.put("group_id", new TableInfo.Column("group_id", "TEXT", true, 0, null, 1));
        HashSet hashSetS2 = prk.o.s(map2, "response", new TableInfo.Column("response", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new TableInfo.Index("index_transaction_details_group_id", false, Arrays.asList("group_id"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("transaction_details", map2, hashSetS2, hashSet2);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "transaction_details");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("transaction_details(com.revolut.feature.transactions.impl.data.new_arch.database.entity.TransactionDetailsEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(15);
        map3.put("transfer_user_key", new TableInfo.Column("transfer_user_key", "TEXT", true, 1, null, 1));
        map3.put("transfer_user_id", new TableInfo.Column("transfer_user_id", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_legal_name", new TableInfo.Column("transfer_user_legal_name", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_first_name", new TableInfo.Column("transfer_user_first_name", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_last_name", new TableInfo.Column("transfer_user_last_name", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_phone", new TableInfo.Column("transfer_user_phone", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_username", new TableInfo.Column("transfer_user_username", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_code", new TableInfo.Column("transfer_user_code", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_country", new TableInfo.Column("transfer_user_country", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_pocket_id", new TableInfo.Column("transfer_user_pocket_id", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_pocket_type", new TableInfo.Column("transfer_user_pocket_type", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_appMode", new TableInfo.Column("transfer_user_appMode", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_type", new TableInfo.Column("transfer_user_type", "TEXT", false, 0, null, 1));
        map3.put("transfer_user_businessName", new TableInfo.Column("transfer_user_businessName", "TEXT", false, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("transfer_users", map3, prk.o.s(map3, "transfer_user_individual_type", new TableInfo.Column("transfer_user_individual_type", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "transfer_users");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("transfer_users(com.revolut.feature.transactions.impl.data.new_arch.database.entity.TransferUserEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(20);
        map4.put("merchant_table_key", new TableInfo.Column("merchant_table_key", "TEXT", true, 1, null, 1));
        map4.put("merchant_merchant_identifier", new TableInfo.Column("merchant_merchant_identifier", "TEXT", false, 0, null, 1));
        map4.put("merchant_identifier", new TableInfo.Column("merchant_identifier", "TEXT", false, 0, null, 1));
        map4.put("merchant_blocked_merchant_id", new TableInfo.Column("merchant_blocked_merchant_id", "TEXT", false, 0, null, 1));
        map4.put("merchant_name", new TableInfo.Column("merchant_name", "TEXT", false, 0, null, 1));
        map4.put("merchant_mcc", new TableInfo.Column("merchant_mcc", "TEXT", false, 0, null, 1));
        map4.put("merchant_category", new TableInfo.Column("merchant_category", "TEXT", false, 0, null, 1));
        map4.put("merchant_city", new TableInfo.Column("merchant_city", "TEXT", false, 0, null, 1));
        map4.put("merchant_country", new TableInfo.Column("merchant_country", "TEXT", false, 0, null, 1));
        map4.put("merchant_address", new TableInfo.Column("merchant_address", "TEXT", false, 0, null, 1));
        map4.put("merchant_state", new TableInfo.Column("merchant_state", "TEXT", false, 0, null, 1));
        map4.put("merchant_postcode", new TableInfo.Column("merchant_postcode", "TEXT", false, 0, null, 1));
        map4.put("merchant_logo", new TableInfo.Column("merchant_logo", "TEXT", false, 0, null, 1));
        map4.put("merchant_background_color", new TableInfo.Column("merchant_background_color", "TEXT", false, 0, null, 1));
        map4.put("merchant_can_be_blocked", new TableInfo.Column("merchant_can_be_blocked", "INTEGER", false, 0, null, 1));
        map4.put("merchant_block_eligibility", new TableInfo.Column("merchant_block_eligibility", "TEXT", false, 0, null, 1));
        map4.put("merchant_brand_id", new TableInfo.Column("merchant_brand_id", "TEXT", false, 0, null, 1));
        map4.put("merchant_scheme", new TableInfo.Column("merchant_scheme", "TEXT", false, 0, null, 1));
        map4.put("merchant_location_latitude", new TableInfo.Column("merchant_location_latitude", "REAL", false, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("merchants", map4, prk.o.s(map4, "merchant_location_longitude", new TableInfo.Column("merchant_location_longitude", "REAL", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "merchants");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("merchants(com.revolut.feature.transactions.impl.data.new_arch.database.entity.MerchantEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(26);
        map5.put("merchant_payment_identifier", new TableInfo.Column("merchant_payment_identifier", "TEXT", true, 1, null, 1));
        map5.put("merchant_payment_type", new TableInfo.Column("merchant_payment_type", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_payment_method", new TableInfo.Column("merchant_payment_payment_method", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_settle_on", new TableInfo.Column("merchant_payment_settle_on", "INTEGER", false, 0, null, 1));
        map5.put("merchant_payment_order_id", new TableInfo.Column("merchant_payment_order_id", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_order_type", new TableInfo.Column("merchant_payment_order_type", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_order_description", new TableInfo.Column("merchant_payment_order_description", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_id", new TableInfo.Column("merchant_payment_customer_id", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_full_name", new TableInfo.Column("merchant_payment_customer_full_name", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_name", new TableInfo.Column("merchant_payment_customer_name", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_user_name", new TableInfo.Column("merchant_payment_customer_user_name", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_email", new TableInfo.Column("merchant_payment_customer_email", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_phone", new TableInfo.Column("merchant_payment_customer_phone", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_cardholder_name", new TableInfo.Column("merchant_payment_customer_cardholder_name", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_bin", new TableInfo.Column("merchant_payment_customer_card_bin", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_last_four", new TableInfo.Column("merchant_payment_customer_card_last_four", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_card_present", new TableInfo.Column("merchant_payment_customer_card_card_present", "INTEGER", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_expiry_month", new TableInfo.Column("merchant_payment_customer_card_expiry_month", "INTEGER", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_expiry_year", new TableInfo.Column("merchant_payment_customer_card_expiry_year", "INTEGER", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_bin_scheme", new TableInfo.Column("merchant_payment_customer_card_bin_scheme", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_bin_member_name", new TableInfo.Column("merchant_payment_customer_card_bin_member_name", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_card_brand", new TableInfo.Column("merchant_payment_customer_card_card_brand", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_product_code", new TableInfo.Column("merchant_payment_customer_card_product_code", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_card_type", new TableInfo.Column("merchant_payment_customer_card_card_type", "TEXT", false, 0, null, 1));
        map5.put("merchant_payment_customer_card_card_sub_type", new TableInfo.Column("merchant_payment_customer_card_card_sub_type", "TEXT", false, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("merchant_payments", map5, prk.o.s(map5, "merchant_payment_customer_card_country_code", new TableInfo.Column("merchant_payment_customer_card_country_code", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "merchant_payments");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("merchant_payments(com.revolut.feature.transactions.impl.data.new_arch.database.entity.MerchantPaymentEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(10);
        map6.put("acquiring_cashback_leg_id", new TableInfo.Column("acquiring_cashback_leg_id", "TEXT", true, 1, null, 1));
        map6.put("acquiring_cashback_amount", new TableInfo.Column("acquiring_cashback_amount", "INTEGER", false, 0, null, 1));
        map6.put("acquiring_cashback_currency", new TableInfo.Column("acquiring_cashback_currency", "TEXT", false, 0, null, 1));
        map6.put("acquiring_cashback_payout_type", new TableInfo.Column("acquiring_cashback_payout_type", "TEXT", false, 0, null, 1));
        map6.put("acquiring_cashback_payout_plan_rate", new TableInfo.Column("acquiring_cashback_payout_plan_rate", "REAL", false, 0, null, 1));
        map6.put("acquiring_cashback_payout_plan_amount", new TableInfo.Column("acquiring_cashback_payout_plan_amount", "INTEGER", false, 0, null, 1));
        map6.put("acquiring_cashback_payout_plan_currency", new TableInfo.Column("acquiring_cashback_payout_plan_currency", "TEXT", false, 0, null, 1));
        map6.put("acquiring_cashback_payout_booster_rate", new TableInfo.Column("acquiring_cashback_payout_booster_rate", "REAL", false, 0, null, 1));
        map6.put("acquiring_cashback_payout_booster_amount", new TableInfo.Column("acquiring_cashback_payout_booster_amount", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("acquiring_cashback", map6, prk.o.s(map6, "acquiring_cashback_payout_booster_currency", new TableInfo.Column("acquiring_cashback_payout_booster_currency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "acquiring_cashback");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("acquiring_cashback(com.revolut.feature.transactions.impl.data.new_arch.database.entity.AcquiringCashbackEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(29);
        map7.put("loan_leg_id", new TableInfo.Column("loan_leg_id", "TEXT", true, 1, null, 1));
        map7.put("loan_repayment_type", new TableInfo.Column("loan_repayment_type", "TEXT", false, 0, null, 1));
        map7.put("loan_repayment_mode", new TableInfo.Column("loan_repayment_mode", "TEXT", false, 0, null, 1));
        map7.put("loan_name", new TableInfo.Column("loan_name", "TEXT", false, 0, null, 1));
        map7.put("loan_id", new TableInfo.Column("loan_id", "TEXT", false, 0, null, 1));
        map7.put("loan_regular_loan_amount", new TableInfo.Column("loan_regular_loan_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_regular_interest_amount", new TableInfo.Column("loan_regular_interest_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_regular_fee_amount", new TableInfo.Column("loan_regular_fee_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_regular_principal_amount", new TableInfo.Column("loan_regular_principal_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_outstanding_loan_amount", new TableInfo.Column("loan_outstanding_loan_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_outstanding_interest_amount", new TableInfo.Column("loan_outstanding_interest_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_outstanding_fee_amount", new TableInfo.Column("loan_outstanding_fee_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_outstanding_principal_amount", new TableInfo.Column("loan_outstanding_principal_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_overdue_loan_amount", new TableInfo.Column("loan_overdue_loan_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_overdue_interest_amount", new TableInfo.Column("loan_overdue_interest_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_overdue_fee_amount", new TableInfo.Column("loan_overdue_fee_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_overdue_principal_amount", new TableInfo.Column("loan_overdue_principal_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_penalty_amount", new TableInfo.Column("loan_penalty_amount", "INTEGER", false, 0, null, 1));
        map7.put("loan_regularRescheduledPrincipalAmount", new TableInfo.Column("loan_regularRescheduledPrincipalAmount", "INTEGER", false, 0, null, 1));
        map7.put("loan_outstandingRescheduledPrincipalAmount", new TableInfo.Column("loan_outstandingRescheduledPrincipalAmount", "INTEGER", false, 0, null, 1));
        map7.put("loan_overdueRescheduledPrincipalAmount", new TableInfo.Column("loan_overdueRescheduledPrincipalAmount", "INTEGER", false, 0, null, 1));
        map7.put("loan_bank_identifier", new TableInfo.Column("loan_bank_identifier", "TEXT", false, 0, null, 1));
        map7.put("loan_account_number", new TableInfo.Column("loan_account_number", "TEXT", false, 0, null, 1));
        map7.put("loan_debtor_name", new TableInfo.Column("loan_debtor_name", "TEXT", false, 0, null, 1));
        map7.put("loan_product", new TableInfo.Column("loan_product", "TEXT", false, 0, null, 1));
        map7.put("loan_stampDuty_over_accrued_interest", new TableInfo.Column("loan_stampDuty_over_accrued_interest", "INTEGER", false, 0, null, 1));
        map7.put("loan_stampDuty_over_late_interest", new TableInfo.Column("loan_stampDuty_over_late_interest", "INTEGER", false, 0, null, 1));
        map7.put("loan_stampDuty_over_late_fee", new TableInfo.Column("loan_stampDuty_over_late_fee", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo13 = new TableInfo("loans", map7, prk.o.s(map7, "loan_stampDuty_total", new TableInfo.Column("loan_stampDuty_total", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "loans");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("loans(com.revolut.feature.transactions.impl.data.new_arch.database.entity.LoanEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(30);
        map8.put("extra_attr_leg_id", new TableInfo.Column("extra_attr_leg_id", "TEXT", true, 1, null, 1));
        map8.put("extra_attr_pocket_origin_type", new TableInfo.Column("extra_attr_pocket_origin_type", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_card_verification", new TableInfo.Column("extra_attr_card_verification", "INTEGER", false, 0, null, 1));
        map8.put("extra_attr_lounge_pass_ids", new TableInfo.Column("extra_attr_lounge_pass_ids", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_hotel_booking_id", new TableInfo.Column("extra_attr_hotel_booking_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_user_offer_id", new TableInfo.Column("extra_attr_user_offer_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_cashback_type", new TableInfo.Column("extra_attr_cashback_type", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_savings_vaults_bonus", new TableInfo.Column("extra_attr_savings_vaults_bonus", "INTEGER", false, 0, null, 1));
        map8.put("extra_attr_shops_brand_id", new TableInfo.Column("extra_attr_shops_brand_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_charity_id", new TableInfo.Column("extra_attr_charity_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_user_comment", new TableInfo.Column("extra_attr_user_comment", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_tax_recipient_id", new TableInfo.Column("extra_attr_tax_recipient_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_bill_account_id", new TableInfo.Column("extra_attr_bill_account_id", "TEXT", false, 0, null, 1));
        map8.put("extra_external_regulator_type", new TableInfo.Column("extra_external_regulator_type", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_acquiring_tax_payment", new TableInfo.Column("extra_attr_acquiring_tax_payment", "INTEGER", false, 0, null, 1));
        map8.put("extra_attr_can_be_marked_as_subscription", new TableInfo.Column("extra_attr_can_be_marked_as_subscription", "INTEGER", false, 0, null, 1));
        map8.put("extra_attr_staking_info_reward", new TableInfo.Column("extra_attr_staking_info_reward", "INTEGER", false, 0, null, 1));
        map8.put("extra_attr_merchant_block_eligibility", new TableInfo.Column("extra_attr_merchant_block_eligibility", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_transfer_reasons_catalogue", new TableInfo.Column("extra_attr_transfer_reasons_catalogue", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_guardian_id", new TableInfo.Column("extra_attr_guardian_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_attrs", new TableInfo.Column("extra_attr_attrs", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_payment_authorisation_id", new TableInfo.Column("extra_attr_payment_authorisation_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_payment_authorisation_type", new TableInfo.Column("extra_attr_payment_authorisation_type", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_linked_exchange_details_counterparty_pocket_id", new TableInfo.Column("extra_attr_linked_exchange_details_counterparty_pocket_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_money_request_id", new TableInfo.Column("extra_attr_money_request_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_money_request_requester_id", new TableInfo.Column("extra_attr_money_request_requester_id", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_money_request_requester_name", new TableInfo.Column("extra_attr_money_request_requester_name", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_money_request_requester_code", new TableInfo.Column("extra_attr_money_request_requester_code", "TEXT", false, 0, null, 1));
        map8.put("extra_attr_mcy_top_up_funding_status", new TableInfo.Column("extra_attr_mcy_top_up_funding_status", "TEXT", false, 0, null, 1));
        TableInfo tableInfo15 = new TableInfo("extra_attributes", map8, prk.o.s(map8, "extra_attr_mcy_top_up_funds_transfer_expire_time", new TableInfo.Column("extra_attr_mcy_top_up_funds_transfer_expire_time", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "extra_attributes");
        if (!tableInfo15.equals(tableInfo16)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("extra_attributes(com.revolut.feature.transactions.impl.data.new_arch.database.entity.ExtraAttributesEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16));
        }
        HashMap map9 = new HashMap(2);
        map9.put("leg_id", new TableInfo.Column("leg_id", "TEXT", true, 1, null, 1));
        TableInfo tableInfo17 = new TableInfo("hidden", map9, prk.o.s(map9, "hidden", new TableInfo.Column("hidden", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "hidden");
        if (!tableInfo17.equals(tableInfo18)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("hidden(com.revolut.feature.transactions.impl.data.new_arch.database.entity.HiddenEntity).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfo18));
        }
        HashMap map10 = new HashMap(4);
        map10.put("excluded_transaction_id", new TableInfo.Column("excluded_transaction_id", "TEXT", true, 1, null, 1));
        map10.put("included_amount", new TableInfo.Column("included_amount", "INTEGER", false, 0, null, 1));
        map10.put("included_amount_currency", new TableInfo.Column("included_amount_currency", "TEXT", false, 0, null, 1));
        TableInfo tableInfo19 = new TableInfo("excluded_transactions", map10, prk.o.s(map10, "excluded_type", new TableInfo.Column("excluded_type", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "excluded_transactions");
        if (!tableInfo19.equals(tableInfo20)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("excluded_transactions(com.revolut.feature.transactions.impl.data.new_arch.database.entity.ExcludedTransactionEntity).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfo20));
        }
        HashMap map11 = new HashMap(2);
        map11.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        TableInfo tableInfo21 = new TableInfo("loading_state", map11, prk.o.s(map11, "value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo22 = TableInfo.read(sQLiteConnection, "loading_state");
        if (!tableInfo21.equals(tableInfo22)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("loading_state(com.revolut.feature.transactions.impl.data.new_arch.database.entity.LoadingStateEntity).\n Expected:\n", tableInfo21, "\n Found:\n", tableInfo22));
        }
        HashMap map12 = new HashMap(8);
        map12.put("crypto_deposit_leg_id", new TableInfo.Column("crypto_deposit_leg_id", "TEXT", true, 1, null, 1));
        map12.put("transaction_hash", new TableInfo.Column("transaction_hash", "TEXT", false, 0, null, 1));
        map12.put("below_minimum", new TableInfo.Column("below_minimum", "INTEGER", false, 0, null, 1));
        map12.put("blockchain", new TableInfo.Column("blockchain", "TEXT", false, 0, null, 1));
        map12.put("deposit_state", new TableInfo.Column("deposit_state", "TEXT", false, 0, null, 1));
        map12.put("source_address", new TableInfo.Column("source_address", "TEXT", false, 0, null, 1));
        map12.put("display_rate", new TableInfo.Column("display_rate", "REAL", false, 0, null, 1));
        TableInfo tableInfo23 = new TableInfo("crypto_deposits", map12, prk.o.s(map12, "display_currency", new TableInfo.Column("display_currency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo24 = TableInfo.read(sQLiteConnection, "crypto_deposits");
        if (!tableInfo23.equals(tableInfo24)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("crypto_deposits(com.revolut.feature.transactions.impl.data.new_arch.database.entity.CryptoDepositEntity).\n Expected:\n", tableInfo23, "\n Found:\n", tableInfo24));
        }
        HashMap map13 = new HashMap(26);
        map13.put("defi_metadata_leg_id", new TableInfo.Column("defi_metadata_leg_id", "TEXT", true, 1, null, 1));
        map13.put("defi_metadata_account_id", new TableInfo.Column("defi_metadata_account_id", "TEXT", true, 0, null, 1));
        map13.put("defi_metadata_account_scoped_asset_id", new TableInfo.Column("defi_metadata_account_scoped_asset_id", "TEXT", true, 0, null, 1));
        map13.put("defi_metadata_counterpart_account_scoped_asset_id", new TableInfo.Column("defi_metadata_counterpart_account_scoped_asset_id", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_rate", new TableInfo.Column("defi_metadata_rate", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_chain", new TableInfo.Column("defi_metadata_chain", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_amount_value", new TableInfo.Column("defi_metadata_amount_value", "TEXT", true, 0, null, 1));
        map13.put("defi_metadata_amount_currency", new TableInfo.Column("defi_metadata_amount_currency", "TEXT", true, 0, null, 1));
        map13.put("defi_metadata_fee_value", new TableInfo.Column("defi_metadata_fee_value", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_fee_currency", new TableInfo.Column("defi_metadata_fee_currency", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_fiat_amount_value", new TableInfo.Column("defi_metadata_fiat_amount_value", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_fiat_amount_currency", new TableInfo.Column("defi_metadata_fiat_amount_currency", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_fee_fiat_amount_value", new TableInfo.Column("defi_metadata_fee_fiat_amount_value", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_fee_fiat_amount_currency", new TableInfo.Column("defi_metadata_fee_fiat_amount_currency", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_counterpart_fiat_amount_value", new TableInfo.Column("defi_metadata_counterpart_fiat_amount_value", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_counterpart_fiat_amount_currency", new TableInfo.Column("defi_metadata_counterpart_fiat_amount_currency", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_counterpart_value", new TableInfo.Column("defi_metadata_counterpart_value", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_counterpart_currency", new TableInfo.Column("defi_metadata_counterpart_currency", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_bundle_id", new TableInfo.Column("defi_metadata_bundle_id", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_bundle_link", new TableInfo.Column("defi_metadata_bundle_link", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_on_chain_tx_hash", new TableInfo.Column("defi_metadata_on_chain_tx_hash", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_on_chain_tx_link", new TableInfo.Column("defi_metadata_on_chain_tx_link", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_recipient_wallet_address", new TableInfo.Column("defi_metadata_recipient_wallet_address", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_recipient_link", new TableInfo.Column("defi_metadata_recipient_link", "TEXT", false, 0, null, 1));
        map13.put("defi_metadata_sender_wallet_address", new TableInfo.Column("defi_metadata_sender_wallet_address", "TEXT", false, 0, null, 1));
        HashSet hashSetS3 = prk.o.s(map13, "defi_metadata_sender_link", new TableInfo.Column("defi_metadata_sender_link", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new TableInfo.Index("index_defi_metadata_defi_metadata_account_scoped_asset_id", false, Arrays.asList("defi_metadata_account_scoped_asset_id"), Arrays.asList("ASC")));
        TableInfo tableInfo25 = new TableInfo("defi_metadata", map13, hashSetS3, hashSet3);
        TableInfo tableInfo26 = TableInfo.read(sQLiteConnection, "defi_metadata");
        if (!tableInfo25.equals(tableInfo26)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("defi_metadata(com.revolut.feature.transactions.impl.data.new_arch.database.entity.DeFiMetadataEntity).\n Expected:\n", tableInfo25, "\n Found:\n", tableInfo26));
        }
        HashMap map14 = new HashMap(2);
        map14.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        TableInfo tableInfo27 = new TableInfo("calculated_balance_state", map14, prk.o.s(map14, "value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo28 = TableInfo.read(sQLiteConnection, "calculated_balance_state");
        if (!tableInfo27.equals(tableInfo28)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("calculated_balance_state(com.revolut.feature.transactions.impl.data.new_arch.database.entity.CalculatedBalanceStateEntity).\n Expected:\n", tableInfo27, "\n Found:\n", tableInfo28));
        }
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add("leg_id");
        hashSet4.add("content_index");
        FtsTableInfo ftsTableInfo = new FtsTableInfo("search_indexes", hashSet4, "CREATE VIRTUAL TABLE IF NOT EXISTS `search_indexes` USING FTS4(`leg_id` TEXT NOT NULL, `content_index` TEXT NOT NULL)");
        FtsTableInfo ftsTableInfo2 = FtsTableInfo.read(sQLiteConnection, "search_indexes");
        if (!ftsTableInfo.equals(ftsTableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, "search_indexes(com.revolut.feature.transactions.impl.data.new_arch.database.entity.SearchIndexEntity).\n Expected:\n" + ftsTableInfo + "\n Found:\n" + ftsTableInfo2);
        }
        HashMap map15 = new HashMap(3);
        map15.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map15.put("value", new TableInfo.Column("value", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo29 = new TableInfo("search_index_state", map15, prk.o.s(map15, "value_string", new TableInfo.Column("value_string", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo30 = TableInfo.read(sQLiteConnection, "search_index_state");
        return !tableInfo29.equals(tableInfo30) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("search_index_state(com.revolut.feature.transactions.impl.data.new_arch.database.entity.SearchIndexStateEntity).\n Expected:\n", tableInfo29, "\n Found:\n", tableInfo30)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
