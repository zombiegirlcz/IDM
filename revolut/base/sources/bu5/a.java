package bu5;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18688c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE `crypto_positions`", "CREATE TABLE IF NOT EXISTS `crypto_positions` (\n            `type` TEXT NOT NULL, \n            `currency` TEXT NOT NULL, \n            `baseCurrency` TEXT NOT NULL, \n            `investment` TEXT NOT NULL, \n            `lastTransactionDate` INTEGER NOT NULL, \n            `averagePrice` TEXT NOT NULL, \n            PRIMARY KEY(`type`, `currency`, `baseCurrency`))");
    }
}
