package vq8;

import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f291358a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f291358a = featureToggleInteractor;
    }

    public final jq9.a a() {
        return ((d) this.f291358a).c(JuniorCoreApi$Toggles.PaymentsWithAllJunior.f76895c) ? jq9.a.ALL : jq9.a.ONLY_OWNED;
    }
}
