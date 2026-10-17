package xek;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.pricing_plans.impl.database.PricingPlansDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PricingPlansDatabase_Impl f304698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PricingPlansDatabase_Impl pricingPlansDatabase_Impl) {
        super(5, "9ce309d286f90bd2fc0ed92cdbe5e641", "f4a05b0f25c6beb73d051a0eb5bf2df7");
        this.f304698a = pricingPlansDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pricing_plan` (`id` TEXT NOT NULL, `code` TEXT NOT NULL, `display_code` TEXT NOT NULL, `currencyCode` TEXT NOT NULL, `min_period` TEXT, `billing` TEXT NOT NULL, `features` TEXT NOT NULL, `featureGroups` TEXT NOT NULL, `card_designs` TEXT NOT NULL, `products` TEXT NOT NULL, `state` TEXT, `queuePosition` INTEGER, `priority` INTEGER NOT NULL, `cardTier` INTEGER NOT NULL, `cashback` TEXT, `is_default` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9ce309d286f90bd2fc0ed92cdbe5e641')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pricing_plan`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = PricingPlansDatabase_Impl.f102626j;
        this.f304698a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(16);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, 1));
        map.put("display_code", new TableInfo.Column("display_code", "TEXT", true, 0, null, 1));
        map.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", true, 0, null, 1));
        map.put("min_period", new TableInfo.Column("min_period", "TEXT", false, 0, null, 1));
        map.put("billing", new TableInfo.Column("billing", "TEXT", true, 0, null, 1));
        map.put(ib.b.Features, new TableInfo.Column(ib.b.Features, "TEXT", true, 0, null, 1));
        map.put("featureGroups", new TableInfo.Column("featureGroups", "TEXT", true, 0, null, 1));
        map.put("card_designs", new TableInfo.Column("card_designs", "TEXT", true, 0, null, 1));
        map.put("products", new TableInfo.Column("products", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, 1));
        map.put("queuePosition", new TableInfo.Column("queuePosition", "INTEGER", false, 0, null, 1));
        map.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, null, 1));
        map.put("cardTier", new TableInfo.Column("cardTier", "INTEGER", true, 0, null, 1));
        map.put("cashback", new TableInfo.Column("cashback", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("pricing_plan", map, o.s(map, "is_default", new TableInfo.Column("is_default", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "pricing_plan");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("pricing_plan(com.revolut.retail.feature.pricing_plans.impl.database.model.PricingPlanEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
