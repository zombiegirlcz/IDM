package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f301987c = new r0();

    private r0() {
        super(137, 138);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `gift_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `gift_state` TEXT DEFAULT NULL");
    }
}
