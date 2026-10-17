package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f302061c = new y();

    private y() {
        super(SyslogConstants.LOG_CLOCK, 121);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `product_savings` ADD COLUMN `onboarding` TEXT DEFAULT NULL");
    }
}
