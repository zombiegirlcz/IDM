package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f230200c = new j();

    private j() {
        super(19, 20);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM `complex_analytics_performance_chart`", "ALTER TABLE `complex_analytics_performance_chart` ADD COLUMN `last_modified` INTEGER NOT NULL DEFAULT 0");
    }
}
