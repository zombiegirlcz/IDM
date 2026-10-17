package ga3;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f142058c = new a();

    private a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `revolut_card_sca_counters`", "CREATE TABLE IF NOT EXISTS `revolut_card_sca_counters` (`cardId` TEXT NOT NULL, `contactlessCounter` TEXT NOT NULL, PRIMARY KEY(`cardId`))");
    }
}
