package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ge extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ge f301863c = new ge();

    private ge() {
        super(91, 92);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER table `vaults` ADD COLUMN `deadline` INTEGER");
    }
}
