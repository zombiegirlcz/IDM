package t10;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends Migration {
    public g() {
        super(57, 58);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "ALTER TABLE messages ADD COLUMN chatIdGroup INTEGER NOT NULL DEFAULT 0", "ALTER TABLE messages ADD COLUMN feedIdGroup INTEGER NOT NULL DEFAULT 0", "ALTER TABLE messages ADD COLUMN feedTypeGroup INTEGER NOT NULL DEFAULT 0");
        o.D(supportSQLiteDatabase, "\n            CREATE TABLE IF NOT EXISTS chat_history_load_state (\n                id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                chatId TEXT,\n                feedType TEXT,\n                feedId TEXT,\n                historyFullyLoaded INTEGER NOT NULL DEFAULT 0\n            )\n            ", "\n            CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_history_load_state_chatId`\n            ON `chat_history_load_state` (`chatId`)\n            ", "\n            CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_history_load_state_feedType`\n            ON `chat_history_load_state` (`feedType`)\n            ", "\n            CREATE UNIQUE INDEX IF NOT EXISTS `index_chat_history_load_state_feedId`\n            ON `chat_history_load_state` (`feedId`)\n            ");
        o.D(supportSQLiteDatabase, "ALTER TABLE pending_uploads ADD COLUMN feedType TEXT", "ALTER TABLE pending_uploads ADD COLUMN feedId TEXT", "\n            CREATE INDEX IF NOT EXISTS `index_messages_chatId_chatIdGroup`\n            ON `messages` (`chatId`, `chatIdGroup`)\n            ", "\n            CREATE INDEX IF NOT EXISTS `index_messages_feedId_feedIdGroup`\n            ON `messages` (`feedId`, `feedIdGroup`)\n            ");
        supportSQLiteDatabase.execSQL("\n            CREATE INDEX IF NOT EXISTS `index_messages_feedType_feedTypeGroup`\n            ON `messages` (`feedType`, `feedTypeGroup`)\n            ");
    }
}
