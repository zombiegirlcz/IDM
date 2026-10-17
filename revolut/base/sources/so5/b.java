package so5;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f264777c = new b();

    private b() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE `crypto_addresses`", "CREATE TABLE IF NOT EXISTS `crypto_addresses` (`id` TEXT NOT NULL, `description` TEXT, `currency` TEXT NOT NULL, `address` TEXT NOT NULL, `destinationTag` TEXT, `hasTransactions` INTEGER NOT NULL, `status` TEXT NOT NULL, `blockchain` TEXT, `isHidden` INTEGER NOT NULL, `recipientDetails` TEXT, `isRevolutAddress` INTEGER NOT NULL, `limits` TEXT, `createdDate` INTEGER NOT NULL, `counterparty` TEXT, PRIMARY KEY(`id`))");
    }
}
