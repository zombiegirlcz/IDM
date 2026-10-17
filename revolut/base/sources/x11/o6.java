package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class o6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o6 f301953c = new o6();

    private o6() {
        super(262, 263);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `recurring_payments` ADD COLUMN `initiator_id` TEXT DEFAULT NULL", "ALTER TABLE `recurring_payments` ADD COLUMN `initiator_name` TEXT DEFAULT NULL");
    }
}
