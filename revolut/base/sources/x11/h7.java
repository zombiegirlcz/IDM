package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h7 f301872c = new h7();

    private h7() {
        super(279, 280);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `is_investment_auto_top_up` INTEGER NOT NULL DEFAULT 0");
    }
}
