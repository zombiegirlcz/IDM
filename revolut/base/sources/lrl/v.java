package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f199571c = new v();

    private v() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "ALTER TABLE `trading_orders` ADD COLUMN `instrumentName` TEXT NOT NULL DEFAULT ''", "ALTER TABLE `trading_orders` ADD COLUMN `instrumentType` TEXT NOT NULL DEFAULT 'UNSPECIFIED'");
    }
}
