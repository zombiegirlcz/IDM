package odg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import efm.r;
import ffk.t;
import i9g.p;
import i9g.v;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p8g.a f224467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f224468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p8g.c f224469n;
    public final j60.a o;

    public e(p8g.a travelHotelsCashbackInteractor, t pricingPlanInteractor, p8g.c travelHotelsFeatureInteractor, j60.a expandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(travelHotelsCashbackInteractor, "travelHotelsCashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        this.f224467l = travelHotelsCashbackInteractor;
        this.f224468m = pricingPlanInteractor;
        this.f224469n = travelHotelsFeatureInteractor;
        this.o = expandableDialogControllerExtension;
    }

    public static final r c3(e eVar) {
        if (!((v) eVar.f224469n).b()) {
            return ((p) eVar.f224467l).f159829a.M.f(Unit.f186387a, false);
        }
        r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
        Intrinsics.h(rVarJust);
        return rVarJust;
    }

    @Override // odg.a
    public final void Z2(HotelsPropertyCashback tagViewDataPayload) {
        Intrinsics.checkNotNullParameter(tagViewDataPayload, "tagViewDataPayload");
        if (((v) this.f224469n).b()) {
            return;
        }
        V2(new c(this, null, 1), new yi5.b(29));
    }

    @Override // odg.a
    public final void b3(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (((v) this.f224469n).b()) {
            return;
        }
        V2(new c(this, null, 0), new yi5.b(29));
    }
}
