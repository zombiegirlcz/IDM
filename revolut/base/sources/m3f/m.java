package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f202448c = new m();

    private m() {
        super(LDSFile.EF_DG15_TAG, 112);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        f202448c.getClass();
        db8.execSQL(kotlin.text.t.e("\n                CREATE TABLE etf_stats_TEMP (\n                    `ref` TEXT NOT NULL,\n                    `price` TEXT,\n                    `marketCapitalization` TEXT,\n                    `dividends` TEXT,\n                    `expenseRatios` TEXT,\n                    `managementFees` TEXT,\n                    `charges` TEXT,\n                    PRIMARY KEY(`ref`)\n                )\n            "));
        db8.execSQL(kotlin.text.t.e("\n                INSERT INTO etf_stats_TEMP (\n                    `ref`,\n                    `price`,\n                    `marketCapitalization`,\n                    `dividends`,\n                    `expenseRatios`,\n                    `managementFees`,\n                    `charges`\n                )\n                SELECT\n                    `instruments`.ref,\n                    `etf_stats`.`price`,\n                    `etf_stats`.`marketCapitalization`,\n                    `etf_stats`.`dividends`,\n                    `etf_stats`.`expenseRatios`,\n                    `etf_stats`.`managementFees`,\n                    `etf_stats`.`charges`\n                FROM `instruments`\n                INNER JOIN `etf_stats`\n                ON `instruments`.`symbol` = `etf_stats`.`symbol` AND `instruments`.`ref` != ''\n            "));
        db8.execSQL("DROP TABLE etf_stats");
        db8.execSQL("ALTER TABLE `etf_stats_TEMP` RENAME TO `etf_stats`");
        db8.execSQL(kotlin.text.t.e("\n                CREATE TABLE bond_stats_TEMP (\n                    `ref` TEXT NOT NULL,\n                    `price` TEXT NOT NULL,\n                    `primaryStats` TEXT NOT NULL,\n                    `yieldStats` TEXT NOT NULL,\n                    `riskStats` TEXT NOT NULL,\n                    PRIMARY KEY(`ref`)\n                )\n            "));
        db8.execSQL(kotlin.text.t.e("\n                INSERT INTO bond_stats_TEMP (\n                    `ref`,\n                    `price`,\n                    `primaryStats`,\n                    `yieldStats`,\n                    `riskStats`\n                )\n                SELECT\n                    `instruments`.ref,\n                    `bond_stats`.`price`,\n                    `bond_stats`.`primaryStats`,\n                    `bond_stats`.`yieldStats`,\n                    `bond_stats`.`riskStats`\n                FROM `instruments`\n                INNER JOIN `bond_stats`\n                ON `instruments`.`symbol` = `bond_stats`.`symbol` AND `instruments`.`ref` != ''\n            "));
        db8.execSQL("DROP TABLE bond_stats");
        db8.execSQL("ALTER TABLE `bond_stats_TEMP` RENAME TO `bond_stats`");
        db8.execSQL(kotlin.text.t.e("\n                CREATE TABLE instrument_stats_TEMP (\n                    `ref` TEXT NOT NULL,\n                    `price` TEXT NOT NULL,\n                    `volume` TEXT NOT NULL,\n                    `marketCap` TEXT NOT NULL,\n                    `perShare` TEXT NOT NULL,\n                    `dividend` TEXT NOT NULL,\n                    `valuation` TEXT NOT NULL,\n                    `profitability` TEXT NOT NULL,\n                    `managementEffectiveness` TEXT NOT NULL,\n                    PRIMARY KEY(`ref`)\n                )\n            "));
        db8.execSQL(kotlin.text.t.e("\n                INSERT INTO instrument_stats_TEMP (\n                    `ref`,\n                    `price`,\n                    `volume`,\n                    `marketCap`,\n                    `perShare`,\n                    `dividend`,\n                    `valuation`,\n                    `profitability`,\n                    `managementEffectiveness`\n                )\n                SELECT\n                    `instruments`.ref,\n                    `instrument_stats`.`price`,\n                    `instrument_stats`.`volume`,\n                    `instrument_stats`.`marketCap`,\n                    `instrument_stats`.`perShare`,\n                    `instrument_stats`.`dividend`,\n                    `instrument_stats`.`valuation`,\n                    `instrument_stats`.`profitability`,\n                    `instrument_stats`.`managementEffectiveness`\n                FROM `instruments`\n                INNER JOIN `instrument_stats`\n                ON `instruments`.`symbol` = `instrument_stats`.`symbol` AND `instruments`.`ref` != ''\n            "));
        db8.execSQL("DROP TABLE instrument_stats");
        db8.execSQL("ALTER TABLE `instrument_stats_TEMP` RENAME TO `instrument_stats`");
    }
}
