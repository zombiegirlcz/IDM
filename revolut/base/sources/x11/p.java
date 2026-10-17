package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f301961c = new p();

    private p() {
        super(113, 114);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n            CREATE TABLE IF NOT EXISTS `recently_viewed_instrument` \n            (\n                `symbol` TEXT NOT NULL, \n                `last_seen` INTEGER NOT NULL,\n                PRIMARY KEY(`symbol`),\n                FOREIGN KEY(`symbol`) REFERENCES `instruments`(`symbol`) ON DELETE CASCADE\n            )\n            ");
    }
}
