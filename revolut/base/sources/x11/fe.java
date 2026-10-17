package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class fe extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fe f301850c = new fe();

    private fe() {
        super(90, 91);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "db", "\n            CREATE TABLE IF NOT EXISTS `instrument_details_new` \n            (`symbol` TEXT NOT NULL, \n            `description` TEXT, \n            `stats` TEXT, \n            PRIMARY KEY(`symbol`))\n            ", "\n            INSERT INTO instrument_details_new\n            SELECT * FROM instrument_details\n            ", "DROP TABLE instrument_details");
        supportSQLiteDatabase.execSQL("ALTER TABLE instrument_details_new RENAME TO instrument_details");
    }
}
