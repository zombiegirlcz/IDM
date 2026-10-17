package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f202503c = new v0();

    private v0() {
        super(143, SyslogConstants.LOG_LOCAL2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP table IF EXISTS `trading_banners`");
    }
}
