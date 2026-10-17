package q29;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f241546c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `points_advertisement_earning_rule` (`id` TEXT NOT NULL, `advertisementId` TEXT NOT NULL, `rate` TEXT NOT NULL, `booster` INTEGER NOT NULL, `decorator` TEXT, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `points_miles_redemption_rule` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `logo` TEXT NOT NULL, `image` TEXT NOT NULL, `provider` TEXT NOT NULL, `rate` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `points_product_earning_rule` (`id` TEXT NOT NULL, `productType` TEXT NOT NULL, `rate` TEXT NOT NULL, `booster` INTEGER NOT NULL, `decorator` TEXT, PRIMARY KEY(`id`))");
    }
}
