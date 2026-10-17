package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f202509c = new w0();

    private w0() {
        super(SyslogConstants.LOG_LOCAL2, 145);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP TABLE IF EXISTS `portfolioSettings`");
    }
}
