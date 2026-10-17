package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f301997c = new s0();

    private s0() {
        super(138, 139);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `exchange_fee` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `transactions` ADD COLUMN `transfer_fee` INTEGER NOT NULL DEFAULT 0");
    }
}
