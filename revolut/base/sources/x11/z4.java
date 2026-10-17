package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z4 f302080c = new z4();

    private z4() {
        super(Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION, 230);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `recurring_payments` ADD COLUMN `receiverPayLaterEntity` TEXT");
    }
}
