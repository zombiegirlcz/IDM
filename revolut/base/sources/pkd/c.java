package pkd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f237002c = new c();

    private c() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `incentives`", "CREATE TABLE `incentives`\n    (\n        `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n        `screenId` TEXT NOT NULL,\n        `meta_campaignId` TEXT NOT NULL,\n        `meta_activeUntil` INTEGER NOT NULL,\n        `content_title` TEXT NOT NULL,\n        `content_description` TEXT,\n        `content_caption` TEXT NOT NULL,\n        `content_deeplink` TEXT NOT NULL,\n        `content_imageUrl` TEXT NOT NULL,\n        `content_progress_type` TEXT,\n        `content_progress_current` INTEGER,\n        `content_progress_total` INTEGER,\n        `style_backgroundColor` INTEGER\n    )", "DROP TABLE `slot_actions`");
        y.y(supportSQLiteDatabase, "CREATE TABLE `slot_actions`\n    (\n        `id` TEXT NOT NULL,\n        `screen_id` TEXT NOT NULL,\n        `campaign_id` TEXT NOT NULL,\n        `slot_type` TEXT NOT NULL,\n        `action_type` TEXT NOT NULL,\n        `params_comm_id` TEXT,\n        PRIMARY KEY(`id`)\n    )");
    }
}
