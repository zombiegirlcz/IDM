package tbh;

import akg.n;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;
import m1h.k;
import rbh.b;
import t5e.m;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f269524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f269525b;

    public a(k addMoneyPortfolioInfoProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(addMoneyPortfolioInfoProvider, "addMoneyPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f269524a = addMoneyPortfolioInfoProvider;
        this.f269525b = featureToggleInteractor;
    }

    @Override // rbh.b
    public final n a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(this.f269524a.d(transferSubjectId), new m(this, 26));
    }
}
