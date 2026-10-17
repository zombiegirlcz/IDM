package lud;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f200225c = new e();

    private e() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `staking_rewards` (`pocketId` TEXT NOT NULL, `balance` TEXT NOT NULL, `date` INTEGER NOT NULL, `daysTillFirstReward` INTEGER, PRIMARY KEY(`pocketId`))");
    }
}
