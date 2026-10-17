package er1;

import bla.c;
import com.revolut.feature.apm.bills.postal_check.api.PostalCheckToggles$PostalCheck;
import jla.h;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f128526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f128527b;

    public b(gte.a featureToggleInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f128526a = featureToggleInteractor;
        this.f128527b = productCatalogueInteractor;
    }

    public final boolean a() {
        c cVarD = this.f128527b.d("BILLS_AND_TAXES.postalcheck", null);
        if (cVarD == c.ENABLED || cVarD == c.INACTIVE) {
            return ((d) this.f128526a).c(PostalCheckToggles$PostalCheck.f61497c);
        }
        return false;
    }
}
