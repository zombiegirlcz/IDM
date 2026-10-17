package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f279194c = new n();

    private n() {
        super(25, 26);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
    }
}
