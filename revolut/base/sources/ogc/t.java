package ogc;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f225097c = new t();

    private t() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "\n            DROP TABLE `rewards_details`\n            ", "\n            CREATE TABLE IF NOT EXISTS `rewards_details` (\n                `id` TEXT NOT NULL,     \n                `type` TEXT NOT NULL, \n                `primaryCategoryId` TEXT NOT NULL,  \n                `description` TEXT NOT NULL, \n                `details` TEXT NOT NULL, \n                `merchant` TEXT NOT NULL, \n                `start` INTEGER, \n                `end` INTEGER, \n                `steps` TEXT NOT NULL, \n                `social_proof_likes` INTEGER, \n                `feedbackrating` INTEGER, \n                `feedbackcomment` TEXT, \n                PRIMARY KEY(`id`)\n            )\n            ");
    }
}
