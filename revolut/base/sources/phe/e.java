package phe;

import g48.r0;
import jhe.l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vge.c1;
import vkm.q;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f236287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f236288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f236289c;

    public e(c1 productDataSourcesInteractor, r0 jointAccountsInteractor, l onHoldDecorator) {
        Intrinsics.checkNotNullParameter(productDataSourcesInteractor, "productDataSourcesInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(onHoldDecorator, "onHoldDecorator");
        this.f236287a = productDataSourcesInteractor;
        this.f236288b = jointAccountsInteractor;
        this.f236289c = onHoldDecorator;
    }

    @Override // phe.b
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return q.Q(k38.c.a(this.f236288b, w4l.h.f294642c, null, 2), new om4.r0(null, this, dataLoadingMode, 5));
    }
}
