package ms6;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FreelancerTaxPocketsDatabase_Impl f208631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FreelancerTaxPocketsDatabase_Impl freelancerTaxPocketsDatabase_Impl) {
        super(4, "1ccee68d227a7a3ff3a9be11a13431c3", "65a443d2297c80e8d8903963cc278ceb");
        this.f208631a = freelancerTaxPocketsDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `tax_hub_calendar_event` (`id` TEXT NOT NULL, `tax_type` TEXT NOT NULL, `state` TEXT NOT NULL, `period` TEXT NOT NULL, `accounting_start_date` TEXT, `accounting_end_date` TEXT, `completed_date` TEXT, `filing_start_date` TEXT NOT NULL, `filing_end_date` TEXT NOT NULL, `steps` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `tax_hub_tax_profile` (`id` TEXT NOT NULL, `tax_type` TEXT NOT NULL, `notifications_enabled` INTEGER NOT NULL, `state` TEXT NOT NULL, `scheduling_options_period` TEXT NOT NULL, `scheduling_options_next_payment_date` TEXT, `scheduling_options_closing_month` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `vat_reminder` (`id` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `assessment_period` TEXT NOT NULL, `closing_month` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `vat_summary` (`vat_reminder_id` TEXT NOT NULL, `assessment_period` TEXT NOT NULL, `next_vat_return_due_date` TEXT NOT NULL, `summary_total_sales_amount` INTEGER NOT NULL, `summary_total_sales_currency` TEXT NOT NULL, `summary_tax_rate_type` TEXT, `summary_tax_rate_value` REAL, `summary_total_tax_amount` INTEGER NOT NULL, `summary_total_tax_currency` TEXT NOT NULL, PRIMARY KEY(`vat_reminder_id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1ccee68d227a7a3ff3a9be11a13431c3')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `tax_hub_calendar_event`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `tax_hub_tax_profile`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `vat_reminder`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `vat_summary`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = FreelancerTaxPocketsDatabase_Impl.f73515m;
        this.f208631a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(10);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("tax_type", new TableInfo.Column("tax_type", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("period", new TableInfo.Column("period", "TEXT", true, 0, null, 1));
        map.put("accounting_start_date", new TableInfo.Column("accounting_start_date", "TEXT", false, 0, null, 1));
        map.put("accounting_end_date", new TableInfo.Column("accounting_end_date", "TEXT", false, 0, null, 1));
        map.put("completed_date", new TableInfo.Column("completed_date", "TEXT", false, 0, null, 1));
        map.put("filing_start_date", new TableInfo.Column("filing_start_date", "TEXT", true, 0, null, 1));
        map.put("filing_end_date", new TableInfo.Column("filing_end_date", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("tax_hub_calendar_event", map, o.s(map, "steps", new TableInfo.Column("steps", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "tax_hub_calendar_event");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("tax_hub_calendar_event(com.revolut.feature.freelancer.impl.database.tax_pockets.entity.TaxHubCalendarEventEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(7);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("tax_type", new TableInfo.Column("tax_type", "TEXT", true, 0, null, 1));
        map2.put("notifications_enabled", new TableInfo.Column("notifications_enabled", "INTEGER", true, 0, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map2.put("scheduling_options_period", new TableInfo.Column("scheduling_options_period", "TEXT", true, 0, null, 1));
        map2.put("scheduling_options_next_payment_date", new TableInfo.Column("scheduling_options_next_payment_date", "TEXT", false, 0, null, 1));
        TableInfo tableInfo3 = new TableInfo("tax_hub_tax_profile", map2, o.s(map2, "scheduling_options_closing_month", new TableInfo.Column("scheduling_options_closing_month", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "tax_hub_tax_profile");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("tax_hub_tax_profile(com.revolut.feature.freelancer.impl.database.tax_pockets.entity.TaxHubProfileEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(4);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("enabled", new TableInfo.Column("enabled", "INTEGER", true, 0, null, 1));
        map3.put("assessment_period", new TableInfo.Column("assessment_period", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("vat_reminder", map3, o.s(map3, "closing_month", new TableInfo.Column("closing_month", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "vat_reminder");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("vat_reminder(com.revolut.feature.freelancer.impl.database.tax_pockets.entity.VatReminderEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(9);
        map4.put("vat_reminder_id", new TableInfo.Column("vat_reminder_id", "TEXT", true, 1, null, 1));
        map4.put("assessment_period", new TableInfo.Column("assessment_period", "TEXT", true, 0, null, 1));
        map4.put("next_vat_return_due_date", new TableInfo.Column("next_vat_return_due_date", "TEXT", true, 0, null, 1));
        map4.put("summary_total_sales_amount", new TableInfo.Column("summary_total_sales_amount", "INTEGER", true, 0, null, 1));
        map4.put("summary_total_sales_currency", new TableInfo.Column("summary_total_sales_currency", "TEXT", true, 0, null, 1));
        map4.put("summary_tax_rate_type", new TableInfo.Column("summary_tax_rate_type", "TEXT", false, 0, null, 1));
        map4.put("summary_tax_rate_value", new TableInfo.Column("summary_tax_rate_value", "REAL", false, 0, null, 1));
        map4.put("summary_total_tax_amount", new TableInfo.Column("summary_total_tax_amount", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("vat_summary", map4, o.s(map4, "summary_total_tax_currency", new TableInfo.Column("summary_total_tax_currency", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "vat_summary");
        return !tableInfo7.equals(tableInfo8) ? new RoomOpenDelegate.ValidationResult(false, o.o("vat_summary(com.revolut.feature.freelancer.impl.database.tax_pockets.entity.VatSummaryEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
