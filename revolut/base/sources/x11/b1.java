package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f301793c = new b1();

    private b1() {
        super(145, 146);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `vaults_interactions` (`id` TEXT NOT NULL, `lastOpenedTimeMillis` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
