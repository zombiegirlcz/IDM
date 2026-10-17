package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class nb extends Migration {
    public nb() {
        super(56, 57);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `wallet`", "DROP TABLE IF EXISTS `pockets`", "DROP TABLE IF EXISTS `pocket_info`");
    }
}
