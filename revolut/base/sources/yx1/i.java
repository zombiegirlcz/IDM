package yx1;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f317536c = new i();

    private i() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "ALTER TABLE bizum_contacts RENAME TO bizum_contacts_old;", "CREATE TABLE bizum_contacts (\n    idValue TEXT NOT NULL,\n    id TEXT NOT NULL,\n    descriptor TEXT NOT NULL,\n    descriptorValue TEXT NOT NULL,\n    contactName TEXT,\n    alias TEXT,\n    photoUri TEXT,\n    state TEXT NOT NULL,\n    PRIMARY KEY(idValue)\n);", "INSERT INTO bizum_contacts (idValue, id, descriptor, descriptorValue, contactName, alias, photoUri, state)\nSELECT\n    idValue,\n    id,\n    CASE\n        WHEN phone IS NOT NULL THEN 'PHONE'\n        WHEN email IS NOT NULL THEN 'EMAIL'\n    END AS descriptor,\n    CASE\n        WHEN phone IS NOT NULL THEN phone\n        WHEN email IS NOT NULL THEN email\n    END AS descriptorValue,\n    contactName, \n    alias, \n    photoUri, \n    state\nFROM bizum_contacts_old;");
        o.D(supportSQLiteDatabase, "DROP TABLE bizum_contacts_old;", "DROP TABLE IF EXISTS `blik_contacts_temp` ", "CREATE TABLE IF NOT EXISTS `blik_contacts_temp` (\n    `idValue` TEXT NOT NULL,\n    `id` TEXT NOT NULL,\n    `descriptor` TEXT NOT NULL,\n    `descriptorValue` TEXT NOT NULL,\n    `contactName` TEXT,\n    `alias` TEXT,\n    `photoUri` TEXT,\n    `state` TEXT NOT NULL,\n    PRIMARY KEY(idValue)\n);", "DROP TABLE IF EXISTS `multibanco_contacts` ");
        o.C(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `multibanco_contacts` (\n    `idValue` TEXT NOT NULL,\n    `id` TEXT NOT NULL,\n    `descriptor` TEXT NOT NULL,\n    `descriptorValue` TEXT NOT NULL,\n    `contactName` TEXT,\n    `alias` TEXT,\n    `photoUri` TEXT,\n    `state` TEXT NOT NULL,\n    PRIMARY KEY(idValue)\n);", "DROP TABLE IF EXISTS `wero_contacts` ", "CREATE TABLE IF NOT EXISTS `wero_contacts` (\n    `idValue` TEXT NOT NULL,\n    `id` TEXT NOT NULL,\n    `descriptor` TEXT NOT NULL,\n    `descriptorValue` TEXT NOT NULL,\n    `contactName` TEXT,\n    `alias` TEXT,\n    `photoUri` TEXT,\n    `state` TEXT NOT NULL,\n    PRIMARY KEY(idValue)\n);");
    }
}
