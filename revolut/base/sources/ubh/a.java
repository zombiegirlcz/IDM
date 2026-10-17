package ubh;

import akg.n;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;
import rbh.b;
import t1h.i;
import u6b.k;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f278896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f278897b;

    public a(i withdrawMoneyPortfolioInfoProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(withdrawMoneyPortfolioInfoProvider, "withdrawMoneyPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f278896a = withdrawMoneyPortfolioInfoProvider;
        this.f278897b = featureToggleInteractor;
    }

    @Override // rbh.b
    public final n a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(this.f278896a.b(), new k(this, 21));
    }
}
