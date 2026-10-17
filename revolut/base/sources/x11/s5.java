package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s5 f302001c = new s5();

    private s5() {
        super(Constants.TAG_F4, Constants.TAG_F5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `shops_brand_id` TEXT DEFAULT NULL");
    }
}
