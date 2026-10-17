package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t4 f202495c = new t4();

    private t4() {
        super(96, 97);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `instruments` ADD COLUMN `promotion_campaigns` TEXT DEFAULT NULL");
    }
}
