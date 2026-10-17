package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class v4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v4 f202507c = new v4();

    private v4() {
        super(98, 99);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `trading_trades_temp` (`trade_id` TEXT NOT NULL, `compound_id` TEXT, `holding_id` TEXT NOT NULL, `state` TEXT NOT NULL, `completed_at` INTEGER, `updated_at` INTEGER, `created_at` INTEGER NOT NULL, `stock_trade` TEXT, `cash_trade` TEXT, `dividend_trade` TEXT, `bond_coupon` TEXT, `bond_redemption` TEXT, `custody_fees` TEXT, `margin_trade` TEXT, `commodity_trade` TEXT, `exchange_trade` TEXT, `stock_transfer_trade` TEXT, `value` TEXT NOT NULL, `settlementDate` INTEGER, `slip_transaction` INTEGER NOT NULL, `stock_transfer_fee` INTEGER NOT NULL, `commission_refund` INTEGER NOT NULL, `refund` TEXT, `overnight_fee` INTEGER NOT NULL, `standing_order_id` TEXT, `client_order_id` TEXT, `account_type` TEXT NOT NULL, `portfolio_id` TEXT, `price_adjustment` INTEGER NOT NULL, `base_instrument_currency` TEXT, `counter_instrument_currency` TEXT, PRIMARY KEY(`trade_id`))", "INSERT INTO `trading_trades_temp` (`trade_id`, `compound_id`, `holding_id`, `state`, `completed_at`, `updated_at`, `created_at`, `stock_trade`, `cash_trade`, `dividend_trade`, `bond_coupon`, `bond_redemption`, `custody_fees`, `margin_trade`, `commodity_trade`, `exchange_trade`, `stock_transfer_trade`, `value`, `settlementDate`, `slip_transaction`, `stock_transfer_fee`, `commission_refund`, `refund`, `overnight_fee`, `standing_order_id`, `client_order_id`, `account_type`, `portfolio_id`, `price_adjustment`, `base_instrument_currency`, `counter_instrument_currency`) \n    SELECT \n        `trade_id`,\n        `compound_id`,\n        `holding_id`,\n        `state`,\n        `completed_at`,\n        `updated_at`,\n        `created_at`,\n        `stock_trade`,\n        `cash_trade`,\n        `dividend_trade`,\n        `bond_coupon`,\n        `bond_redemption`,\n        `custody_fees`,\n        `margin_trade`,\n        `commodity_trade`,\n        `exchange_trade`,\n        `stock_transfer_trade`,\n        `value`,\n        `settlementDate`,\n        `slip_transaction`,\n        `stock_transfer_fee`,\n        `commission_refund`,\n        CASE `refund`\n            WHEN 0 THEN NULL\n            ELSE '{\"refundType\":\"UNKNOWN\"}'\n        END,\n        `overnight_fee`,\n        `standing_order_id`,\n        `client_order_id`,\n        `account_type`,\n        `portfolio_id`,\n        `price_adjustment`,\n        `base_instrument_currency`,\n        `counter_instrument_currency`\n    FROM \n        `trading_trades`", "DROP TABLE IF EXISTS `trading_trades`");
        prk.o.D(supportSQLiteDatabase, "ALTER TABLE `trading_trades_temp` RENAME TO `trading_trades`", "CREATE INDEX IF NOT EXISTS `index_trading_trades_holding_id_created_at` ON `trading_trades` (`holding_id`, `created_at`)", "CREATE INDEX IF NOT EXISTS `index_trading_trades_created_at` ON `trading_trades` (`created_at`)", "CREATE INDEX IF NOT EXISTS `index_trading_trades_account_type_completed_at_updated_at_created_at` ON `trading_trades` (`account_type`, `completed_at`, `updated_at`, `created_at`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_trading_trades_compound_id` ON `trading_trades` (`compound_id`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_trading_trades_holding_id` ON `trading_trades` (`holding_id`)");
    }
}
