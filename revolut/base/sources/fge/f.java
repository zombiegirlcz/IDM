package fge;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f135060c = new f();

    private f() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("ALTER TABLE account_notification_info ADD COLUMN lastSeenTimestamp INTEGER NOT NULL DEFAULT 0");
        database.execSQL("UPDATE account_notification_info SET lastSeenTimestamp = lastActionTimestamp");
        database.endTransaction();
    }
}
