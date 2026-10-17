package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m4 f301927c = new m4();

    private m4() {
        super(Constants.TAG_BOOT_LOADER_CHECKSUM, Constants.TAG_KSL_ID);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `is_business_transaction` INTEGER DEFAULT NULL");
    }
}
