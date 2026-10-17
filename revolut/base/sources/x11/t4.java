package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends Migration {
    public t4() {
        super(PassportService.DEFAULT_MAX_BLOCKSIZE, BERTags.FLAGS);
    }

    public static void a(SupportSQLiteDatabase supportSQLiteDatabase, Function1 function1) {
        try {
            supportSQLiteDatabase.beginTransaction();
            function1.invoke(supportSQLiteDatabase);
            supportSQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
            } finally {
                try {
                    supportSQLiteDatabase.endTransaction();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase originalDb) {
        Intrinsics.checkNotNullParameter(originalDb, "originalDb");
        a(originalDb, new x1.n(2));
        a(originalDb, new v77.a(zhm.v.k("DROP TABLE IF EXISTS \"instruments\"", "DROP INDEX IF EXISTS \"index_instruments_symbol\"", "DROP TABLE IF EXISTS \"instrument_tickers\"", "DROP TABLE IF EXISTS \"instrument_tickers_summary\"", "DROP TABLE IF EXISTS \"instruments_watchlist\"", "DROP TABLE IF EXISTS \"recently_viewed_instrument\""), 28));
    }
}
