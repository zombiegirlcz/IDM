package mv7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreenContract$InputData;
import gu7.a4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mkk.q;
import mv7.f;
import wli.x;
import xv7.p;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements g {
    public final EmbeddedBottomSheetScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f209163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f209164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mu7.a f209165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f209166s;

    public j(EmbeddedBottomSheetScreenContract$InputData inputData, x deeplinkHandler, p pricingPlanBannerMapper, mu7.a embeddedInsuranceDetailInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanBannerMapper, "pricingPlanBannerMapper");
        Intrinsics.checkNotNullParameter(embeddedInsuranceDetailInteractor, "embeddedInsuranceDetailInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f209163p = deeplinkHandler;
        this.f209164q = pricingPlanBannerMapper;
        this.f209165r = embeddedInsuranceDetailInteractor;
        this.f209166s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        PricingPlanBanner pricingPlanBanner = this.o.f76102a.e;
        if (pricingPlanBanner != null) {
            p pVar = this.f209164q;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(pricingPlanBanner, "pricingPlanBanner");
            yji.l.a1(this, nim.a.v(rd0.e.b(pVar.f309221a.r(pricingPlanBanner.f75959c)), new xng.l(pVar, pricingPlanBanner, 26)), null, null, new q(this, null, 25), 3);
        }
    }

    public final void I2(Object obj2) {
        if (obj2 instanceof BottomSheet.Button) {
            BottomSheet.Button button = (BottomSheet.Button) obj2;
            BottomSheet.Action action = button.f75889b;
            boolean z = action instanceof BottomSheet.Action.Dismiss;
            f.a aVar = f.a.f209160a;
            if (z) {
                C2(aVar);
                Unit unit = Unit.f186387a;
                return;
            }
            if (action instanceof BottomSheet.Action.LearnMore) {
                ou7.a.b(this, ((BottomSheet.Action.LearnMore) action).f75882b);
                C2(aVar);
                Unit unit2 = Unit.f186387a;
                return;
            }
            if (action instanceof BottomSheet.Action.Upgrade) {
                BottomSheet.Action.Upgrade upgrade = (BottomSheet.Action.Upgrade) action;
                ou7.a.c(this, upgrade.f75884b, upgrade.f75885c);
                C2(aVar);
                Unit unit3 = Unit.f186387a;
                return;
            }
            if (action instanceof BottomSheet.Action.Deeplink) {
                n2(new h(this, button, null), new whi.b(6));
                return;
            }
            if (!(action instanceof BottomSheet.Action.DynamicContactUrl)) {
                throw new NoWhenBranchMatchedException();
            }
            n2(new i(this, button, null), new mm7.h(1, this, pu7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 20));
        }
    }

    public final void J2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj2 instanceof a4) {
            n2(new mpd.p(this, ((a4) obj2).f146714b, null, 11), new whi.b(6));
        } else if (obj2 instanceof PricingPlanBanner) {
            PricingPlanBanner pricingPlanBanner = (PricingPlanBanner) obj2;
            ou7.a.c(this, pricingPlanBanner.f75958b, pricingPlanBanner.f75959c);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f209166s;
    }
}
