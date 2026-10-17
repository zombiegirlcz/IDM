package pkd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f237003c = new d();

    private d() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `incentives`", "CREATE TABLE `incentives`\n    (\n        `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n        `screenId` TEXT NOT NULL,\n        `meta_campaignId` TEXT NOT NULL,\n        `meta_activeUntil` INTEGER NOT NULL,\n        `content_title` TEXT NOT NULL,\n        `content_description` TEXT,\n        `content_caption` TEXT NOT NULL,\n        `content_deeplink` TEXT NOT NULL,\n        `content_imageUrl` TEXT NOT NULL,\n        `content_progress_type` TEXT,\n        `content_progress_current` REAL,\n        `content_progress_total` REAL,\n        `style_backgroundColor` INTEGER\n    )");
    }
}
