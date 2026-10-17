package om4;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements al4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f226568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f226569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.q f226570c;

    public f(gte.a featureToggleInteractor, ang.f userInteractor, al4.q creditCardProductInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f226568a = featureToggleInteractor;
        this.f226569b = userInteractor;
        this.f226570c = creditCardProductInteractor;
    }

    public final Flow a(h93.f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (!((jte.d) this.f226568a).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
            return new go.g(null, 2);
        }
        h93.l0 l0Var = card.G;
        return l0Var == h93.l0.BRAZIL_GLOBAL ? new go.g(al4.a.GLOBAL_DEBIT, 2) : !(l0Var == h93.l0.BRAZIL_LOCAL) ? new go.g(null, 2) : new olf.e(b(), 2);
    }

    public final Flow b() {
        if (!((jte.d) this.f226568a).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
            return new go.g(Boolean.FALSE, 2);
        }
        return vkm.q.q(new n33.r0(mo3.a.e(rd0.e.n(xam.a.h(new jkh.g(this, (Continuation) null, 17), nim.a.v(this.f226569b.j(w4l.h.f294642c), new okk.d(18))), zhm.h0.f322473a), new ol6.b(4), new ol6.b(5)), 18));
    }
}
