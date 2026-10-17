package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u4 f302023c = new u4();

    private u4() {
        super(BERTags.FLAGS, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `contact` ADD COLUMN `appMode` TEXT NOT NULL DEFAULT ''", "ALTER TABLE `remote_contacts` ADD COLUMN `appMode` TEXT NOT NULL DEFAULT ''");
    }
}
