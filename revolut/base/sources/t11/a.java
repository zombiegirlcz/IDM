package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.k8;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k8 f267060c;

    public a() {
        super(300, 301);
        this.f267060c = new k8();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_beneficiaries` (`id` TEXT NOT NULL, `ownerId` TEXT, `name` TEXT, `firstName` TEXT, `lastName` TEXT, `companyName` TEXT, `type` TEXT, `bankCountry` TEXT, `bankLogo` TEXT, `paymentType` TEXT, `extraFields` TEXT, `settings` TEXT NOT NULL, `accountFields` TEXT, `externalRef` TEXT, `externalAccount` INTEGER, `state` TEXT, `address` TEXT, `email` TEXT, `phone` TEXT, `deprecated` INTEGER NOT NULL, `country` TEXT, `currency` TEXT, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `label` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_beneficiaries` (`id`,`ownerId`,`name`,`firstName`,`lastName`,`companyName`,`type`,`bankCountry`,`bankLogo`,`paymentType`,`extraFields`,`settings`,`accountFields`,`externalRef`,`externalAccount`,`state`,`address`,`email`,`phone`,`deprecated`,`country`,`currency`,`transactionsCount`,`timestamp`,`label`) SELECT `id`,`ownerId`,`name`,`firstName`,`lastName`,`companyName`,`type`,`bankCountry`,`bankLogo`,`paymentType`,`extraFields`,`settings`,`accountFields`,`externalRef`,`externalAccount`,`state`,`address`,`email`,`phone`,`deprecated`,`country`,`currency`,`transactionsCount`,`timestamp`,`label` FROM `beneficiaries`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `beneficiaries`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_beneficiaries` RENAME TO `beneficiaries`");
        this.f267060c.onPostMigrate(sQLiteConnection);
    }
}
