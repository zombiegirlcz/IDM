package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f230192c = new f();

    private f() {
        super(15, 16);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `complex_analytics_security_positions` (\n    `currency` TEXT NOT NULL,\n    `investment` TEXT NOT NULL,\n    `lastTransactionDate` INTEGER NOT NULL,\n    `averagePrice` TEXT NOT NULL,\n    PRIMARY KEY(`currency`)\n)");
    }
}
