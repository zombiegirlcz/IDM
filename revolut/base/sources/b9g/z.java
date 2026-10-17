package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f13779c = new z();

    private z() {
        super(33, 34);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `hotels_location` ADD COLUMN `imageUrl` TEXT");
    }
}
