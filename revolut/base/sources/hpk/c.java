package hpk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {
    public c() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL(" CREATE TABLE IF NOT EXISTS `mid_rates_plot` (\n     `previousRangeCloseRate` REAL NOT NULL,\n     `currencyFrom` TEXT NOT NULL,\n     `currencyTo` TEXT NOT NULL,\n     `duration` TEXT NOT NULL,\n     `plot` TEXT NOT NULL,\n      PRIMARY KEY(`currencyFrom`, `currencyTo`, `duration`)\n)");
    }
}
