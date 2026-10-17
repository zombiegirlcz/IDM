package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f279191c = new k();

    private k() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DELETE FROM `vaults`");
    }
}
