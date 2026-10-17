package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m9 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m9 f301931c = new m9();

    private m9() {
        super(350, 351);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `collection_trading_icon` TEXT DEFAULT NULL");
    }
}
