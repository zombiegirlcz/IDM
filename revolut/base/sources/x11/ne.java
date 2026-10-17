package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ne extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ne f301947c = new ne();

    private ne() {
        super(98, 99);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE `airport_lounge_registration`;");
    }
}
