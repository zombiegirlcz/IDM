package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f230185c = new b0();

    private b0() {
        super(35, 36);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `complex_analytics_contributors` ADD COLUMN `openingPrice` TEXT DEFAULT null", "ALTER TABLE `complex_analytics_contributors` ADD COLUMN `positionId` TEXT DEFAULT null", "ALTER TABLE `complex_analytics_contributors` ADD COLUMN `quantity` TEXT DEFAULT null");
    }
}
