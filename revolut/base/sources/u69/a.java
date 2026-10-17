package u69;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.notification_centre.impl.data.database.InboxDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InboxDatabase_Impl f277508a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InboxDatabase_Impl inboxDatabase_Impl) {
        super(5, "2181ed7dbc89d8d1fb1a3a94d2688692", "2f9c8fdd8cc7164068b466c15cb8f25f");
        this.f277508a = inboxDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `inbox_item` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `state` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `icon` TEXT NOT NULL, `deeplink` TEXT, `viewCount` INTEGER, `buttons` TEXT NOT NULL, `asset` TEXT, `body` TEXT, `messageId` TEXT, `campaignId` TEXT, `pushId` TEXT, `tileId` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2181ed7dbc89d8d1fb1a3a94d2688692')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `inbox_item`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = InboxDatabase_Impl.f78136j;
        this.f277508a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(16);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map.put("subtitle", new TableInfo.Column("subtitle", "TEXT", true, 0, null, 1));
        map.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, 1));
        map.put("deeplink", new TableInfo.Column("deeplink", "TEXT", false, 0, null, 1));
        map.put("viewCount", new TableInfo.Column("viewCount", "INTEGER", false, 0, null, 1));
        map.put("buttons", new TableInfo.Column("buttons", "TEXT", true, 0, null, 1));
        map.put("asset", new TableInfo.Column("asset", "TEXT", false, 0, null, 1));
        map.put("body", new TableInfo.Column("body", "TEXT", false, 0, null, 1));
        map.put("messageId", new TableInfo.Column("messageId", "TEXT", false, 0, null, 1));
        map.put("campaignId", new TableInfo.Column("campaignId", "TEXT", false, 0, null, 1));
        map.put("pushId", new TableInfo.Column("pushId", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("inbox_item", map, o.s(map, "tileId", new TableInfo.Column("tileId", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "inbox_item");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("inbox_item(com.revolut.feature.notification_centre.impl.data.database.entity.InboxItemEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
