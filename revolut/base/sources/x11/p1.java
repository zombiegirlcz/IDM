package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f301963c = new p1();

    private p1() {
        super(157, ISO781611.SMT_DO_DS);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `insurance` ADD COLUMN `subtypes` TEXT NOT NULL DEFAULT '[]'");
    }
}
