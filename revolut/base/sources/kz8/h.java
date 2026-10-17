package kz8;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f191074c = new h();

    private h() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `blogs`", "CREATE TABLE IF NOT EXISTS `blogs` (`blogId` TEXT NOT NULL, `title` TEXT NOT NULL, `content` TEXT, `productDomain` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `author` TEXT, `description` TEXT, `previewImageUrl` TEXT, `imageUrl` TEXT, `lengthInMins` INTEGER, PRIMARY KEY(`blogId`))");
    }
}
