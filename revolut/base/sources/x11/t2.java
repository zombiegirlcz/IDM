package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f302012c = new t2();

    private t2() {
        super(181, 182);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `gift_direction` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `gift_iconImageUrl` TEXT DEFAULT NULL");
    }
}
