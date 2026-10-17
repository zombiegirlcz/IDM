package so5;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f264785c = new j();

    private j() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `crypto_wallets` (`id` TEXT NOT NULL, `address` TEXT NOT NULL, `addressType` TEXT NOT NULL, `recipientDetails` TEXT, `linkedBeneficiaries` TEXT NOT NULL, `isHidden` INTEGER NOT NULL DEFAULT 0, `status` TEXT NOT NULL, `limits` TEXT, `label` TEXT, PRIMARY KEY(`id`))");
    }
}
