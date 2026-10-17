package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class c7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c7 f301808c = new c7();

    private c7() {
        super(274, 275);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `wealth_portfolio_id` TEXT DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `wealth_account_type` TEXT DEFAULT NULL");
    }
}
