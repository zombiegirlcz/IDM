package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f301974c = new q1();

    private q1() {
        super(ISO781611.SMT_DO_DS, 159);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instruments` ADD COLUMN `shortOverview` TEXT DEFAULT NULL");
    }
}
