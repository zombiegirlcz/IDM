package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class v extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f232833c = new v();

    private v() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DELETE FROM loans", "DELETE FROM loan_details");
    }
}
