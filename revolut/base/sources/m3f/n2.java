package m3f;

import android.database.Cursor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class n2 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n2 f202457c = new n2();

    private n2() {
        super(43, 44);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) throws IOException {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `portfolio_headers`\n(\n    `id` TEXT NOT NULL,\n    `state` TEXT NOT NULL,\n    `onboardedDate` INTEGER,\n    `offboardedDate` INTEGER,\n    PRIMARY KEY(`id`)\n)");
        database.execSQL("ALTER TABLE `portfolios`\nADD COLUMN `legacy` INTEGER NOT NULL DEFAULT 1");
        Cursor cursorQuery = database.query("SELECT id FROM portfolios ORDER BY ROWID DESC LIMIT 1");
        try {
            String string = (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? null : cursorQuery.getString(0);
            cursorQuery.close();
            n2 n2Var = f202457c;
            if (string == null) {
                n2Var.getClass();
                database.execSQL("DROP TABLE `holdings`");
                database.execSQL("CREATE TABLE IF NOT EXISTS `holdings` (\n    `id` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `creation_date` INTEGER,\n    `holding_state` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `currency` TEXT NOT NULL, \n    `cash_holding` TEXT,\n    `stock_holding` TEXT,\n    PRIMARY KEY(`id`, `portfolio_id`)\n)");
                database.execSQL("DELETE FROM `account_closure_backend_requested`");
                database.execSQL("ALTER TABLE `account_closure_backend_requested`\nADD COLUMN `legacy` INTEGER NOT NULL DEFAULT 0");
                database.execSQL("ALTER TABLE `account_closure_backend_requested`\nADD COLUMN `portfolio_id` TEXT NOT NULL DEFAULT \"\"");
                return;
            }
            n2Var.getClass();
            database.execSQL(kotlin.text.t.e("\n            ALTER TABLE `holdings`\n            ADD COLUMN `portfolio_id` TEXT NOT NULL DEFAULT '" + string + "'\n        "));
            prk.o.D(database, "CREATE TABLE IF NOT EXISTS `tmp_holdings` (\n    `id` TEXT NOT NULL,\n    `portfolio_id` TEXT NOT NULL,\n    `creation_date` INTEGER,\n    `holding_state` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `currency` TEXT NOT NULL, \n    `cash_holding` TEXT,\n    `stock_holding` TEXT,\n    PRIMARY KEY(`id`, `portfolio_id`)\n)", "INSERT INTO `tmp_holdings`\nSELECT  `id`, `portfolio_id`, `creation_date`, `holding_state`, `name`, `currency`, `cash_holding`, `stock_holding`\nFROM `holdings`", "DROP TABLE `holdings`", "ALTER TABLE `tmp_holdings`\nRENAME TO `holdings`");
            database.execSQL("ALTER TABLE `account_closure_backend_requested`\nADD COLUMN `legacy` INTEGER NOT NULL DEFAULT 1");
            database.execSQL(kotlin.text.t.e("\n            ALTER TABLE `account_closure_backend_requested`\n            ADD COLUMN `portfolio_id` TEXT NOT NULL DEFAULT '" + string + "'\n        "));
        } finally {
        }
    }
}
