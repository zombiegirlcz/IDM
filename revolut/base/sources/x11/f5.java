package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f5 f301845c = new f5();

    private f5() {
        super(Constants.TAG_USB_CAPABILITY, Constants.TAG_EMV_ICC_CONFIG_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `transactions` ADD COLUMN `card_disposable` INTEGER DEFAULT NULL");
    }
}
