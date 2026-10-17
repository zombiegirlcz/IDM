package obj;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f223966c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE `crypto_addresses`", "CREATE TABLE IF NOT EXISTS `crypto_addresses` (`pocketId` TEXT NOT NULL, `address` TEXT NOT NULL, `tag` TEXT, PRIMARY KEY(`pocketId`))");
    }
}
