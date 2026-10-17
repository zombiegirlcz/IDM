package u11;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f276327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yk0.a f276328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de0.a f276329c;
    public final Set d;

    public b(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory, ImmutableSet typeConverters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        this.f276327a = context;
        this.f276328b = databaseSessionProvider;
        this.f276329c = databaseEncryptionMigratorFactory;
        this.d = typeConverters;
    }
}
