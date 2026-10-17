package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f225101c = new x();

    private x() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        f225101c.getClass();
        database.execSQL("\n                    CREATE TABLE IF NOT EXISTS `rewards_short_new` (\n                        `id` TEXT NOT NULL, \n                        `type` TEXT NOT NULL, \n                        `start` INTEGER, \n                        `end` INTEGER, \n                        `category` TEXT NOT NULL, \n                        `claimType` TEXT, \n                        `merchant` TEXT NOT NULL,\n                        `description` TEXT NOT NULL,\n                        `social_proof_likes` INTEGER,\n                        `activation_state` TEXT,\n                        `recommended` INTEGER NOT NULL DEFAULT '0',\n                        PRIMARY KEY(`id`, `recommended`)\n                    )\n                ");
        database.execSQL("\n                    INSERT INTO `rewards_short_new` \n                        (id, type, start, `end`, category, claimType, merchant, description, social_proof_likes, recommended, activation_state)\n                    SELECT \n                        id, type, start, `end`, category, claimType, merchant, description, social_proof_likes, recommended, NULL\n                    FROM `rewards_short` \n                ");
        database.execSQL("DROP TABLE `rewards_short`;");
        prk.o.D(database, "ALTER TABLE `rewards_short_new` RENAME TO `rewards_short`;", "\n                    CREATE TABLE IF NOT EXISTS `rewards_new` (\n                        `id` TEXT NOT NULL, \n                        `type` TEXT NOT NULL, \n                        `primaryCategoryId` TEXT NOT NULL, \n                        `description` TEXT NOT NULL, \n                        `details` TEXT NOT NULL, \n                        `merchant` TEXT NOT NULL, \n                        `start` INTEGER, \n                        `end` INTEGER, \n                        `steps` TEXT NOT NULL, \n                        `claim_type` TEXT, \n                        `activation_state` TEXT, \n                        `social_proof_likes` INTEGER, \n                        `feedbackrating` INTEGER, \n                        `feedbackcomment` TEXT, PRIMARY KEY(`id`))\n                ", "\n                    INSERT INTO `rewards_new` \n                        (id, type, primaryCategoryId, description, details, merchant, start, `end`, steps, claim_type, activation_state, social_proof_likes, feedbackrating, feedbackcomment)\n                    SELECT \n                        id, type, primaryCategoryId, description, details, merchant, start, `end`, steps, claim_type, NULL, social_proof_likes, feedbackrating, feedbackcomment\n                    FROM `rewards_details` \n                ", "DROP TABLE `rewards_details`;");
        database.execSQL("ALTER TABLE `rewards_new` RENAME TO `rewards_details`;");
    }
}
