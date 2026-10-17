package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f142538c = new j();

    private j() {
        super(19, 20);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `ipo_instrument_details` ADD COLUMN `bookBuildingAvailable` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `ipo_instrument_summary` ADD COLUMN `acknowledgementWorkflowId` TEXT");
    }
}
