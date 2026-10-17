package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f302075c = new z();

    private z() {
        super(121, 122);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `credit_loans`");
    }
}
