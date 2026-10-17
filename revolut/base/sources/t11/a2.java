package t11;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.data.database.AppRoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppRoomDatabase_Impl f267061a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(AppRoomDatabase_Impl appRoomDatabase_Impl) {
        super(388, "3770e7c1d16540a4e89816c4f45ab160", "32165d02e6177697004a6e270cc81ebf");
        this.f267061a = appRoomDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `recurring_payments` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `type` TEXT NOT NULL, `receiver` TEXT, `speed` TEXT, `updatedDate` INTEGER, `startDate` TEXT, `nextDate` TEXT, `endDate` TEXT, `period` TEXT, `frequency` TEXT, `recurring` INTEGER, `estimated` INTEGER, `autoExchangeEnabled` INTEGER, `fee` TEXT, `sourceCurrency` TEXT, `currency` TEXT NOT NULL, `amount` INTEGER, `title` TEXT, `description` TEXT, `transferReason` TEXT, `receiverInfoRecurringBuy` TEXT, `recieverInfoBeneficiary` TEXT, `recieverInfoRecipient` TEXT, `recieverInfoCreditor` TEXT, `receiverInfoVault` TEXT, `receiverInfoMerchant` TEXT, `receiverCreditEntity` TEXT, `receiverPayLaterEntity` TEXT, `receiverLoanEntity` TEXT, `receiverAccountInfo` TEXT, `cobrandsLogo` TEXT, `receiverPaymentCounterpartyInfo` TEXT, `receiverPaymentMethodDetails` TEXT, `receiverUpiInfo` TEXT, `senderAccountInfo` TEXT, `billMoneyBoxId` TEXT, `side` TEXT, `day` INTEGER NOT NULL, `gifUrl` TEXT, `linkedTransactionsIds` TEXT, `planInfo` TEXT, `wallet_id` TEXT, `initiator_id` TEXT, `initiator_name` TEXT, `name` TEXT, `pending_refund_sender_info` TEXT, `referenceFields` TEXT, `sourcePocketId` TEXT, `sourcePocketScope` TEXT, `payment_scheme` TEXT, `payment_method` TEXT, `end_criteria` TEXT, `availableActions` TEXT, `fundsSource` TEXT, `bill_details` TEXT, `walletAutomation` TEXT, `initiationMethod` TEXT, `request_frequency_confirmation` INTEGER, `deactivatedDate` TEXT, `blockExpiryDate` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `consents` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `expiry_date` INTEGER, `permissions` TEXT NOT NULL, `account_numbers` TEXT NOT NULL, `third_party_id` TEXT NOT NULL, `third_party_name` TEXT NOT NULL, `third_party_logo` TEXT, `is_active` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `institutions` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logo` TEXT NOT NULL, `logoType` TEXT NOT NULL, `paymentInitiation` INTEGER NOT NULL, `infoProvider` INTEGER NOT NULL, `requirements` TEXT NOT NULL, `mandateInitiation` INTEGER NOT NULL, `tags` TEXT NOT NULL, `description` TEXT, `system` TEXT NOT NULL, `recurrenceSupported` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `institution_branch` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `institution_id` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`institution_id`) REFERENCES `institutions`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_institution_branch_institution_id` ON `institution_branch` (`institution_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_custom_category` (`id` TEXT NOT NULL, `walletId` TEXT NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `color` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `beneficiaries` (`id` TEXT NOT NULL, `rootId` TEXT, `ownerId` TEXT, `name` TEXT, `firstName` TEXT, `lastName` TEXT, `companyName` TEXT, `fullName` TEXT, `type` TEXT, `bankCountry` TEXT, `bankLogo` TEXT, `paymentType` TEXT, `extraFields` TEXT, `settings` TEXT NOT NULL, `accountFields` TEXT, `externalRef` TEXT, `externalAccount` INTEGER, `state` TEXT, `address` TEXT, `email` TEXT, `phone` TEXT, `deprecated` INTEGER NOT NULL, `country` TEXT, `currency` TEXT, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `label` TEXT, `identification` TEXT, `createdDate` INTEGER, `counterpartyDetailsGroup` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `split_bill` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `currency` TEXT NOT NULL, `comment` TEXT, `owner_id` TEXT, `dateTime` INTEGER NOT NULL, `splitted_items` TEXT NOT NULL, `money_requests` TEXT NOT NULL, `registered_identity_id` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `statement_template_info` (`id` TEXT NOT NULL, `checkSum` TEXT NOT NULL, `url` TEXT NOT NULL, `accountId` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3770e7c1d16540a4e89816c4f45ab160')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `recurring_payments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `consents`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `institutions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `institution_branch`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `transaction_custom_category`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `beneficiaries`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `split_bill`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `statement_template_info`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = AppRoomDatabase_Impl.f60128p;
        this.f267061a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(61);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("receiver", new TableInfo.Column("receiver", "TEXT", false, 0, null, 1));
        map.put("speed", new TableInfo.Column("speed", "TEXT", false, 0, null, 1));
        map.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", false, 0, null, 1));
        map.put("startDate", new TableInfo.Column("startDate", "TEXT", false, 0, null, 1));
        map.put("nextDate", new TableInfo.Column("nextDate", "TEXT", false, 0, null, 1));
        map.put("endDate", new TableInfo.Column("endDate", "TEXT", false, 0, null, 1));
        map.put("period", new TableInfo.Column("period", "TEXT", false, 0, null, 1));
        map.put("frequency", new TableInfo.Column("frequency", "TEXT", false, 0, null, 1));
        map.put("recurring", new TableInfo.Column("recurring", "INTEGER", false, 0, null, 1));
        map.put("estimated", new TableInfo.Column("estimated", "INTEGER", false, 0, null, 1));
        map.put("autoExchangeEnabled", new TableInfo.Column("autoExchangeEnabled", "INTEGER", false, 0, null, 1));
        map.put("fee", new TableInfo.Column("fee", "TEXT", false, 0, null, 1));
        map.put("sourceCurrency", new TableInfo.Column("sourceCurrency", "TEXT", false, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("amount", new TableInfo.Column("amount", "INTEGER", false, 0, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map.put("transferReason", new TableInfo.Column("transferReason", "TEXT", false, 0, null, 1));
        map.put("receiverInfoRecurringBuy", new TableInfo.Column("receiverInfoRecurringBuy", "TEXT", false, 0, null, 1));
        map.put("recieverInfoBeneficiary", new TableInfo.Column("recieverInfoBeneficiary", "TEXT", false, 0, null, 1));
        map.put("recieverInfoRecipient", new TableInfo.Column("recieverInfoRecipient", "TEXT", false, 0, null, 1));
        map.put("recieverInfoCreditor", new TableInfo.Column("recieverInfoCreditor", "TEXT", false, 0, null, 1));
        map.put("receiverInfoVault", new TableInfo.Column("receiverInfoVault", "TEXT", false, 0, null, 1));
        map.put("receiverInfoMerchant", new TableInfo.Column("receiverInfoMerchant", "TEXT", false, 0, null, 1));
        map.put("receiverCreditEntity", new TableInfo.Column("receiverCreditEntity", "TEXT", false, 0, null, 1));
        map.put("receiverPayLaterEntity", new TableInfo.Column("receiverPayLaterEntity", "TEXT", false, 0, null, 1));
        map.put("receiverLoanEntity", new TableInfo.Column("receiverLoanEntity", "TEXT", false, 0, null, 1));
        map.put("receiverAccountInfo", new TableInfo.Column("receiverAccountInfo", "TEXT", false, 0, null, 1));
        map.put("cobrandsLogo", new TableInfo.Column("cobrandsLogo", "TEXT", false, 0, null, 1));
        map.put("receiverPaymentCounterpartyInfo", new TableInfo.Column("receiverPaymentCounterpartyInfo", "TEXT", false, 0, null, 1));
        map.put("receiverPaymentMethodDetails", new TableInfo.Column("receiverPaymentMethodDetails", "TEXT", false, 0, null, 1));
        map.put("receiverUpiInfo", new TableInfo.Column("receiverUpiInfo", "TEXT", false, 0, null, 1));
        map.put("senderAccountInfo", new TableInfo.Column("senderAccountInfo", "TEXT", false, 0, null, 1));
        map.put("billMoneyBoxId", new TableInfo.Column("billMoneyBoxId", "TEXT", false, 0, null, 1));
        map.put("side", new TableInfo.Column("side", "TEXT", false, 0, null, 1));
        map.put("day", new TableInfo.Column("day", "INTEGER", true, 0, null, 1));
        map.put("gifUrl", new TableInfo.Column("gifUrl", "TEXT", false, 0, null, 1));
        map.put("linkedTransactionsIds", new TableInfo.Column("linkedTransactionsIds", "TEXT", false, 0, null, 1));
        map.put("planInfo", new TableInfo.Column("planInfo", "TEXT", false, 0, null, 1));
        map.put("wallet_id", new TableInfo.Column("wallet_id", "TEXT", false, 0, null, 1));
        map.put("initiator_id", new TableInfo.Column("initiator_id", "TEXT", false, 0, null, 1));
        map.put("initiator_name", new TableInfo.Column("initiator_name", "TEXT", false, 0, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
        map.put("pending_refund_sender_info", new TableInfo.Column("pending_refund_sender_info", "TEXT", false, 0, null, 1));
        map.put("referenceFields", new TableInfo.Column("referenceFields", "TEXT", false, 0, null, 1));
        map.put("sourcePocketId", new TableInfo.Column("sourcePocketId", "TEXT", false, 0, null, 1));
        map.put("sourcePocketScope", new TableInfo.Column("sourcePocketScope", "TEXT", false, 0, null, 1));
        map.put("payment_scheme", new TableInfo.Column("payment_scheme", "TEXT", false, 0, null, 1));
        map.put("payment_method", new TableInfo.Column("payment_method", "TEXT", false, 0, null, 1));
        map.put("end_criteria", new TableInfo.Column("end_criteria", "TEXT", false, 0, null, 1));
        map.put("availableActions", new TableInfo.Column("availableActions", "TEXT", false, 0, null, 1));
        map.put("fundsSource", new TableInfo.Column("fundsSource", "TEXT", false, 0, null, 1));
        map.put("bill_details", new TableInfo.Column("bill_details", "TEXT", false, 0, null, 1));
        map.put("walletAutomation", new TableInfo.Column("walletAutomation", "TEXT", false, 0, null, 1));
        map.put("initiationMethod", new TableInfo.Column("initiationMethod", "TEXT", false, 0, null, 1));
        map.put("request_frequency_confirmation", new TableInfo.Column("request_frequency_confirmation", "INTEGER", false, 0, null, 1));
        map.put("deactivatedDate", new TableInfo.Column("deactivatedDate", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("recurring_payments", map, prk.o.s(map, "blockExpiryDate", new TableInfo.Column("blockExpiryDate", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "recurring_payments");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("recurring_payments(com.revolut.data.database.models.recurringpayments.RecurringPaymentEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(9);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("expiry_date", new TableInfo.Column("expiry_date", "INTEGER", false, 0, null, 1));
        map2.put("permissions", new TableInfo.Column("permissions", "TEXT", true, 0, null, 1));
        map2.put("account_numbers", new TableInfo.Column("account_numbers", "TEXT", true, 0, null, 1));
        map2.put("third_party_id", new TableInfo.Column("third_party_id", "TEXT", true, 0, null, 1));
        map2.put("third_party_name", new TableInfo.Column("third_party_name", "TEXT", true, 0, null, 1));
        map2.put("third_party_logo", new TableInfo.Column("third_party_logo", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("consents", map2, prk.o.s(map2, "is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, "1", 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "consents");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("consents(com.revolut.data.database.models.openbanking.ConsentEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(12);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map3.put("logo", new TableInfo.Column("logo", "TEXT", true, 0, null, 1));
        map3.put("logoType", new TableInfo.Column("logoType", "TEXT", true, 0, null, 1));
        map3.put("paymentInitiation", new TableInfo.Column("paymentInitiation", "INTEGER", true, 0, null, 1));
        map3.put("infoProvider", new TableInfo.Column("infoProvider", "INTEGER", true, 0, null, 1));
        map3.put("requirements", new TableInfo.Column("requirements", "TEXT", true, 0, null, 1));
        map3.put("mandateInitiation", new TableInfo.Column("mandateInitiation", "INTEGER", true, 0, null, 1));
        map3.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, 1));
        map3.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map3.put("system", new TableInfo.Column("system", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("institutions", map3, prk.o.s(map3, "recurrenceSupported", new TableInfo.Column("recurrenceSupported", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "institutions");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("institutions(com.revolut.data.database.models.openbanking.ExternalInstitutionEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(3);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        HashSet hashSetS = prk.o.s(map4, "institution_id", new TableInfo.Column("institution_id", "TEXT", true, 0, null, 1), 1);
        HashSet hashSetL = r6.b.l(hashSetS, new TableInfo.ForeignKey("institutions", "CASCADE", "NO ACTION", Arrays.asList("institution_id"), Arrays.asList("id")), 1);
        hashSetL.add(new TableInfo.Index("index_institution_branch_institution_id", false, Arrays.asList("institution_id"), Arrays.asList("ASC")));
        TableInfo tableInfo7 = new TableInfo("institution_branch", map4, hashSetS, hashSetL);
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "institution_branch");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("institution_branch(com.revolut.data.database.models.openbanking.ExternalInstitutionBranchEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(5);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map5.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 0, null, 1));
        map5.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map5.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("transaction_custom_category", map5, prk.o.s(map5, "color", new TableInfo.Column("color", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "transaction_custom_category");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("transaction_custom_category(com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(30);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("rootId", new TableInfo.Column("rootId", "TEXT", false, 0, null, 1));
        map6.put("ownerId", new TableInfo.Column("ownerId", "TEXT", false, 0, null, 1));
        map6.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
        map6.put("firstName", new TableInfo.Column("firstName", "TEXT", false, 0, null, 1));
        map6.put("lastName", new TableInfo.Column("lastName", "TEXT", false, 0, null, 1));
        map6.put("companyName", new TableInfo.Column("companyName", "TEXT", false, 0, null, 1));
        map6.put("fullName", new TableInfo.Column("fullName", "TEXT", false, 0, null, 1));
        map6.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, 1));
        map6.put("bankCountry", new TableInfo.Column("bankCountry", "TEXT", false, 0, null, 1));
        map6.put("bankLogo", new TableInfo.Column("bankLogo", "TEXT", false, 0, null, 1));
        map6.put("paymentType", new TableInfo.Column("paymentType", "TEXT", false, 0, null, 1));
        map6.put("extraFields", new TableInfo.Column("extraFields", "TEXT", false, 0, null, 1));
        map6.put("settings", new TableInfo.Column("settings", "TEXT", true, 0, null, 1));
        map6.put("accountFields", new TableInfo.Column("accountFields", "TEXT", false, 0, null, 1));
        map6.put("externalRef", new TableInfo.Column("externalRef", "TEXT", false, 0, null, 1));
        map6.put("externalAccount", new TableInfo.Column("externalAccount", "INTEGER", false, 0, null, 1));
        map6.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, 1));
        map6.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, 1));
        map6.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, 1));
        map6.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, 1));
        map6.put("deprecated", new TableInfo.Column("deprecated", "INTEGER", true, 0, null, 1));
        map6.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, 1));
        map6.put("currency", new TableInfo.Column("currency", "TEXT", false, 0, null, 1));
        map6.put("transactionsCount", new TableInfo.Column("transactionsCount", "INTEGER", true, 0, null, 1));
        map6.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
        map6.put("label", new TableInfo.Column("label", "TEXT", false, 0, null, 1));
        map6.put("identification", new TableInfo.Column("identification", "TEXT", false, 0, null, 1));
        map6.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("beneficiaries", map6, prk.o.s(map6, "counterpartyDetailsGroup", new TableInfo.Column("counterpartyDetailsGroup", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "beneficiaries");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("beneficiaries(com.revolut.data.database.models.beneficiary.BeneficiaryEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(9);
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map7.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map7.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map7.put("comment", new TableInfo.Column("comment", "TEXT", false, 0, null, 1));
        map7.put("owner_id", new TableInfo.Column("owner_id", "TEXT", false, 0, null, 1));
        map7.put("dateTime", new TableInfo.Column("dateTime", "INTEGER", true, 0, null, 1));
        map7.put("splitted_items", new TableInfo.Column("splitted_items", "TEXT", true, 0, null, 1));
        map7.put("money_requests", new TableInfo.Column("money_requests", "TEXT", true, 0, null, 1));
        TableInfo tableInfo13 = new TableInfo("split_bill", map7, prk.o.s(map7, "registered_identity_id", new TableInfo.Column("registered_identity_id", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "split_bill");
        if (!tableInfo13.equals(tableInfo14)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("split_bill(com.revolut.data.database.models.splitbill.SplitBillEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14));
        }
        HashMap map8 = new HashMap(4);
        map8.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map8.put("checkSum", new TableInfo.Column("checkSum", "TEXT", true, 0, null, 1));
        map8.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, 1));
        TableInfo tableInfo15 = new TableInfo("statement_template_info", map8, prk.o.s(map8, "accountId", new TableInfo.Column("accountId", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "statement_template_info");
        return !tableInfo15.equals(tableInfo16) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("statement_template_info(com.revolut.data.database.models.statement.StatementTemplateInfoEntity).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfo16)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
