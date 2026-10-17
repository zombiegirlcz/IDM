package ei9;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.pay_later.impl.database.PayLaterDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;
import r6.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayLaterDatabase_Impl f126462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PayLaterDatabase_Impl payLaterDatabase_Impl) {
        super(26, "2b734f8cef21779bc704489054a5324c", "8e6a8c3c7a74186e963c0e15cc6976f0");
        this.f126462a = payLaterDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plans` (`id` TEXT NOT NULL, `facilityId` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `merchantName` TEXT NOT NULL, `merchantLogoUrl` TEXT, `merchantLogoName` TEXT, `merchantCategory` TEXT, `startDateTime` INTEGER NOT NULL, `updateDateTime` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `paidAmount` INTEGER NOT NULL, `remainingAmount` INTEGER NOT NULL, `revPoints` INTEGER, `fee` INTEGER NOT NULL, `currency` TEXT NOT NULL, `state` TEXT NOT NULL, `isLimitWithdrawn` INTEGER NOT NULL, `feeType` TEXT NOT NULL, `origin` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `instalmentType` TEXT NOT NULL, `termFeeRate` TEXT NOT NULL, `minFeeAmount` INTEGER NOT NULL, `cancellationOrigin` TEXT, `rescheduleCount` INTEGER, `withdrawalTransactionId` TEXT, `feeDetails` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `repayments` (`planId` TEXT NOT NULL, `index` INTEGER NOT NULL, `dueDate` INTEGER NOT NULL, `state` TEXT NOT NULL, `currency` TEXT NOT NULL, `paidDateTime` INTEGER, `transactionIds` TEXT NOT NULL, `amount` INTEGER NOT NULL, `repaidAmount` INTEGER NOT NULL, `fee` INTEGER NOT NULL, `repaidFee` INTEGER NOT NULL, `lateInterest` INTEGER NOT NULL, `repaidLateInterest` INTEGER NOT NULL, `isOverLimit` INTEGER NOT NULL, PRIMARY KEY(`index`, `planId`), FOREIGN KEY(`planId`) REFERENCES `plans`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_repayments_planId_state` ON `repayments` (`planId`, `state`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plan_updates` (`id` TEXT NOT NULL, `updateDateTime` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plan_preferences` (`planId` TEXT NOT NULL, `seenRescheduleVersion` INTEGER, PRIMARY KEY(`planId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `repayment_parts` (`transactionId` TEXT NOT NULL, `planId` TEXT NOT NULL, `instalmentIndex` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `fee` INTEGER NOT NULL, `lateInterest` INTEGER NOT NULL, PRIMARY KEY(`transactionId`, `planId`, `instalmentIndex`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `plan_details` (`id` TEXT NOT NULL, `cancellable` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2b734f8cef21779bc704489054a5324c')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `plans`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `repayments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `plan_updates`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `plan_preferences`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `repayment_parts`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `plan_details`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = PayLaterDatabase_Impl.f78848j;
        this.f126462a.internalInitInvalidationTracker(sQLiteConnection);
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
        HashMap map = new HashMap(27);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("facilityId", new TableInfo.Column("facilityId", "TEXT", true, 0, null, 1));
        map.put("transactionId", new TableInfo.Column("transactionId", "TEXT", true, 0, null, 1));
        map.put("merchantName", new TableInfo.Column("merchantName", "TEXT", true, 0, null, 1));
        map.put("merchantLogoUrl", new TableInfo.Column("merchantLogoUrl", "TEXT", false, 0, null, 1));
        map.put("merchantLogoName", new TableInfo.Column("merchantLogoName", "TEXT", false, 0, null, 1));
        map.put("merchantCategory", new TableInfo.Column("merchantCategory", "TEXT", false, 0, null, 1));
        map.put("startDateTime", new TableInfo.Column("startDateTime", "INTEGER", true, 0, null, 1));
        map.put("updateDateTime", new TableInfo.Column("updateDateTime", "INTEGER", true, 0, null, 1));
        map.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map.put("paidAmount", new TableInfo.Column("paidAmount", "INTEGER", true, 0, null, 1));
        map.put("remainingAmount", new TableInfo.Column("remainingAmount", "INTEGER", true, 0, null, 1));
        map.put("revPoints", new TableInfo.Column("revPoints", "INTEGER", false, 0, null, 1));
        map.put("fee", new TableInfo.Column("fee", "INTEGER", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("isLimitWithdrawn", new TableInfo.Column("isLimitWithdrawn", "INTEGER", true, 0, null, 1));
        map.put("feeType", new TableInfo.Column("feeType", "TEXT", true, 0, null, 1));
        map.put("origin", new TableInfo.Column("origin", "TEXT", true, 0, null, 1));
        map.put("countryCode", new TableInfo.Column("countryCode", "TEXT", true, 0, null, 1));
        map.put("instalmentType", new TableInfo.Column("instalmentType", "TEXT", true, 0, null, 1));
        map.put("termFeeRate", new TableInfo.Column("termFeeRate", "TEXT", true, 0, null, 1));
        map.put("minFeeAmount", new TableInfo.Column("minFeeAmount", "INTEGER", true, 0, null, 1));
        map.put("cancellationOrigin", new TableInfo.Column("cancellationOrigin", "TEXT", false, 0, null, 1));
        map.put("rescheduleCount", new TableInfo.Column("rescheduleCount", "INTEGER", false, 0, null, 1));
        map.put("withdrawalTransactionId", new TableInfo.Column("withdrawalTransactionId", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("plans", map, o.s(map, "feeDetails", new TableInfo.Column("feeDetails", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "plans");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("plans(com.revolut.feature.pay_later.impl.database.entities.PlanEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(14);
        map2.put("planId", new TableInfo.Column("planId", "TEXT", true, 2, null, 1));
        map2.put("index", new TableInfo.Column("index", "INTEGER", true, 1, null, 1));
        map2.put("dueDate", new TableInfo.Column("dueDate", "INTEGER", true, 0, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map2.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map2.put("paidDateTime", new TableInfo.Column("paidDateTime", "INTEGER", false, 0, null, 1));
        map2.put("transactionIds", new TableInfo.Column("transactionIds", "TEXT", true, 0, null, 1));
        map2.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map2.put("repaidAmount", new TableInfo.Column("repaidAmount", "INTEGER", true, 0, null, 1));
        map2.put("fee", new TableInfo.Column("fee", "INTEGER", true, 0, null, 1));
        map2.put("repaidFee", new TableInfo.Column("repaidFee", "INTEGER", true, 0, null, 1));
        map2.put("lateInterest", new TableInfo.Column("lateInterest", "INTEGER", true, 0, null, 1));
        map2.put("repaidLateInterest", new TableInfo.Column("repaidLateInterest", "INTEGER", true, 0, null, 1));
        HashSet hashSetS = o.s(map2, "isOverLimit", new TableInfo.Column("isOverLimit", "INTEGER", true, 0, null, 1), 1);
        HashSet hashSetL = b.l(hashSetS, new TableInfo.ForeignKey("plans", "CASCADE", "NO ACTION", Arrays.asList("planId"), Arrays.asList("id")), 1);
        hashSetL.add(new TableInfo.Index("index_repayments_planId_state", false, Arrays.asList("planId", "state"), Arrays.asList("ASC", "ASC")));
        TableInfo tableInfo3 = new TableInfo("repayments", map2, hashSetS, hashSetL);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "repayments");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("repayments(com.revolut.feature.pay_later.impl.database.entities.InstalmentEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(2);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        TableInfo tableInfo5 = new TableInfo("plan_updates", map3, o.s(map3, "updateDateTime", new TableInfo.Column("updateDateTime", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "plan_updates");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("plan_updates(com.revolut.feature.pay_later.impl.database.entities.PlanUpdateEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(2);
        map4.put("planId", new TableInfo.Column("planId", "TEXT", true, 1, null, 1));
        TableInfo tableInfo7 = new TableInfo("plan_preferences", map4, o.s(map4, "seenRescheduleVersion", new TableInfo.Column("seenRescheduleVersion", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "plan_preferences");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("plan_preferences(com.revolut.feature.pay_later.impl.database.entities.PlanPreferencesEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(6);
        map5.put("transactionId", new TableInfo.Column("transactionId", "TEXT", true, 1, null, 1));
        map5.put("planId", new TableInfo.Column("planId", "TEXT", true, 2, null, 1));
        map5.put("instalmentIndex", new TableInfo.Column("instalmentIndex", "INTEGER", true, 3, null, 1));
        map5.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map5.put("fee", new TableInfo.Column("fee", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("repayment_parts", map5, o.s(map5, "lateInterest", new TableInfo.Column("lateInterest", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "repayment_parts");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("repayment_parts(com.revolut.feature.pay_later.impl.database.entities.RepaymentEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(2);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        TableInfo tableInfo11 = new TableInfo("plan_details", map6, o.s(map6, "cancellable", new TableInfo.Column("cancellable", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "plan_details");
        return !tableInfo11.equals(tableInfo12) ? new RoomOpenDelegate.ValidationResult(false, o.o("plan_details(com.revolut.feature.pay_later.impl.database.entities.PlanDetailsEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
