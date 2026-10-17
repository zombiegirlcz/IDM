package dek;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.retail.feature.pod_nominees.impl.data.database.PodNomineesDatabase;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e implements e4m.e {
    public static PodNomineesDatabase a(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        PodNomineesDatabase podNomineesDatabase = (PodNomineesDatabase) PodNomineesDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[0], databaseEncryptionMigratorFactory);
        s.k(podNomineesDatabase);
        return podNomineesDatabase;
    }
}
