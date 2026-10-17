package qif;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends Migration {
    public a() {
        super(19, 20);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        database.execSQL("ALTER TABLE extra_attributes\nADD COLUMN extra_external_regulator_type TEXT DEFAULT NULL");
        database.setTransactionSuccessful();
        database.endTransaction();
    }
}
