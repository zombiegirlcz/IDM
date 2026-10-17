package p45;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f232816c = new e();

    private e() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM loans");
    }
}
