package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f301842c = new f1();

    private f1() {
        super(149, 150);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `recurring_payments` ADD COLUMN `receiverCreditEntity` TEXT");
    }
}
