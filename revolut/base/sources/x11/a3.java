package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class a3 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a3 f301781c = new a3();

    private a3() {
        super(188, 189);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `transaction_predefined_category` (`id` TEXT NOT NULL, `baseDirection` TEXT NOT NULL, `actualDirection` TEXT NOT NULL, PRIMARY KEY(`id`))", "DROP TABLE `transaction_category`", "CREATE TABLE IF NOT EXISTS `transaction_custom_category` (`id` TEXT NOT NULL, `baseDirection` TEXT NOT NULL, `actualDirection` TEXT NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `color` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
