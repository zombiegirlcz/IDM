package t10;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends Migration {
    public h() {
        super(58, 59);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `message_search`", "CREATE TABLE IF NOT EXISTS `message_search` (\n    `messageId` TEXT NOT NULL,\n    `chatId` TEXT NOT NULL,\n    `feedId` TEXT,\n    `feedType` TEXT,\n    `ticketCreatedAt` TEXT NOT NULL,\n    `createdAt` TEXT NOT NULL,\n    `searchText` TEXT,\n    PRIMARY KEY(`messageId`),\n    FOREIGN KEY(`messageId`) REFERENCES `messages`(`id`)\n        ON UPDATE NO ACTION ON DELETE CASCADE\n)", "CREATE INDEX IF NOT EXISTS `index_message_search_chatId_ticketCreatedAt_createdAt` ON `message_search` (`chatId`, `ticketCreatedAt`, `createdAt`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_message_search_feedId_ticketCreatedAt_createdAt` ON `message_search` (`feedId`, `ticketCreatedAt`, `createdAt`)");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_message_search_feedType_ticketCreatedAt_createdAt` ON `message_search` (`feedType`, `ticketCreatedAt`, `createdAt`)");
    }
}
