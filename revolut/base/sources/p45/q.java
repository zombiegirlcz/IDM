package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f232828c = new q();

    private q() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP TABLE IF EXISTS `loan_refinanced_credits`");
    }
}
