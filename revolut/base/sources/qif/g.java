package qif;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends Migration {
    public g() {
        super(52, 53);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("ALTER TABLE extra_attributes ADD COLUMN extra_attr_merchant_block_eligibility TEXT DEFAULT NULL");
            database.execSQL("INSERT INTO extra_attributes (\n    extra_attr_leg_id,\n    extra_attr_merchant_block_eligibility\n)\nSELECT\n    t.leg_id,\n    COALESCE(\n        m.merchant_block_eligibility,\n        CASE WHEN m.merchant_can_be_blocked = 1 THEN 'ALLOWED' END\n    )\nFROM transactions t\nJOIN merchants m ON m.merchant_table_key = t.merchant_key\nWHERE t.merchant_key IS NOT NULL\nAND NOT EXISTS (\n    SELECT 1 FROM extra_attributes e\n    WHERE e.extra_attr_leg_id = t.leg_id\n)");
            database.execSQL("UPDATE extra_attributes\nSET extra_attr_merchant_block_eligibility = (\n    SELECT COALESCE(\n        m.merchant_block_eligibility,\n        CASE WHEN m.merchant_can_be_blocked = 1 THEN 'ALLOWED' END\n    )\n    FROM transactions t\n    JOIN merchants m ON m.merchant_table_key = t.merchant_key\n    WHERE t.leg_id = extra_attributes.extra_attr_leg_id\n)\nWHERE extra_attr_leg_id IN (\n    SELECT leg_id FROM transactions WHERE merchant_key IS NOT NULL\n)");
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }
}
