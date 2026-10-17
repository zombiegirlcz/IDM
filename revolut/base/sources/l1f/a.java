package l1f;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.trade_rev_points.impl.database.TradeRevPointsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TradeRevPointsDatabase_Impl f191531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TradeRevPointsDatabase_Impl tradeRevPointsDatabase_Impl) {
        super(3, "79121ef03973765f959038e84d67884e", "1c6752c03e052a117a095c15ad2fd3c5");
        this.f191531a = tradeRevPointsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `trade_rev_points_accounts` (`id` TEXT NOT NULL, `product` TEXT NOT NULL, `externalId` TEXT NOT NULL, `primaryAgents` TEXT NOT NULL, `loyaltyProgramme_id` TEXT NOT NULL, `loyaltyProgramme_name` TEXT NOT NULL, `loyaltyProgramme_logoUrl` TEXT NOT NULL, `loyaltyProgramme_product` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `trade_rev_points_agents` (`id` TEXT NOT NULL, `product` TEXT NOT NULL, `name` TEXT NOT NULL, `programmeName` TEXT NOT NULL, `programmeDescription` TEXT, `subtitle` TEXT NOT NULL, `description` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `learnMoreUrl` TEXT NOT NULL, `additionalInfoUrl` TEXT, `suggested` INTEGER NOT NULL, `backgroundUrl` TEXT NOT NULL, `loyaltyProgramme` TEXT NOT NULL, `redeemTypes` TEXT NOT NULL, `websiteUrl` TEXT, `voucherProductGroupId` TEXT, `redeemOptions` TEXT NOT NULL, `extraRedeemOptions` TEXT NOT NULL, `additionalDetails` TEXT, `limit` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '79121ef03973765f959038e84d67884e')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `trade_rev_points_accounts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `trade_rev_points_agents`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = TradeRevPointsDatabase_Impl.k;
        this.f191531a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(8);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("product", new TableInfo.Column("product", "TEXT", true, 0, null, 1));
        map.put("externalId", new TableInfo.Column("externalId", "TEXT", true, 0, null, 1));
        map.put("primaryAgents", new TableInfo.Column("primaryAgents", "TEXT", true, 0, null, 1));
        map.put("loyaltyProgramme_id", new TableInfo.Column("loyaltyProgramme_id", "TEXT", true, 0, null, 1));
        map.put("loyaltyProgramme_name", new TableInfo.Column("loyaltyProgramme_name", "TEXT", true, 0, null, 1));
        map.put("loyaltyProgramme_logoUrl", new TableInfo.Column("loyaltyProgramme_logoUrl", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("trade_rev_points_accounts", map, o.s(map, "loyaltyProgramme_product", new TableInfo.Column("loyaltyProgramme_product", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "trade_rev_points_accounts");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("trade_rev_points_accounts(com.revolut.feature.trade_rev_points.impl.database.model.TradeRevPointsAccountEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(20);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("product", new TableInfo.Column("product", "TEXT", true, 0, null, 1));
        map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map2.put("programmeName", new TableInfo.Column("programmeName", "TEXT", true, 0, null, 1));
        map2.put("programmeDescription", new TableInfo.Column("programmeDescription", "TEXT", false, 0, null, 1));
        map2.put("subtitle", new TableInfo.Column("subtitle", "TEXT", true, 0, null, 1));
        map2.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map2.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", true, 0, null, 1));
        map2.put("learnMoreUrl", new TableInfo.Column("learnMoreUrl", "TEXT", true, 0, null, 1));
        map2.put("additionalInfoUrl", new TableInfo.Column("additionalInfoUrl", "TEXT", false, 0, null, 1));
        map2.put("suggested", new TableInfo.Column("suggested", "INTEGER", true, 0, null, 1));
        map2.put("backgroundUrl", new TableInfo.Column("backgroundUrl", "TEXT", true, 0, null, 1));
        map2.put("loyaltyProgramme", new TableInfo.Column("loyaltyProgramme", "TEXT", true, 0, null, 1));
        map2.put("redeemTypes", new TableInfo.Column("redeemTypes", "TEXT", true, 0, null, 1));
        map2.put("websiteUrl", new TableInfo.Column("websiteUrl", "TEXT", false, 0, null, 1));
        map2.put("voucherProductGroupId", new TableInfo.Column("voucherProductGroupId", "TEXT", false, 0, null, 1));
        map2.put("redeemOptions", new TableInfo.Column("redeemOptions", "TEXT", true, 0, null, 1));
        map2.put("extraRedeemOptions", new TableInfo.Column("extraRedeemOptions", "TEXT", true, 0, null, 1));
        map2.put("additionalDetails", new TableInfo.Column("additionalDetails", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("trade_rev_points_agents", map2, o.s(map2, "limit", new TableInfo.Column("limit", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "trade_rev_points_agents");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("trade_rev_points_agents(com.revolut.feature.trade_rev_points.impl.database.model.TradeRevPointsAgentEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
