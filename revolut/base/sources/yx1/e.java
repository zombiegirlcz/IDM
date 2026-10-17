package yx1;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f317533c = new e();

    private e() {
        super(19, 20);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `pix_contacts` ", "CREATE TABLE IF NOT EXISTS `pix_contacts` (\n    `id` TEXT NOT NULL, \n    `idValue` TEXT NOT NULL, \n    `descriptor` TEXT NOT NULL, \n    `descriptorValue` TEXT NOT NULL, \n    `contactName` TEXT, \n    `alias` TEXT, \n    `photoUri` TEXT, \n    `state` TEXT NOT NULL, \n    `issuingEntityName` TEXT,\n    `identificationType` TEXT,\n    `identificationValue` TEXT,\n    PRIMARY KEY(`descriptor`, `descriptorValue`)\n)", "CREATE INDEX IF NOT EXISTS `index_pix_contacts_descriptorValue` ON `pix_contacts` (`descriptorValue`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_pix_contacts_idValue` ON `pix_contacts` (`idValue`)");
    }
}
