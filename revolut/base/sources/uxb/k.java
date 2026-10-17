package uxb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f283966c = new k();

    private k() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.B(supportSQLiteDatabase, "db", "ALTER TABLE `rev_points_transaction` ADD COLUMN `originResource` TEXT;", "ALTER TABLE `rev_points_transaction` ADD COLUMN `originResourceType` TEXT;", "ALTER TABLE `rev_points_transaction` ADD COLUMN `receivedAmount` TEXT;");
    }
}
