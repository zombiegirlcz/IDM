package ma;

import cli.y;
import com.feature.navigation.hub.impl.ui.hub.NavigationHubControllerContract$InputData;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class u extends oki.h implements dli.b {
    public final ja.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NavigationHubControllerContract$InputData f203860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f203861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f203862r;

    public u(q stateMapper, ja.b navigationHubRepository, NavigationHubControllerContract$InputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(navigationHubRepository, "navigationHubRepository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.o = navigationHubRepository;
        this.f203860p = inputData;
        this.f203861q = transactionsInteractor;
        this.f203862r = mra.d.b(this, new g(new Data(null, null, true, 3, null), f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String id10 = this.f203860p.f26224a;
        ja.b bVar = this.o;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = bVar.e.b(id10, loadingStrategy);
        Continuation continuation = null;
        yji.l.a1(this, dVarB, new s(this, continuation, 0), null, new s(this, continuation, 1), 2);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new t(this, null, 1), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203862r;
    }
}
