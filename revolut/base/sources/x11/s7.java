package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class s7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s7 f302003c = new s7();

    private s7() {
        super(288, 289);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_transfer` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_crypto_fee` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_crypto_percent` REAL DEFAULT NULL");
    }
}
