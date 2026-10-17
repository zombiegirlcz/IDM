package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h2 f301867c = new h2();

    private h2() {
        super(171, 172);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `product_savings` ");
    }
}
