package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class va extends Migration {
    public va() {
        super(48, 49);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `beneficiaries` (`id` TEXT NOT NULL, `ownerId` TEXT, `name` TEXT, `firstName` TEXT, `lastName` TEXT, `companyName` TEXT, `type` TEXT, `bankCountry` TEXT, `paymentType` TEXT, `extraFields` TEXT, `accountFields` TEXT, `externalRef` TEXT, `externalAccount` INTEGER, `state` TEXT, `address` TEXT, `email` TEXT, `phone` TEXT, `deprecated` INTEGER NOT NULL, `country` TEXT, `currency` TEXT, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
