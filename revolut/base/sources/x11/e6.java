package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e6 f301831c = new e6();

    private e6() {
        super(254, 255);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `account_id` TEXT DEFAULT NULL");
    }
}
