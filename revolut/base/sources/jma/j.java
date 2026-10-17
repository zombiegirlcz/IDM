package jma;

import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfileDetailsConfirmationBEDrivenUserDetails;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f176506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f176507b;

    public j(gte.a featureToggleInteractor, sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f176506a = navigator;
        this.f176507b = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "profile-details-confirmation");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(((jte.d) this.f176507b).c(ProfileApi$Toggles$ProfileDetailsConfirmationBEDrivenUserDetails.f81316c) ? UserDetailsDestination.f26226a : u0.b(gc0.c.f(ProfileFeatureConfig.DetailsConfirmation.f81346a)), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        f0 f0VarF = new pfm.h(new i1i.a(this, 6), 2).f(d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return ue0.e.F(f0VarF, Boolean.FALSE);
    }
}
