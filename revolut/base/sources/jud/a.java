package jud;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.staking.impl.database.StakingDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StakingDatabase_Impl f178648a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StakingDatabase_Impl stakingDatabase_Impl) {
        super(11, "469f0e0636987d5e1cd9a52554b4546a", "31b1ed2e81dab73624624636c8ae34b9");
        this.f178648a = stakingDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `staking_pockets` (`id` TEXT NOT NULL, `productId` TEXT NOT NULL, `stakingBalance` TEXT NOT NULL, `fiatBalance` TEXT NOT NULL, `unstakingLockedBalance` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `staking_rewards` (`pocketId` TEXT NOT NULL, `balance` TEXT NOT NULL, `daysTillFirstReward` INTEGER, PRIMARY KEY(`pocketId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `unstaking_data` (`id` TEXT NOT NULL, `startDate` INTEGER NOT NULL, `state` TEXT NOT NULL, `productId` TEXT NOT NULL, `estimatedEndDate` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '469f0e0636987d5e1cd9a52554b4546a')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `staking_pockets`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `staking_rewards`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `unstaking_data`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = StakingDatabase_Impl.f88123l;
        this.f178648a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("productId", new TableInfo.Column("productId", "TEXT", true, 0, null, 1));
        map.put("stakingBalance", new TableInfo.Column("stakingBalance", "TEXT", true, 0, null, 1));
        map.put("fiatBalance", new TableInfo.Column("fiatBalance", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("staking_pockets", map, o.s(map, "unstakingLockedBalance", new TableInfo.Column("unstakingLockedBalance", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "staking_pockets");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("staking_pockets(com.revolut.feature.staking.impl.database.model.StakingPocketEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(3);
        map2.put("pocketId", new TableInfo.Column("pocketId", "TEXT", true, 1, null, 1));
        map2.put("balance", new TableInfo.Column("balance", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("staking_rewards", map2, o.s(map2, "daysTillFirstReward", new TableInfo.Column("daysTillFirstReward", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "staking_rewards");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("staking_rewards(com.revolut.feature.staking.impl.database.model.StakingRewardsEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(5);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("startDate", new TableInfo.Column("startDate", "INTEGER", true, 0, null, 1));
        map3.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map3.put("productId", new TableInfo.Column("productId", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("unstaking_data", map3, o.s(map3, "estimatedEndDate", new TableInfo.Column("estimatedEndDate", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "unstaking_data");
        return !tableInfo5.equals(tableInfo6) ? new RoomOpenDelegate.ValidationResult(false, o.o("unstaking_data(com.revolut.feature.staking.impl.database.model.unstaking.UnstakingDataEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
