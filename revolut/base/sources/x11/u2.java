package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u2 f302021c = new u2();

    private u2() {
        super(182, 183);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `remote_contacts` ADD COLUMN `legalName` TEXT NOT NULL DEFAULT ''", "ALTER TABLE `transactions` ADD COLUMN `recipient_legal_name` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `sender_legal_name` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `money_requests` ADD COLUMN `payer_legal_name` TEXT DEFAULT NULL");
        supportSQLiteDatabase.execSQL("ALTER TABLE `money_requests` ADD COLUMN `requester_legal_name` TEXT DEFAULT NULL");
    }
}
