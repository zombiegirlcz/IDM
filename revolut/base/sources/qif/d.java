package qif;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import ip0.v7;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends Migration {
    public d() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        v7.B(supportSQLiteDatabase, "database", "ALTER TABLE extra_attributes\nADD COLUMN extra_attr_bill_account_id TEXT DEFAULT NULL", "UPDATE extra_attributes \nSET extra_attr_bill_account_id = json_extract(extra_attr_attrs, '$.billAccountId')");
    }
}
