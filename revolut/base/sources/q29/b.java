package q29;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f241547c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `points_product_earning_rule`", "CREATE TABLE IF NOT EXISTS `points_product_earning_rule` (`id` TEXT NOT NULL, `productType` TEXT NOT NULL, `rate` TEXT NOT NULL, `booster` REAL NOT NULL, `decorator` TEXT, PRIMARY KEY(`id`))");
    }
}
