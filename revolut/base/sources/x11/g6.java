package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.StandardBiometricHeader;

/* JADX INFO: loaded from: classes.dex */
public final class g6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g6 f301857c = new g6();

    private g6() {
        super(256, StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `merchant_merchantId` TEXT DEFAULT NULL");
    }
}
