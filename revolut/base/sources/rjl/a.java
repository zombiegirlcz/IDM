package rjl;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.sso.impl.data.db.SsoDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SsoDatabase_Impl f254690a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SsoDatabase_Impl ssoDatabase_Impl) {
        super(6, "17d02b6a7283914cd6a0b9ff9cae1d62", "5030c756f1fe9c37f7bdae357ba6cf30");
        this.f254690a = ssoDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `consented_client` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `consents` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `lastUsedAt` INTEGER NOT NULL, `iconUri` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `user_info_account` (`id` TEXT NOT NULL, `displayTitle` TEXT NOT NULL, `displaySubtitle` TEXT NOT NULL, `profileType` TEXT NOT NULL, `email_value` TEXT, `email_verified` INTEGER, `email_unmaskedValue` TEXT, `phone_value` TEXT, `phone_verified` INTEGER, `phone_unmaskedValue` TEXT, `address_streetAddress` TEXT, `address_postalCode` TEXT, `address_country` TEXT, `address_locality` TEXT, `address_region` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '17d02b6a7283914cd6a0b9ff9cae1d62')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `consented_client`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `user_info_account`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = SsoDatabase_Impl.k;
        this.f254690a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("consents", new TableInfo.Column("consents", "TEXT", true, 0, null, 1));
        map.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
        map.put("lastUsedAt", new TableInfo.Column("lastUsedAt", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("consented_client", map, o.s(map, "iconUri", new TableInfo.Column("iconUri", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "consented_client");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("consented_client(com.revolut.sso.impl.data.db.models.ConsentedClientEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(15);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("displayTitle", new TableInfo.Column("displayTitle", "TEXT", true, 0, null, 1));
        map2.put("displaySubtitle", new TableInfo.Column("displaySubtitle", "TEXT", true, 0, null, 1));
        map2.put("profileType", new TableInfo.Column("profileType", "TEXT", true, 0, null, 1));
        map2.put("email_value", new TableInfo.Column("email_value", "TEXT", false, 0, null, 1));
        map2.put("email_verified", new TableInfo.Column("email_verified", "INTEGER", false, 0, null, 1));
        map2.put("email_unmaskedValue", new TableInfo.Column("email_unmaskedValue", "TEXT", false, 0, null, 1));
        map2.put("phone_value", new TableInfo.Column("phone_value", "TEXT", false, 0, null, 1));
        map2.put("phone_verified", new TableInfo.Column("phone_verified", "INTEGER", false, 0, null, 1));
        map2.put("phone_unmaskedValue", new TableInfo.Column("phone_unmaskedValue", "TEXT", false, 0, null, 1));
        map2.put("address_streetAddress", new TableInfo.Column("address_streetAddress", "TEXT", false, 0, null, 1));
        map2.put("address_postalCode", new TableInfo.Column("address_postalCode", "TEXT", false, 0, null, 1));
        map2.put("address_country", new TableInfo.Column("address_country", "TEXT", false, 0, null, 1));
        map2.put("address_locality", new TableInfo.Column("address_locality", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("user_info_account", map2, o.s(map2, "address_region", new TableInfo.Column("address_region", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "user_info_account");
        return !tableInfo3.equals(tableInfo4) ? new RoomOpenDelegate.ValidationResult(false, o.o("user_info_account(com.revolut.sso.impl.data.db.models.UserInfoAccountEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
