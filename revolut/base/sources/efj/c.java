package efj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import go.g;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements cej.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f125333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f125334b;

    public c(gte.a featureToggleInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f125333a = featureToggleInteractor;
        this.f125334b = productCatalogueInteractor;
    }

    public final boolean a() {
        EsimApi$Toggles.ForceEnableEsim forceEnableEsim = EsimApi$Toggles.ForceEnableEsim.f100186a;
        jte.d dVar = (jte.d) this.f125333a;
        if (dVar.c(forceEnableEsim)) {
            return true;
        }
        return dVar.c(EsimApi$Toggles.EsimRollout.f100184c) && this.f125334b.d("ESIM", null) == bla.c.ENABLED;
    }

    public final Flow b() {
        EsimApi$Toggles.ForceEnableEsim forceEnableEsim = EsimApi$Toggles.ForceEnableEsim.f100186a;
        jte.d dVar = (jte.d) this.f125333a;
        return dVar.c(forceEnableEsim) ? new g(new Data(Boolean.TRUE, null, false, 6, null), 2) : !dVar.c(EsimApi$Toggles.EsimRollout.f100184c) ? new g(new Data(Boolean.FALSE, null, false, 6, null), 2) : hb9.b.x(new ae8.c(bla.b.b(this.f125334b, "ESIM"), 6), Boolean.FALSE);
    }
}
