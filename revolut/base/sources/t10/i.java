package t10;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends Migration {
    public i() {
        super(59, 60);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DROP INDEX IF EXISTS `index_messages_chatId_ticketCreatedAt_createdAt`", "DROP INDEX IF EXISTS `index_messages_feedId_ticketCreatedAt_createdAt`", "DROP INDEX IF EXISTS `index_messages_feedType_ticketCreatedAt_createdAt`");
        o.D(supportSQLiteDatabase, "\n            CREATE INDEX IF NOT EXISTS `index_messages_chatId_ticketCreatedAt_createdAt_id`\n            ON `messages` (`chatId`, `ticketCreatedAt`, `createdAt`, `id`)\n            ", "\n            CREATE INDEX IF NOT EXISTS `index_messages_feedId_ticketCreatedAt_createdAt_id`\n            ON `messages` (`feedId`, `ticketCreatedAt`, `createdAt`, `id`)\n            ", "\n            CREATE INDEX IF NOT EXISTS `index_messages_feedType_ticketCreatedAt_createdAt_id`\n            ON `messages` (`feedType`, `ticketCreatedAt`, `createdAt`, `id`)\n            ", "CREATE TABLE IF NOT EXISTS `pending_uploads_new` (\n    `uploadCorrelationId` TEXT NOT NULL,\n    `ticketId` TEXT NOT NULL,\n    `messageId` TEXT NOT NULL,\n    `messageCorrelationId` TEXT NOT NULL,\n    `filePath` TEXT NOT NULL,\n    `contentType` TEXT,\n    `status` TEXT NOT NULL,\n    `createdAt` INTEGER NOT NULL,\n    PRIMARY KEY(`uploadCorrelationId`)\n)");
        o.C(supportSQLiteDatabase, "INSERT INTO `pending_uploads_new` (`uploadCorrelationId`, `ticketId`, `messageId`, `messageCorrelationId`, `filePath`, `contentType`, `status`, `createdAt`)\nSELECT `uploadCorrelationId`, `ticketId`, `messageId`, `messageCorrelationId`, `filePath`, `contentType`, `status`, `createdAt`\nFROM `pending_uploads`", "DROP TABLE `pending_uploads`", "ALTER TABLE `pending_uploads_new` RENAME TO `pending_uploads`");
    }
}
