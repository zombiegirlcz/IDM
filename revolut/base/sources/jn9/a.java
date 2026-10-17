package jn9;

import com.revolut.feature.payinstore.api.config.PayInStoreDestination;
import com.revolut.feature.payinstore.api.declaration.PayInStoreApi$Toggles;
import jf0.c;
import jte.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import q06.h;
import sri.m;
import ufm.b;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements dn9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f176660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f176661b;

    public a(gte.a featureToggle, m navigator) {
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f176660a = featureToggle;
        this.f176661b = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        if (!y.D(cVar, "deeplink", 1, "in-store") || d0.W(cVar.e(2))) {
            return false;
        }
        return ((d) this.f176660a).c(PayInStoreApi$Toggles.PayInStoreFeature.f79039c);
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new h(new PayInStoreDestination(cVar.e(2)), null);
    }

    @Override // jf0.d
    public final efm.d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!((d) this.f176660a).c(PayInStoreApi$Toggles.PayInStoreFeature.f79039c)) {
            b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (Intrinsics.f(deeplink.e(1), "in-store") && !d0.W(deeplink.e(2))) {
            return new pfm.h(new hc7.a(deeplink, this, 11), 2).f(efm.d0.m(Boolean.TRUE));
        }
        b bVarM2 = efm.d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
