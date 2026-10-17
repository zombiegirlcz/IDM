package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r7 f301994c = new r7();

    private r7() {
        super(287, 288);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `transactions` ADD COLUMN `auto_invest_target_type` TEXT DEFAULT NULL");
    }
}
