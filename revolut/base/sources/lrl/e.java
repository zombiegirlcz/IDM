package lrl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f199554c = new e();

    private e() {
        super(14, 15);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `invest_orders` ADD COLUMN `tax_advantaged_order` TEXT DEFAULT NULL");
    }
}
