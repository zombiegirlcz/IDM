package yqk;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.stockdetails.impl.data.database.StockDetailsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StockDetailsDatabase_Impl f316042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StockDetailsDatabase_Impl stockDetailsDatabase_Impl) {
        super(3, "77bac0de15896f0af15e582c9ac78630", "ad54c9252d4c9cbebf1cbfb79e49eb3f");
        this.f316042a = stockDetailsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `stock_financials` (`ref` TEXT NOT NULL, `year` INTEGER NOT NULL, `interimPeriod` INTEGER, `identifier` TEXT NOT NULL, `margin` REAL, `revenue_amount` INTEGER, `revenue_currency` TEXT, `netIncome_amount` INTEGER, `netIncome_currency` TEXT, `debtToAssets` REAL, `assets_amount` INTEGER, `assets_currency` TEXT, `liabilities_amount` INTEGER, `liabilities_currency` TEXT, `operating_amount` INTEGER, `operating_currency` TEXT, `investing_amount` INTEGER, `investing_currency` TEXT, `financing_amount` INTEGER, `financing_currency` TEXT, `freeCashFlow_amount` INTEGER, `freeCashFlow_currency` TEXT, PRIMARY KEY(`ref`, `identifier`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `stock_financials_statements` (`ref` TEXT NOT NULL, `type` TEXT NOT NULL, `year` INTEGER NOT NULL, `quarter` INTEGER, `statementItems` TEXT NOT NULL, `quarterId` TEXT NOT NULL, PRIMARY KEY(`ref`, `type`, `year`, `quarterId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '77bac0de15896f0af15e582c9ac78630')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `stock_financials`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `stock_financials_statements`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = StockDetailsDatabase_Impl.f103751j;
        this.f316042a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(22);
        map.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map.put("year", new TableInfo.Column("year", "INTEGER", true, 0, null, 1));
        map.put("interimPeriod", new TableInfo.Column("interimPeriod", "INTEGER", false, 0, null, 1));
        map.put("identifier", new TableInfo.Column("identifier", "TEXT", true, 2, null, 1));
        map.put("margin", new TableInfo.Column("margin", "REAL", false, 0, null, 1));
        map.put("revenue_amount", new TableInfo.Column("revenue_amount", "INTEGER", false, 0, null, 1));
        map.put("revenue_currency", new TableInfo.Column("revenue_currency", "TEXT", false, 0, null, 1));
        map.put("netIncome_amount", new TableInfo.Column("netIncome_amount", "INTEGER", false, 0, null, 1));
        map.put("netIncome_currency", new TableInfo.Column("netIncome_currency", "TEXT", false, 0, null, 1));
        map.put("debtToAssets", new TableInfo.Column("debtToAssets", "REAL", false, 0, null, 1));
        map.put("assets_amount", new TableInfo.Column("assets_amount", "INTEGER", false, 0, null, 1));
        map.put("assets_currency", new TableInfo.Column("assets_currency", "TEXT", false, 0, null, 1));
        map.put("liabilities_amount", new TableInfo.Column("liabilities_amount", "INTEGER", false, 0, null, 1));
        map.put("liabilities_currency", new TableInfo.Column("liabilities_currency", "TEXT", false, 0, null, 1));
        map.put("operating_amount", new TableInfo.Column("operating_amount", "INTEGER", false, 0, null, 1));
        map.put("operating_currency", new TableInfo.Column("operating_currency", "TEXT", false, 0, null, 1));
        map.put("investing_amount", new TableInfo.Column("investing_amount", "INTEGER", false, 0, null, 1));
        map.put("investing_currency", new TableInfo.Column("investing_currency", "TEXT", false, 0, null, 1));
        map.put("financing_amount", new TableInfo.Column("financing_amount", "INTEGER", false, 0, null, 1));
        map.put("financing_currency", new TableInfo.Column("financing_currency", "TEXT", false, 0, null, 1));
        map.put("freeCashFlow_amount", new TableInfo.Column("freeCashFlow_amount", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("stock_financials", map, o.s(map, "freeCashFlow_currency", new TableInfo.Column("freeCashFlow_currency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "stock_financials");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("stock_financials(com.revolut.retail.feature.stockdetails.impl.data.database.model.StockFinancialsEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(6);
        map2.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 2, null, 1));
        map2.put("year", new TableInfo.Column("year", "INTEGER", true, 3, null, 1));
        map2.put("quarter", new TableInfo.Column("quarter", "INTEGER", false, 0, null, 1));
        map2.put("statementItems", new TableInfo.Column("statementItems", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("stock_financials_statements", map2, o.s(map2, "quarterId", new TableInfo.Column("quarterId", "TEXT", true, 4, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "stock_financials_statements");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("stock_financials_statements(com.revolut.retail.feature.stockdetails.impl.data.database.model.StockFinancialsStatementEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
