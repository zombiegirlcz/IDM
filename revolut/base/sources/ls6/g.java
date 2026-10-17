package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f199633c = new g();

    private g() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "ALTER TABLE `orders` ADD COLUMN `customer_id` TEXT", "ALTER TABLE `orders` ADD COLUMN `customer_email` TEXT", "ALTER TABLE `orders` ADD COLUMN `customer_full_name` TEXT");
    }
}
