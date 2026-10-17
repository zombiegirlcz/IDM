package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jc extends Migration {
    public jc() {
        super(66, 67);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `transaction_category` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `color` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
