package et6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.x f129388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.w f129389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f129390c;
    public final l80.e d;

    public z(au6.x repository, r10.w exchangeRatesProvider, wsg.n walletInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(exchangeRatesProvider, "exchangeRatesProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f129388a = repository;
        this.f129389b = exchangeRatesProvider;
        this.f129390c = walletInteractor;
        this.d = dateProvider;
    }

    public final vkm.d a(AcquiringPaymentsQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.d0 d0Var = (au6.d0) this.f129388a;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return d0Var.e.b(query, loadingStrategy);
    }
}
