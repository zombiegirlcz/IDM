package hv9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f155789c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `payments_social_reactions_temp` (`id` TEXT NOT NULL, `senderId` TEXT NOT NULL, `recipientId` TEXT NOT NULL, `media` TEXT, `type` TEXT, `createdDate` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `transactionId` TEXT, `status` TEXT NOT NULL, `state` TEXT NOT NULL, PRIMARY KEY(`id`))", "\n            INSERT INTO `payments_social_reactions_temp` (`id`,`senderId`,`recipientId`,`media`,`type`,`createdDate`,`updatedDate`,`transactionId`,`status`,`state`) \n                SELECT \n                    `id`,\n                    `senderId`,\n                    `recipientId`,\n                    `media`,\n                    `type`,\n                    `createdDate`,\n                    `createdDate`,\n                    `transactionId`,\n                    (CASE `status`\n                        WHEN 'DELETING' THEN 'SENDING'\n                        ELSE `status`\n                    END),\n                    (CASE `status`\n                        WHEN 'DELETING' THEN 'DELETED'\n                        ELSE 'SENT'\n                    END) \n                FROM \n                    `payments_social_reactions`\n            ", "DROP TABLE `payments_social_reactions`");
        y.y(supportSQLiteDatabase, "ALTER TABLE `payments_social_reactions_temp` RENAME TO `payments_social_reactions`");
    }
}
