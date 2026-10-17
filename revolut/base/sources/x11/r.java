package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f301986c = new r();

    private r() {
        super(ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, 116);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("\n                CREATE TABLE IF NOT EXISTS `candle_sticks`(\n                    `symbol` TEXT NOT NULL,\n                    `period` TEXT NOT NULL,\n                    `open` TEXT NOT NULL,\n                    `close` TEXT NOT NULL,\n                    `high` TEXT NOT NULL,\n                    `low` TEXT NOT NULL,\n                    `volume` TEXT NOT NULL,\n                    `from` INTEGER NOT NULL,\n                    `to` INTEGER NOT NULL,\n                    PRIMARY KEY(`symbol`, `period`, `from`), \n                    FOREIGN KEY(`symbol`) REFERENCES `instruments`(`symbol`) ON UPDATE NO ACTION ON DELETE CASCADE \n                )\n            ");
    }
}
