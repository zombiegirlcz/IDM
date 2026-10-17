package w8f;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.trading.transfer.investments.impl.data.database.TransferInvestmentsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferInvestmentsDatabase_Impl f295645a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TransferInvestmentsDatabase_Impl transferInvestmentsDatabase_Impl) {
        super(3, "b550e815e00cacb3243ecc33e1e3d405", "d846a0a39183249de2994cd396f7fc8b");
        this.f295645a = transferInvestmentsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transfer_instruments` (`account_id` TEXT NOT NULL DEFAULT '', `ref` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `currency` TEXT NOT NULL, `direction` TEXT NOT NULL DEFAULT 'IN', `quantity` TEXT, `transfer_fee` TEXT, PRIMARY KEY(`account_id`, `ref`, `direction`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b550e815e00cacb3243ecc33e1e3d405')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transfer_instruments`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = TransferInvestmentsDatabase_Impl.f91551j;
        this.f295645a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("account_id", new TableInfo.Column("account_id", "TEXT", true, 1, "''", 1));
        map.put("ref", new TableInfo.Column("ref", "TEXT", true, 2, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("direction", new TableInfo.Column("direction", "TEXT", true, 3, "'IN'", 1));
        map.put("quantity", new TableInfo.Column("quantity", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("transfer_instruments", map, o.s(map, "transfer_fee", new TableInfo.Column("transfer_fee", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "transfer_instruments");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("transfer_instruments(com.revolut.feature.trading.transfer.investments.impl.data.database.models.TransferInstrumentEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
