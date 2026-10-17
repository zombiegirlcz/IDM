package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f279193c = new m();

    private m() {
        super(24, 25);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `vaults` ADD COLUMN `updatedDate` INTEGER DEFAULT NULL");
    }
}
