package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class n6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n6 f301944c = new n6();

    private n6() {
        super(261, 262);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `joint_extra_peer` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `joint_extra_account_id` TEXT DEFAULT NULL");
    }
}
