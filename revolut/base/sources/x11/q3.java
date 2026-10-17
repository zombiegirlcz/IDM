package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends Migration {
    public q3() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `recurring_payments` (\n    `id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `type` TEXT NOT NULL,\n    `receiver` TEXT,\n    `speed` TEXT,\n    `startDate` TEXT,\n    `nextDate` TEXT,\n    `period` TEXT,\n    `fee` TEXT,\n    `sourceCurrency` TEXT,\n    `currency` TEXT,\n    `amount` INTEGER,\n    `title` TEXT,\n    `description` TEXT,\n    `receiverInfo` TEXT,\n    `attributes` TEXT,\n    PRIMARY KEY(`id`))");
    }
}
