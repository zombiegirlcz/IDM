package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.StandardBiometricHeader;

/* JADX INFO: loaded from: classes.dex */
public final class h6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h6 f301871c = new h6();

    private h6() {
        super(StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE, 258);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `paymentType` TEXT DEFAULT NULL");
    }
}
