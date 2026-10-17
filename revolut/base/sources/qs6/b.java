package qs6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f248752c = new b();

    private b() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "db", "DROP TABLE tax_hub_calendar_event", "CREATE TABLE IF NOT EXISTS `tax_hub_calendar_event` (`id` TEXT NOT NULL, `tax_type` TEXT NOT NULL, `state` TEXT NOT NULL, `period` TEXT NOT NULL, `accounting_start_date` TEXT, `accounting_end_date` TEXT, `completed_date` TEXT, `filing_start_date` TEXT NOT NULL, `filing_end_date` TEXT NOT NULL, `steps` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
