package vcj;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.CryptoCommodityDetailsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CryptoCommodityDetailsDatabase_Impl f287760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CryptoCommodityDetailsDatabase_Impl cryptoCommodityDetailsDatabase_Impl) {
        super(9, "46d89de673a869d80953a24286cc63f8", "3cd777bd1ac00e30c4c8924c9974516a");
        this.f287760a = cryptoCommodityDetailsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `crypto_details_about` (`symbol` TEXT NOT NULL, `description` TEXT, `website` TEXT, `whitepaperLink` TEXT, `stats` TEXT, `sentimentIndicator` TEXT, `airTip` TEXT, `customLinks` TEXT, PRIMARY KEY(`symbol`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `commodity_price_targets_info` (`fromCcy` TEXT NOT NULL, `toCcy` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL, `priceTargets` TEXT NOT NULL, PRIMARY KEY(`fromCcy`, `toCcy`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '46d89de673a869d80953a24286cc63f8')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `crypto_details_about`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `commodity_price_targets_info`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = CryptoCommodityDetailsDatabase_Impl.k;
        this.f287760a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 1, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map.put("website", new TableInfo.Column("website", "TEXT", false, 0, null, 1));
        map.put("whitepaperLink", new TableInfo.Column("whitepaperLink", "TEXT", false, 0, null, 1));
        map.put("stats", new TableInfo.Column("stats", "TEXT", false, 0, null, 1));
        map.put("sentimentIndicator", new TableInfo.Column("sentimentIndicator", "TEXT", false, 0, null, 1));
        map.put("airTip", new TableInfo.Column("airTip", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("crypto_details_about", map, o.s(map, "customLinks", new TableInfo.Column("customLinks", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "crypto_details_about");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("crypto_details_about(com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.model.CryptoDetailsAboutEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(4);
        map2.put("fromCcy", new TableInfo.Column("fromCcy", "TEXT", true, 1, null, 1));
        map2.put("toCcy", new TableInfo.Column("toCcy", "TEXT", true, 2, null, 1));
        map2.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("commodity_price_targets_info", map2, o.s(map2, "priceTargets", new TableInfo.Column("priceTargets", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "commodity_price_targets_info");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("commodity_price_targets_info(com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.model.CommodityPriceTargetsInfoEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
