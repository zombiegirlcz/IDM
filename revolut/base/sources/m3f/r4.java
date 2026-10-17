package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class r4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r4 f202483c = new r4();

    private r4() {
        super(94, 95);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `candle_sticks`", "CREATE TABLE IF NOT EXISTS `candle_sticks` (`symbol` TEXT NOT NULL, `period` TEXT NOT NULL, `open` TEXT NOT NULL, `close` TEXT NOT NULL, `high` TEXT NOT NULL, `low` TEXT NOT NULL, `volume` INTEGER NOT NULL, `from` INTEGER NOT NULL, `to` INTEGER NOT NULL, `startClose` TEXT NOT NULL, `endClose` TEXT NOT NULL, `baseline` TEXT, PRIMARY KEY(`symbol`, `period`, `from`))");
    }
}
