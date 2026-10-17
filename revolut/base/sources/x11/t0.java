package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f302010c = new t0();

    private t0() {
        super(139, 140);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `current_product` ADD COLUMN `limitUnit` TEXT DEFAULT NULL");
    }
}
