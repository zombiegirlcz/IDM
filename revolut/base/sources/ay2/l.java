package ay2;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import o5l.v;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx2.g f11044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f11045b;

    public l(jx2.g cardDesignRevPointsPricingClauseProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cardDesignRevPointsPricingClauseProvider, "cardDesignRevPointsPricingClauseProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f11044a = cardDesignRevPointsPricingClauseProvider;
        this.f11045b = featureToggleInteractor;
    }

    public final v a(o5l.i iVar) {
        dj0.d dVarO;
        dj0.d dVarO2;
        dj0.d dVarO3;
        dj0.d dVar;
        o5l.p pVar;
        o5l.r rVar;
        v vVar = iVar.f.f222475a.d;
        v vVar2 = (!((jte.d) this.f11045b).c(CardsCoreApi$Toggles.CardPriceIncludingDeliveryFee.f65559c) || (pVar = iVar.i) == null || (rVar = pVar.f222475a) == null) ? null : rVar.d;
        if (vVar == null && vVar2 == null) {
            return null;
        }
        if (vVar == null || (dVarO = vVar.f222484c) == null) {
            dVarO = iVar.f.f222475a.f222477a;
        }
        dj0.d dVarB = b(iVar);
        if (vVar2 != null && (dVar = vVar2.f222484c) != null) {
            dVarB = dVar;
        }
        if (vVar != null) {
            dVarO2 = pyd.c.O(vVar.f222482a, vVar2 != null ? vVar2.f222482a : null);
        } else {
            if (vVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dVarO2 = vVar2.f222482a;
        }
        if (vVar != null) {
            dVarO3 = pyd.c.O(vVar.f222483b, vVar2 != null ? vVar2.f222483b : null);
        } else {
            if (vVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dVarO3 = vVar2.f222483b;
        }
        if (!dVarB.k()) {
            dVarO = pyd.c.O(dVarO, dVarB);
        }
        return new v(dVarO2, dVarO3, dVarO);
    }

    public final dj0.d b(o5l.i iVar) {
        dj0.d dVar;
        if (!((jte.d) this.f11045b).c(CardsCoreApi$Toggles.CardPriceIncludingDeliveryFee.f65559c)) {
            dj0.d.Companion.getClass();
            return dj0.d.d;
        }
        o5l.j jVar = iVar.f222465h;
        if (jVar != null && (dVar = jVar.f222466a) != null) {
            if (!dVar.f(dj0.d.e)) {
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        dj0.d.Companion.getClass();
        return dj0.d.d;
    }

    public final dj0.d c(o5l.i iVar, boolean z) {
        return pyd.c.O(z ? iVar.f.f222475a.f222477a : iVar.f.f222475a.f222478b, b(iVar));
    }
}
