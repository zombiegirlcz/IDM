package pj4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreenContract$InputData;
import ft3.j1;
import hw3.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p24.v;
import p24.w;
import pfk.o0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    private static final j Companion = new j();
    public final WaitingListV3DashboardScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f236671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r05.e f236672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f236673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q06.l f236674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f236675t;

    public k(WaitingListV3DashboardScreenContract$InputData inputData, n creditWaitingListInteractor, r05.e creditScoreEntryPointInteractor, ang.f userInteractor, q06.l deeplinkRouter, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditWaitingListInteractor, "creditWaitingListInteractor");
        Intrinsics.checkNotNullParameter(creditScoreEntryPointInteractor, "creditScoreEntryPointInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f236671p = creditWaitingListInteractor;
        this.f236672q = creditScoreEntryPointInteractor;
        this.f236673r = userInteractor;
        this.f236674s = deeplinkRouter;
        this.f236675t = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        j1 productType = this.o.f68530a;
        n nVar = this.f236671p;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(productType, "productType");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        v vVar = nVar.f156081a;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = 3;
        Continuation continuation = null;
        yji.l.b1(this, nim.a.v(u0.i(vVar.d.b(new w(productType), loadingStrategy), rd0.e.e(n14.k.p(nim.a.v(this.f236672q.a(), new pij.d(25)), new pij.d(26)), h0.f322473a, new pc2.d(i, 1, continuation)), new vkm.y(n14.k.p(nim.a.v(this.f236673r.j(w4l.j.f294644c), new pij.d(23)), new pij.d(24)), new pc2.d(i, 2, continuation))), new pij.d(22)), null, new o0(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236675t;
    }
}
