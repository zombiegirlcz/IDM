package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f301852c = new g0();

    private g0() {
        super(128, 129);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `recurring_payments` ADD COLUMN `receiverInfoMerchant` TEXT", "ALTER TABLE `recurring_payments` ADD COLUMN `frequency` TEXT");
    }
}
