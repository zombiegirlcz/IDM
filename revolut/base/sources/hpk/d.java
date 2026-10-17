package hpk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {
    public d() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `rates_alerts` (\n`id` TEXT NOT NULL, \n`state` TEXT NOT NULL, \n`targetRate` TEXT NOT NULL, \n`placementRate` TEXT,\n`currencyFrom` TEXT NOT NULL,\n`currencyTo` TEXT NOT NULL, \n`createdDate` INTEGER NOT NULL, \n`executedDate` INTEGER NOT NULL,\n PRIMARY KEY(`id`)\n)");
    }
}
