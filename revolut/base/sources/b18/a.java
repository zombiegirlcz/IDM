package b18;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.invest.smart_notifications.impl.data.database.SmartNotificationsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;
import r6.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartNotificationsDatabase_Impl f11746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SmartNotificationsDatabase_Impl smartNotificationsDatabase_Impl) {
        super(2, "f7373ff9f40dafcc9f050e4cfc52ba59", "94c297cd1d9f7624dbed08105a16df2b");
        this.f11746a = smartNotificationsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `smart_notification_feed` (`id` TEXT NOT NULL, `date` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT, `ref` TEXT NOT NULL, `assetType` TEXT NOT NULL, `priceImpact` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_smart_notification_feed_date` ON `smart_notification_feed` (`date`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `feed_asset_types` (`feedId` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`feedId`, `type`), FOREIGN KEY(`feedId`) REFERENCES `smart_notification_feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f7373ff9f40dafcc9f050e4cfc52ba59')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `smart_notification_feed`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `feed_asset_types`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = SmartNotificationsDatabase_Impl.k;
        this.f11746a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, 1));
        map.put("ref", new TableInfo.Column("ref", "TEXT", true, 0, null, 1));
        map.put("assetType", new TableInfo.Column("assetType", "TEXT", true, 0, null, 1));
        HashSet hashSetS = o.s(map, "priceImpact", new TableInfo.Column("priceImpact", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_smart_notification_feed_date", false, Arrays.asList("date"), Arrays.asList("ASC")));
        TableInfo tableInfo = new TableInfo("smart_notification_feed", map, hashSetS, hashSet);
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "smart_notification_feed");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("smart_notification_feed(com.revolut.feature.invest.smart_notifications.impl.data.database.model.FeedElementEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(2);
        map2.put("feedId", new TableInfo.Column("feedId", "TEXT", true, 1, null, 1));
        HashSet hashSetS2 = o.s(map2, "type", new TableInfo.Column("type", "TEXT", true, 2, null, 1), 1);
        TableInfo tableInfo3 = new TableInfo("feed_asset_types", map2, hashSetS2, b.l(hashSetS2, new TableInfo.ForeignKey("smart_notification_feed", "CASCADE", "NO ACTION", Arrays.asList("feedId"), Arrays.asList("id")), 0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "feed_asset_types");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("feed_asset_types(com.revolut.feature.invest.smart_notifications.impl.data.database.model.FeedElementAssetFiltersEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
