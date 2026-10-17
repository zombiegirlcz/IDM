package vha;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tfm.n4;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x79.a f289369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f289370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f289371c;
    public final wa7.m d;

    public h1(x79.a onHoldAccountInteractor, s proAccountsInteractor, t0 proAccountsProductMapper, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(proAccountsProductMapper, "proAccountsProductMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f289369a = onHoldAccountInteractor;
        this.f289370b = proAccountsInteractor;
        this.f289371c = proAccountsProductMapper;
        this.d = hiddenAccountsInteractor;
    }

    @Override // pfe.g
    public final Flow a() {
        return ((et6.l0) this.f289370b.f289427a).m();
    }

    @Override // pfe.g
    public final boolean b() {
        return true;
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        s sVar = this.f289370b;
        sVar.f289435n.setValue(dataLoadingMode);
        efm.r rVarB = sVar.b(dataLoadingMode);
        efm.r rVarA = sVar.a(dataLoadingMode);
        cxe.u uVarE = ((d89.g) this.f289369a).e(z79.b.PRO);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC = rd0.e.c(uVarE, gVar);
        n4 pendingAmountObservable = sVar.o;
        Intrinsics.checkNotNullExpressionValue(pendingAmountObservable, "pendingAmountObservable");
        return rd0.e.b(nim.a.w(mif.a.g(rVarB, rVarA, rVarC, pendingAmountObservable, rd0.e.c(new ahe.l(this.d.k(), 25), gVar)), new vh2.j(this, 2)));
    }
}
