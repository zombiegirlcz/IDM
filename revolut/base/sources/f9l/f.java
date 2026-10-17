package f9l;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.shared.feature.rates.impl.database.SharedRatesRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedRatesRoomDatabase_Impl f133000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SharedRatesRoomDatabase_Impl sharedRatesRoomDatabase_Impl) {
        super(2, "a0cc33bee2345e29d19990dfd9131ed8", "be536dd3a62e6008cb6c8dfbab4e2ee6");
        this.f133000a = sharedRatesRoomDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rates_cache` (`from` TEXT NOT NULL, `to` TEXT NOT NULL, `rate` REAL NOT NULL, `last_available_rate` REAL, `time_stamp` INTEGER NOT NULL, `isWeekend` INTEGER, `weekendStartTime` INTEGER, `weekendEndTime` INTEGER, PRIMARY KEY(`from`, `to`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a0cc33bee2345e29d19990dfd9131ed8')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rates_cache`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = SharedRatesRoomDatabase_Impl.f104882j;
        this.f133000a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("from", new TableInfo.Column("from", "TEXT", true, 1, null, 1));
        map.put("to", new TableInfo.Column("to", "TEXT", true, 2, null, 1));
        map.put("rate", new TableInfo.Column("rate", "REAL", true, 0, null, 1));
        map.put("last_available_rate", new TableInfo.Column("last_available_rate", "REAL", false, 0, null, 1));
        map.put("time_stamp", new TableInfo.Column("time_stamp", "INTEGER", true, 0, null, 1));
        map.put("isWeekend", new TableInfo.Column("isWeekend", "INTEGER", false, 0, null, 1));
        map.put("weekendStartTime", new TableInfo.Column("weekendStartTime", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("rates_cache", map, o.s(map, "weekendEndTime", new TableInfo.Column("weekendEndTime", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "rates_cache");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("rates_cache(com.revolut.shared.feature.rates.impl.database.RatesCacheEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
