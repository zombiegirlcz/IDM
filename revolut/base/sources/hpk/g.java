package hpk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f154573c = new g();

    private g() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("    CREATE TABLE IF NOT EXISTS `all_rates` (\n    `from` TEXT NOT NULL, \n    `to` TEXT NOT NULL, \n    `askRate` TEXT NOT NULL, \n    `bidRate` TEXT NOT NULL, \n    `midRate` TEXT NOT NULL, \n    `eodRate` TEXT, \n    PRIMARY KEY(`from`, `to`)\n)");
    }
}
