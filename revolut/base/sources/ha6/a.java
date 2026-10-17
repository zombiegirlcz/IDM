package ha6;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.donations.impl.database.DonationsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DonationsDatabase_Impl f150454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DonationsDatabase_Impl donationsDatabase_Impl) {
        super(6, "f2ec83c2e23d200af570be65c7a5ba96", "ae383bd5c5dc7a2355c63760cf552733");
        this.f150454a = donationsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `charity` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `pocket_id` TEXT NOT NULL, `brief` TEXT NOT NULL, `description` TEXT NOT NULL, `icon` TEXT NOT NULL, `banner` TEXT NOT NULL, `campaign` TEXT, `shareable` INTEGER NOT NULL, `code` TEXT NOT NULL, `availability_area` TEXT NOT NULL, `donors_count` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `featured` INTEGER NOT NULL, `availability` TEXT NOT NULL, `pointsRedemptionAvailable` INTEGER NOT NULL, `total_donation_amount` INTEGER NOT NULL, `total_donation_currency` TEXT NOT NULL, `my_donation_amount` INTEGER NOT NULL, `my_donation_currency` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `charity_collections` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `banner_url` TEXT NOT NULL, `charities` TEXT NOT NULL, `featured` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `charity_campaigns` (`charityId` TEXT NOT NULL, `id` TEXT NOT NULL, `type` TEXT NOT NULL, `cardDesignCode` TEXT NOT NULL, `cardDesignUrl` TEXT NOT NULL, `status` TEXT NOT NULL, `minDonationsToUnlock` TEXT NOT NULL, PRIMARY KEY(`charityId`, `id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f2ec83c2e23d200af570be65c7a5ba96')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `charity`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `charity_collections`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `charity_campaigns`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = DonationsDatabase_Impl.k;
        this.f150454a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("pocket_id", new TableInfo.Column("pocket_id", "TEXT", true, 0, null, 1));
        map.put("brief", new TableInfo.Column("brief", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, 1));
        map.put("banner", new TableInfo.Column("banner", "TEXT", true, 0, null, 1));
        map.put("campaign", new TableInfo.Column("campaign", "TEXT", false, 0, null, 1));
        map.put("shareable", new TableInfo.Column("shareable", "INTEGER", true, 0, null, 1));
        map.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, 1));
        map.put("availability_area", new TableInfo.Column("availability_area", "TEXT", true, 0, null, 1));
        map.put("donors_count", new TableInfo.Column("donors_count", "INTEGER", true, 0, null, 1));
        map.put("rank", new TableInfo.Column("rank", "INTEGER", true, 0, null, 1));
        map.put("featured", new TableInfo.Column("featured", "INTEGER", true, 0, null, 1));
        map.put("availability", new TableInfo.Column("availability", "TEXT", true, 0, null, 1));
        map.put("pointsRedemptionAvailable", new TableInfo.Column("pointsRedemptionAvailable", "INTEGER", true, 0, null, 1));
        map.put("total_donation_amount", new TableInfo.Column("total_donation_amount", "INTEGER", true, 0, null, 1));
        map.put("total_donation_currency", new TableInfo.Column("total_donation_currency", "TEXT", true, 0, null, 1));
        map.put("my_donation_amount", new TableInfo.Column("my_donation_amount", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("charity", map, o.s(map, "my_donation_currency", new TableInfo.Column("my_donation_currency", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "charity");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("charity(com.revolut.feature.donations.impl.database.model.CharityEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(6);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map2.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map2.put("banner_url", new TableInfo.Column("banner_url", "TEXT", true, 0, null, 1));
        map2.put("charities", new TableInfo.Column("charities", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("charity_collections", map2, o.s(map2, "featured", new TableInfo.Column("featured", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "charity_collections");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("charity_collections(com.revolut.feature.donations.impl.database.model.CharitiesCollectionEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(7);
        map3.put("charityId", new TableInfo.Column("charityId", "TEXT", true, 1, null, 1));
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 2, null, 1));
        map3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map3.put("cardDesignCode", new TableInfo.Column("cardDesignCode", "TEXT", true, 0, null, 1));
        map3.put("cardDesignUrl", new TableInfo.Column("cardDesignUrl", "TEXT", true, 0, null, 1));
        map3.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("charity_campaigns", map3, o.s(map3, "minDonationsToUnlock", new TableInfo.Column("minDonationsToUnlock", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "charity_campaigns");
        return !tableInfo5.equals(tableInfo6) ? new RoomOpenDelegate.ValidationResult(false, o.o("charity_campaigns(com.revolut.feature.donations.impl.database.model.CharityCampaignEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
