package ce0;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SupportHelper;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SupportSQLiteOpenHelper.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl0.f f23333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f23334b;

    public d(bl0.f databaseEncryptionMigrator) {
        Intrinsics.checkNotNullParameter(databaseEncryptionMigrator, "databaseEncryptionMigrator");
        this.f23333a = databaseEncryptionMigrator;
        this.f23334b = j.b(new androidx.lifecycle.b(this, 9));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = ((SupportOpenHelperFactory) this.f23334b.getValue()).create(configuration);
        Intrinsics.checkNotNullExpressionValue(supportSQLiteOpenHelperCreate, "create(...)");
        String str = configuration.name;
        if (str == null) {
            str = "";
        }
        return new g((SupportHelper) supportSQLiteOpenHelperCreate, str, configuration.context, this.f23333a);
    }
}
