package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f283958c = new c();

    private c() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.delete("rev_points_transaction", null, null);
        db8.delete("rev_points_transaction_metadata", null, null);
    }
}
