package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d8 f301824c = new d8();

    private d8() {
        super(297, 298);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `transactions` ADD COLUMN `paid_plan_transaction_billing_cycle_id` TEXT DEFAULT null");
    }
}
