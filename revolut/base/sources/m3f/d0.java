package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f202395c = new d0();

    private d0() {
        super(CertificateBody.profileType, 128);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `entities_adt` ADD COLUMN `trade_executed_price` TEXT");
    }
}
