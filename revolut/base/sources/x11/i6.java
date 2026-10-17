package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class i6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i6 f301882c = new i6();

    private i6() {
        super(258, 259);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `joint_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `joint_initiator_legal_name` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `joint_initiator_image` TEXT DEFAULT NULL");
    }
}
