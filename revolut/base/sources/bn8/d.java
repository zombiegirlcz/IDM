package bn8;

import bi2.n;
import bn4.y;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.junior_savings.api.navigation.JuniorSavingFeatureConfig;
import j49.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import te8.r;
import w4l.h;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements xm8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj8.a f17123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xcd.a f17124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an8.b f17125c;
    public final r d;

    public d(hj8.a juniorProfileInteractor, xcd.a savingsRequestInteractor, an8.b juniorSavingProductInteractor, r juniorCoreSavingsProductInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(savingsRequestInteractor, "savingsRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        Intrinsics.checkNotNullParameter(juniorCoreSavingsProductInteractor, "juniorCoreSavingsProductInteractor");
        this.f17123a = juniorProfileInteractor;
        this.f17124b = savingsRequestInteractor;
        this.f17125c = juniorSavingProductInteractor;
        this.d = juniorCoreSavingsProductInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof a;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return e.e(mo3.a.g(zi0.c.w(xam.a.h(new b(this, null), xam.a.h(new n(this, null, 11), ((nj8.n) this.f17123a).k(null, h.f294642c)))), null, new y(1), 1), h0.f322473a, new c(3, null));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.junior_savings.impl.pending_action.JuniorSavingRequestPendingActionDelegateImpl.RequestPendingActionPayload");
        rcd.a aVar = ((a) obj2).f17121a;
        return new j49.b(new JuniorSavingFeatureConfig.SavingReview(aVar.f253250a, aVar.f253251b).f98274b);
    }
}
