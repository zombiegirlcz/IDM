package b9g;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f13774c = new u();

    private u() {
        super(29, 30);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "DROP TABLE `hotels_filter`", "DROP TABLE `hotels_price_range`", "DROP TABLE `hotels_property_type`");
        supportSQLiteDatabase.execSQL("DELETE FROM `hotels_recent_property_searches`");
    }
}
