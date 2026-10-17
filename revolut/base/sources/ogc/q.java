package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f225094c = new q();

    private q() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "\n            CREATE TABLE IF NOT EXISTS `rewards_short` (\n                `id` TEXT NOT NULL, \n                `type` TEXT NOT NULL, \n                `start` INTEGER, \n                `end` INTEGER, \n                `category` TEXT NOT NULL, \n                `claimType` TEXT, \n                `merchant` TEXT NOT NULL,\n                `description` TEXT NOT NULL,\n                `social_proof_likes` INTEGER, \n                PRIMARY KEY(`id`)\n            )\n        ", "\n            CREATE TABLE IF NOT EXISTS `rewards_details` (\n                `id` TEXT NOT NULL, \n                `type` TEXT NOT NULL, \n                `primaryCategoryId` TEXT NOT NULL, \n                `start` INTEGER, \n                `end` INTEGER, \n                `steps` TEXT NOT NULL, \n                `description` TEXT NOT NULL,\n                `details` TEXT NOT NULL,\n                `merchant` TEXT NOT NULL,\n                `social_proof_likes` INTEGER, \n                `feedback` TEXT,\n                PRIMARY KEY(`id`)\n            )\n        ", "\n            CREATE TABLE IF NOT EXISTS `rewards_collections` (\n                `id` TEXT NOT NULL, \n                `order` INTEGER NOT NULL, \n                `imageUrl` TEXT NOT NULL, \n                PRIMARY KEY(`id`)\n            )\n        ");
        supportSQLiteDatabase.execSQL("\n            CREATE TABLE IF NOT EXISTS `rewards_categories` (\n                `id` TEXT NOT NULL, \n                `name` TEXT NOT NULL, \n                `perks` TEXT NOT NULL, \n                `order` INTEGER NOT NULL, \n                `type` TEXT NOT NULL, \n                PRIMARY KEY(`id`)\n            )\n        ");
        supportSQLiteDatabase.execSQL("\n                CREATE INDEX IF NOT EXISTS `index_rewards_categories_type` ON `rewards_categories` (`type`)\n            ");
        supportSQLiteDatabase.setTransactionSuccessful();
        supportSQLiteDatabase.endTransaction();
    }
}
