package dhl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f114850c = new k();

    private k() {
        super(8, 9);
    }

    public static void a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `" + str + "` ADD COLUMN `merger_symbol` TEXT DEFAULT null");
        StringBuilder sbV = y.v(y.v(y.v(y.v(y.v(y.v(new StringBuilder("ALTER TABLE `"), str, "` ADD COLUMN `merger_ref` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `merger_details` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `spinoff_symbol` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `spinoff_ref` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `spinoff_details` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `"), str, "` ADD COLUMN `bankruptcy_symbol` TEXT DEFAULT null", supportSQLiteDatabase, "ALTER TABLE `");
        sbV.append(str);
        sbV.append("` ADD COLUMN `bankruptcy_ref` TEXT DEFAULT null");
        supportSQLiteDatabase.execSQL(sbV.toString());
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        a(database, "calendar_events");
        a(database, "upcoming_events");
    }
}
