package ad9;

import com.revolut.feature.onboarding.api.user_migration.UserMigrationFeatureConfig;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements a99.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f3291a;

    public a(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f3291a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "user-migration");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new UserMigrationFeatureConfig.UserMigrationDestination(null, null), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new a08.d(this, 1), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
