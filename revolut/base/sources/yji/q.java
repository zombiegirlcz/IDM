package yji;

import com.revolut.kompot.navigable.root.RootFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends com.revolut.kompot.navigable.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RootFlow f314529n;
    public final ecm.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mp.r f314530p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(RootFlow rootFlow, ecm.q activityLauncher, mp.r permissionsRequester, Integer num, aki.f controllersCache, uji.b hooksProvider) {
        super(g.f314514a, num, controllersCache, new wji.g(hooksProvider), null, null, null);
        Intrinsics.checkNotNullParameter(rootFlow, "rootFlow");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        Intrinsics.checkNotNullParameter(permissionsRequester, "permissionsRequester");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        Intrinsics.checkNotNullParameter(hooksProvider, "hooksProvider");
        this.f314529n = rootFlow;
        this.o = activityLauncher;
        this.f314530p = permissionsRequester;
        this.f98425m = hooksProvider;
    }

    @Override // com.revolut.kompot.navigable.b
    public final void d() {
        super.d();
        aki.f fVar = (aki.f) this.f98420c;
        fVar.f5962a.clear();
        fVar.f5963b.clear();
        fVar.d.clear();
        fVar.e.clear();
        fVar.f5964c.clear();
    }
}
