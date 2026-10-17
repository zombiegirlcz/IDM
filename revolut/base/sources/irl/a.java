package irl;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.trading.orders.data.db.OrdersDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OrdersDatabase_Impl f168064a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OrdersDatabase_Impl ordersDatabase_Impl) {
        super(24, "8e2d648445bd3cdc957a1faef0408759", "f0de0b09232a63ba4508d53340c9a819");
        this.f168064a = ordersDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `invest_orders` (`id` TEXT NOT NULL, `account_type` TEXT NOT NULL, `compound_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `completed_at` INTEGER, `side` TEXT NOT NULL, `state` TEXT NOT NULL, `order_type` TEXT NOT NULL, `currency_pair_first` TEXT NOT NULL, `currency_pair_second` TEXT NOT NULL, `symbol` TEXT, `instrument_type` TEXT NOT NULL, `stock_order` TEXT, `tax_advantaged_order` TEXT, `commodity_order` TEXT, `margin_order` TEXT, `fund_order` TEXT, `mutual_fund_order` TEXT, `option_order` TEXT, `initiated_by` TEXT, `account_holder_type` TEXT NOT NULL, `blocking` INTEGER, `portfolio_id` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8e2d648445bd3cdc957a1faef0408759')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `invest_orders`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = OrdersDatabase_Impl.f106799j;
        this.f168064a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(24);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("account_type", new TableInfo.Column("account_type", "TEXT", true, 0, null, 1));
        map.put("compound_id", new TableInfo.Column("compound_id", "TEXT", true, 0, null, 1));
        map.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, 1));
        map.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, 1));
        map.put("completed_at", new TableInfo.Column("completed_at", "INTEGER", false, 0, null, 1));
        map.put("side", new TableInfo.Column("side", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("order_type", new TableInfo.Column("order_type", "TEXT", true, 0, null, 1));
        map.put("currency_pair_first", new TableInfo.Column("currency_pair_first", "TEXT", true, 0, null, 1));
        map.put("currency_pair_second", new TableInfo.Column("currency_pair_second", "TEXT", true, 0, null, 1));
        map.put("symbol", new TableInfo.Column("symbol", "TEXT", false, 0, null, 1));
        map.put("instrument_type", new TableInfo.Column("instrument_type", "TEXT", true, 0, null, 1));
        map.put("stock_order", new TableInfo.Column("stock_order", "TEXT", false, 0, null, 1));
        map.put("tax_advantaged_order", new TableInfo.Column("tax_advantaged_order", "TEXT", false, 0, null, 1));
        map.put("commodity_order", new TableInfo.Column("commodity_order", "TEXT", false, 0, null, 1));
        map.put("margin_order", new TableInfo.Column("margin_order", "TEXT", false, 0, null, 1));
        map.put("fund_order", new TableInfo.Column("fund_order", "TEXT", false, 0, null, 1));
        map.put("mutual_fund_order", new TableInfo.Column("mutual_fund_order", "TEXT", false, 0, null, 1));
        map.put("option_order", new TableInfo.Column("option_order", "TEXT", false, 0, null, 1));
        map.put("initiated_by", new TableInfo.Column("initiated_by", "TEXT", false, 0, null, 1));
        map.put("account_holder_type", new TableInfo.Column("account_holder_type", "TEXT", true, 0, null, 1));
        map.put("blocking", new TableInfo.Column("blocking", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("invest_orders", map, o.s(map, "portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "invest_orders");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("invest_orders(com.revolut.trading.orders.data.db.entity.InvestOrderEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
