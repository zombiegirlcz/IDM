package ce0;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f23332b;

    public c(String dbName, Class dbClass) {
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        Intrinsics.checkNotNullParameter(dbClass, "dbClass");
        this.f23331a = dbName;
        this.f23332b = dbClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RoomDatabase a(Context context, yk0.a databaseSessionProvider, Migration[] migrations, de0.a databaseEncryptionMigratorFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        return a.b(new b(context, this, migrations, databaseEncryptionMigratorFactory, databaseSessionProvider, 0));
    }
}
