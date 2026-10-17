package t10;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends Migration {
    public b() {
        super(52, 53);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `uploads` (\n    `id` TEXT NOT NULL,\n    `createdAt` TEXT NOT NULL,\n    `chatId` TEXT NOT NULL,\n    `data` TEXT NOT NULL,\n    `feedType` TEXT,\n    `ticketCreatedAt` TEXT NOT NULL,\n    `feedId` TEXT,\n    `serverId` TEXT,\n    `uploadType` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)", "CREATE INDEX IF NOT EXISTS index_uploads_serverId ON uploads(serverId)");
    }
}
