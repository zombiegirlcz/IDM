package qif;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends Migration {
    public b() {
        super(33, 34);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.beginTransaction();
        try {
            db8.execSQL("ALTER TABLE extra_attributes\nADD COLUMN extra_attr_money_request_id TEXT DEFAULT NULL");
            db8.execSQL("ALTER TABLE extra_attributes\nADD COLUMN extra_attr_money_request_requester_id TEXT DEFAULT NULL");
            db8.execSQL("ALTER TABLE extra_attributes\nADD COLUMN extra_attr_money_request_requester_name TEXT DEFAULT NULL");
            db8.execSQL("ALTER TABLE extra_attributes\nADD COLUMN extra_attr_money_request_requester_code TEXT DEFAULT NULL");
            db8.execSQL("UPDATE extra_attributes \nSET extra_attr_money_request_id = json_extract(extra_attr_attrs, '$.moneyRequestId')");
            db8.setTransactionSuccessful();
        } finally {
            db8.endTransaction();
        }
    }
}
