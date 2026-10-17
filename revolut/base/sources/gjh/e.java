package gjh;

import com.revolut.feature.wealth.commodity_additional_services.api.CommodityAdditionalServicesApi$Toggles$CommodityAdditionalServices;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends n implements vki.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f144295l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f144296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f144297n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f144298p;

    public e(ejh.b onboardingNavigationCommandFactory, j investInWidgetPopupMenuMapper, l0 popupMenuDialogDisplayer, jlh.f accountWidgetsPersonalisationInteractor) {
        Intrinsics.checkNotNullParameter(onboardingNavigationCommandFactory, "onboardingNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(investInWidgetPopupMenuMapper, "investInWidgetPopupMenuMapper");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(accountWidgetsPersonalisationInteractor, "accountWidgetsPersonalisationInteractor");
        this.f144296m = onboardingNavigationCommandFactory;
        this.f144297n = investInWidgetPopupMenuMapper;
        this.o = popupMenuDialogDisplayer;
        this.f144298p = accountWidgetsPersonalisationInteractor;
    }

    @Override // yji.n
    public void H2() {
        switch (this.f144295l) {
            case 1:
                if (!((jte.d) ((gte.a) this.f144297n)).c(CommodityAdditionalServicesApi$Toggles$CommodityAdditionalServices.f95438c)) {
                    X2((vki.a) this.f144298p, new s4b.e(27));
                } else {
                    n.l2(this, new ae8.c(bla.b.b((jla.h) this.f144296m, "COMMODITY_WITHDRAWAL.physical_delivery"), 26), null, new rf9.h(this, (Continuation) null, 2), 3);
                }
                break;
        }
    }

    @Override // vki.b
    public cam.f getState() {
        return (vki.a) this.f144298p;
    }

    public e(jla.h productCatalogueInteractor, gte.a featureToggleInteractor, d5h.a host) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(host, "host");
        this.f144296m = productCatalogueInteractor;
        this.f144297n = featureToggleInteractor;
        this.o = host;
        this.f144298p = pyd.c.a(this, new s5h.f(false));
    }
}
