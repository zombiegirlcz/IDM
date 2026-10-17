package qpj;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.impl.AnalyticsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalyticsDatabase_Impl f248435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        super(18, "1345c9e075aa8b90fc51b825db8cc6cf", "4655f652e5f1e33c93ae5d213257bff7");
        this.f248435a = analyticsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `income_sorters` (`id` TEXT NOT NULL, `walletId` TEXT NOT NULL, `baseTransactionId` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `destinations` TEXT NOT NULL, `sortMethod` TEXT, `remainingBalanceDestinationId` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `income_sorter_executions` (`id` TEXT NOT NULL, `incomeSorterId` TEXT NOT NULL, `state` TEXT NOT NULL, `sourceTransactionId` TEXT NOT NULL, `updatedDate` INTEGER NOT NULL, `destinations` TEXT NOT NULL, `remainderDestination` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `balance_history` (`date` INTEGER NOT NULL, `source` TEXT NOT NULL, `balance` INTEGER NOT NULL, PRIMARY KEY(`date`, `source`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `trips` (`id` TEXT NOT NULL, `startDate` INTEGER, `endDate` INTEGER, `countryCode` TEXT NOT NULL, `transactionAdjustments` TEXT NOT NULL DEFAULT '', `createdDate` INTEGER NOT NULL DEFAULT 0, `deleted` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `trips_metadata` (`id` INTEGER NOT NULL, `lastModified` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_assets` (`id` TEXT NOT NULL, `category` TEXT NOT NULL, `attributes` TEXT NOT NULL, `value_history` TEXT NOT NULL, `next_estimation_date` INTEGER, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `state` TEXT NOT NULL, `value_source` TEXT NOT NULL DEFAULT 'USER', `smart_estimation_enabled` INTEGER NOT NULL DEFAULT 0, `smart_estimation_rejected` INTEGER NOT NULL DEFAULT 0, `currentValue_amount` INTEGER, `currentValue_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `field_definitions` (`category` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `component` TEXT NOT NULL, `required` INTEGER NOT NULL, `options` TEXT NOT NULL, `max_length` INTEGER, `required_for` TEXT NOT NULL DEFAULT '[]', `supports_smart_estimation` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`category`, `name`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1345c9e075aa8b90fc51b825db8cc6cf')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `income_sorters`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `income_sorter_executions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `balance_history`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `trips`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `trips_metadata`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_assets`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `field_definitions`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = AnalyticsDatabase_Impl.o;
        this.f248435a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(10);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 0, null, 1));
        map.put("baseTransactionId", new TableInfo.Column("baseTransactionId", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        map.put("destinations", new TableInfo.Column("destinations", "TEXT", true, 0, null, 1));
        map.put("sortMethod", new TableInfo.Column("sortMethod", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("income_sorters", map, prk.o.s(map, "remainingBalanceDestinationId", new TableInfo.Column("remainingBalanceDestinationId", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "income_sorters");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("income_sorters(com.revolut.retail.feature.impl.income_sorter.database.entity.IncomeSorterEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(7);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("incomeSorterId", new TableInfo.Column("incomeSorterId", "TEXT", true, 0, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map2.put("sourceTransactionId", new TableInfo.Column("sourceTransactionId", "TEXT", true, 0, null, 1));
        map2.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        map2.put("destinations", new TableInfo.Column("destinations", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("income_sorter_executions", map2, prk.o.s(map2, "remainderDestination", new TableInfo.Column("remainderDestination", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "income_sorter_executions");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("income_sorter_executions(com.revolut.retail.feature.impl.income_sorter.database.entity.IncomeSorterExecutionEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(3);
        map3.put("date", new TableInfo.Column("date", "INTEGER", true, 1, null, 1));
        map3.put("source", new TableInfo.Column("source", "TEXT", true, 2, null, 1));
        TableInfo tableInfo5 = new TableInfo("balance_history", map3, prk.o.s(map3, "balance", new TableInfo.Column("balance", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "balance_history");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("balance_history(com.revolut.retail.feature.impl.balance_history.database.entity.BalanceHistoryEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(7);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("startDate", new TableInfo.Column("startDate", "INTEGER", false, 0, null, 1));
        map4.put("endDate", new TableInfo.Column("endDate", "INTEGER", false, 0, null, 1));
        map4.put("countryCode", new TableInfo.Column("countryCode", "TEXT", true, 0, null, 1));
        map4.put("transactionAdjustments", new TableInfo.Column("transactionAdjustments", "TEXT", true, 0, "''", 1));
        map4.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, "0", 1));
        TableInfo tableInfo7 = new TableInfo("trips", map4, prk.o.s(map4, "deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, "false", 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "trips");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("trips(com.revolut.retail.feature.impl.trips.database.entity.TripEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(2);
        map5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        TableInfo tableInfo9 = new TableInfo("trips_metadata", map5, prk.o.s(map5, "lastModified", new TableInfo.Column("lastModified", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "trips_metadata");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("trips_metadata(com.revolut.retail.feature.impl.trips.database.entity.TripsMetadataEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(13);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, 1));
        map6.put("attributes", new TableInfo.Column("attributes", "TEXT", true, 0, null, 1));
        map6.put("value_history", new TableInfo.Column("value_history", "TEXT", true, 0, null, 1));
        map6.put("next_estimation_date", new TableInfo.Column("next_estimation_date", "INTEGER", false, 0, null, 1));
        map6.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, 1));
        map6.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, 1));
        map6.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map6.put("value_source", new TableInfo.Column("value_source", "TEXT", true, 0, "'USER'", 1));
        map6.put("smart_estimation_enabled", new TableInfo.Column("smart_estimation_enabled", "INTEGER", true, 0, "0", 1));
        map6.put("smart_estimation_rejected", new TableInfo.Column("smart_estimation_rejected", "INTEGER", true, 0, "0", 1));
        map6.put("currentValue_amount", new TableInfo.Column("currentValue_amount", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("custom_assets", map6, prk.o.s(map6, "currentValue_currency", new TableInfo.Column("currentValue_currency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "custom_assets");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("custom_assets(com.revolut.retail.feature.impl.custom_assets.database.entity.CustomAssetEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(9);
        map7.put("category", new TableInfo.Column("category", "TEXT", true, 1, null, 1));
        map7.put("name", new TableInfo.Column("name", "TEXT", true, 2, null, 1));
        map7.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map7.put("component", new TableInfo.Column("component", "TEXT", true, 0, null, 1));
        map7.put("required", new TableInfo.Column("required", "INTEGER", true, 0, null, 1));
        map7.put("options", new TableInfo.Column("options", "TEXT", true, 0, null, 1));
        map7.put("max_length", new TableInfo.Column("max_length", "INTEGER", false, 0, null, 1));
        map7.put("required_for", new TableInfo.Column("required_for", "TEXT", true, 0, "'[]'", 1));
        TableInfo tableInfo13 = new TableInfo("field_definitions", map7, prk.o.s(map7, "supports_smart_estimation", new TableInfo.Column("supports_smart_estimation", "INTEGER", true, 0, "0", 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "field_definitions");
        return !tableInfo13.equals(tableInfo14) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("field_definitions(com.revolut.retail.feature.impl.custom_assets.database.entity.FieldDefinitionEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
