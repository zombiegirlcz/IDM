package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b8 f301800c = new b8();

    private b8() {
        super(295, 296);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `transactions` ADD COLUMN `pocket_fees_breakdown_cashAdvance` INTEGER DEFAULT NULL");
    }
}
