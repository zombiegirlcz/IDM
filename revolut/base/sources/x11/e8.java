package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e8 f301833c = new e8();

    private e8() {
        super(298, 299);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `transactions` ADD COLUMN `credit_card_cashback_collection` INTEGER NOT NULL DEFAULT 0");
    }
}
