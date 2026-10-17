package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f301972c = new q();

    private q() {
        super(114, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS collections (\n    `id` TEXT NOT NULL,\n    `title` TEXT NOT NULL,\n    `description` TEXT,\n    `backgroundImageLink` TEXT NOT NULL,\n    `avatarImageLink` TEXT NOT NULL,\n    `collections` TEXT,\n    `instruments` TEXT,\n    PRIMARY KEY (`id`)\n)");
    }
}
