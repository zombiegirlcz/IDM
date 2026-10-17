package om4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardStatementRevPointsRedemption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.n f226533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f226534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.p f226535c;

    public b4(al4.n creditCardInteractor, gte.a featureToggleInteractor, al4.p creditCardProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        this.f226533a = creditCardInteractor;
        this.f226534b = featureToggleInteractor;
        this.f226535c = creditCardProductFeatureTogglesInteractor;
    }

    public final akg.n a() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarM = ((x2) this.f226533a).m(loadingStrategy);
        go.g gVar = new go.g(new Data(Boolean.valueOf(((jte.d) this.f226534b).c(CreditCardApi$Toggles$CreditCardStatementRevPointsRedemption.f68688c)), null, false, 6, null), 2);
        ll4.p productFeature = ll4.p.EARN_REVPOINTS;
        s3 s3Var = (s3) this.f226535c;
        Intrinsics.checkNotNullParameter(productFeature, "productFeature");
        return nim.a.v(zh9.u0.i(nVarM, gVar, new go.g(new Data(Boolean.valueOf(s3Var.k.d(productFeature.a(), null) == bla.c.ENABLED), null, false, 6, null), 2)), new l3(9));
    }
}
