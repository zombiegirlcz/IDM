package qif;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;
import wp5.y;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends Migration {
    public e() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        y.z(supportSQLiteDatabase, "db", "DELETE FROM loading_state", "DELETE FROM transactions", "DELETE FROM transfer_users");
        o.D(supportSQLiteDatabase, "DELETE FROM loans", "DELETE FROM merchants", "DELETE FROM merchant_payments", "DELETE FROM acquiring_cashback");
        y.y(supportSQLiteDatabase, "DELETE FROM extra_attributes");
    }
}
