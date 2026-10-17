package crk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f108401c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        f108401c.getClass();
        db8.execSQL("DROP TABLE IF EXISTS `stock_financials`");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `stock_financials` (\n    `ref` TEXT NOT NULL,\n    `year` INTEGER NOT NULL,\n    `interimPeriod` INTEGER,\n    `revenue_amount` INTEGER,\n    `revenue_currency` TEXT,\n    `netIncome_amount` INTEGER,\n    `netIncome_currency` TEXT,\n    `margin` REAL,\n    `assets_amount` INTEGER,\n    `assets_currency` TEXT,\n    `liabilities_amount` INTEGER,\n    `liabilities_currency` TEXT,\n    `debtToAssets` REAL,\n    `operating_amount` INTEGER,\n    `operating_currency` TEXT,\n    `investing_amount` INTEGER,\n    `investing_currency` TEXT,\n    `financing_amount` INTEGER,\n    `financing_currency` TEXT,\n    `freeCashFlow_amount` INTEGER,\n    `freeCashFlow_currency` TEXT,\n    `identifier` TEXT NOT NULL,\n    PRIMARY KEY(`ref`, `identifier`)\n)");
        db8.execSQL("DROP TABLE IF EXISTS `stock_financials_statements`");
        db8.execSQL("CREATE TABLE IF NOT EXISTS `stock_financials_statements` (\n    `ref` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `year` INTEGER NOT NULL,\n    `quarter` INTEGER,\n    `statementItems` TEXT NOT NULL,\n    `quarterId` TEXT NOT NULL,\n    PRIMARY KEY(`ref`, `type`, `year`, `quarterId`)\n)");
    }
}
