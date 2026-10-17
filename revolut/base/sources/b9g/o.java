package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f13768c = new o();

    private o() {
        super(23, 24);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "DELETE FROM `hotels_location`", "ALTER TABLE `hotels_location` ADD COLUMN `isPopular` INTEGER NOT NULL", "CREATE TABLE IF NOT EXISTS `hotels_promotions` (\n    `id` TEXT PRIMARY KEY NOT NULL,\n    `type` TEXT NOT NULL,\n    `start` TEXT NOT NULL,\n    `end` TEXT NOT NULL,\n    `maxDiscountPercentage` REAL NOT NULL,\n    `locationId` TEXT NOT NULL,\n    `isThirdPartyPromoEnabled` INTEGER NOT NULL,\n    FOREIGN KEY(`locationId`) REFERENCES `hotels_location`(`id`) ON DELETE CASCADE\n)");
    }
}
