package t10;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends Migration {
    public d() {
        super(54, 55);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "db", "\n            CREATE TABLE IF NOT EXISTS `chat_drafts` (\n                `id` TEXT NOT NULL,\n                `routingMode` TEXT NOT NULL,\n                `routingKeyValue` TEXT NOT NULL,\n                `text` TEXT,\n                `inputMessageVersion` INTEGER NOT NULL,\n                `replyToMessageServerId` TEXT,\n                `replyToSelectedText` TEXT,\n                `pendingAttachments` TEXT,\n                `createdAt` TEXT NOT NULL,\n                `expiresAt` TEXT NOT NULL,\n                PRIMARY KEY(`id`)\n            )\n        ", "CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_drafts_routingMode_routingKeyValue` ON `chat_drafts` (`routingMode`, `routingKeyValue`)");
    }
}
