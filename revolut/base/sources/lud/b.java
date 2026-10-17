package lud;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f200222c = new b();

    private b() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `staking_pockets`", "CREATE TABLE IF NOT EXISTS `staking_pockets` (`id` TEXT NOT NULL, `productId` TEXT NOT NULL, `stakingBalance` TEXT NOT NULL, `fiatBalance` TEXT NOT NULL, `unstakingLockedBalance` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
