package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f174389c = new a();

    private a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        f174389c.getClass();
        database.execSQL("CREATE TABLE plans_backup (`id` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `facilityId` TEXT NOT NULL, `merchantName` TEXT NOT NULL, `merchantLogoUrl` TEXT, `merchantLogoName` TEXT, `startDateTime` INTEGER NOT NULL, `updateDateTime` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `fee` INTEGER NOT NULL, `lateInterest` INTEGER NOT NULL, `currency` TEXT NOT NULL, `state` TEXT NOT NULL, `amountChanged` INTEGER NOT NULL, `cancellationOrigin` TEXT, PRIMARY KEY(`id`))");
        database.execSQL("INSERT INTO plans_backup SELECT id, transactionId, facilityId, merchantName, merchantLogoUrl, merchantLogoName, startDateTime, updateDateTime, amount, fee, lateInterest, currency, state, amountChanged, cancellationOrigin FROM plans");
        database.execSQL("DROP TABLE plans");
        prk.o.D(database, "CREATE TABLE plans (`id` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `facilityId` TEXT NOT NULL, `merchantName` TEXT NOT NULL, `merchantLogoUrl` TEXT, `merchantLogoName` TEXT, `startDateTime` INTEGER NOT NULL, `updateDateTime` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `fee` INTEGER NOT NULL, `lateInterest` INTEGER NOT NULL, `currency` TEXT NOT NULL, `state` TEXT NOT NULL, `rescheduleVersion` INTEGER, `withdrawalTransactionId` TEXT, `cancellationOrigin` TEXT, PRIMARY KEY(`id`))", "INSERT INTO plans SELECT id, transactionId, facilityId, merchantName, merchantLogoUrl, merchantLogoName, startDateTime, updateDateTime, amount, fee, lateInterest, currency, state, NULL, NULL, cancellationOrigin FROM plans_backup", "DROP TABLE plans_backup", "DROP TABLE plan_preferences");
        database.execSQL("CREATE TABLE plan_preferences (`planId` TEXT NOT NULL, `seenRescheduleVersion` INTEGER, PRIMARY KEY(`planId`))");
        database.execSQL("INSERT INTO plan_preferences SELECT id, NULL FROM plans");
    }
}
