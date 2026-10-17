package ml3;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.contacts.impl.data.database.ContactsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContactsDatabase_Impl f206608a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ContactsDatabase_Impl contactsDatabase_Impl) {
        super(11, "ad5382a3610d073cc2e51f28eed59835", "b3bb150b04b12573cf360454e8a8fd80");
        this.f206608a = contactsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `contact` (`id` INTEGER NOT NULL, `point` TEXT NOT NULL, `displayedName` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `registeredAs` TEXT NOT NULL, `username` TEXT, `code` TEXT, `isRevolut` INTEGER NOT NULL, `isNewlyJoined` INTEGER NOT NULL, `joinDate` INTEGER, `birthday` TEXT, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `pictureUri` TEXT, `type` TEXT NOT NULL, `country` TEXT NOT NULL, `appMode` TEXT NOT NULL, `paidPlan` TEXT, `customerType` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_contact_point` ON `contact` (`point`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `remote_contacts` (`code` TEXT NOT NULL, `username` TEXT NOT NULL, `legalName` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `country` TEXT NOT NULL, `appMode` TEXT NOT NULL, `type` TEXT NOT NULL, `businessName` TEXT, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`code`))");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_remote_contacts_username` ON `remote_contacts` (`username`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `virtual_contacts` (`point` TEXT NOT NULL, `type` TEXT NOT NULL, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`point`))");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_virtual_contacts_point` ON `virtual_contacts` (`point`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `remote_contacts_extra` (`code` TEXT NOT NULL, `username` TEXT NOT NULL, `paidPlan` TEXT, `birthday` TEXT, `legalName` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `businessName` TEXT, PRIMARY KEY(`code`))");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_remote_contacts_extra_username` ON `remote_contacts_extra` (`username`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad5382a3610d073cc2e51f28eed59835')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `contact`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `remote_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `virtual_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `remote_contacts_extra`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = ContactsDatabase_Impl.f65996m;
        this.f206608a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(20);
        map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
        map.put("point", new TableInfo.Column("point", "TEXT", true, 0, null, 1));
        map.put("displayedName", new TableInfo.Column("displayedName", "TEXT", true, 0, null, 1));
        map.put("firstName", new TableInfo.Column("firstName", "TEXT", true, 0, null, 1));
        map.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 0, null, 1));
        map.put("registeredAs", new TableInfo.Column("registeredAs", "TEXT", true, 0, null, 1));
        map.put("username", new TableInfo.Column("username", "TEXT", false, 0, null, 1));
        map.put("code", new TableInfo.Column("code", "TEXT", false, 0, null, 1));
        map.put("isRevolut", new TableInfo.Column("isRevolut", "INTEGER", true, 0, null, 1));
        map.put("isNewlyJoined", new TableInfo.Column("isNewlyJoined", "INTEGER", true, 0, null, 1));
        map.put("joinDate", new TableInfo.Column("joinDate", "INTEGER", false, 0, null, 1));
        map.put("birthday", new TableInfo.Column("birthday", "TEXT", false, 0, null, 1));
        map.put("transactionsCount", new TableInfo.Column("transactionsCount", "INTEGER", true, 0, null, 1));
        map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
        map.put("pictureUri", new TableInfo.Column("pictureUri", "TEXT", false, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, 1));
        map.put("appMode", new TableInfo.Column("appMode", "TEXT", true, 0, null, 1));
        map.put("paidPlan", new TableInfo.Column("paidPlan", "TEXT", false, 0, null, 1));
        HashSet hashSetS = prk.o.s(map, "customerType", new TableInfo.Column("customerType", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_contact_point", true, Arrays.asList("point"), Arrays.asList("ASC")));
        TableInfo tableInfo = new TableInfo("contact", map, hashSetS, hashSet);
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "contact");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("contact(com.revolut.feature.contacts.impl.data.database.ContactEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(11);
        map2.put("code", new TableInfo.Column("code", "TEXT", true, 1, null, 1));
        map2.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, 1));
        map2.put("legalName", new TableInfo.Column("legalName", "TEXT", true, 0, null, 1));
        map2.put("firstName", new TableInfo.Column("firstName", "TEXT", true, 0, null, 1));
        map2.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 0, null, 1));
        map2.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, 1));
        map2.put("appMode", new TableInfo.Column("appMode", "TEXT", true, 0, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("businessName", new TableInfo.Column("businessName", "TEXT", false, 0, null, 1));
        map2.put("transactionsCount", new TableInfo.Column("transactionsCount", "INTEGER", true, 0, null, 1));
        HashSet hashSetS2 = prk.o.s(map2, "timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1), 0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new TableInfo.Index("index_remote_contacts_username", true, Arrays.asList("username"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("remote_contacts", map2, hashSetS2, hashSet2);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "remote_contacts");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("remote_contacts(com.revolut.feature.contacts.impl.data.database.RemoteContactEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(4);
        map3.put("point", new TableInfo.Column("point", "TEXT", true, 1, null, 1));
        map3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map3.put("transactionsCount", new TableInfo.Column("transactionsCount", "INTEGER", true, 0, null, 1));
        HashSet hashSetS3 = prk.o.s(map3, "timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1), 0);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new TableInfo.Index("index_virtual_contacts_point", true, Arrays.asList("point"), Arrays.asList("ASC")));
        TableInfo tableInfo5 = new TableInfo("virtual_contacts", map3, hashSetS3, hashSet3);
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "virtual_contacts");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("virtual_contacts(com.revolut.feature.contacts.impl.data.database.VirtualContactEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(8);
        map4.put("code", new TableInfo.Column("code", "TEXT", true, 1, null, 1));
        map4.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, 1));
        map4.put("paidPlan", new TableInfo.Column("paidPlan", "TEXT", false, 0, null, 1));
        map4.put("birthday", new TableInfo.Column("birthday", "TEXT", false, 0, null, 1));
        map4.put("legalName", new TableInfo.Column("legalName", "TEXT", true, 0, null, 1));
        map4.put("firstName", new TableInfo.Column("firstName", "TEXT", true, 0, null, 1));
        map4.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 0, null, 1));
        HashSet hashSetS4 = prk.o.s(map4, "businessName", new TableInfo.Column("businessName", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new TableInfo.Index("index_remote_contacts_extra_username", true, Arrays.asList("username"), Arrays.asList("ASC")));
        TableInfo tableInfo7 = new TableInfo("remote_contacts_extra", map4, hashSetS4, hashSet4);
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "remote_contacts_extra");
        return !tableInfo7.equals(tableInfo8) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("remote_contacts_extra(com.revolut.feature.contacts.impl.data.database.RemoteContactExtraEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
