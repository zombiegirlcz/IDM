package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t7 f302016c = new t7();

    private t7() {
        super(289, 290);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER table `recurring_payments` ADD COLUMN `endDate` TEXT DEFAULT NULL", "ALTER table `recurring_payments` ADD COLUMN `planInfo` TEXT DEFAULT NULL");
    }
}
