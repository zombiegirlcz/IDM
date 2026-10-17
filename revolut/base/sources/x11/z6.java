package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z6 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z6 f302082c = new z6();

    private z6() {
        super(271, 272);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `provisional_refund` INTEGER DEFAULT NULL");
    }
}
