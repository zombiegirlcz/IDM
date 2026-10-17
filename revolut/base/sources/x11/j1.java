package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j1 f301890c = new j1();

    private j1() {
        super(ISO7816.TAG_SM_EXPECTED_LENGTH, SyslogConstants.LOG_LOCAL3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `trading_news` ");
    }
}
