package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c5 f301806c = new c5();

    private c5() {
        super(230, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `chargeback_eligible` INTEGER DEFAULT NULL");
    }
}
