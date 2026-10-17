package hv9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f155788c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS 'payments_social_reactions'", "CREATE TABLE IF NOT EXISTS `payments_social_reactions` (`id` TEXT NOT NULL, `senderId` TEXT NOT NULL, `recipientId` TEXT NOT NULL, `media` TEXT NOT NULL, `type` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `transactionId` TEXT, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
