package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f301988c = new r1();

    private r1() {
        super(159, 160);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DELETE FROM `entities_adt`");
    }
}
