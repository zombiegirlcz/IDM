package fv9;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Migration {
    public b() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_message_reactions` (`parentMessageId` TEXT NOT NULL, `relatedEntityId` TEXT NOT NULL, `relatedEntityType` TEXT NOT NULL, `chatId` TEXT NOT NULL, `isGroup` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`relatedEntityId`, `relatedEntityType`))");
    }
}
