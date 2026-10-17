package p29;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.lifestyle.core.impl.database.LifestyleCoreDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifestyleCoreDatabase_Impl f232188a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LifestyleCoreDatabase_Impl lifestyleCoreDatabase_Impl) {
        super(4, "409c0c76aca844a4a087349c46b5ab2d", "dd12e53be2ce360486e3a9d4eee7ded0");
        this.f232188a = lifestyleCoreDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `lifestyle_tab_config` (`id` TEXT NOT NULL, `placementOrder` TEXT NOT NULL, `advertisementPlacements` TEXT NOT NULL, `mediaHeaderPlacement` TEXT NOT NULL, `revolutProducts` TEXT NOT NULL, `advertisements` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `points_advertisement_earning_rule` (`id` TEXT NOT NULL, `advertisementId` TEXT NOT NULL, `rate` TEXT NOT NULL, `booster` INTEGER NOT NULL, `decorator` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `points_miles_redemption_rule` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logo` TEXT NOT NULL, `image` TEXT NOT NULL, `provider` TEXT NOT NULL, `rate` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `points_product_earning_rule` (`id` TEXT NOT NULL, `productType` TEXT NOT NULL, `rate` TEXT NOT NULL, `booster` REAL NOT NULL, `decorator` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '409c0c76aca844a4a087349c46b5ab2d')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `lifestyle_tab_config`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `points_advertisement_earning_rule`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `points_miles_redemption_rule`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `points_product_earning_rule`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = LifestyleCoreDatabase_Impl.f78061j;
        this.f232188a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(6);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("placementOrder", new TableInfo.Column("placementOrder", "TEXT", true, 0, null, 1));
        map.put("advertisementPlacements", new TableInfo.Column("advertisementPlacements", "TEXT", true, 0, null, 1));
        map.put("mediaHeaderPlacement", new TableInfo.Column("mediaHeaderPlacement", "TEXT", true, 0, null, 1));
        map.put("revolutProducts", new TableInfo.Column("revolutProducts", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("lifestyle_tab_config", map, o.s(map, "advertisements", new TableInfo.Column("advertisements", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "lifestyle_tab_config");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("lifestyle_tab_config(com.revolut.feature.lifestyle.core.impl.database.entity.LifestyleTabConfigEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(5);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("advertisementId", new TableInfo.Column("advertisementId", "TEXT", true, 0, null, 1));
        map2.put("rate", new TableInfo.Column("rate", "TEXT", true, 0, null, 1));
        map2.put("booster", new TableInfo.Column("booster", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("points_advertisement_earning_rule", map2, o.s(map2, "decorator", new TableInfo.Column("decorator", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "points_advertisement_earning_rule");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("points_advertisement_earning_rule(com.revolut.feature.lifestyle.core.impl.database.entity.points.RevPointsAdvertisementEarningRuleEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(6);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map3.put("logo", new TableInfo.Column("logo", "TEXT", true, 0, null, 1));
        map3.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, 1));
        map3.put("provider", new TableInfo.Column("provider", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("points_miles_redemption_rule", map3, o.s(map3, "rate", new TableInfo.Column("rate", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "points_miles_redemption_rule");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("points_miles_redemption_rule(com.revolut.feature.lifestyle.core.impl.database.entity.points.RevPointsMilesRedemptionRuleEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(5);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("productType", new TableInfo.Column("productType", "TEXT", true, 0, null, 1));
        map4.put("rate", new TableInfo.Column("rate", "TEXT", true, 0, null, 1));
        map4.put("booster", new TableInfo.Column("booster", "REAL", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("points_product_earning_rule", map4, o.s(map4, "decorator", new TableInfo.Column("decorator", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "points_product_earning_rule");
        return !tableInfo7.equals(tableInfo8) ? new RoomOpenDelegate.ValidationResult(false, o.o("points_product_earning_rule(com.revolut.feature.lifestyle.core.impl.database.entity.points.RevPointsProductEarningRuleEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
