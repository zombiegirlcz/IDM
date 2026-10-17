package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f11685c = new g();

    private g() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `scoped_symbols` (`scope` TEXT NOT NULL, `symbolType` TEXT NOT NULL, `symbol` TEXT NOT NULL, PRIMARY KEY(`scope`, `symbol`))");
    }
}
