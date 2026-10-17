package ji9;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f174406c = new r();

    private r() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `limits`", "CREATE TABLE IF NOT EXISTS `limits` (`facilityId` TEXT NOT NULL, `pocketId` TEXT NOT NULL, `fee` REAL NOT NULL, `countryCode` TEXT NOT NULL, PRIMARY KEY(`facilityId`))");
    }
}
