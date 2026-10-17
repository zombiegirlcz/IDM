package om4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardDebitToInstalment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f226511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.n f226512b;

    public a0(gte.a featureToggleInteractor, al4.n creditCardInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        this.f226511a = featureToggleInteractor;
        this.f226512b = creditCardInteractor;
    }

    public final akg.n a() {
        return nim.a.v(zh9.u0.m(new go.g(new Data(Boolean.valueOf(((jte.d) this.f226511a).c(CreditCardApi$Toggles$CreditCardDebitToInstalment.f68682c)), null, false, 6, null), 2), ((x2) this.f226512b).m(w4l.j.f294644c)), new okk.d(22));
    }
}
