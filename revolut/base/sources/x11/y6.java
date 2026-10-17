package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y6 f302068c = new y6();

    private y6() {
        super(270, 271);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `recurring_payments` ADD COLUMN `name` TEXT DEFAULT NULL");
    }
}
