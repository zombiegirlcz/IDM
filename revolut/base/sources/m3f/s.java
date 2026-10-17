package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f202484c = new s();

    private s() {
        super(LDSFile.EF_DG2_TAG, LDSFile.EF_DG4_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "db", "DROP TABLE IF EXISTS `recently_viewed_instrument`", "CREATE TABLE IF NOT EXISTS `recently_viewed_instrument` (`ref` TEXT NOT NULL, `last_seen` INTEGER NOT NULL, PRIMARY KEY(`ref`))");
    }
}
