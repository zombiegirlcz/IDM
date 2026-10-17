package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class m8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m8 f301930c = new m8();

    private m8() {
        super(303, 304);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `transactions` ADD COLUMN `vault_withdrawal_principle` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `vault_withdrawal_interest` INTEGER DEFAULT NULL");
    }
}
