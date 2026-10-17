package e7h;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.wealth.impl.data.database.WealthDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WealthDatabase_Impl f123333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WealthDatabase_Impl wealthDatabase_Impl) {
        super(7, "f1cfc1db6aa25db9bc77b81557e3e69b", "acc8b26c940686dede7eb2e83fef7450");
        this.f123333a = wealthDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `collections` (`id` TEXT NOT NULL, `assetType` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT, `emoji` TEXT, `backgroundImageLink` TEXT, `avatarImageLink` TEXT, `icon` TEXT, `additionalInfoLink` TEXT, `collections` TEXT, `entries` TEXT, `category` TEXT, PRIMARY KEY(`id`, `assetType`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `recurring_orders` (`orderId` TEXT NOT NULL, `portfolioId` TEXT NOT NULL, `sourcePocketId` TEXT, `state` TEXT NOT NULL, `period` TEXT NOT NULL, `startDate` TEXT NOT NULL, `nextDate` TEXT NOT NULL, `updatedDate` INTEGER NOT NULL, `orderAmount_amount` INTEGER NOT NULL, `orderAmount_currency` TEXT NOT NULL, PRIMARY KEY(`orderId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_recurring_orders_portfolioId` ON `recurring_orders` (`portfolioId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f1cfc1db6aa25db9bc77b81557e3e69b')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `collections`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `recurring_orders`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = WealthDatabase_Impl.f95479l;
        this.f123333a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(12);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 2, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map.put("emoji", new TableInfo.Column("emoji", "TEXT", false, 0, null, 1));
        map.put("backgroundImageLink", new TableInfo.Column("backgroundImageLink", "TEXT", false, 0, null, 1));
        map.put("avatarImageLink", new TableInfo.Column("avatarImageLink", "TEXT", false, 0, null, 1));
        map.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, 1));
        map.put("additionalInfoLink", new TableInfo.Column("additionalInfoLink", "TEXT", false, 0, null, 1));
        map.put("collections", new TableInfo.Column("collections", "TEXT", false, 0, null, 1));
        map.put("entries", new TableInfo.Column("entries", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("collections", map, o.s(map, "category", new TableInfo.Column("category", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "collections");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("collections(com.revolut.feature.wealth.impl.data.database.collections.CollectionEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(10);
        map2.put("orderId", new TableInfo.Column("orderId", "TEXT", true, 1, null, 1));
        map2.put("portfolioId", new TableInfo.Column("portfolioId", "TEXT", true, 0, null, 1));
        map2.put("sourcePocketId", new TableInfo.Column("sourcePocketId", "TEXT", false, 0, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map2.put("period", new TableInfo.Column("period", "TEXT", true, 0, null, 1));
        map2.put("startDate", new TableInfo.Column("startDate", "TEXT", true, 0, null, 1));
        map2.put("nextDate", new TableInfo.Column("nextDate", "TEXT", true, 0, null, 1));
        map2.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        map2.put("orderAmount_amount", new TableInfo.Column("orderAmount_amount", "INTEGER", true, 0, null, 1));
        HashSet hashSetS = o.s(map2, "orderAmount_currency", new TableInfo.Column("orderAmount_currency", "TEXT", true, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_recurring_orders_portfolioId", false, Arrays.asList("portfolioId"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("recurring_orders", map2, hashSetS, hashSet);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "recurring_orders");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("recurring_orders(com.revolut.feature.wealth.impl.data.database.recurring_orders.PortfolioRecurringOrderEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
