package efj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import go.g;
import jla.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cej.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f125335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f125336b;

    public d(gte.a featureToggleInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f125335a = featureToggleInteractor;
        this.f125336b = productCatalogueInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f125335a).c(EsimApi$Toggles.EsimMobilePlans.f100179c) && this.f125336b.d("MOBILE_PLANS", null) == bla.c.ENABLED;
    }

    public final g b() {
        if (((jte.d) this.f125335a).c(EsimApi$Toggles.EsimMobilePlans.f100179c)) {
            return hb9.b.j(Boolean.valueOf(this.f125336b.d("MOBILE_PLANS", null) == bla.c.ENABLED));
        }
        return new g(new Data(Boolean.FALSE, null, false, 6, null), 2);
    }
}
