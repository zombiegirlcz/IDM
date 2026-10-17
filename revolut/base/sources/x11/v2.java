package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v2 f302033c = new v2();

    private v2() {
        super(183, SyslogConstants.LOG_LOCAL7);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `revolut_card_sca_counters`");
    }
}
