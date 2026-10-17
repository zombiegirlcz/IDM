package qs6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f248751c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "db", "DROP TABLE vat_reminder", "CREATE TABLE IF NOT EXISTS `vat_reminder` (`id` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `assessment_period` TEXT NOT NULL, `closing_month` INTEGER, PRIMARY KEY(`id`))", "DROP TABLE `vat_summary`");
        y.y(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `vat_summary` (`vat_reminder_id` TEXT NOT NULL, `assessment_period` TEXT NOT NULL, `next_vat_return_due_date` TEXT NOT NULL, `summary_total_sales_amount` INTEGER NOT NULL, `summary_total_sales_currency` TEXT NOT NULL, `summary_tax_rate_type` TEXT, `summary_tax_rate_value` REAL, `summary_total_tax_amount` INTEGER NOT NULL, `summary_total_tax_currency` TEXT NOT NULL, PRIMARY KEY(`vat_reminder_id`))");
    }
}
