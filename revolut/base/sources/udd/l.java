package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f279192c = new l();

    private l() {
        super(23, 24);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "CREATE TABLE IF NOT EXISTS `vaults_account_type_states` (\n    `accountType` TEXT NOT NULL,\n    PRIMARY KEY(`accountType`)\n)", "INSERT OR IGNORE INTO `vaults_account_type_states` (`accountType`)\nSELECT DISTINCT `accountType` FROM `vaults`");
    }
}
