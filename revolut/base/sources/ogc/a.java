package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f225078c = new a();

    private a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n                    CREATE TABLE IF NOT EXISTS `rewards_short_new` (\n                        `id` TEXT NOT NULL, \n                        `type` TEXT NOT NULL, \n                        `start` INTEGER, \n                        `end` INTEGER, \n                        `category` TEXT NOT NULL, \n                        `claimType` TEXT, \n                        `merchant` TEXT NOT NULL,\n                        `description` TEXT NOT NULL,\n                        `social_proof_likes` INTEGER,\n                        `activation_state` TEXT,\n                        `recommended` INTEGER NOT NULL DEFAULT '0',\n                        `homeFeed` INTEGER NOT NULL DEFAULT '0',\n                        PRIMARY KEY(`id`, `recommended`, 'homeFeed')\n                    )\n                ", "\n                    INSERT INTO `rewards_short_new` \n                        (id, type, start, `end`, category, claimType, merchant, description, social_proof_likes, recommended, activation_state, homeFeed)\n                    SELECT \n                        id, type, start, `end`, category, claimType, merchant, description, social_proof_likes, recommended, activation_state, '0'\n                    FROM `rewards_short` \n                ", "DROP TABLE `rewards_short`;");
        supportSQLiteDatabase.execSQL("ALTER TABLE `rewards_short_new` RENAME TO `rewards_short`;");
    }
}
