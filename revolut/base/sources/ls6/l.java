package ls6;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f199638c = new l();

    private l() {
        super(20, 21);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `orders` ADD COLUMN `payments` TEXT");
    }
}
