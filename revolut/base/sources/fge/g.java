package fge;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f135061c = new g();

    private g() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("DROP TABLE IF EXISTS `account_notification_info`");
        database.execSQL("CREATE TABLE IF NOT EXISTS `account_notification_info` (`accountId` TEXT NOT NULL, `productId` TEXT NOT NULL, `lastSeenTimestamp` INTEGER NOT NULL, `lastActionTimestamp` INTEGER NOT NULL, `lastTransactionTimestamp` INTEGER NOT NULL, `unreadCounter` INTEGER NOT NULL, PRIMARY KEY(`accountId`, `productId`))");
        database.endTransaction();
    }
}
