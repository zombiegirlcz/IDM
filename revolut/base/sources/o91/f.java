package o91;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f223058c = new f();

    private f() {
        super(6, 7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "ALTER TABLE `pae_scheduled_payments_table` ADD COLUMN `iban` TEXT", "ALTER TABLE `pae_scheduled_payments_table` ADD COLUMN `reference` TEXT NOT NULL DEFAULT ''", "CREATE TABLE IF NOT EXISTS `pae_scheduled_payment_overridden_data_table` (\n    `id` TEXT NOT NULL,\n    `reference` TEXT,\n    `frequency` TEXT,\n    `startDate` TEXT,\n    `beneficiaryId` TEXT,\n    PRIMARY KEY(`id`),\n    FOREIGN KEY(`id`) REFERENCES `pae_scheduled_payments_table`(`id`) ON DELETE CASCADE\n)");
    }
}
