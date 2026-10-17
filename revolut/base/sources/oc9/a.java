package oc9;

import com.revolut.feature.onboarding.api.qes_terms.QesTermsFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements y89.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f224131a;

    public a(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f224131a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "qes-terms");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(QesTermsFeatureConfig.QesTermsDestination.f78200a, null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pfm.z zVarD = new pfm.h(new i1i.a(this, 27), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
