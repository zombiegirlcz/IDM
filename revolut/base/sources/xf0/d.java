package xf0;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.core.faq.data.db.FaqDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes.dex */
public final class d extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FaqDatabase_Impl f304749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FaqDatabase_Impl faqDatabase_Impl) {
        super(16, "c3a6f041c2732f01e5f6eca6409e2762", "3c46427ce3982422ac02b7a4e9619b53");
        this.f304749a = faqDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `faq` (`key` TEXT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `plane_content` TEXT NOT NULL, `placement` TEXT NOT NULL, `weight` INTEGER NOT NULL, `relatedItems` TEXT NOT NULL, `language` TEXT NOT NULL, `userCountry` TEXT NOT NULL, `actions` TEXT NOT NULL, `specialisationQueue` TEXT, `chatEntrySuggestions` TEXT, `contentStyle` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_faq_key` ON `faq` (`key`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_faq_placement` ON `faq` (`placement`)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_faq_key_placement_language_contentStyle` ON `faq` (`key`, `placement`, `language`, `contentStyle`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `settings` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `light_faq` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `title` TEXT NOT NULL, `parentKey` TEXT NOT NULL, `contentStyle` TEXT NOT NULL, `deeplink` TEXT NOT NULL, `language` TEXT NOT NULL, `index` INTEGER NOT NULL, `iconUri` TEXT, PRIMARY KEY(`key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_light_faq_key` ON `light_faq` (`key`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_light_faq_parentKey` ON `light_faq` (`parentKey`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pigeon_tree_node` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `parentKey` TEXT NOT NULL, `title` TEXT NOT NULL, `hidden` INTEGER NOT NULL, `deeplink` TEXT, `language` TEXT NOT NULL, `icon` TEXT, PRIMARY KEY(`key`, `parentKey`, `language`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_pigeon_tree_node_key` ON `pigeon_tree_node` (`key`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_pigeon_tree_node_parentKey` ON `pigeon_tree_node` (`parentKey`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_pigeon_tree_node_language` ON `pigeon_tree_node` (`language`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pigeon_node_details` (`key` TEXT NOT NULL, `language` TEXT NOT NULL, `json` TEXT NOT NULL, PRIMARY KEY(`key`, `language`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c3a6f041c2732f01e5f6eca6409e2762')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `faq`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `settings`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `light_faq`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pigeon_tree_node`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pigeon_node_details`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = FaqDatabase_Impl.f51376n;
        this.f304749a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(14);
        map.put("key", new TableInfo.Column("key", "TEXT", true, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, 1));
        map.put("plane_content", new TableInfo.Column("plane_content", "TEXT", true, 0, null, 1));
        map.put("placement", new TableInfo.Column("placement", "TEXT", true, 0, null, 1));
        map.put("weight", new TableInfo.Column("weight", "INTEGER", true, 0, null, 1));
        map.put("relatedItems", new TableInfo.Column("relatedItems", "TEXT", true, 0, null, 1));
        map.put("language", new TableInfo.Column("language", "TEXT", true, 0, null, 1));
        map.put("userCountry", new TableInfo.Column("userCountry", "TEXT", true, 0, null, 1));
        map.put("actions", new TableInfo.Column("actions", "TEXT", true, 0, null, 1));
        map.put("specialisationQueue", new TableInfo.Column("specialisationQueue", "TEXT", false, 0, null, 1));
        map.put("chatEntrySuggestions", new TableInfo.Column("chatEntrySuggestions", "TEXT", false, 0, null, 1));
        map.put("contentStyle", new TableInfo.Column("contentStyle", "TEXT", true, 0, null, 1));
        HashSet hashSetS = o.s(map, "id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1), 0);
        HashSet hashSet = new HashSet(3);
        hashSet.add(new TableInfo.Index("index_faq_key", false, Arrays.asList("key"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_faq_placement", false, Arrays.asList("placement"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_faq_key_placement_language_contentStyle", true, Arrays.asList("key", "placement", "language", "contentStyle"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
        TableInfo tableInfo = new TableInfo("faq", map, hashSetS, hashSet);
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "faq");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("faq(com.revolut.core.faq.data.db.model.FaqDbEntry).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(2);
        map2.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        TableInfo tableInfo3 = new TableInfo("settings", map2, o.s(map2, "value", new TableInfo.Column("value", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "settings");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("settings(com.revolut.core.faq.data.db.model.FaqSettingEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(9);
        map3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map3.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        map3.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map3.put("parentKey", new TableInfo.Column("parentKey", "TEXT", true, 0, null, 1));
        map3.put("contentStyle", new TableInfo.Column("contentStyle", "TEXT", true, 0, null, 1));
        map3.put("deeplink", new TableInfo.Column("deeplink", "TEXT", true, 0, null, 1));
        map3.put("language", new TableInfo.Column("language", "TEXT", true, 0, null, 1));
        map3.put("index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1));
        HashSet hashSetS2 = o.s(map3, "iconUri", new TableInfo.Column("iconUri", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new TableInfo.Index("index_light_faq_key", false, Arrays.asList("key"), Arrays.asList("ASC")));
        hashSet2.add(new TableInfo.Index("index_light_faq_parentKey", false, Arrays.asList("parentKey"), Arrays.asList("ASC")));
        TableInfo tableInfo5 = new TableInfo("light_faq", map3, hashSetS2, hashSet2);
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "light_faq");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("light_faq(com.revolut.core.faq.data.db.model.LightenedFaqEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(8);
        map4.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map4.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        map4.put("parentKey", new TableInfo.Column("parentKey", "TEXT", true, 2, null, 1));
        map4.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map4.put("hidden", new TableInfo.Column("hidden", "INTEGER", true, 0, null, 1));
        map4.put("deeplink", new TableInfo.Column("deeplink", "TEXT", false, 0, null, 1));
        map4.put("language", new TableInfo.Column("language", "TEXT", true, 3, null, 1));
        HashSet hashSetS3 = o.s(map4, "icon", new TableInfo.Column("icon", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet3 = new HashSet(3);
        hashSet3.add(new TableInfo.Index("index_pigeon_tree_node_key", false, Arrays.asList("key"), Arrays.asList("ASC")));
        hashSet3.add(new TableInfo.Index("index_pigeon_tree_node_parentKey", false, Arrays.asList("parentKey"), Arrays.asList("ASC")));
        hashSet3.add(new TableInfo.Index("index_pigeon_tree_node_language", false, Arrays.asList("language"), Arrays.asList("ASC")));
        TableInfo tableInfo7 = new TableInfo("pigeon_tree_node", map4, hashSetS3, hashSet3);
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "pigeon_tree_node");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("pigeon_tree_node(com.revolut.core.faq.data.db.model.PigeonTreeNodeEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(3);
        map5.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        map5.put("language", new TableInfo.Column("language", "TEXT", true, 2, null, 1));
        TableInfo tableInfo9 = new TableInfo("pigeon_node_details", map5, o.s(map5, "json", new TableInfo.Column("json", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "pigeon_node_details");
        return !tableInfo9.equals(tableInfo10) ? new RoomOpenDelegate.ValidationResult(false, o.o("pigeon_node_details(com.revolut.core.faq.data.db.model.PigeonNodeDetailsEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
