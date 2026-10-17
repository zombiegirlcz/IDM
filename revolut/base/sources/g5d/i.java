package g5d;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.shared.airtip.impl.data.database.AirTipDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AirTipDatabase_Impl f140765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AirTipDatabase_Impl airTipDatabase_Impl) {
        super(3, "4d3caf04d8ef91a8b68ac849986247bb", "c11b7d105c1e07e43e2b942cdb0e7b76");
        this.f140765a = airTipDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `air_tip_state` (`air_tip_id` TEXT NOT NULL, `air_tip_type` TEXT NOT NULL, `was_clicked` INTEGER NOT NULL, `has_animated` INTEGER NOT NULL, `expiration_date` INTEGER NOT NULL, PRIMARY KEY(`air_tip_id`, `air_tip_type`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4d3caf04d8ef91a8b68ac849986247bb')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `air_tip_state`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = AirTipDatabase_Impl.f86031j;
        this.f140765a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("air_tip_id", new TableInfo.Column("air_tip_id", "TEXT", true, 1, null, 1));
        map.put("air_tip_type", new TableInfo.Column("air_tip_type", "TEXT", true, 2, null, 1));
        map.put("was_clicked", new TableInfo.Column("was_clicked", "INTEGER", true, 0, null, 1));
        map.put("has_animated", new TableInfo.Column("has_animated", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("air_tip_state", map, o.s(map, "expiration_date", new TableInfo.Column("expiration_date", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "air_tip_state");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("air_tip_state(com.revolut.feature.shared.airtip.impl.data.database.AirTipStateEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
