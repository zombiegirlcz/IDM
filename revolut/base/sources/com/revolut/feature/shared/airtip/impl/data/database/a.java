package com.revolut.feature.shared.airtip.impl.data.database;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.shared.airtip.impl.data.database.AirTipDatabase;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AirTipDatabase.b f86032c;

    public a() {
        super(2, 3);
        this.f86032c = new AirTipDatabase.b();
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `air_tip_animation_state`");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `air_tip_state` (`air_tip_id` TEXT NOT NULL, `air_tip_type` TEXT NOT NULL, `was_clicked` INTEGER NOT NULL, `has_animated` INTEGER NOT NULL, `expiration_date` INTEGER NOT NULL, PRIMARY KEY(`air_tip_id`, `air_tip_type`))");
        this.f86032c.onPostMigrate(sQLiteConnection);
    }
}
