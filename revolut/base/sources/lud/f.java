package lud;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f200226c = new f();

    private f() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS unstaking_data (`id` TEXT NOT NULL, `startDate` INTEGER NOT NULL, `state` TEXT NOT NULL, `productId` TEXT NOT NULL, `estimatedEndDate` INTEGER, PRIMARY KEY(`id`))");
    }
}
