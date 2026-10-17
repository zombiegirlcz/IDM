package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2 f301914c = new l2();

    private l2() {
        super(175, SyslogConstants.LOG_LOCAL6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `instrument_details`");
    }
}
