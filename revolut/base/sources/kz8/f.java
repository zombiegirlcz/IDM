package kz8;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f191072c = new f();

    private f() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "database", "ALTER TABLE `courses` ADD COLUMN `badges` TEXT", "CREATE TABLE IF NOT EXISTS `course_categories` (\n  `category` TEXT NOT NULL, \n  `title` TEXT NOT NULL, \n  `variant` TEXT NOT NULL, \n  `productDomains` TEXT NOT NULL, \n  PRIMARY KEY(`category`)\n)", "CREATE TABLE IF NOT EXISTS `course_category_join` (\n  `categoryId` TEXT NOT NULL, \n  `courseId` TEXT NOT NULL,\n   PRIMARY KEY(`categoryId`, `courseId`), \n   FOREIGN KEY(`categoryId`) REFERENCES `course_categories`(`category`) ON UPDATE NO ACTION ON DELETE CASCADE, \n   FOREIGN KEY(`courseId`) REFERENCES `courses`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE\n)");
        o.D(supportSQLiteDatabase, "DROP TABLE IF EXISTS `lessons`", "CREATE TABLE IF NOT EXISTS `lessons` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `courseId` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `contentCards` TEXT NOT NULL, `quiz` TEXT, `reward` TEXT NOT NULL, `progress` TEXT NOT NULL, `coverImage` TEXT, `content` TEXT NOT NULL, `rewardStatus` TEXT NOT NULL, `lessonIndex` INTEGER NOT NULL, `totalLessons` INTEGER NOT NULL, `preconditions` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`courseId`) REFERENCES `courses`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE INDEX index_lessons_courseId ON lessons(courseId ASC)", "CREATE TABLE IF NOT EXISTS `total_earned_reward` (\n  `id` TEXT NOT NULL,\n  `total_amount` INTEGER,\n  `total_currency` TEXT,\n  PRIMARY KEY(`id`)\n)");
    }
}
