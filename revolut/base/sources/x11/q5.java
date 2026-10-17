package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q5 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q5 f301977c = new q5();

    private q5() {
        super(242, Constants.TAG_F3_BUILD_CONFIGURATION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase originalDb) {
        Intrinsics.checkNotNullParameter(originalDb, "originalDb");
        v77.a aVar = new v77.a(zhm.v.k("DROP TABLE IF EXISTS \"contact\"", "DROP TABLE IF EXISTS \"remote_contacts\"", "DROP INDEX IF EXISTS \"index_remote_contacts_username\"", "DROP TABLE IF EXISTS \"virtual_contacts\"", "DROP INDEX IF EXISTS \"index_virtual_contacts_point\""), 29);
        try {
            originalDb.beginTransaction();
            aVar.invoke(originalDb);
            originalDb.setTransactionSuccessful();
        } finally {
            try {
            } finally {
                try {
                    originalDb.endTransaction();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
