package m91;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccountSwitchingDatabase_Impl f203607a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountSwitchingDatabase_Impl accountSwitchingDatabase_Impl) {
        super(7, "b9ee34dc30122cbd1a6543466ddd3dde", "24f099613a62479b487b6aa1870955af");
        this.f203607a = accountSwitchingDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_source_bank_details_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logoUrl` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_pae_source_bank_details_table_name` ON `pae_source_bank_details_table` (`name`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_direct_debits_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `sentDate` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_scheduled_payments_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `frequency` TEXT NOT NULL, `iban` TEXT, `reference` TEXT NOT NULL, `state` TEXT NOT NULL, `sentDate` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_scheduled_payment_overridden_data_table` (`id` TEXT NOT NULL, `reference` TEXT, `frequency` TEXT, `startDate` TEXT, `beneficiaryId` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`id`) REFERENCES `pae_scheduled_payments_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_incoming_payments_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `sentDate` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_payment_address_table` (`id` TEXT NOT NULL, `postcode` TEXT NOT NULL, `street` TEXT NOT NULL, `city` TEXT NOT NULL, `country` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`id`) REFERENCES `pae_direct_debits_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_payment_overridden_names_table` (`id` TEXT NOT NULL, `overriddenName` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`id`) REFERENCES `pae_direct_debits_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_payment_required_attributes_table` (`id` TEXT NOT NULL, `paymentId` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT, PRIMARY KEY(`id`, `paymentId`), FOREIGN KEY(`paymentId`) REFERENCES `pae_direct_debits_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_pae_payment_required_attributes_table_paymentId` ON `pae_payment_required_attributes_table` (`paymentId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pae_payment_required_attribute_values_table` (`id` TEXT NOT NULL, `paymentId` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`id`, `paymentId`), FOREIGN KEY(`id`, `paymentId`) REFERENCES `pae_payment_required_attributes_table`(`id`, `paymentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b9ee34dc30122cbd1a6543466ddd3dde')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_source_bank_details_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_direct_debits_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_scheduled_payments_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_scheduled_payment_overridden_data_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_incoming_payments_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_payment_address_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_payment_overridden_names_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_payment_required_attributes_table`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pae_payment_required_attribute_values_table`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = AccountSwitchingDatabase_Impl.o;
        this.f203607a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(3);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        HashSet hashSetS = prk.o.s(map, "logoUrl", new TableInfo.Column("logoUrl", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_pae_source_bank_details_table_name", false, Arrays.asList("name"), Arrays.asList("ASC")));
        TableInfo tableInfo = new TableInfo("pae_source_bank_details_table", map, hashSetS, hashSet);
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "pae_source_bank_details_table");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_source_bank_details_table(com.revolut.feature.account_switching.impl.data.storage.entity.SourceBankDetailsEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(9);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map2.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map2.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map2.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
        map2.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", false, 0, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("pae_direct_debits_table", map2, prk.o.s(map2, "sentDate", new TableInfo.Column("sentDate", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "pae_direct_debits_table");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_direct_debits_table(com.revolut.feature.account_switching.impl.data.storage.entity.DirectDebitEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(11);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map3.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map3.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map3.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
        map3.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", false, 0, null, 1));
        map3.put("frequency", new TableInfo.Column("frequency", "TEXT", true, 0, null, 1));
        map3.put("iban", new TableInfo.Column("iban", "TEXT", false, 0, null, 1));
        map3.put("reference", new TableInfo.Column("reference", "TEXT", true, 0, null, 1));
        map3.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("pae_scheduled_payments_table", map3, prk.o.s(map3, "sentDate", new TableInfo.Column("sentDate", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "pae_scheduled_payments_table");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_scheduled_payments_table(com.revolut.feature.account_switching.impl.data.storage.entity.ScheduledPaymentEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(5);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("reference", new TableInfo.Column("reference", "TEXT", false, 0, null, 1));
        map4.put("frequency", new TableInfo.Column("frequency", "TEXT", false, 0, null, 1));
        map4.put("startDate", new TableInfo.Column("startDate", "TEXT", false, 0, null, 1));
        HashSet hashSetS2 = prk.o.s(map4, "beneficiaryId", new TableInfo.Column("beneficiaryId", "TEXT", false, 0, null, 1), 1);
        TableInfo tableInfo7 = new TableInfo("pae_scheduled_payment_overridden_data_table", map4, hashSetS2, r6.b.l(hashSetS2, new TableInfo.ForeignKey("pae_scheduled_payments_table", "CASCADE", "NO ACTION", Arrays.asList("id"), Arrays.asList("id")), 0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "pae_scheduled_payment_overridden_data_table");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_scheduled_payment_overridden_data_table(com.revolut.feature.account_switching.impl.data.storage.entity.ScheduledPaymentOverriddenDataEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(9);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map5.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map5.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map5.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map5.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
        map5.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", false, 0, null, 1));
        map5.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map5.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("pae_incoming_payments_table", map5, prk.o.s(map5, "sentDate", new TableInfo.Column("sentDate", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "pae_incoming_payments_table");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_incoming_payments_table(com.revolut.feature.account_switching.impl.data.storage.entity.IncomingPaymentEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(5);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("postcode", new TableInfo.Column("postcode", "TEXT", true, 0, null, 1));
        map6.put("street", new TableInfo.Column("street", "TEXT", true, 0, null, 1));
        map6.put("city", new TableInfo.Column("city", "TEXT", true, 0, null, 1));
        HashSet hashSetS3 = prk.o.s(map6, "country", new TableInfo.Column("country", "TEXT", true, 0, null, 1), 1);
        TableInfo tableInfo11 = new TableInfo("pae_payment_address_table", map6, hashSetS3, r6.b.l(hashSetS3, new TableInfo.ForeignKey("pae_direct_debits_table", "CASCADE", "NO ACTION", Arrays.asList("id"), Arrays.asList("id")), 0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "pae_payment_address_table");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_payment_address_table(com.revolut.feature.account_switching.impl.data.storage.entity.PaymentAddressEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(2);
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        HashSet hashSetS4 = prk.o.s(map7, "overriddenName", new TableInfo.Column("overriddenName", "TEXT", true, 0, null, 1), 1);
        TableInfo tableInfo13 = new TableInfo("pae_payment_overridden_names_table", map7, hashSetS4, r6.b.l(hashSetS4, new TableInfo.ForeignKey("pae_direct_debits_table", "CASCADE", "NO ACTION", Arrays.asList("id"), Arrays.asList("id")), 0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "pae_payment_overridden_names_table");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_payment_overridden_names_table(com.revolut.feature.account_switching.impl.data.storage.entity.PaymentOverriddenNameEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(4);
        map8.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map8.put("paymentId", new TableInfo.Column("paymentId", "TEXT", true, 2, null, 1));
        map8.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        HashSet hashSetS5 = prk.o.s(map8, "description", new TableInfo.Column("description", "TEXT", false, 0, null, 1), 1);
        HashSet hashSetL = r6.b.l(hashSetS5, new TableInfo.ForeignKey("pae_direct_debits_table", "CASCADE", "NO ACTION", Arrays.asList("paymentId"), Arrays.asList("id")), 1);
        hashSetL.add(new TableInfo.Index("index_pae_payment_required_attributes_table_paymentId", false, Arrays.asList("paymentId"), Arrays.asList("ASC")));
        TableInfo tableInfo15 = new TableInfo("pae_payment_required_attributes_table", map8, hashSetS5, hashSetL);
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "pae_payment_required_attributes_table");
        if (!tableInfo15.equals(tableInfo16)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_payment_required_attributes_table(com.revolut.feature.account_switching.impl.data.storage.entity.PaymentRequiredAttributeEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16));
        }
        HashMap map9 = new HashMap(3);
        map9.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map9.put("paymentId", new TableInfo.Column("paymentId", "TEXT", true, 2, null, 1));
        HashSet hashSetS6 = prk.o.s(map9, "value", new TableInfo.Column("value", "TEXT", true, 0, null, 1), 1);
        TableInfo tableInfo17 = new TableInfo("pae_payment_required_attribute_values_table", map9, hashSetS6, r6.b.l(hashSetS6, new TableInfo.ForeignKey("pae_payment_required_attributes_table", "CASCADE", "NO ACTION", Arrays.asList("id", "paymentId"), Arrays.asList("id", "paymentId")), 0));
        TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "pae_payment_required_attribute_values_table");
        return !tableInfo17.equals(tableInfo18) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("pae_payment_required_attribute_values_table(com.revolut.feature.account_switching.impl.data.storage.entity.PaymentRequiredAttributeValueEntity).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfo18)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
