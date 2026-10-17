package y5d;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f311074c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `auto_invests`", "CREATE TABLE IF NOT EXISTS `auto_invests` (`id` TEXT NOT NULL, `isEnabled` INTEGER NOT NULL, `targetId` TEXT, `targetType` TEXT, `targetName` TEXT, `dailySpendAmount` INTEGER, `dailySpendCcy` TEXT, `percentage` REAL, `multiplier` REAL, `strategy` TEXT, `ownerId` TEXT NOT NULL, `scope` TEXT, PRIMARY KEY(`id`))");
    }
}
