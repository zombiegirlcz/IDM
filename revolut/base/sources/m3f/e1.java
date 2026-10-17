package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f202402c = new e1();

    private e1() {
        super(ISO7816.TAG_SM_EXPECTED_LENGTH, SyslogConstants.LOG_LOCAL3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `account_holder_type` TEXT NOT NULL DEFAULT 'PERSONAL'");
    }
}
