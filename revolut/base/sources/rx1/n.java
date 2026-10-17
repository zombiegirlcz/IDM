package rx1;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class n extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ApmContactsDatabase_Impl f258015a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ApmContactsDatabase_Impl apmContactsDatabase_Impl) {
        super(21, "a0e1a113a7a9f457762cf73731cc23a0", "36d356995ff238fff4bfcea6833a500b");
        this.f258015a = apmContactsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `aani_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `isRequestEnabled` INTEGER NOT NULL, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `bizum_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `blik_contacts_temp` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `breb_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `issuingEntityName` TEXT, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `iris_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `identityType` TEXT NOT NULL DEFAULT 'PERSONAL', PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `multibanco_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pix_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `aliasResolutionId` TEXT, `issuingEntityName` TEXT, `identificationType` TEXT, `identificationValue` TEXT, PRIMARY KEY(`descriptor`, `descriptorValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_pix_contacts_descriptorValue` ON `pix_contacts` (`descriptorValue`)");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_pix_contacts_idValue` ON `pix_contacts` (`idValue`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `qvik_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `isRequestEnabled` INTEGER NOT NULL, `settings_blockIncomingMoneyRequests` INTEGER, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `spin_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `wero_contacts` (`id` TEXT NOT NULL, `idValue` TEXT NOT NULL, `descriptor` TEXT NOT NULL, `descriptorValue` TEXT NOT NULL, `contactName` TEXT, `alias` TEXT, `photoUri` TEXT, `state` TEXT NOT NULL, `isRequestEnabled` INTEGER NOT NULL, PRIMARY KEY(`idValue`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a0e1a113a7a9f457762cf73731cc23a0')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `aani_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `bizum_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `blik_contacts_temp`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `breb_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `iris_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `multibanco_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pix_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `qvik_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `spin_contacts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `wero_contacts`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = ApmContactsDatabase_Impl.f61842s;
        this.f258015a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(9);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("aani_contacts", map, prk.o.s(map, "isRequestEnabled", new TableInfo.Column("isRequestEnabled", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "aani_contacts");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("aani_contacts(com.revolut.feature.apm.core.contacts.database.aani.AaniContactEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(8);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map2.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map2.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map2.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map2.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map2.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map2.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("bizum_contacts", map2, prk.o.s(map2, "state", new TableInfo.Column("state", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "bizum_contacts");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("bizum_contacts(com.revolut.feature.apm.core.contacts.database.bizum.BizumContactEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(8);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map3.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map3.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map3.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map3.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map3.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map3.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("blik_contacts_temp", map3, prk.o.s(map3, "state", new TableInfo.Column("state", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "blik_contacts_temp");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("blik_contacts_temp(com.revolut.feature.apm.core.contacts.database.blik.BlikContactEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(9);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map4.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map4.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map4.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map4.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map4.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map4.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        map4.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("breb_contacts", map4, prk.o.s(map4, "issuingEntityName", new TableInfo.Column("issuingEntityName", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "breb_contacts");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("breb_contacts(com.revolut.feature.apm.core.contacts.database.breb.BrebContactEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(9);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map5.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map5.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map5.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map5.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map5.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map5.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        map5.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("iris_contacts", map5, prk.o.s(map5, "identityType", new TableInfo.Column("identityType", "TEXT", true, 0, "'PERSONAL'", 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "iris_contacts");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("iris_contacts(com.revolut.feature.apm.core.contacts.database.iris.IrisContactEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(8);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map6.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map6.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map6.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map6.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map6.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map6.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("multibanco_contacts", map6, prk.o.s(map6, "state", new TableInfo.Column("state", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "multibanco_contacts");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("multibanco_contacts(com.revolut.feature.apm.core.contacts.database.multibanco.MultibancoContactEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(12);
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map7.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 0, null, 1));
        map7.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 1, null, 1));
        map7.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 2, null, 1));
        map7.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map7.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map7.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        map7.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map7.put("aliasResolutionId", new TableInfo.Column("aliasResolutionId", "TEXT", false, 0, null, 1));
        map7.put("issuingEntityName", new TableInfo.Column("issuingEntityName", "TEXT", false, 0, null, 1));
        map7.put("identificationType", new TableInfo.Column("identificationType", "TEXT", false, 0, null, 1));
        HashSet hashSetS = prk.o.s(map7, "identificationValue", new TableInfo.Column("identificationValue", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(2);
        hashSet.add(new TableInfo.Index("index_pix_contacts_descriptorValue", false, Arrays.asList("descriptorValue"), Arrays.asList("ASC")));
        hashSet.add(new TableInfo.Index("index_pix_contacts_idValue", false, Arrays.asList("idValue"), Arrays.asList("ASC")));
        TableInfo tableInfo13 = new TableInfo("pix_contacts", map7, hashSetS, hashSet);
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "pix_contacts");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pix_contacts(com.revolut.feature.apm.core.contacts.database.pix.PixContactEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(10);
        map8.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map8.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map8.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map8.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map8.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map8.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map8.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        map8.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map8.put("isRequestEnabled", new TableInfo.Column("isRequestEnabled", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo15 = new TableInfo("qvik_contacts", map8, prk.o.s(map8, "settings_blockIncomingMoneyRequests", new TableInfo.Column("settings_blockIncomingMoneyRequests", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "qvik_contacts");
        if (!tableInfo15.equals(tableInfo16)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("qvik_contacts(com.revolut.feature.apm.core.contacts.database.qvik.QvikContactEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16));
        }
        HashMap map9 = new HashMap(8);
        map9.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map9.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map9.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map9.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map9.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map9.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map9.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        TableInfo tableInfo17 = new TableInfo("spin_contacts", map9, prk.o.s(map9, "state", new TableInfo.Column("state", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "spin_contacts");
        if (!tableInfo17.equals(tableInfo18)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("spin_contacts(com.revolut.feature.apm.core.contacts.database.spin.SpinContactEntity).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfo18));
        }
        HashMap map10 = new HashMap(9);
        map10.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
        map10.put("idValue", new TableInfo.Column("idValue", "TEXT", true, 1, null, 1));
        map10.put("descriptor", new TableInfo.Column("descriptor", "TEXT", true, 0, null, 1));
        map10.put("descriptorValue", new TableInfo.Column("descriptorValue", "TEXT", true, 0, null, 1));
        map10.put("contactName", new TableInfo.Column("contactName", "TEXT", false, 0, null, 1));
        map10.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, null, 1));
        map10.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
        map10.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo19 = new TableInfo("wero_contacts", map10, prk.o.s(map10, "isRequestEnabled", new TableInfo.Column("isRequestEnabled", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "wero_contacts");
        return !tableInfo19.equals(tableInfo20) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("wero_contacts(com.revolut.feature.apm.core.contacts.database.wero.WeroContactEntity).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfo20)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
