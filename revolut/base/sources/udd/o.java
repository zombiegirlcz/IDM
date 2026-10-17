package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f279195c = new o();

    private o() {
        super(26, 27);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DELETE FROM vaults", "DELETE FROM vaults_account_type_states");
    }
}
