package o77;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Migration {
    public a() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS market_assets", "CREATE TABLE IF NOT EXISTS market_assets (\n    id INTEGER PRIMARY KEY NOT NULL,\n    type TEXT NOT NULL,\n    description TEXT,\n    symbol TEXT,\n    ref TEXT,\n    currency TEXT,\n    baseCurrency TEXT\n);", "DROP TABLE IF EXISTS index_details");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS index_details (\n    ref TEXT PRIMARY KEY NOT NULL,\n    symbol TEXT NOT NULL,\n    baseCurrency TEXT,\n    shortDescription TEXT,\n    description TEXT\n);");
    }
}
