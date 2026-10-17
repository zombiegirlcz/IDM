package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f13776c = new w();

    private w() {
        super(30, 31);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `hotels_recent_smart_searches` (\n    `prompt` TEXT NOT NULL,\n    `searchTimestamp` INTEGER NOT NULL,\n    PRIMARY KEY(`prompt`)\n)");
    }
}
