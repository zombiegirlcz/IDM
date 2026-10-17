package yf0;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f313110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(3, 4);
        this.f313110c = context;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `faq` ADD COLUMN `language` TEXT NOT NULL DEFAULT ''");
        database.execSQL("UPDATE `faq` SET `language` = '" + jh.d.d(this.f313110c).getLanguage() + "' WHERE `language` = ''");
        database.execSQL("CREATE UNIQUE INDEX `index_faq_key_placement_language` ON `faq` (`key`, `placement`, `language`)");
    }
}
