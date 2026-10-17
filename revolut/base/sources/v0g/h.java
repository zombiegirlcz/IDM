package v0g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f284850c = new h();

    private h() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `travel_experiences_reviews` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `experienceId` TEXT NOT NULL, `publishedDate` TEXT NOT NULL, `userName` TEXT NOT NULL, `rating` INTEGER, `title` TEXT NOT NULL, `text` TEXT NOT NULL, `provider` TEXT NOT NULL, `light` TEXT NOT NULL, `dark` TEXT NOT NULL)", "CREATE TABLE IF NOT EXISTS `travel_experiences_reviews_summary` (`experienceId` TEXT NOT NULL, `count` INTEGER NOT NULL, `averageScore` REAL NOT NULL, PRIMARY KEY(`experienceId`))");
    }
}
