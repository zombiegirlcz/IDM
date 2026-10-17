package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n2 f301940c = new n2();

    private n2() {
        super(177, 178);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `instrument_tickers` ADD COLUMN `lastClose` INTEGER", "ALTER TABLE `instrument_tickers` ADD COLUMN `tradingSession` TEXT NOT NULL DEFAULT ''", "DELETE FROM `instrument_tickers`");
    }
}
