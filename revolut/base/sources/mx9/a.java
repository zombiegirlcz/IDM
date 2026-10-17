package mx9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f210231c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `payments_recent_v2` (`recipientId` TEXT NOT NULL, `recipientType` TEXT NOT NULL, `itemId` TEXT NOT NULL, `itemType` TEXT NOT NULL, `unreadCounter` INTEGER NOT NULL, `unreadSyncTimestamp` INTEGER NOT NULL, PRIMARY KEY(`recipientId`))");
    }
}
