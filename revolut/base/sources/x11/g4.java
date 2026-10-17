package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class g4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g4 f301855c = new g4();

    private g4() {
        super(Constants.TAG_PCI_PED_CHECKSUM, Constants.TAG_EMV_L1_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `contact_copy` (\n    `id` INTEGER NOT NULL,\n    `point` TEXT NOT NULL,\n    `displayedName` TEXT NOT NULL,\n    `firstName` TEXT NOT NULL,\n    `lastName` TEXT NOT NULL,\n    `registeredAs` TEXT NOT NULL,\n    `username` TEXT, `code` TEXT,\n    `isRevolut` INTEGER NOT NULL,\n    `isNewlyJoined` INTEGER NOT NULL,\n    `settings` TEXT NOT NULL,\n    `transactionsCount` INTEGER NOT NULL,\n    `timestamp` INTEGER NOT NULL,\n    `pictureUri` TEXT,\n    `type` TEXT NOT NULL,\n    `country` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)", "INSERT INTO \n    `contact_copy` (\n        id,\n        point,\n        displayedName,\n        firstName,\n        lastName,\n        registeredAs,\n        username,\n        isRevolut,\n        isNewlyJoined,\n        settings,\n        transactionsCount,\n        timestamp,\n        pictureUri,\n        type,\n        country\n    ) \nSELECT\n    id,\n    point,\n    displayedName,\n    firstName,\n    lastName,\n    registeredAs,\n    username,\n    isRevolut,\n    isNewlyJoined,\n    settings,\n    transactionsCount,\n    timestamp,\n    pictureUri,\n    type,\n    country\nFROM `contact`", "DROP TABLE IF EXISTS contact");
        supportSQLiteDatabase.execSQL("ALTER TABLE contact_copy RENAME TO contact");
    }
}
