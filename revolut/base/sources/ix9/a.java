package ix9;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.payments.recents.impl.data.PaymentsRecentDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaymentsRecentDatabase_Impl f169522a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PaymentsRecentDatabase_Impl paymentsRecentDatabase_Impl) {
        super(4, "d636a568add9e13379197f02dc04b6e4", "000ffa843a931ce44e42d5f2f75ebe8b");
        this.f169522a = paymentsRecentDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_recent_v2` (`recipientId` TEXT NOT NULL, `recipientType` TEXT NOT NULL, `itemId` TEXT NOT NULL, `itemType` TEXT NOT NULL, `unreadCounter` INTEGER NOT NULL, `unreadSyncTimestamp` INTEGER NOT NULL, PRIMARY KEY(`recipientId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd636a568add9e13379197f02dc04b6e4')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_recent_v2`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = PaymentsRecentDatabase_Impl.f79669j;
        this.f169522a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("recipientId", new TableInfo.Column("recipientId", "TEXT", true, 1, null, 1));
        map.put("recipientType", new TableInfo.Column("recipientType", "TEXT", true, 0, null, 1));
        map.put("itemId", new TableInfo.Column("itemId", "TEXT", true, 0, null, 1));
        map.put("itemType", new TableInfo.Column("itemType", "TEXT", true, 0, null, 1));
        map.put("unreadCounter", new TableInfo.Column("unreadCounter", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("payments_recent_v2", map, o.s(map, "unreadSyncTimestamp", new TableInfo.Column("unreadSyncTimestamp", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "payments_recent_v2");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("payments_recent_v2(com.revolut.feature.payments.recents.impl.data.model.RecentEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
