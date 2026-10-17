package cbh;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;
import vkm.o2;
import vkm.q0;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x8h.q f22831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l80.e f22832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fkg.a f22833n;
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InvestTransactionsFilter f22834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f22835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f22836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f22837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22838t;
    public boolean u;
    public final vki.a v;

    public n0(InvestTransactionsListContract$InputData inputData, x8h.q investTransactionsInteractor, l80.e dateProvider, fkg.a nextPageTokenResolver, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investTransactionsInteractor, "investTransactionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(nextPageTokenResolver, "nextPageTokenResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f22831l = investTransactionsInteractor;
        this.f22832m = dateProvider;
        this.f22833n = nextPageTokenResolver;
        this.o = featureToggleInteractor;
        InvestTransactionsFilter investTransactionsFilter = inputData.f95365a;
        this.f22834p = investTransactionsFilter;
        this.f22835q = new o(new z2f.f(investTransactionsFilter));
        this.f22836r = vkm.q.b(0, 7, null);
        this.f22837s = te0.w.y0(new a0(this, 0));
        this.v = pyd.c.a(this, new l(null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void D2() {
        if (((Boolean) this.f22837s.getValue()).booleanValue()) {
            return;
        }
        yji.n.j2(this, new q0(new ba4.x(new o2(this.f22836r, new a35.j(2, 10, null)), this, 19), new c84.y(this, null, 6), 1), null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        if (!((Boolean) this.f22837s.getValue()).booleanValue() && this.f22838t) {
            V2(new l0(this, null, 0), new yi5.b(29));
        }
    }

    @Override // cbh.k
    public final void Z2() {
        if (!this.f22838t || this.u) {
            return;
        }
        T2(new l0(this, null, 1), new yi5.b(27));
    }

    @Override // cbh.k
    public final void b3() {
        T2(new l0(this, null, 2), new yi5.b(27));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.v;
    }
}
