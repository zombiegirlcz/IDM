package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f13769c = new p();

    private p() {
        super(24, 25);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM `hotels_promotions`");
    }
}
