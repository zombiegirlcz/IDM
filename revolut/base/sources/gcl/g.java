package gcl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f142535c = new g();

    private g() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `ipo_instrument_details` (\n    `ref` TEXT NOT NULL,\n    `launchDate` INTEGER NOT NULL,\n    `cancellationDeadline` INTEGER,\n    `disclaimerWorkflowId` TEXT,\n    `acknowledgementWorkflowId` TEXT,\n    `priceRangeLow` TEXT NOT NULL,\n    `priceRangeHigh` TEXT NOT NULL,\n    `documents` TEXT NOT NULL,\n    `details` TEXT NOT NULL,\n    `sections` TEXT NOT NULL,\n    `finalPriceDate` INTEGER,\n    `barChartDetails` TEXT,\n    `lineChartDetails` TEXT,\n    PRIMARY KEY(`ref`)\n)", "CREATE TABLE IF NOT EXISTS `ipo_instrument_summary` (\n    `ref` TEXT NOT NULL,\n    `launchDate` INTEGER NOT NULL,\n    `cancellationDeadline` INTEGER,\n    `disclaimerWorkflowId` TEXT,\n    `priceRangeLow` TEXT NOT NULL,\n    `priceRangeHigh` TEXT NOT NULL,\n    `finalPriceDate` INTEGER,\n    PRIMARY KEY(`ref`)\n)");
    }
}
