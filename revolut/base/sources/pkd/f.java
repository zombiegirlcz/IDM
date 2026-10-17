package pkd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f237005c = new f();

    private f() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE `slot_actions`", "CREATE TABLE `slot_actions`\n(\n    `id` TEXT NOT NULL,\n    `screen_id` TEXT NOT NULL,\n    `campaign_id` TEXT NOT NULL,\n    `slot_type` TEXT NOT NULL,\n    `action_type` TEXT NOT NULL,\n    `params` TEXT,\n    PRIMARY KEY(`id`)\n)");
    }
}
