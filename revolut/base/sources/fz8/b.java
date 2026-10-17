package fz8;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.learn.shared.impl.data.database.LearnDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LearnDatabase_Impl f139134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LearnDatabase_Impl learnDatabase_Impl) {
        super(11, "9c6e853d7eb3453996fbca751d2c9692", "45805b08a18f72267ba3e2bb57c7ccee");
        this.f139134a = learnDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `courses` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `reward` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `state` TEXT NOT NULL, `mode` TEXT, `domain` TEXT NOT NULL, `description` TEXT NOT NULL, `courseIndex` INTEGER NOT NULL, `lessonsProgress` TEXT NOT NULL, `incentiveEnded` INTEGER NOT NULL, `tags` TEXT, `coverImage` TEXT, `totalEarnedReward` TEXT, `badges` TEXT, `hasLessonsWithAbuseRewardStatus` INTEGER, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `lessons` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `courseId` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `contentCards` TEXT NOT NULL, `quiz` TEXT, `reward` TEXT NOT NULL, `progress` TEXT NOT NULL, `coverImage` TEXT, `content` TEXT NOT NULL, `rewardStatus` TEXT NOT NULL, `lessonIndex` INTEGER NOT NULL, `totalLessons` INTEGER NOT NULL, `preconditions` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`courseId`) REFERENCES `courses`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_lessons_courseId` ON `lessons` (`courseId`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `glossary_terms` (`glossaryItemId` TEXT NOT NULL, `term` TEXT NOT NULL, `definition` TEXT NOT NULL, `productDomain` TEXT NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`glossaryItemId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `blogs` (`blogId` TEXT NOT NULL, `title` TEXT NOT NULL, `content` TEXT, `productDomain` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `author` TEXT, `description` TEXT, `previewImageUrl` TEXT, `imageUrl` TEXT, `lengthInMins` INTEGER, PRIMARY KEY(`blogId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `course_categories` (`category` TEXT NOT NULL, `title` TEXT NOT NULL, `variant` TEXT NOT NULL, `productDomains` TEXT NOT NULL, PRIMARY KEY(`category`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `course_category_join` (`categoryId` TEXT NOT NULL, `courseId` TEXT NOT NULL, PRIMARY KEY(`categoryId`, `courseId`), FOREIGN KEY(`courseId`) REFERENCES `courses`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`categoryId`) REFERENCES `course_categories`(`category`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `total_earned_reward` (`id` TEXT NOT NULL, `total_amount` INTEGER, `total_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9c6e853d7eb3453996fbca751d2c9692')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `courses`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `lessons`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `glossary_terms`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `blogs`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `course_categories`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `course_category_join`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `total_earned_reward`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
        int i = LearnDatabase_Impl.f77974m;
        this.f139134a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(16);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map.put("reward", new TableInfo.Column("reward", "TEXT", true, 0, null, 1));
        map.put("thumbnail", new TableInfo.Column("thumbnail", "TEXT", true, 0, null, 1));
        map.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map.put("mode", new TableInfo.Column("mode", "TEXT", false, 0, null, 1));
        map.put("domain", new TableInfo.Column("domain", "TEXT", true, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map.put("courseIndex", new TableInfo.Column("courseIndex", "INTEGER", true, 0, null, 1));
        map.put("lessonsProgress", new TableInfo.Column("lessonsProgress", "TEXT", true, 0, null, 1));
        map.put("incentiveEnded", new TableInfo.Column("incentiveEnded", "INTEGER", true, 0, null, 1));
        map.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, 1));
        map.put("coverImage", new TableInfo.Column("coverImage", "TEXT", false, 0, null, 1));
        map.put("totalEarnedReward", new TableInfo.Column("totalEarnedReward", "TEXT", false, 0, null, 1));
        map.put("badges", new TableInfo.Column("badges", "TEXT", false, 0, null, 1));
        TableInfo tableInfo = new TableInfo("courses", map, o.s(map, "hasLessonsWithAbuseRewardStatus", new TableInfo.Column("hasLessonsWithAbuseRewardStatus", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "courses");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("courses(com.revolut.feature.learn.shared.impl.data.database.entity.CourseEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(14);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map2.put("courseId", new TableInfo.Column("courseId", "TEXT", true, 0, null, 1));
        map2.put("thumbnail", new TableInfo.Column("thumbnail", "TEXT", true, 0, null, 1));
        map2.put("contentCards", new TableInfo.Column("contentCards", "TEXT", true, 0, null, 1));
        map2.put("quiz", new TableInfo.Column("quiz", "TEXT", false, 0, null, 1));
        map2.put("reward", new TableInfo.Column("reward", "TEXT", true, 0, null, 1));
        map2.put("progress", new TableInfo.Column("progress", "TEXT", true, 0, null, 1));
        map2.put("coverImage", new TableInfo.Column("coverImage", "TEXT", false, 0, null, 1));
        map2.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, 1));
        map2.put("rewardStatus", new TableInfo.Column("rewardStatus", "TEXT", true, 0, null, 1));
        map2.put("lessonIndex", new TableInfo.Column("lessonIndex", "INTEGER", true, 0, null, 1));
        map2.put("totalLessons", new TableInfo.Column("totalLessons", "INTEGER", true, 0, null, 1));
        HashSet hashSetS = o.s(map2, "preconditions", new TableInfo.Column("preconditions", "TEXT", false, 0, null, 1), 1);
        HashSet hashSetL = r6.b.l(hashSetS, new TableInfo.ForeignKey("courses", "CASCADE", "NO ACTION", Arrays.asList("courseId"), Arrays.asList("id")), 1);
        hashSetL.add(new TableInfo.Index("index_lessons_courseId", false, Arrays.asList("courseId"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("lessons", map2, hashSetS, hashSetL);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "lessons");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("lessons(com.revolut.feature.learn.shared.impl.data.database.entity.LessonEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(5);
        map3.put("glossaryItemId", new TableInfo.Column("glossaryItemId", "TEXT", true, 1, null, 1));
        map3.put("term", new TableInfo.Column("term", "TEXT", true, 0, null, 1));
        map3.put("definition", new TableInfo.Column("definition", "TEXT", true, 0, null, 1));
        map3.put("productDomain", new TableInfo.Column("productDomain", "TEXT", true, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("glossary_terms", map3, o.s(map3, "index", new TableInfo.Column("index", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "glossary_terms");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("glossary_terms(com.revolut.feature.learn.shared.impl.data.database.entity.GlossaryTermEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(10);
        map4.put("blogId", new TableInfo.Column("blogId", "TEXT", true, 1, null, 1));
        map4.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map4.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, 1));
        map4.put("productDomain", new TableInfo.Column("productDomain", "TEXT", true, 0, null, 1));
        map4.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, 1));
        map4.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, 1));
        map4.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map4.put("previewImageUrl", new TableInfo.Column("previewImageUrl", "TEXT", false, 0, null, 1));
        map4.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("blogs", map4, o.s(map4, "lengthInMins", new TableInfo.Column("lengthInMins", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "blogs");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("blogs(com.revolut.feature.learn.shared.impl.data.database.entity.LearnBlogEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(4);
        map5.put("category", new TableInfo.Column("category", "TEXT", true, 1, null, 1));
        map5.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
        map5.put("variant", new TableInfo.Column("variant", "TEXT", true, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("course_categories", map5, o.s(map5, "productDomains", new TableInfo.Column("productDomains", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "course_categories");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("course_categories(com.revolut.feature.learn.shared.impl.data.database.entity.CourseCategoryEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(2);
        map6.put("categoryId", new TableInfo.Column("categoryId", "TEXT", true, 1, null, 1));
        HashSet hashSetS2 = o.s(map6, "courseId", new TableInfo.Column("courseId", "TEXT", true, 2, null, 1), 2);
        hashSetS2.add(new TableInfo.ForeignKey("courses", "CASCADE", "NO ACTION", Arrays.asList("courseId"), Arrays.asList("id")));
        TableInfo tableInfo11 = new TableInfo("course_category_join", map6, hashSetS2, r6.b.l(hashSetS2, new TableInfo.ForeignKey("course_categories", "CASCADE", "NO ACTION", Arrays.asList("categoryId"), Arrays.asList("category")), 0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "course_category_join");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, o.o("course_category_join(com.revolut.feature.learn.shared.impl.data.database.entity.CourseCategoryJoinEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(3);
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map7.put("total_amount", new TableInfo.Column("total_amount", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo13 = new TableInfo("total_earned_reward", map7, o.s(map7, "total_currency", new TableInfo.Column("total_currency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "total_earned_reward");
        return !tableInfo13.equals(tableInfo14) ? new RoomOpenDelegate.ValidationResult(false, o.o("total_earned_reward(com.revolut.feature.learn.shared.impl.data.database.entity.TotalEarnedRewardEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
