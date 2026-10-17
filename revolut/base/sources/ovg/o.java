package ovg;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f230210c = new o();

    private o() {
        super(23, 24);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `complex_analytics_pnl` ADD COLUMN `last_modified` TEXT default null");
    }
}
