package om4;

import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements ck4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3i.b f226656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb5.b f226657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ck4.b f226658c;
    public final ang.f d;

    public p(n3i.b externalCardsMapper, lb5.b creditCardAutopayInteractor, ck4.b autopaySourceProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        Intrinsics.checkNotNullParameter(creditCardAutopayInteractor, "creditCardAutopayInteractor");
        Intrinsics.checkNotNullParameter(autopaySourceProvider, "autopaySourceProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f226656a = externalCardsMapper;
        this.f226657b = creditCardAutopayInteractor;
        this.f226658c = autopaySourceProvider;
        this.d = userInteractor;
    }

    @Override // ck4.a
    public final efm.r a(AutoPayRepaymentDataRequest autoPayRepaymentDataRequest) {
        return rd0.e.c(vkm.q.q(xam.a.h(new oli.f(this, null, 2), zi0.c.i(autoPayRepaymentDataRequest))), kotlin.coroutines.g.f186406a);
    }
}
