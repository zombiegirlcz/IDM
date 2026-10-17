package f9l;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f132989c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "db", "ALTER TABLE `rates_cache` ADD COLUMN `last_available_rate` REAL", "UPDATE `rates_cache` SET `last_available_rate` = `rate` WHERE `rate` != -1.0");
    }
}
