package ayk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Migration {
    public a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE trading_onboarding_kyc", "CREATE TABLE IF NOT EXISTS trading_onboarding_kyc (\n    id INTEGER,\n    countryOfBirth TEXT, \n    nationalities TEXT, \n    usTaxPayer INTEGER, \n    rtlBrexitOptIn INTEGER, \n    documents TEXT NOT NULL, \n    PRIMARY KEY (id)\n)");
    }
}
