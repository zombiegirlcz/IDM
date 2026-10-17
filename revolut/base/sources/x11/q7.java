package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q7 f301979c = new q7();

    private q7() {
        super(286, 287);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `transactions` ADD COLUMN `merchant_blockedMerchantId` TEXT DEFAULT NULL");
    }
}
