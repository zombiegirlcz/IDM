package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f301923c = new m0();

    private m0() {
        super(132, 133);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `bill_account_id` TEXT DEFAULT NULL");
    }
}
