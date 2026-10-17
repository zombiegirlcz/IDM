package lif;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qif.h f195501c;

    public o0() {
        super(53, 54);
        this.f195501c = new qif.h();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_crypto_deposits` (`crypto_deposit_leg_id` TEXT NOT NULL, `transaction_hash` TEXT, `below_minimum` INTEGER, `blockchain` TEXT, `deposit_state` TEXT, `source_address` TEXT, `display_rate` REAL, `display_currency` TEXT, PRIMARY KEY(`crypto_deposit_leg_id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_crypto_deposits` (`crypto_deposit_leg_id`,`transaction_hash`,`below_minimum`,`blockchain`,`deposit_state`,`source_address`,`display_rate`,`display_currency`) SELECT `crypto_deposit_leg_id`,`transaction_hash`,`below_minimum`,`blockchain`,`deposit_state`,`source_address`,`display_rate`,`display_currency` FROM `crypto_deposits`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `crypto_deposits`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_crypto_deposits` RENAME TO `crypto_deposits`");
        this.f195501c.onPostMigrate(sQLiteConnection);
    }
}
