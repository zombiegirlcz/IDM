package hpk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f154570c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `rates_plot`", "CREATE TABLE IF NOT EXISTS `rates_plot` (\n    `type` TEXT NOT NULL,\n    `currencyFrom` TEXT NOT NULL,\n    `currencyTo` TEXT NOT NULL,\n    `duration` TEXT NOT NULL,\n    `plot` TEXT NOT NULL,\n     PRIMARY KEY(`type`, `currencyFrom`, `currencyTo`, `duration`)\n)");
    }
}
