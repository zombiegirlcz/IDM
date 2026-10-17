package mq2;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.banners.impl.data.database.BannersDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;
import r6.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannersDatabase_Impl f207847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BannersDatabase_Impl bannersDatabase_Impl) {
        super(3, "8cdcdf0dd452721c82538099a3f4d8ec", "f12c3c029411932e544a1577b1e205ac");
        this.f207847a = bannersDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `banners_keys` (`id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `banners_closed_ids` (`banner_id` TEXT NOT NULL, PRIMARY KEY(`banner_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_banners_closed_ids_banner_id` ON `banners_closed_ids` (`banner_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `banners` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `single_cta_id` TEXT, `single_cta_priority` INTEGER, `single_cta_image` TEXT, `single_cta_title` TEXT, `single_cta_text` TEXT, `single_cta_closeable` INTEGER, `single_cta_action` TEXT, `no_cta_id` TEXT, `no_cta_priority` INTEGER, `no_cta_image` TEXT, `no_cta_title` TEXT, `no_cta_text` TEXT, `no_cta_closeable` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `banners_keys_relations` (`key_id` TEXT NOT NULL, `banner_id` TEXT NOT NULL, PRIMARY KEY(`key_id`, `banner_id`), FOREIGN KEY(`key_id`) REFERENCES `banners_keys`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`banner_id`) REFERENCES `banners`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8cdcdf0dd452721c82538099a3f4d8ec')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `banners_keys`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `banners_closed_ids`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `banners`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `banners_keys_relations`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = BannersDatabase_Impl.f64087j;
        this.f207847a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(1);
        TableInfo tableInfo = new TableInfo("banners_keys", map, o.s(map, "id", new TableInfo.Column("id", "TEXT", true, 1, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "banners_keys");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("banners_keys(com.revolut.feature.banners.impl.data.database.entity.BannersKeyEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(1);
        HashSet hashSetS = o.s(map2, "banner_id", new TableInfo.Column("banner_id", "TEXT", true, 1, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_banners_closed_ids_banner_id", false, Arrays.asList("banner_id"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("banners_closed_ids", map2, hashSetS, hashSet);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "banners_closed_ids");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("banners_closed_ids(com.revolut.feature.banners.impl.data.database.entity.BannersClosedIdEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(15);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map3.put("single_cta_id", new TableInfo.Column("single_cta_id", "TEXT", false, 0, null, 1));
        map3.put("single_cta_priority", new TableInfo.Column("single_cta_priority", "INTEGER", false, 0, null, 1));
        map3.put("single_cta_image", new TableInfo.Column("single_cta_image", "TEXT", false, 0, null, 1));
        map3.put("single_cta_title", new TableInfo.Column("single_cta_title", "TEXT", false, 0, null, 1));
        map3.put("single_cta_text", new TableInfo.Column("single_cta_text", "TEXT", false, 0, null, 1));
        map3.put("single_cta_closeable", new TableInfo.Column("single_cta_closeable", "INTEGER", false, 0, null, 1));
        map3.put("single_cta_action", new TableInfo.Column("single_cta_action", "TEXT", false, 0, null, 1));
        map3.put("no_cta_id", new TableInfo.Column("no_cta_id", "TEXT", false, 0, null, 1));
        map3.put("no_cta_priority", new TableInfo.Column("no_cta_priority", "INTEGER", false, 0, null, 1));
        map3.put("no_cta_image", new TableInfo.Column("no_cta_image", "TEXT", false, 0, null, 1));
        map3.put("no_cta_title", new TableInfo.Column("no_cta_title", "TEXT", false, 0, null, 1));
        map3.put("no_cta_text", new TableInfo.Column("no_cta_text", "TEXT", false, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("banners", map3, o.s(map3, "no_cta_closeable", new TableInfo.Column("no_cta_closeable", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "banners");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("banners(com.revolut.feature.banners.impl.data.database.entity.BannerEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(2);
        map4.put("key_id", new TableInfo.Column("key_id", "TEXT", true, 1, null, 1));
        HashSet hashSetS2 = o.s(map4, "banner_id", new TableInfo.Column("banner_id", "TEXT", true, 2, null, 1), 2);
        hashSetS2.add(new TableInfo.ForeignKey("banners_keys", "CASCADE", "NO ACTION", Arrays.asList("key_id"), Arrays.asList("id")));
        TableInfo tableInfo7 = new TableInfo("banners_keys_relations", map4, hashSetS2, b.l(hashSetS2, new TableInfo.ForeignKey("banners", "CASCADE", "NO ACTION", Arrays.asList("banner_id"), Arrays.asList("id")), 0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "banners_keys_relations");
        return !tableInfo7.equals(tableInfo8) ? new RoomOpenDelegate.ValidationResult(false, o.o("banners_keys_relations(com.revolut.feature.banners.impl.data.database.entity.BannersKeysRelationEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
