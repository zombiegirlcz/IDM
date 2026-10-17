package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class a8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a8 f301785c = new a8();

    private a8() {
        super(294, 295);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "ALTER TABLE `transactions` ADD COLUMN `merchant_canBeBlocked` INTEGER DEFAULT 1", "ALTER TABLE `transactions` ADD COLUMN `merchant_brandId` TEXT DEFAULT NULL");
    }
}
