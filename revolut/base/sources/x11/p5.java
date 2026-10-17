package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p5 f301967c = new p5();

    private p5() {
        super(Constants.TAG_TRANSACTION_DATA, 242);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `instalment_plan_apr` REAL DEFAULT NULL");
    }
}
