package wq9;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaymentsGroupsDatabase_Impl f299424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PaymentsGroupsDatabase_Impl paymentsGroupsDatabase_Impl) {
        super(22, "8e2ddf14e846ede50f2aa565634f0e69", "19d40431f6fbcdbc3d49e87b25422762");
        this.f299424a = paymentsGroupsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_groups` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `imageUrl` TEXT, `currencyCode` TEXT, `balance` TEXT, `isTrusted` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `lastFullSettlementDate` INTEGER, `settings_calculationType` TEXT NOT NULL, `settings_baseCurrency` TEXT, `analytics_totalSpentByGroup` INTEGER, `analytics_totalSpentByCurrentMember` INTEGER, `analytics_currency` TEXT, `analytics_totalSpentByGroupByCurrency` TEXT, `analytics_totalSpentByCurrentMemberByCurrency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_groups_members` (`memberId` TEXT NOT NULL, `groupId` TEXT NOT NULL, `inviterId` TEXT, `contactId` TEXT, `type` TEXT NOT NULL, `firstName` TEXT, `lastName` TEXT, `countryCode` TEXT, `isRevolut` INTEGER, PRIMARY KEY(`memberId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_groups_bills` (`id` TEXT NOT NULL, `groupId` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `createdBy` TEXT NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `exchangedAmount` TEXT, `createdDate` INTEGER NOT NULL, `transactionId` TEXT, `transactionCategory` TEXT, `transactionLogo` TEXT, `lineItems` TEXT, `receiptImageUri` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_groups_bills_splits` (`id` TEXT NOT NULL, `billId` TEXT NOT NULL, `groupId` TEXT NOT NULL, `ownerId` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `exchangedAmount` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_groups_settlements` (`id` TEXT NOT NULL, `groupId` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `transactionId` TEXT, `paymentLinkId` TEXT, `payerId` TEXT NOT NULL, `payeeId` TEXT NOT NULL, `createdBy` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `exchangedAmount` TEXT, `createdDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_groups_debts` (`id` TEXT NOT NULL, `groupId` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `displayAmount` INTEGER NOT NULL, `displayCurrencyCode` TEXT NOT NULL, `payerId` TEXT NOT NULL, `payeeId` TEXT NOT NULL, `transferReasonRequired` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8e2ddf14e846ede50f2aa565634f0e69')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_groups`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_groups_members`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_groups_bills`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_groups_bills_splits`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_groups_settlements`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `payments_groups_debts`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = PaymentsGroupsDatabase_Impl.o;
        this.f299424a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(15);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, 1));
        map.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", false, 0, null, 1));
        map.put("balance", new TableInfo.Column("balance", "TEXT", false, 0, null, 1));
        map.put("isTrusted", new TableInfo.Column("isTrusted", "INTEGER", true, 0, null, 1));
        map.put("updatedDate", new TableInfo.Column("updatedDate", "INTEGER", true, 0, null, 1));
        map.put("lastFullSettlementDate", new TableInfo.Column("lastFullSettlementDate", "INTEGER", false, 0, null, 1));
        map.put("settings_calculationType", new TableInfo.Column("settings_calculationType", "TEXT", true, 0, null, 1));
        map.put("settings_baseCurrency", new TableInfo.Column("settings_baseCurrency", "TEXT", false, 0, null, 1));
        map.put("analytics_totalSpentByGroup", new TableInfo.Column("analytics_totalSpentByGroup", "INTEGER", false, 0, null, 1));
        map.put("analytics_totalSpentByCurrentMember", new TableInfo.Column("analytics_totalSpentByCurrentMember", "INTEGER", false, 0, null, 1));
        map.put("analytics_currency", new TableInfo.Column("analytics_currency", "TEXT", false, 0, null, 1));
        map.put("analytics_totalSpentByGroupByCurrency", new TableInfo.Column("analytics_totalSpentByGroupByCurrency", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("payments_groups", map, o.s(map, "analytics_totalSpentByCurrentMemberByCurrency", new TableInfo.Column("analytics_totalSpentByCurrentMemberByCurrency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "payments_groups");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("payments_groups(com.revolut.feature.payments.groups.impl.data.database.models.PaymentGroupEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(9);
        map2.put("memberId", new TableInfo.Column("memberId", "TEXT", true, 1, null, 1));
        map2.put("groupId", new TableInfo.Column("groupId", "TEXT", true, 0, null, 1));
        map2.put("inviterId", new TableInfo.Column("inviterId", "TEXT", false, 0, null, 1));
        map2.put("contactId", new TableInfo.Column("contactId", "TEXT", false, 0, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("firstName", new TableInfo.Column("firstName", "TEXT", false, 0, null, 1));
        map2.put("lastName", new TableInfo.Column("lastName", "TEXT", false, 0, null, 1));
        map2.put("countryCode", new TableInfo.Column("countryCode", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("payments_groups_members", map2, o.s(map2, "isRevolut", new TableInfo.Column("isRevolut", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "payments_groups_members");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("payments_groups_members(com.revolut.feature.payments.groups.impl.data.database.models.PaymentGroupMemberEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(15);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("groupId", new TableInfo.Column("groupId", "TEXT", true, 0, null, 1));
        map3.put("ownerId", new TableInfo.Column("ownerId", "TEXT", true, 0, null, 1));
        map3.put("createdBy", new TableInfo.Column("createdBy", "TEXT", true, 0, null, 1));
        map3.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map3.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map3.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map3.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", true, 0, null, 1));
        map3.put("exchangedAmount", new TableInfo.Column("exchangedAmount", "TEXT", false, 0, null, 1));
        map3.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map3.put("transactionId", new TableInfo.Column("transactionId", "TEXT", false, 0, null, 1));
        map3.put("transactionCategory", new TableInfo.Column("transactionCategory", "TEXT", false, 0, null, 1));
        map3.put("transactionLogo", new TableInfo.Column("transactionLogo", "TEXT", false, 0, null, 1));
        map3.put("lineItems", new TableInfo.Column("lineItems", "TEXT", false, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("payments_groups_bills", map3, o.s(map3, "receiptImageUri", new TableInfo.Column("receiptImageUri", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "payments_groups_bills");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("payments_groups_bills(com.revolut.feature.payments.groups.impl.data.database.models.PaymentGroupBillEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(7);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("billId", new TableInfo.Column("billId", "TEXT", true, 0, null, 1));
        map4.put("groupId", new TableInfo.Column("groupId", "TEXT", true, 0, null, 1));
        map4.put("ownerId", new TableInfo.Column("ownerId", "TEXT", true, 0, null, 1));
        map4.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map4.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("payments_groups_bills_splits", map4, o.s(map4, "exchangedAmount", new TableInfo.Column("exchangedAmount", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "payments_groups_bills_splits");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("payments_groups_bills_splits(com.revolut.feature.payments.groups.impl.data.database.models.PaymentGroupBillSplitEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(13);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map5.put("groupId", new TableInfo.Column("groupId", "TEXT", true, 0, null, 1));
        map5.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map5.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map5.put("transactionId", new TableInfo.Column("transactionId", "TEXT", false, 0, null, 1));
        map5.put("paymentLinkId", new TableInfo.Column("paymentLinkId", "TEXT", false, 0, null, 1));
        map5.put("payerId", new TableInfo.Column("payerId", "TEXT", true, 0, null, 1));
        map5.put("payeeId", new TableInfo.Column("payeeId", "TEXT", true, 0, null, 1));
        map5.put("createdBy", new TableInfo.Column("createdBy", "TEXT", true, 0, null, 1));
        map5.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map5.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", true, 0, null, 1));
        map5.put("exchangedAmount", new TableInfo.Column("exchangedAmount", "TEXT", false, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("payments_groups_settlements", map5, o.s(map5, "createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "payments_groups_settlements");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("payments_groups_settlements(com.revolut.feature.payments.groups.impl.data.database.models.PaymentGroupSettlementEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(11);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("groupId", new TableInfo.Column("groupId", "TEXT", true, 0, null, 1));
        map6.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map6.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map6.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map6.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", true, 0, null, 1));
        map6.put("displayAmount", new TableInfo.Column("displayAmount", "INTEGER", true, 0, null, 1));
        map6.put("displayCurrencyCode", new TableInfo.Column("displayCurrencyCode", "TEXT", true, 0, null, 1));
        map6.put("payerId", new TableInfo.Column("payerId", "TEXT", true, 0, null, 1));
        map6.put("payeeId", new TableInfo.Column("payeeId", "TEXT", true, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("payments_groups_debts", map6, o.s(map6, "transferReasonRequired", new TableInfo.Column("transferReasonRequired", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "payments_groups_debts");
        return !tableInfo11.equals(tableInfo12) ? new RoomOpenDelegate.ValidationResult(false, o.o("payments_groups_debts(com.revolut.feature.payments.groups.impl.data.database.models.PaymentGroupDebtEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
