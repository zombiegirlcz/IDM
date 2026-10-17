package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f302020c = new u1();

    private u1() {
        super(160, 161);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `crypto_address_id` TEXT");
    }
}
