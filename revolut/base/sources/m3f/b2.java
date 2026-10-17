package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class b2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b2 f202385c = new b2();

    private b2() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `last_onboarded_portfolio_status` (\n    `id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `offboardedDate` INTEGER,\n    `onboardedDate` INTEGER,\n    `accountNumber` TEXT,\n    PRIMARY KEY(`id`)\n)", "CREATE TABLE IF NOT EXISTS `account_closure_backend_requested` (\n    `terminationRequested` INTEGER NOT NULL DEFAULT(0),\n    `id` INTEGER NOT NULL,\n    `title` TEXT,\n    `subtitle` TEXT,\n    `content` TEXT,\n    PRIMARY KEY(`id`)\n)");
    }
}
