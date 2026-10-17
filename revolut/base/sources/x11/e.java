package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f301825c = new e();

    private e() {
        super(104, 105);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE institutions;", "CREATE TABLE IF NOT EXISTS institutions(id TEXT NOT NULL, name TEXT NOT NULL, logo TEXT NOT NULL, logoType TEXT NOT NULL, status TEXT NOT NULL, PRIMARY KEY(id));");
    }
}
