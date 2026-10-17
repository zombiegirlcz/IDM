package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f301779c = new a1();

    private a1() {
        super(SyslogConstants.LOG_LOCAL2, 145);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `savingsVaultsBonus` INTEGER");
    }
}
