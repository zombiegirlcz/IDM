package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i2 f301878c = new i2();

    private i2() {
        super(172, 173);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `product_savings` ", "DROP TABLE IF EXISTS `vaults` ", "DROP TABLE IF EXISTS `vaults_interactions` ");
    }
}
