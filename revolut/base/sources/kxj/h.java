package kxj;

import bjl.n;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements com.revolut.retail.feature.api.userauth.navigation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f190592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f190593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0j.b f190594c;

    public h(d0 juniorPersonalisationInteractor, b userOnboardingConfigDataProvider, r0j.b combinedAuthenticationStateProvider) {
        Intrinsics.checkNotNullParameter(juniorPersonalisationInteractor, "juniorPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingConfigDataProvider, "userOnboardingConfigDataProvider");
        Intrinsics.checkNotNullParameter(combinedAuthenticationStateProvider, "combinedAuthenticationStateProvider");
        this.f190592a = juniorPersonalisationInteractor;
        this.f190593b = userOnboardingConfigDataProvider;
        this.f190594c = combinedAuthenticationStateProvider;
    }

    public static UserAuthFeatureConfig.UseCase.CombinedAuthentication b(a aVar, r0j.a aVar2, boolean z, boolean z3, n nVar) {
        p0j.a aVar3;
        String str = aVar.f190581a;
        String str2 = aVar.f190582b;
        int i = g.f190591a[aVar2.ordinal()];
        if (i == 1) {
            aVar3 = p0j.a.TWO_BUTTONS_UI;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar3 = p0j.a.UNIFIED_UI;
        }
        return new UserAuthFeatureConfig.UseCase.CombinedAuthentication(str, str2, aVar3, z, z3, nVar);
    }
}
