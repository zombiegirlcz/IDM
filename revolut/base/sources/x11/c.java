package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f301802c = new c();

    private c() {
        super(102, 103);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.A(supportSQLiteDatabase, "database", "CREATE TABLE IF NOT EXISTS `trading_news_banners` (`id` TEXT NOT NULL, `icon` TEXT, `title` TEXT NOT NULL, `subtitle` TEXT, `closeable` INTEGER NOT NULL, `uriActionEmbeddedEntity` TEXT, `contentActionEmbeddedEntity` TEXT, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_trading_news_banners_id` ON `trading_news_banners` (`id`)");
    }
}
