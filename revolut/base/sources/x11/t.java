package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f302009c = new t();

    private t() {
        super(LDSFile.EF_DG2_TAG, LDSFile.EF_DG4_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `institution_branch` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `institution_id` TEXT NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`institution_id`) REFERENCES `institutions`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
