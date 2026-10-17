package m45;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.credit.loan.impl.database.LoanDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoanDatabase_Impl f202668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(LoanDatabase_Impl loanDatabase_Impl) {
        super(40, "cea4a041b7fa68be3e68bbc9e61fd8e6", "6d3dc5e866f9e3748329aa9d9cd88aae");
        this.f202668a = loanDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `statement_documents` (`loanId` TEXT NOT NULL, `statementId` TEXT NOT NULL, `issueDate` TEXT NOT NULL, `statementPeriodFrom` TEXT NOT NULL, `statementPeriodTo` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`loanId`, `statementId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `update_dates` (`key` TEXT NOT NULL, `updateDate` INTEGER NOT NULL, PRIMARY KEY(`key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loan_preferences` (`loanId` TEXT NOT NULL, `isHidden` INTEGER NOT NULL, PRIMARY KEY(`loanId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loan_refinanced_credits_v2` (`refinancingIdentifier` TEXT NOT NULL, `refinancingState` TEXT NOT NULL, `loanId` TEXT NOT NULL, `id` TEXT NOT NULL, `mode` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `receiptAvailable` INTEGER NOT NULL, `bankName` TEXT, `fallbackDateTime` TEXT, `fallbackTransactionId` TEXT, PRIMARY KEY(`loanId`, `id`, `refinancingIdentifier`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loans` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `disbursalDate` TEXT NOT NULL, `finalRepaymentDate` TEXT NOT NULL, `currency` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `principal` INTEGER NOT NULL, `outstandingPrincipal` INTEGER NOT NULL, `outstandingRescheduledPrincipal` INTEGER, `fixedOutstandingBalance` INTEGER, `totalRepaid` INTEGER NOT NULL, `totalToRepay` INTEGER NOT NULL, `fractionRepaid` REAL NOT NULL, `state` TEXT NOT NULL, `product` TEXT NOT NULL, `repaidCount` INTEGER NOT NULL, `remainingTerm` INTEGER NOT NULL, `interestRate` TEXT NOT NULL, `nextInstalment` TEXT, `lastPaidRepayment` TEXT, `config` TEXT NOT NULL, `refurbishment` TEXT, `interestOnly` TEXT, `insuranceState` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loan_details_shard` (`id` TEXT NOT NULL, `durationMonths` INTEGER NOT NULL, `repaymentDay` INTEGER NOT NULL, `outstandingBalance` INTEGER NOT NULL, `accruedInterest` TEXT NOT NULL, `accruedFee` TEXT NOT NULL, `oneTimeFee` TEXT NOT NULL, `monthlyRepayment` INTEGER NOT NULL, `isInCooldownPeriod` INTEGER NOT NULL, `unavailableFeatures` TEXT NOT NULL, `borrowers` TEXT NOT NULL, `autoPayRepaymentSource` TEXT, `backupCard` TEXT, `repaymentConfig` TEXT NOT NULL, `agreementNumber` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `loan_repayments` (`loanId` TEXT NOT NULL, `id` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `repaymentDateTime` TEXT NOT NULL, `currency` TEXT NOT NULL, `amount` INTEGER NOT NULL, `type` TEXT NOT NULL, `clientId` TEXT, `firstName` TEXT, `lastName` TEXT, `principal` INTEGER, `accruedInterest` INTEGER, `lateRepaymentInterest` INTEGER, `transferType` TEXT, `accountDetails` TEXT, `insuranceType` TEXT, PRIMARY KEY(`id`, `loanId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cea4a041b7fa68be3e68bbc9e61fd8e6')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `statement_documents`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `update_dates`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `loan_preferences`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `loan_refinanced_credits_v2`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `loans`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `loan_details_shard`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `loan_repayments`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = LoanDatabase_Impl.f70308m;
        this.f202668a.internalInitInvalidationTracker(sQLiteConnection);
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
        map.put("loanId", new TableInfo.Column("loanId", "TEXT", true, 1, null, 1));
        map.put("statementId", new TableInfo.Column("statementId", "TEXT", true, 2, null, 1));
        map.put("issueDate", new TableInfo.Column("issueDate", "TEXT", true, 0, null, 1));
        map.put("statementPeriodFrom", new TableInfo.Column("statementPeriodFrom", "TEXT", true, 0, null, 1));
        map.put("statementPeriodTo", new TableInfo.Column("statementPeriodTo", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("statement_documents", map, o.s(map, "type", new TableInfo.Column("type", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "statement_documents");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("statement_documents(com.revolut.feature.credit.loan.impl.database.entity.StatementDocumentEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(2);
        map2.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        TableInfo tableInfo3 = new TableInfo("update_dates", map2, o.s(map2, "updateDate", new TableInfo.Column("updateDate", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "update_dates");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("update_dates(com.revolut.feature.credit.loan.impl.database.entity.UpdateDateEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(2);
        map3.put("loanId", new TableInfo.Column("loanId", "TEXT", true, 1, null, 1));
        TableInfo tableInfo5 = new TableInfo("loan_preferences", map3, o.s(map3, "isHidden", new TableInfo.Column("isHidden", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "loan_preferences");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("loan_preferences(com.revolut.feature.credit.loan.impl.database.entity.LoanPreferencesEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(13);
        map4.put("refinancingIdentifier", new TableInfo.Column("refinancingIdentifier", "TEXT", true, 3, null, 1));
        map4.put("refinancingState", new TableInfo.Column("refinancingState", "TEXT", true, 0, null, 1));
        map4.put("loanId", new TableInfo.Column("loanId", "TEXT", true, 1, null, 1));
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 2, null, 1));
        map4.put("mode", new TableInfo.Column("mode", "TEXT", true, 0, null, 1));
        map4.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map4.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map4.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map4.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map4.put("receiptAvailable", new TableInfo.Column("receiptAvailable", "INTEGER", true, 0, null, 1));
        map4.put("bankName", new TableInfo.Column("bankName", "TEXT", false, 0, null, 1));
        map4.put("fallbackDateTime", new TableInfo.Column("fallbackDateTime", "TEXT", false, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("loan_refinanced_credits_v2", map4, o.s(map4, "fallbackTransactionId", new TableInfo.Column("fallbackTransactionId", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "loan_refinanced_credits_v2");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("loan_refinanced_credits_v2(com.revolut.feature.credit.loan.impl.database.entity.LoanRefinancedCreditDetailsEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(24);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map5.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map5.put("disbursalDate", new TableInfo.Column("disbursalDate", "TEXT", true, 0, null, 1));
        map5.put("finalRepaymentDate", new TableInfo.Column("finalRepaymentDate", "TEXT", true, 0, null, 1));
        map5.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map5.put("countryCode", new TableInfo.Column("countryCode", "TEXT", true, 0, null, 1));
        map5.put("principal", new TableInfo.Column("principal", "INTEGER", true, 0, null, 1));
        map5.put("outstandingPrincipal", new TableInfo.Column("outstandingPrincipal", "INTEGER", true, 0, null, 1));
        map5.put("outstandingRescheduledPrincipal", new TableInfo.Column("outstandingRescheduledPrincipal", "INTEGER", false, 0, null, 1));
        map5.put("fixedOutstandingBalance", new TableInfo.Column("fixedOutstandingBalance", "INTEGER", false, 0, null, 1));
        map5.put("totalRepaid", new TableInfo.Column("totalRepaid", "INTEGER", true, 0, null, 1));
        map5.put("totalToRepay", new TableInfo.Column("totalToRepay", "INTEGER", true, 0, null, 1));
        map5.put("fractionRepaid", new TableInfo.Column("fractionRepaid", "REAL", true, 0, null, 1));
        map5.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map5.put("product", new TableInfo.Column("product", "TEXT", true, 0, null, 1));
        map5.put("repaidCount", new TableInfo.Column("repaidCount", "INTEGER", true, 0, null, 1));
        map5.put("remainingTerm", new TableInfo.Column("remainingTerm", "INTEGER", true, 0, null, 1));
        map5.put("interestRate", new TableInfo.Column("interestRate", "TEXT", true, 0, null, 1));
        map5.put("nextInstalment", new TableInfo.Column("nextInstalment", "TEXT", false, 0, null, 1));
        map5.put("lastPaidRepayment", new TableInfo.Column("lastPaidRepayment", "TEXT", false, 0, null, 1));
        map5.put("config", new TableInfo.Column("config", "TEXT", true, 0, null, 1));
        map5.put("refurbishment", new TableInfo.Column("refurbishment", "TEXT", false, 0, null, 1));
        map5.put("interestOnly", new TableInfo.Column("interestOnly", "TEXT", false, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("loans", map5, o.s(map5, "insuranceState", new TableInfo.Column("insuranceState", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "loans");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("loans(com.revolut.feature.credit.loan.impl.database.entity.LoanEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(15);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("durationMonths", new TableInfo.Column("durationMonths", "INTEGER", true, 0, null, 1));
        map6.put("repaymentDay", new TableInfo.Column("repaymentDay", "INTEGER", true, 0, null, 1));
        map6.put("outstandingBalance", new TableInfo.Column("outstandingBalance", "INTEGER", true, 0, null, 1));
        map6.put("accruedInterest", new TableInfo.Column("accruedInterest", "TEXT", true, 0, null, 1));
        map6.put("accruedFee", new TableInfo.Column("accruedFee", "TEXT", true, 0, null, 1));
        map6.put("oneTimeFee", new TableInfo.Column("oneTimeFee", "TEXT", true, 0, null, 1));
        map6.put("monthlyRepayment", new TableInfo.Column("monthlyRepayment", "INTEGER", true, 0, null, 1));
        map6.put("isInCooldownPeriod", new TableInfo.Column("isInCooldownPeriod", "INTEGER", true, 0, null, 1));
        map6.put("unavailableFeatures", new TableInfo.Column("unavailableFeatures", "TEXT", true, 0, null, 1));
        map6.put("borrowers", new TableInfo.Column("borrowers", "TEXT", true, 0, null, 1));
        map6.put("autoPayRepaymentSource", new TableInfo.Column("autoPayRepaymentSource", "TEXT", false, 0, null, 1));
        map6.put("backupCard", new TableInfo.Column("backupCard", "TEXT", false, 0, null, 1));
        map6.put("repaymentConfig", new TableInfo.Column("repaymentConfig", "TEXT", true, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("loan_details_shard", map6, o.s(map6, "agreementNumber", new TableInfo.Column("agreementNumber", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "loan_details_shard");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("loan_details_shard(com.revolut.feature.credit.loan.impl.database.entity.LoanDetailsShardEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(16);
        map7.put("loanId", new TableInfo.Column("loanId", "TEXT", true, 2, null, 1));
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map7.put("transactionId", new TableInfo.Column("transactionId", "TEXT", true, 0, null, 1));
        map7.put("repaymentDateTime", new TableInfo.Column("repaymentDateTime", "TEXT", true, 0, null, 1));
        map7.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map7.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map7.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map7.put("clientId", new TableInfo.Column("clientId", "TEXT", false, 0, null, 1));
        map7.put("firstName", new TableInfo.Column("firstName", "TEXT", false, 0, null, 1));
        map7.put("lastName", new TableInfo.Column("lastName", "TEXT", false, 0, null, 1));
        map7.put("principal", new TableInfo.Column("principal", "INTEGER", false, 0, null, 1));
        map7.put("accruedInterest", new TableInfo.Column("accruedInterest", "INTEGER", false, 0, null, 1));
        map7.put("lateRepaymentInterest", new TableInfo.Column("lateRepaymentInterest", "INTEGER", false, 0, null, 1));
        map7.put("transferType", new TableInfo.Column("transferType", "TEXT", false, 0, null, 1));
        map7.put("accountDetails", new TableInfo.Column("accountDetails", "TEXT", false, 0, null, 1));
        TableInfo tableInfo13 = new TableInfo("loan_repayments", map7, o.s(map7, "insuranceType", new TableInfo.Column("insuranceType", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "loan_repayments");
        return !tableInfo13.equals(tableInfo14) ? new RoomOpenDelegate.ValidationResult(false, o.o("loan_repayments(com.revolut.feature.credit.loan.impl.database.entity.LoanRepaymentEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
