package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class u extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f302019c = new u();

    private u() {
        super(LDSFile.EF_DG4_TAG, LDSFile.EF_SOD_TAG);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `candle_sticks`", "\n                CREATE TABLE IF NOT EXISTS `candle_sticks`(\n                    `symbol` TEXT NOT NULL,\n                    `period` TEXT NOT NULL,\n                    `open` TEXT NOT NULL,\n                    `close` TEXT NOT NULL,\n                    `high` TEXT NOT NULL,\n                    `low` TEXT NOT NULL,\n                    `volume` TEXT NOT NULL,\n                    `from` INTEGER NOT NULL,\n                    `to` INTEGER NOT NULL,\n                    `startClose` TEXT NOT NULL,\n                    `endClose` TEXT NOT NULL,\n                    PRIMARY KEY(`symbol`, `period`, `from`),\n                    FOREIGN KEY(`symbol`) REFERENCES `instruments`(`symbol`) ON UPDATE NO ACTION ON DELETE CASCADE\n                )\n        ");
    }
}
