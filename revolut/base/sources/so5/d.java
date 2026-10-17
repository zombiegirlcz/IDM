package so5;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f264779c = new d();

    private d() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE `crypto_addresses`", "CREATE TABLE IF NOT EXISTS `crypto_addresses` (`id` TEXT NOT NULL, `description` TEXT NOT NULL, `currency` TEXT NOT NULL, `address` TEXT NOT NULL, `destinationTag` TEXT, `hasTransactions` INTEGER NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
