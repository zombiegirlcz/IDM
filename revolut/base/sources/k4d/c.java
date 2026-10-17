package k4d;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeparateFavouritesItemDatabase_Impl f180897a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SeparateFavouritesItemDatabase_Impl separateFavouritesItemDatabase_Impl) {
        super(7, "f2c01ad619070d2b8ea2d1663db44c8b", "5f3bfd1ec6d8cdd58289cca1bebd6570");
        this.f180897a = separateFavouritesItemDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plain_watchlist_items` (`asset_type_key` TEXT NOT NULL, `fromCode` TEXT NOT NULL, `toCode` TEXT NOT NULL, `added_time` INTEGER NOT NULL, `sync_state` TEXT NOT NULL, PRIMARY KEY(`asset_type_key`, `fromCode`, `toCode`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plain_multiple_watchlists_items` (`watchlist_id` TEXT NOT NULL, `asset_type_key` TEXT NOT NULL, `from_code` TEXT NOT NULL, `to_code` TEXT NOT NULL, `added_time` INTEGER NOT NULL, `sync_state` TEXT NOT NULL, PRIMARY KEY(`asset_type_key`, `from_code`, `to_code`, `watchlist_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `converter_items` (`asset_type_key` TEXT NOT NULL, `asset_code` TEXT NOT NULL, `amount` INTEGER NOT NULL, `weight` INTEGER NOT NULL, PRIMARY KEY(`asset_type_key`, `asset_code`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `alert_items` (`id` TEXT NOT NULL, `from_id` TEXT NOT NULL, `from_name` TEXT NOT NULL, `from_type_key` TEXT NOT NULL, `to` TEXT NOT NULL, `target_rate` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `completed_at` INTEGER, `type` TEXT NOT NULL DEFAULT 'TARGET_PRICE', `note` TEXT NOT NULL DEFAULT '', `frequency` TEXT DEFAULT 'ONE_TIME', `percentage` TEXT DEFAULT NULL, `time_range` TEXT DEFAULT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `watchlists` (`watchlist_id` TEXT NOT NULL, `name` TEXT NOT NULL, `is_default` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, PRIMARY KEY(`watchlist_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f2c01ad619070d2b8ea2d1663db44c8b')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `plain_watchlist_items`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `plain_multiple_watchlists_items`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `converter_items`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `alert_items`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `watchlists`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = SeparateFavouritesItemDatabase_Impl.f86022m;
        this.f180897a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(5);
        map.put("asset_type_key", new TableInfo.Column("asset_type_key", "TEXT", true, 1, null, 1));
        map.put("fromCode", new TableInfo.Column("fromCode", "TEXT", true, 2, null, 1));
        map.put("toCode", new TableInfo.Column("toCode", "TEXT", true, 3, null, 1));
        map.put("added_time", new TableInfo.Column("added_time", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("plain_watchlist_items", map, o.s(map, "sync_state", new TableInfo.Column("sync_state", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "plain_watchlist_items");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("plain_watchlist_items(com.revolut.feature.separate_favourites.item_data.impl.watchlist.entities.PlainWatchlistItemEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(6);
        map2.put("watchlist_id", new TableInfo.Column("watchlist_id", "TEXT", true, 4, null, 1));
        map2.put("asset_type_key", new TableInfo.Column("asset_type_key", "TEXT", true, 1, null, 1));
        map2.put("from_code", new TableInfo.Column("from_code", "TEXT", true, 2, null, 1));
        map2.put("to_code", new TableInfo.Column("to_code", "TEXT", true, 3, null, 1));
        map2.put("added_time", new TableInfo.Column("added_time", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("plain_multiple_watchlists_items", map2, o.s(map2, "sync_state", new TableInfo.Column("sync_state", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "plain_multiple_watchlists_items");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("plain_multiple_watchlists_items(com.revolut.feature.separate_favourites.item_data.impl.watchlist.entities.PlainWatchlistsItemEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(4);
        map3.put("asset_type_key", new TableInfo.Column("asset_type_key", "TEXT", true, 1, null, 1));
        map3.put("asset_code", new TableInfo.Column("asset_code", "TEXT", true, 2, null, 1));
        map3.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("converter_items", map3, o.s(map3, "weight", new TableInfo.Column("weight", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "converter_items");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("converter_items(com.revolut.feature.separate_favourites.item_data.impl.converter.entities.ConverterItemEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(13);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("from_id", new TableInfo.Column("from_id", "TEXT", true, 0, null, 1));
        map4.put("from_name", new TableInfo.Column("from_name", "TEXT", true, 0, null, 1));
        map4.put("from_type_key", new TableInfo.Column("from_type_key", "TEXT", true, 0, null, 1));
        map4.put("to", new TableInfo.Column("to", "TEXT", true, 0, null, 1));
        map4.put("target_rate", new TableInfo.Column("target_rate", "TEXT", true, 0, null, 1));
        map4.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, 1));
        map4.put("completed_at", new TableInfo.Column("completed_at", "INTEGER", false, 0, null, 1));
        map4.put("type", new TableInfo.Column("type", "TEXT", true, 0, "'TARGET_PRICE'", 1));
        map4.put("note", new TableInfo.Column("note", "TEXT", true, 0, "''", 1));
        map4.put("frequency", new TableInfo.Column("frequency", "TEXT", false, 0, "'ONE_TIME'", 1));
        map4.put("percentage", new TableInfo.Column("percentage", "TEXT", false, 0, "NULL", 1));
        TableInfo tableInfo7 = new TableInfo("alert_items", map4, o.s(map4, "time_range", new TableInfo.Column("time_range", "TEXT", false, 0, "NULL", 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "alert_items");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("alert_items(com.revolut.feature.separate_favourites.item_data.impl.alerts.entities.AlertItemEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(4);
        map5.put("watchlist_id", new TableInfo.Column("watchlist_id", "TEXT", true, 1, null, 1));
        map5.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map5.put("is_default", new TableInfo.Column("is_default", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("watchlists", map5, o.s(map5, "display_order", new TableInfo.Column("display_order", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "watchlists");
        return !tableInfo9.equals(tableInfo10) ? new RoomOpenDelegate.ValidationResult(false, o.o("watchlists(com.revolut.feature.separate_favourites.item_data.impl.watchlist.entities.WatchlistEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
