package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s8 f302004c = new s8();

    private s8() {
        super(310, 311);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `joint_initiator_code` TEXT DEFAULT NULL");
    }
}
