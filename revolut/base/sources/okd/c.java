package okd;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.slot_manager.impl.database.SlotManagerDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SlotManagerDatabase_Impl f225992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SlotManagerDatabase_Impl slotManagerDatabase_Impl) {
        super(6, "1af9944085b44479730741cb87055aa7", "98d0ba05b0e152c96b89e217b4ba53df");
        this.f225992a = slotManagerDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `slot_actions` (`id` TEXT NOT NULL, `screen_id` TEXT NOT NULL, `campaign_id` TEXT NOT NULL, `slot_type` TEXT NOT NULL, `action_type` TEXT NOT NULL, `params` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1af9944085b44479730741cb87055aa7')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `slot_actions`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = SlotManagerDatabase_Impl.k;
        this.f225992a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("screen_id", new TableInfo.Column("screen_id", "TEXT", true, 0, null, 1));
        map.put("campaign_id", new TableInfo.Column("campaign_id", "TEXT", true, 0, null, 1));
        map.put("slot_type", new TableInfo.Column("slot_type", "TEXT", true, 0, null, 1));
        map.put("action_type", new TableInfo.Column("action_type", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("slot_actions", map, o.s(map, "params", new TableInfo.Column("params", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "slot_actions");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("slot_actions(com.revolut.feature.slot_manager.impl.model.entity.SlotActionEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
