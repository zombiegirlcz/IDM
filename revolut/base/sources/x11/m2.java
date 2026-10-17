package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m2 f301925c = new m2();

    private m2() {
        super(SyslogConstants.LOG_LOCAL6, 177);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("DROP TABLE IF EXISTS `current_product`");
    }
}
