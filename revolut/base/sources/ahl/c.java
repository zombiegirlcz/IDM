package ahl;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.WealthDiscoveryDomainDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WealthDiscoveryDomainDatabase_Impl f5134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WealthDiscoveryDomainDatabase_Impl wealthDiscoveryDomainDatabase_Impl) {
        super(1, "75ef5da049f28a857c92c24e322bc33d", "5b04d1b7c2674c23f83b44fceaa20d7f");
        this.f5134a = wealthDiscoveryDomainDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `entities_adt` (`id` TEXT NOT NULL, `completed_date` TEXT NOT NULL, `updated_date` TEXT NOT NULL, `trade_symbol` TEXT, `trade_ref` TEXT, `trade_amount` TEXT, `trade_quantity` REAL, `trade_fees` TEXT, `trade_commission` TEXT, `trade_executed_price` TEXT, `trade_side` TEXT, `cash_amount` TEXT, `cash_side` TEXT, `dividend_symbol` TEXT, `dividend_ref` TEXT, `dividend_amount` TEXT, `dividend_tax_symbol` TEXT, `dividend_tax_ref` TEXT, `dividend_tax_fees` TEXT, `custody_fees` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_entities_adt_completed_date` ON `entities_adt` (`completed_date`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_entities_adt_updated_date` ON `entities_adt` (`updated_date`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '75ef5da049f28a857c92c24e322bc33d')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `entities_adt`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = WealthDiscoveryDomainDatabase_Impl.k;
        this.f5134a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(20);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("completed_date", new TableInfo.Column("completed_date", "TEXT", true, 0, null, 1));
        map.put("updated_date", new TableInfo.Column("updated_date", "TEXT", true, 0, null, 1));
        map.put("trade_symbol", new TableInfo.Column("trade_symbol", "TEXT", false, 0, null, 1));
        map.put("trade_ref", new TableInfo.Column("trade_ref", "TEXT", false, 0, null, 1));
        map.put("trade_amount", new TableInfo.Column("trade_amount", "TEXT", false, 0, null, 1));
        map.put("trade_quantity", new TableInfo.Column("trade_quantity", "REAL", false, 0, null, 1));
        map.put("trade_fees", new TableInfo.Column("trade_fees", "TEXT", false, 0, null, 1));
        map.put("trade_commission", new TableInfo.Column("trade_commission", "TEXT", false, 0, null, 1));
        map.put("trade_executed_price", new TableInfo.Column("trade_executed_price", "TEXT", false, 0, null, 1));
        map.put("trade_side", new TableInfo.Column("trade_side", "TEXT", false, 0, null, 1));
        map.put("cash_amount", new TableInfo.Column("cash_amount", "TEXT", false, 0, null, 1));
        map.put("cash_side", new TableInfo.Column("cash_side", "TEXT", false, 0, null, 1));
        map.put("dividend_symbol", new TableInfo.Column("dividend_symbol", "TEXT", false, 0, null, 1));
        map.put("dividend_ref", new TableInfo.Column("dividend_ref", "TEXT", false, 0, null, 1));
        map.put("dividend_amount", new TableInfo.Column("dividend_amount", "TEXT", false, 0, null, 1));
        map.put("dividend_tax_symbol", new TableInfo.Column("dividend_tax_symbol", "TEXT", false, 0, null, 1));
        map.put("dividend_tax_ref", new TableInfo.Column("dividend_tax_ref", "TEXT", false, 0, null, 1));
        map.put("dividend_tax_fees", new TableInfo.Column("dividend_tax_fees", "TEXT", false, 0, null, 1));
        HashSet hashSetS = o.s(map, "custody_fees", new TableInfo.Column("custody_fees", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(2);
        hashSet.add(new TableInfo.Index("index_entities_adt_completed_date", false, Arrays.asList("completed_date"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_entities_adt_updated_date", false, Arrays.asList("updated_date"), Arrays.asList("ASC")));
        TableInfo tableInfo = new TableInfo("entities_adt", map, hashSetS, hashSet);
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "entities_adt");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("entities_adt(com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.model.TradingEventAdtEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
