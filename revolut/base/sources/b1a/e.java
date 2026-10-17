package b1a;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.payments.splitbill.impl.data.recurringsplit.database.RecurringSplitDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecurringSplitDatabase_Impl f11760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RecurringSplitDatabase_Impl recurringSplitDatabase_Impl) {
        super(3, "6391323c4f2336d2b0d5bde89ace9f60", "94abeb27cb0cba76bc889cefee1fe90e");
        this.f11760a = recurringSplitDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `recurring_split` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `participants_splits` TEXT NOT NULL, `comment` TEXT, `created_date` INTEGER NOT NULL, `updated_date` INTEGER NOT NULL, `source_type` TEXT NOT NULL, `source_reference_id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6391323c4f2336d2b0d5bde89ace9f60')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `recurring_split`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = RecurringSplitDatabase_Impl.f79833j;
        this.f11760a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("participants_splits", new TableInfo.Column("participants_splits", "TEXT", true, 0, null, 1));
        map.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, 1));
        map.put("created_date", new TableInfo.Column("created_date", "INTEGER", true, 0, null, 1));
        map.put("updated_date", new TableInfo.Column("updated_date", "INTEGER", true, 0, null, 1));
        map.put("source_type", new TableInfo.Column("source_type", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("recurring_split", map, o.s(map, "source_reference_id", new TableInfo.Column("source_reference_id", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "recurring_split");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("recurring_split(com.revolut.feature.payments.splitbill.impl.data.recurringsplit.database.entity.RecurringSplitEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
