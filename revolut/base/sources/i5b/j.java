package i5b;

import akg.n;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import i4h.q;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends h2b.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a2b.b f158803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f158804m;

    public j(a2b.b cfdOnboardingConfigProvider, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(cfdOnboardingConfigProvider, "cfdOnboardingConfigProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f158803l = cfdOnboardingConfigProvider;
        this.f158804m = wealthAccountsInteractor;
    }

    @Override // h2b.d
    public final n Z2() {
        return nim.a.v(m.a(this.f158804m, WealthAccountType.MARGIN), new q(15));
    }
}
