package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f301804c = new c1();

    private c1() {
        super(146, 147);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("DELETE FROM `vaults` WHERE `members` IS NOT NULL");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
