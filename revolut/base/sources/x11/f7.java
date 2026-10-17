package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f7 f301847c = new f7();

    private f7() {
        super(277, 278);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `referral_invite_id` TEXT DEFAULT NULL");
    }
}
