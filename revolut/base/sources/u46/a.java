package u46;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.defi.rates.impl.data.DeFiRatesDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeFiRatesDatabase_Impl f277266a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeFiRatesDatabase_Impl deFiRatesDatabase_Impl) {
        super(1, "3c3bd40ccf745450fe12f7919d43ec08", "d5bc657c4d5f3af96fcf6f5f96acd0a4");
        this.f277266a = deFiRatesDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `defi_fiat_rates` (`assetId` TEXT NOT NULL, `toCurrency` TEXT NOT NULL, `rate` TEXT NOT NULL, `eodRate` TEXT, PRIMARY KEY(`assetId`, `toCurrency`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3c3bd40ccf745450fe12f7919d43ec08')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `defi_fiat_rates`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = DeFiRatesDatabase_Impl.f71791j;
        this.f277266a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("assetId", new TableInfo.Column("assetId", "TEXT", true, 1, null, 1));
        map.put("toCurrency", new TableInfo.Column("toCurrency", "TEXT", true, 2, null, 1));
        map.put("rate", new TableInfo.Column("rate", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("defi_fiat_rates", map, o.s(map, "eodRate", new TableInfo.Column("eodRate", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "defi_fiat_rates");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("defi_fiat_rates(com.revolut.feature.defi.rates.impl.data.entity.DeFiFiatRateEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
