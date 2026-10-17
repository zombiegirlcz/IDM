package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f301803c = new c0();

    private c0() {
        super(124, ISO781611.SMT_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `trading_orders` ADD COLUMN `targetPrice` TEXT DEFAULT NULL");
    }
}
