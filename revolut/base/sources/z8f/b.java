package z8f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f320081c = new b();

    private b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "CREATE TABLE transfer_instruments_new (\n    account_id TEXT NOT NULL DEFAULT '',\n    ref TEXT NOT NULL,\n    name TEXT NOT NULL,\n    symbol TEXT NOT NULL,\n    currency TEXT NOT NULL,\n    direction TEXT NOT NULL DEFAULT 'IN',\n    quantity TEXT,\n    transfer_fee TEXT,\n    PRIMARY KEY(account_id, ref, direction)\n)", "INSERT INTO transfer_instruments_new(account_id, ref, name, symbol, currency, direction)\nSELECT account_id, ref, name, symbol, currency, 'IN'\nFROM transfer_instruments", "DROP TABLE transfer_instruments");
        supportSQLiteDatabase.execSQL("ALTER TABLE transfer_instruments_new RENAME TO transfer_instruments");
    }
}
