package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f301841c = new f0();

    private f0() {
        super(CertificateBody.profileType, 128);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `statement_template_info` (\n                `id` TEXT NOT NULL, \n                `checkSum` TEXT NOT NULL, \n                `url` TEXT NOT NULL, \n                PRIMARY KEY(`id`))\n        ");
    }
}
