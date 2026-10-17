package fb7;

import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 extends oki.h implements b0 {
    public final HiddenAccountsListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.t f133477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dsh.h f133478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wa7.m f133479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ib7.d f133480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r10.d f133481t;
    public final j2 u;
    public final cli.y v;

    public i0(a3e.u stateMapper, HiddenAccountsListScreenContract$InputData inputData, r10.t hiddenAccountsEventsHandlerManager, dsh.h hiddenAccountsDataProviderManager, wa7.m hiddenAccountsInteractor, ib7.d dialogMapper, r10.d hideableAccountsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(hiddenAccountsEventsHandlerManager, "hiddenAccountsEventsHandlerManager");
        Intrinsics.checkNotNullParameter(hiddenAccountsDataProviderManager, "hiddenAccountsDataProviderManager");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(hideableAccountsProvider, "hideableAccountsProvider");
        this.o = inputData;
        this.f133477p = hiddenAccountsEventsHandlerManager;
        this.f133478q = hiddenAccountsDataProviderManager;
        this.f133479r = hiddenAccountsInteractor;
        this.f133480s = dialogMapper;
        this.f133481t = hideableAccountsProvider;
        this.u = vkm.q.c(inputData.f74671c ? qfe.j.f245295a : qfe.i.f245294a);
        this.v = mra.d.b(this, new j(m.f133490a, inputData.f74669a, inputData.f74670b, inputData.f74671c, zhm.h0.f322473a, null, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.u, new f5h.b(continuation, this, 3)), null, new f9d.c(this, continuation, 4), 3);
        r10.d dVar = this.f133481t;
        yji.l.b1(this, new ie7.h(((qfe.m) dVar.f250818a).a(sfe.a.CACHE_ONLY, qfe.j.f245295a), dVar, 9), null, new a2g.q(this, (Continuation) null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
