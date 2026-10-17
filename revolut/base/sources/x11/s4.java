package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s4 f302000c = new s4();

    private s4() {
        super(222, PassportService.DEFAULT_MAX_BLOCKSIZE);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "DROP TABLE IF EXISTS `trading_news_banners`", "DROP INDEX IF EXISTS `index_trading_news_banners_id`");
    }
}
