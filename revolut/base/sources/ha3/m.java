package ha3;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import e7l.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements l93.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f150415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f150416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f150417c;

    public m(fk3.a configurationInteractor, gte.a featureToggleInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f150415a = configurationInteractor;
        this.f150416b = featureToggleInteractor;
        this.f150417c = productCatalogueInteractor;
    }

    public final efm.r a() {
        jla.c cVarC = bla.b.c(this.f150417c, "CARD_DELIVERY");
        Boolean boolA = cVarC != null ? cVarC.a("required_home_delivery") : null;
        if (boolA != null ? boolA.booleanValue() : false) {
            return zi0.c.j(l93.d.NOT_ALLOWED);
        }
        return nim.a.w(((ik3.c) this.f150415a).l(g.b.f123407a, w4l.h.f294642c), new ha1.k(14));
    }

    public final efm.r b(l93.c cardType) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        int i = l.f150414a[cardType.ordinal()];
        if (i == 1) {
            return a();
        }
        if (i == 2) {
            return ((jte.d) this.f150416b).c(CardsCoreApi$Toggles.JuniorCardDeliveryAddress.f65564c) ? a() : zi0.c.j(l93.d.NOT_ALLOWED);
        }
        throw new NoWhenBranchMatchedException();
    }
}
