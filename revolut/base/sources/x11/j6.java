package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j6 f301895c = new j6();

    private j6() {
        super(259, 260);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `joint_extra_internal` INTEGER DEFAULT NULL");
    }
}
