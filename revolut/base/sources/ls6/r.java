package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f199642c = new r();

    private r() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE `sales`", "CREATE TABLE IF NOT EXISTS `sales` (`id` TEXT NOT NULL, `description` TEXT NOT NULL DEFAULT '',`state` TEXT NOT NULL, `type` TEXT NOT NULL, `channel` TEXT NOT NULL,`amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `payment_link` TEXT, `related_sales` TEXT, `related_transactions` TEXT, `created_at` INTEGER NOT NULL,`updated_at` INTEGER NOT NULL, `expires_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
