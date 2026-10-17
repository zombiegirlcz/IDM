package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f302039c = new w0();

    private w0() {
        super(140, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        wp5.y.z(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS collections_copy (\n    `id` TEXT NOT NULL,\n    `assetType` TEXT NOT NULL DEFAULT \"COLLECTIONS_STOCKS\",\n    `title` TEXT NOT NULL,\n    `description` TEXT,\n    `backgroundImageLink` TEXT NOT NULL,\n    `avatarImageLink` TEXT NOT NULL,\n    `collections` TEXT,\n    `instruments` TEXT,\n    PRIMARY KEY (`id`, `assetType`)\n)", "INSERT INTO collections_copy(\n    `id`,\n    `title`,\n    `description`,\n    `backgroundImageLink`,\n    `avatarImageLink`,\n    `collections`,\n    `instruments`\n)\nSELECT \n    `id`, \n    `title`,\n    `description`,\n    `backgroundImageLink`,\n    `avatarImageLink`,\n    `collections`,\n    `instruments`\nFROM collections", "DROP TABLE collections");
        wp5.y.y(supportSQLiteDatabase, "ALTER TABLE collections_copy\nRENAME TO collections");
    }
}
