package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f202389c = new c0();

    private c0() {
        super(126, CertificateBody.profileType);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `trading_trades` ADD COLUMN `transfer_request_id` TEXT");
    }
}
