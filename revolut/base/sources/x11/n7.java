package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n7 f301945c = new n7();

    private n7() {
        super(283, 284);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `transactions` ADD COLUMN `fraud_reason` TEXT DEFAULT NULL");
    }
}
