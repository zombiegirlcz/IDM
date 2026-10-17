package o91;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f223054c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `pae_direct_debits_table`", "CREATE TABLE IF NOT EXISTS `pae_direct_debits_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `sentDate` TEXT, PRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `pae_scheduled_payments_table`");
        o.C(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `pae_scheduled_payments_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `frequency` TEXT NOT NULL, `state` TEXT NOT NULL, `sentDate` TEXT, PRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `pae_incoming_payments_table`", "CREATE TABLE IF NOT EXISTS `pae_incoming_payments_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `date` TEXT NOT NULL, `logoUrl` TEXT, `type` TEXT NOT NULL, `state` TEXT NOT NULL, `sentDate` TEXT, PRIMARY KEY(`id`))");
    }
}
