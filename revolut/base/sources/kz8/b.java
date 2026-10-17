package kz8;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f191068c = new b();

    private b() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `courses` ADD COLUMN `tags` TEXT");
    }
}
