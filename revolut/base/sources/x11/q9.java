package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q9 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q9 f301980c = new q9();

    private q9() {
        super(360, 361);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `consents` ADD COLUMN `is_active` INTEGER NOT NULL DEFAULT 1");
    }
}
