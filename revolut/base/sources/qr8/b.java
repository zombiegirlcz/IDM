package qr8;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f248667c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `junior_transfer_request`", "CREATE TABLE IF NOT EXISTS `junior_transfer_request` (`id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `transactionId` TEXT NOT NULL, `transactionWalletId` TEXT NOT NULL, `transactionPocketId` TEXT NOT NULL, `state` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `comment` TEXT, `gifUrl` TEXT, `sender` TEXT NOT NULL, `recipient` TEXT NOT NULL, `reason_code` TEXT, `reason_limit_amount` INTEGER, `reason_limit_currency` TEXT, PRIMARY KEY(`id`))");
    }
}
