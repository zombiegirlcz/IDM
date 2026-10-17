package twg;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.wealth.analytics.insights.repository.database.PortfolioInsightsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PortfolioInsightsDatabase_Impl f275020a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PortfolioInsightsDatabase_Impl portfolioInsightsDatabase_Impl) {
        super(1, "eece09c58e8f76852678378057f00a75", "a6d5bcdf549faea5626b18d380083e9d");
        this.f275020a = portfolioInsightsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolio_insights` (`portfolio_id` TEXT NOT NULL, `usage_requirements` TEXT NOT NULL, `summary` TEXT, `indicators` TEXT NOT NULL, PRIMARY KEY(`portfolio_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolio_insights_asset_indicator` (`portfolio_id` TEXT NOT NULL, `key` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `sort_order_label` TEXT NOT NULL, `sort_order` TEXT NOT NULL, `info` TEXT NOT NULL, `assets` TEXT NOT NULL, PRIMARY KEY(`portfolio_id`, `key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `portfolio_insights_collection_indicator` (`portfolio_id` TEXT NOT NULL, `key` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `info` TEXT NOT NULL, `collections` TEXT NOT NULL, PRIMARY KEY(`portfolio_id`, `key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eece09c58e8f76852678378057f00a75')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolio_insights`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolio_insights_asset_indicator`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `portfolio_insights_collection_indicator`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = PortfolioInsightsDatabase_Impl.f95018j;
        this.f275020a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(4);
        map.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 1, null, 1));
        map.put("usage_requirements", new TableInfo.Column("usage_requirements", "TEXT", true, 0, null, 1));
        map.put("summary", new TableInfo.Column("summary", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("portfolio_insights", map, o.s(map, "indicators", new TableInfo.Column("indicators", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "portfolio_insights");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolio_insights(com.revolut.feature.wealth.analytics.insights.repository.entity.PortfolioInsightsEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(8);
        map2.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 1, null, 1));
        map2.put("key", new TableInfo.Column("key", "TEXT", true, 2, null, 1));
        map2.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map2.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map2.put("sort_order_label", new TableInfo.Column("sort_order_label", "TEXT", true, 0, null, 1));
        map2.put("sort_order", new TableInfo.Column("sort_order", "TEXT", true, 0, null, 1));
        map2.put("info", new TableInfo.Column("info", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("portfolio_insights_asset_indicator", map2, o.s(map2, "assets", new TableInfo.Column("assets", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "portfolio_insights_asset_indicator");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("portfolio_insights_asset_indicator(com.revolut.feature.wealth.analytics.insights.repository.entity.PortfolioInsightsAssetIndicatorEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(6);
        map3.put("portfolio_id", new TableInfo.Column("portfolio_id", "TEXT", true, 1, null, 1));
        map3.put("key", new TableInfo.Column("key", "TEXT", true, 2, null, 1));
        map3.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map3.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map3.put("info", new TableInfo.Column("info", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("portfolio_insights_collection_indicator", map3, o.s(map3, "collections", new TableInfo.Column("collections", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "portfolio_insights_collection_indicator");
        return !tableInfo5.equals(tableInfo6) ? new RoomOpenDelegate.ValidationResult(false, o.o("portfolio_insights_collection_indicator(com.revolut.feature.wealth.analytics.insights.repository.entity.PortfolioInsightsCollectionIndicatorEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
