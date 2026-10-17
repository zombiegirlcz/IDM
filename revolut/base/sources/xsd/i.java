package xsd;

import frd.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import wsg.n;
import xq3.j;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f308458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f308459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y45.i f308460c;
    public final y45.h d;
    public final e e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.f f308461g;

    public i(n walletInteractor, ppk.f ratesInteractor, y45.i loanProductInteractor, y45.h loanProductFeatureTogglesInteractor, e loanNetWorthProductMapper, j creditApplicationInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(loanNetWorthProductMapper, "loanNetWorthProductMapper");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f308458a = walletInteractor;
        this.f308459b = ratesInteractor;
        this.f308460c = loanProductInteractor;
        this.d = loanProductFeatureTogglesInteractor;
        this.e = loanNetWorthProductMapper;
        this.f = creditApplicationInteractor;
        this.f308461g = userInteractor;
    }

    @Override // frd.k
    public final Flow b() {
        return xam.a.h(new rf9.h((Continuation) null, this, 24), this.d.j());
    }
}
