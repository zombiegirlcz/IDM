package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class n4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n4 f202459c = new n4();

    private n4() {
        super(90, 91);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP INDEX IF EXISTS `index_instruments_symbol`", "CREATE INDEX IF NOT EXISTS `index_instruments_symbol` ON `instruments` (`symbol`)");
    }
}
