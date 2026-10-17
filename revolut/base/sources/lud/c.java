package lud;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f200223c = new c();

    private c() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `staking_products`", "CREATE TABLE IF NOT EXISTS `staking_products` (`id` TEXT NOT NULL, `stakingInfo` TEXT NOT NULL, `riskDisclaimers` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
