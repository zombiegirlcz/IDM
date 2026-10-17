package t11;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import x11.y9;

/* JADX INFO: loaded from: classes20.dex */
public final class w1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y9 f267075c;

    public w1() {
        super(384, 385);
        this.f267075c = new y9();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_beneficiaries` (`id` TEXT NOT NULL, `rootId` TEXT, `ownerId` TEXT, `name` TEXT, `firstName` TEXT, `lastName` TEXT, `companyName` TEXT, `type` TEXT, `bankCountry` TEXT, `bankLogo` TEXT, `paymentType` TEXT, `extraFields` TEXT, `settings` TEXT NOT NULL, `accountFields` TEXT, `externalRef` TEXT, `externalAccount` INTEGER, `state` TEXT, `address` TEXT, `email` TEXT, `phone` TEXT, `deprecated` INTEGER NOT NULL, `country` TEXT, `currency` TEXT, `transactionsCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `label` TEXT, `identification` TEXT, `createdDate` INTEGER, `counterpartyDetailsGroup` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_beneficiaries` (`id`,`rootId`,`ownerId`,`name`,`firstName`,`lastName`,`companyName`,`type`,`bankCountry`,`bankLogo`,`paymentType`,`extraFields`,`settings`,`accountFields`,`externalRef`,`externalAccount`,`state`,`address`,`email`,`phone`,`deprecated`,`country`,`currency`,`transactionsCount`,`timestamp`,`label`,`identification`,`createdDate`,`counterpartyDetailsGroup`) SELECT `id`,`rootId`,`ownerId`,`name`,`firstName`,`lastName`,`companyName`,`type`,`bankCountry`,`bankLogo`,`paymentType`,`extraFields`,`settings`,`accountFields`,`externalRef`,`externalAccount`,`state`,`address`,`email`,`phone`,`deprecated`,`country`,`currency`,`transactionsCount`,`timestamp`,`label`,`identification`,`createdDate`,`counterpartyDetailsGroup` FROM `beneficiaries`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `beneficiaries`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_beneficiaries` RENAME TO `beneficiaries`");
        this.f267075c.onPostMigrate(sQLiteConnection);
    }
}
