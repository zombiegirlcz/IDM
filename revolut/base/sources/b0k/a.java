package b0k;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11679c = new a();

    private a() {
        super(10, 11);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP TABLE IF EXISTS `scoped_symbols`");
        db8.execSQL(t.e("\n                CREATE TABLE IF NOT EXISTS `scoped_symbols` (\n                    `scope` TEXT NOT NULL,\n                    `symbolType` TEXT NOT NULL,\n                    `symbol` TEXT NOT NULL,\n                    `ref` TEXT NOT NULL,\n                    `baseCurrency` TEXT NOT NULL,\n                    `name` TEXT,\n                    PRIMARY KEY(`scope`, `ref`)\n                )\n            "));
    }
}
