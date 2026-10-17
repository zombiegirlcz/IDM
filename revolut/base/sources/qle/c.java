package qle;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import jla.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f247564l;

    public c(h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f247564l = productCatalogueInteractor;
    }

    @Override // qle.a
    public final boolean Z2() {
        return this.f247564l.d("security_hub.wealth_protection", null) == bla.c.ENABLED;
    }

    @Override // qle.a
    public final void b3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "WEALTH_PROTECTION_ITEM_ID")) {
            A2(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.WealthProtection.f85392a, false, (String) null, true, 22));
        }
    }
}
