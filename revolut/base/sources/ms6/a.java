package ms6;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Migration {
    public a() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `tax_hub_calendar_event` (`id` TEXT NOT NULL, `tax_type` TEXT NOT NULL, `state` TEXT NOT NULL, `tax_profile_state` TEXT NOT NULL, `accounting_start_date` TEXT, `accounting_end_date` TEXT, `completed_date` TEXT, `filing_start_date` TEXT NOT NULL, `filing_end_date` TEXT NOT NULL, `steps` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `tax_hub_tax_profile` (`id` TEXT NOT NULL, `tax_type` TEXT NOT NULL, `notifications_enabled` INTEGER NOT NULL, `state` TEXT NOT NULL, `scheduling_options_period` TEXT NOT NULL, `scheduling_options_next_payment_date` TEXT, `scheduling_options_closing_month` TEXT, PRIMARY KEY(`id`))");
    }
}
