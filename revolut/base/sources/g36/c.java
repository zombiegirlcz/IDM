package g36;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.defi.currency.impl.data.database.DeFiCurrencyDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeFiCurrencyDatabase_Impl f140209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeFiCurrencyDatabase_Impl deFiCurrencyDatabase_Impl) {
        super(1, "b5a2c76286b93d77973fc830928dbae4", "3e07c259295ccaf86ed2dd432a81a9d5");
        this.f140209a = deFiCurrencyDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `defi_currencies` (`external_asset_id` TEXT NOT NULL, `display_name` TEXT NOT NULL, `fractional_digits` INTEGER NOT NULL, `display_fractional_digits` INTEGER, `ticker` TEXT NOT NULL, `icon_url` TEXT NOT NULL, PRIMARY KEY(`external_asset_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b5a2c76286b93d77973fc830928dbae4')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `defi_currencies`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = DeFiCurrencyDatabase_Impl.f71716j;
        this.f140209a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("external_asset_id", new TableInfo.Column("external_asset_id", "TEXT", true, 1, null, 1));
        map.put("display_name", new TableInfo.Column("display_name", "TEXT", true, 0, null, 1));
        map.put("fractional_digits", new TableInfo.Column("fractional_digits", "INTEGER", true, 0, null, 1));
        map.put("display_fractional_digits", new TableInfo.Column("display_fractional_digits", "INTEGER", false, 0, null, 1));
        map.put("ticker", new TableInfo.Column("ticker", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("defi_currencies", map, o.s(map, "icon_url", new TableInfo.Column("icon_url", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "defi_currencies");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("defi_currencies(com.revolut.feature.defi.currency.impl.data.database.DeFiCurrencyEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
