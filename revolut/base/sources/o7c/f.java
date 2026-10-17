package o7c;

import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayPendingCashbackDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f222756a;

    public f(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f222756a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "revolut-pay") && Intrinsics.f(cVar.e(2), "cash-reward");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(RevolutPayFeatureConfig$RevolutPayPendingCashbackDestination.f84293a, null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        if (y.D(cVar, "deeplink", 1, "revolut-pay") && Intrinsics.f(cVar.e(2), "cash-reward")) {
            f0 f0VarF = new pfm.h(new i1i.a(this, 25), 2).f(d0.m(Boolean.TRUE));
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            return f0VarF;
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
