package kz8;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f191067c = new a();

    private a() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL(" CREATE TABLE IF NOT EXISTS `blogs` (\n `blogId` TEXT NOT NULL,\n `title` TEXT NOT NULL,\n `content` TEXT NOT NULL,\n `productDomain` TEXT NOT NULL,\n `author` TEXT,\n `description` TEXT,\n `imageUrl` TEXT,\n `publishedDate` INTEGER NOT NULL,\n PRIMARY KEY(`blogId`)\n)");
    }
}
