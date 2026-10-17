package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p6 f301968c = new p6();

    private p6() {
        super(263, 264);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `chargeback_state` TEXT DEFAULT NULL");
    }
}
