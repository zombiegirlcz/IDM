package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f199637c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `sales` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `channel` TEXT NOT NULL,`amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `payment_link` TEXT, `created_at` INTEGER NOT NULL,`updated_at` INTEGER NOT NULL, `expires_at` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `cashback_rates` (`pricing_plan_code` TEXT NOT NULL, `rate` TEXT NOT NULL, PRIMARY KEY(`pricing_plan_code`))");
    }
}
