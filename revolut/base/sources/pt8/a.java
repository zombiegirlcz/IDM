package pt8;

import com.revolut.feature.kyc.core.api.KycCoreApi$Toggles;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements mt8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f239630a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f239630a = featureToggleInteractor;
    }

    public final boolean a() {
        return ((d) this.f239630a).c(KycCoreApi$Toggles.RegisteredIdentityKycStatus.f77521c);
    }
}
