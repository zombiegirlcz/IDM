package lud;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f200229c = new i();

    private i() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER table `staking_rewards` DROP COLUMN `date`");
    }
}
