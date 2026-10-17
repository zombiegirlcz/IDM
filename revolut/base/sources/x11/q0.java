package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f301973c = new q0();

    private q0() {
        super(136, 137);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `recurring_payments` ADD COLUMN `linkedTransactionsIds` TEXT DEFAULT NULL");
    }
}
