package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a7 f301784c = new a7();

    private a7() {
        super(272, 273);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `loan_repaymentMode` TEXT DEFAULT NULL");
    }
}
