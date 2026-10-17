package n77;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GlobalMarketsDatabase_Impl f213011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GlobalMarketsDatabase_Impl globalMarketsDatabase_Impl) {
        super(4, "cd50d4345af17c0bee67067f51f513e4", "1d03dc915d9bbd866c6a05a5fb268c1d");
        this.f213011a = globalMarketsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `market_assets` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `description` TEXT, `symbol` TEXT, `ref` TEXT, `currency` TEXT, `baseCurrency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `index_details` (`ref` TEXT NOT NULL, `symbol` TEXT NOT NULL, `baseCurrency` TEXT, `shortDescription` TEXT, `description` TEXT, PRIMARY KEY(`ref`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cd50d4345af17c0bee67067f51f513e4')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `market_assets`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `index_details`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = GlobalMarketsDatabase_Impl.f74579l;
        this.f213011a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(7);
        map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map.put("symbol", new TableInfo.Column("symbol", "TEXT", false, 0, null, 1));
        map.put("ref", new TableInfo.Column("ref", "TEXT", false, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("market_assets", map, o.s(map, "baseCurrency", new TableInfo.Column("baseCurrency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "market_assets");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("market_assets(com.revolut.feature.global_markets.impl.data.database.MarketAssetEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(5);
        map2.put("ref", new TableInfo.Column("ref", "TEXT", true, 1, null, 1));
        map2.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map2.put("baseCurrency", new TableInfo.Column("baseCurrency", "TEXT", false, 0, null, 1));
        map2.put("shortDescription", new TableInfo.Column("shortDescription", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("index_details", map2, o.s(map2, "description", new TableInfo.Column("description", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "index_details");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("index_details(com.revolut.feature.global_markets.impl.data.database.IndexDetailsEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
