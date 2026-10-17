package crk;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f108400c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("CREATE TABLE IF NOT EXISTS `stock_financials_statements` (`symbol` TEXT NOT NULL, `type` TEXT NOT NULL, `year` INTEGER NOT NULL, `quarter` INTEGER, `statementItems` TEXT NOT NULL, `quarterId` TEXT NOT NULL, PRIMARY KEY(`symbol`, `type`, `year`, `quarterId`))");
    }
}
