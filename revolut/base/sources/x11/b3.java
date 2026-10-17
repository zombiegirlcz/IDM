package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b3 f301795c = new b3();

    private b3() {
        super(189, 190);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_fx` INTEGER DEFAULT NULL", "ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_atm` INTEGER DEFAULT NULL");
    }
}
