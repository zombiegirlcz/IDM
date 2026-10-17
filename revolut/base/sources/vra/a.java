package vra;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f291542c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `card_owners_stats` (\n                    `id` TEXT NOT NULL, \n                    `transactionsNumber` INTEGER NOT NULL, \n                    `latestTransactionTimestamp` INTEGER NOT NULL, \n                    PRIMARY KEY(`id`)\n                )\n                ");
    }
}
