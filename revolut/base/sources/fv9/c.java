package fv9;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hv9.d f138386c;

    public c() {
        super(5, 6);
        this.f138386c = new hv9.d();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `payments_social_sent_message` (`localId` TEXT NOT NULL, `messageId` TEXT NOT NULL, PRIMARY KEY(`localId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_payments_social_reactions` (`id` TEXT NOT NULL, `senderId` TEXT NOT NULL, `recipientId` TEXT NOT NULL, `media` TEXT, `type` TEXT, `isGroupChat` INTEGER NOT NULL, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `status` TEXT NOT NULL, `state` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_payments_social_reactions` (`id`,`senderId`,`recipientId`,`media`,`type`,`isGroupChat`,`createdDate`,`updatedDate`,`status`,`state`) SELECT `id`,`senderId`,`recipientId`,`media`,`type`,`isGroupChat`,`createdDate`,`updatedDate`,`status`,`state` FROM `payments_social_reactions`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `payments_social_reactions`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_payments_social_reactions` RENAME TO `payments_social_reactions`");
        this.f138386c.onPostMigrate(sQLiteConnection);
    }
}
