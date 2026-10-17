package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f202497c = new u0();

    private u0() {
        super(142, 143);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `instruments` ADD COLUMN `priceDecimalPlaces` INTEGER DEFAULT NULL");
    }
}
