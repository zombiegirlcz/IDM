package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f202526c = new z0();

    private z0() {
        super(147, 148);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP table IF EXISTS `disclosures`");
    }
}
