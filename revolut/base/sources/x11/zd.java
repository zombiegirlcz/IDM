package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zd extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zd f302085c = new zd();

    private zd() {
        super(86, 87);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `product_savings` (`id` TEXT NOT NULL, `depositInfo` TEXT NOT NULL, `protectionInfo` TEXT NOT NULL, `documents` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
