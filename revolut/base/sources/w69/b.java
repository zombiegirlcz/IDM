package w69;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Migration {
    public b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.beginTransaction();
        db8.execSQL("ALTER TABLE `inbox_item` ADD COLUMN `viewCount` INTEGER DEFAULT null");
        db8.setTransactionSuccessful();
        db8.endTransaction();
    }
}
