package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f225100c = new w();

    private w() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP table `recommended_rewards`", "\n                    CREATE TABLE IF NOT EXISTS `rewards_short_new` (\n                        `id` TEXT NOT NULL, \n                        `type` TEXT NOT NULL, \n                        `start` INTEGER, \n                        `end` INTEGER, \n                        `category` TEXT NOT NULL, \n                        `claimType` TEXT, \n                        `merchant` TEXT NOT NULL,\n                        `description` TEXT NOT NULL,\n                        `social_proof_likes` INTEGER,\n                        `activationis_activated` INTEGER,\n                        `recommended` INTEGER NOT NULL DEFAULT '0',\n                        PRIMARY KEY(`id`, `recommended`)\n                    )\n                ", "\n                    INSERT INTO `rewards_short_new` \n                        (id, type, start, `end`, category, claimType, merchant, description, social_proof_likes, activationis_activated)\n                    SELECT \n                        id, type, start, `end`, category, claimType, merchant, description, social_proof_likes, activationis_activated\n                    FROM `rewards_short` \n                ");
        supportSQLiteDatabase.execSQL("DROP TABLE `rewards_short`;");
        supportSQLiteDatabase.execSQL("ALTER TABLE `rewards_short_new` RENAME TO `rewards_short`;");
    }
}
