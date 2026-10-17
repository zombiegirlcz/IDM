package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f202436c = new k();

    private k() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `crypto_investments` (\n                    `currency` TEXT NOT NULL,\n                    `investment` TEXT NOT NULL,\n                    `lastTransactionDate` INTEGER NOT NULL,\n                    PRIMARY KEY(`currency`)\n                )\n            ");
    }
}
