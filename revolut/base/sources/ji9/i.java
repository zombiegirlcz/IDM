package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f174397c = new i();

    private i() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        f174397c.getClass();
        database.execSQL("CREATE TABLE `repayments_backup`(\n                `planId` TEXT NOT NULL,\n                `index` INTEGER NOT NULL,\n                `dueDate` INTEGER NOT NULL,\n                `state` TEXT NOT NULL,\n                `currency` TEXT NOT NULL,\n                `paidDateTime` INTEGER,\n                `transactionIds` TEXT NOT NULL,\n                `amount` INTEGER NOT NULL,\n                `repaidAmount` INTEGER NOT NULL,\n                `fee` INTEGER NOT NULL,\n                `repaidFee` INTEGER NOT NULL,\n                `lateInterest` INTEGER NOT NULL,\n                `repaidLateInterest` INTEGER NOT NULL,\n                PRIMARY KEY(`index`,`planId`))");
        database.execSQL("INSERT INTO `repayments_backup` SELECT \n            `planId`,\n            `index`, \n            `dueDate`, \n            `state`,\n            `currency`, \n            `paidDateTime`, \n            `transactionIds`, \n            `amount`,\n            `repaidAmount`,\n            `fee`,\n            `repaidFee`,\n            `lateInterest`,\n            `repaidLateInterest` FROM `repayments`");
        database.execSQL("DROP TABLE `repayments`");
        prk.o.D(database, "CREATE TABLE `repayments` (\n                `planId` TEXT NOT NULL,\n                `index` INTEGER NOT NULL,\n                `dueDate` INTEGER NOT NULL,\n                `state` TEXT NOT NULL,\n                `currency` TEXT NOT NULL,\n                `paidDateTime` INTEGER,\n                `transactionIds` TEXT NOT NULL,\n                `amount` INTEGER NOT NULL,\n                `repaidAmount` INTEGER NOT NULL,\n                `fee` INTEGER NOT NULL,\n                `repaidFee` INTEGER NOT NULL,\n                `lateInterest` INTEGER NOT NULL,\n                `repaidLateInterest` INTEGER NOT NULL,\n                PRIMARY KEY(`index`,`planId`),\n                FOREIGN KEY(`planId`) REFERENCES `plans`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_repayments_state` ON `repayments` (`state`)", "INSERT INTO `repayments` SELECT \n            `planId`,\n            `index`, \n            `dueDate`, \n            `state`,\n            `currency`, \n            `paidDateTime`, \n            `transactionIds`, \n            `amount`,\n            `repaidAmount`,\n            `fee`,\n            `repaidFee`,\n            `lateInterest`,\n            `repaidLateInterest` FROM `repayments_backup`", "DROP TABLE `repayments_backup`");
    }
}
