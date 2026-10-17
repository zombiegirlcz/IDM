package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f202496c = new u();

    private u() {
        super(LDSFile.EF_SOD_TAG, SyslogConstants.LOG_CLOCK);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `instruments` ADD COLUMN `typeSpecificProperties` TEXT DEFAULT NULL");
    }
}
