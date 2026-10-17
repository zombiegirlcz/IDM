package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f202502c = new v();

    private v() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS \"portfolios\" (\"id\" TEXT NOT NULL, \"state\" TEXT NOT NULL, \"asset_types\" TEXT NOT NULL, \"balance\" TEXT, \"kyc\" TEXT NOT NULL, \"disclosures\" TEXT NOT NULL, \"info\" TEXT NOT NULL, PRIMARY KEY(\"id\"))", "CREATE TABLE IF NOT EXISTS \"holdings\" (\"id\" TEXT NOT NULL, \"creation_date\" INTEGER, \"holding_state\" TEXT NOT NULL, \"name\" TEXT NOT NULL, \"currency\" TEXT NOT NULL, \"cash_holding\" TEXT, \"stock_holding\" TEXT, PRIMARY KEY(\"id\"))");
    }
}
