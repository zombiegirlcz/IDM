package rmb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import r10.r;
import vkm.j2;
import vkm.t0;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends oki.h implements c {
    public final ijb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f255231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f255232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fkg.a f255233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f255234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f255235t;
    public final sfk.a u;
    public final j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f255236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f255237x;

    public q(ijb.a savingsProductInteractor, wsg.n walletInteractor, t pricingPlanInteractor, fkg.a savingsUpgradesInteractor, r infoSheetDeeplinkHandler, x deeplinkHandler, sfk.a pricingPlanChangeObservable, l stateMapper) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(savingsUpgradesInteractor, "savingsUpgradesInteractor");
        Intrinsics.checkNotNullParameter(infoSheetDeeplinkHandler, "infoSheetDeeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsProductInteractor;
        this.f255231p = walletInteractor;
        this.f255232q = pricingPlanInteractor;
        this.f255233r = savingsUpgradesInteractor;
        this.f255234s = infoSheetDeeplinkHandler;
        this.f255235t = deeplinkHandler;
        this.u = pricingPlanChangeObservable;
        this.v = vkm.q.c(null);
        this.f255236w = new vii.b();
        this.f255237x = mra.d.b(this, new a(new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f255236w, new n(0, continuation, this)), null, null, new o(0, continuation, this), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.s(new t0(this.v, 1), new h0() { // from class: rmb.p
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((SavingsProductData) obj2).f86683a.f86617a;
            }
        }, vkm.q.f290100b), new n(1, continuation, this)), null, null, new o(1, continuation, this), 3);
        yji.l.a1(this, rd0.e.b(this.u.a()), null, null, new rbh.k(this, continuation, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f255237x;
    }
}
