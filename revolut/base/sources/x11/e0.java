package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f301826c = new e0();

    private e0() {
        super(126, CertificateBody.profileType);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "ALTER TABLE `trading_orders` ADD COLUMN `timeInForce` TEXT NOT NULL DEFAULT ''", "UPDATE `trading_orders` SET `timeInForce` = 'DAY';");
    }
}
