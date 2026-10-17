package qif;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends Migration {
    public c() {
        super(36, 37);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("ALTER TABLE extra_attributes\nADD COLUMN extra_attr_staking_info_reward INTEGER DEFAULT NULL");
            database.execSQL("UPDATE extra_attributes \nSET extra_attr_staking_info_reward = json_extract(extra_attr_attrs, '$.stakingInfoReward')");
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
