package udd;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f279197c = new q();

    private q() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("DROP TABLE IF EXISTS 'product_savings'");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
