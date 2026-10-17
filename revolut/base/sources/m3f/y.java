package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f202520c = new y();

    private y() {
        super(122, 123);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DELETE FROM `trading_trades`", "ALTER TABLE `trading_trades` ADD COLUMN `ref` TEXT NOT NULL");
    }
}
