package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f301924c = new m1();

    private m1() {
        super(Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 155);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `recurring_payments` ADD COLUMN `receiverInfoRecurringBuy` TEXT");
    }
}
