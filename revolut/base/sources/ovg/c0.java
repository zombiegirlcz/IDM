package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f230187c = new c0();

    private c0() {
        super(36, 37);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `complex_analytics_realised_pnl` ADD COLUMN `openingPrice` TEXT DEFAULT null", "ALTER TABLE `complex_analytics_realised_pnl` ADD COLUMN `quantity` TEXT DEFAULT null");
    }
}
