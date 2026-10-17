package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f279189c = new i();

    private i() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `vaults` ADD COLUMN `workflowId` TEXT DEFAULT NULL");
    }
}
