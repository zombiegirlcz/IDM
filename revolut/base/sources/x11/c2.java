package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f301805c = new c2();

    private c2() {
        super(168, 169);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `auto_invests` ");
    }
}
