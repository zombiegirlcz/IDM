package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.partner_taxes_disclaimer;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import hba.k;
import hdg.a;
import hdg.b;
import hdg.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/price_breakdown/partner_taxes_disclaimer/TravelHotelsPartnerTaxesDisclaimerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lhdg/b;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsPartnerTaxesDisclaimerScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelHotelsPartnerTaxesDisclaimerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final h Q;
    public final f0 R;
    public final Object S;
    public final Object T;

    public TravelHotelsPartnerTaxesDisclaimerScreen(TravelHotelsPartnerTaxesDisclaimerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = s.t(this, a.f);
        this.R = f0.f322471a;
        this.S = w.y0(new h1k.a(this, inputData, 18));
        this.T = w.y0(new h1g.a(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.w) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = U;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.Q;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value).f174514c.F), new k(this, (Continuation) null, 4), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value2).f174513b.f), new hbg.h(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getR() {
        return this.R;
    }
}
