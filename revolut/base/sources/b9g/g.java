package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f13759c = new g();

    private g() {
        super(16, 17);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `hotels_inventory_provider` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logos` TEXT, `address` TEXT NOT NULL, `email` TEXT, `phone` TEXT, `termsAndConditionsUrl` TEXT, `disclaimers` TEXT, PRIMARY KEY(`id`))", "ALTER TABLE `hotels_property_type` ADD COLUMN `categories` TEXT NOT NULL DEFAULT ''");
    }
}
