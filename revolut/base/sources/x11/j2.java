package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j2 f301891c = new j2();

    private j2() {
        super(173, 174);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `cashback_box` ");
    }
}
