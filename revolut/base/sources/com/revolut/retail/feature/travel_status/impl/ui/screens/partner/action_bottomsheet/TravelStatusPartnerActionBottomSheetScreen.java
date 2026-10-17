package com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.TravelStatusPartnerActionBottomSheetScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.TravelStatusPartnerActionBottomSheetScreenContract$InputData;
import dli.c;
import iqh.d;
import j2l.b;
import j2l.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import y1l.f;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/screens/partner/action_bottomsheet/TravelStatusPartnerActionBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/travel_status/impl/ui/screens/partner/action_bottomsheet/TravelStatusPartnerActionBottomSheetScreenContract$OutputData;", "Ldli/a;", "Lj2l/h;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelStatusPartnerActionBottomSheetScreen extends ViewController<TravelStatusPartnerActionBottomSheetScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelStatusPartnerActionBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final TravelStatusPartnerActionBottomSheetScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelStatusPartnerActionBottomSheetScreen(TravelStatusPartnerActionBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusPartnerActionBottomSheetScreen f170907b;

            {
                this.f170907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen = this.f170907b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusPartnerActionBottomSheetScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(travelStatusPartnerActionBottomSheetScreen.m2()).a().get(y1l.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y1l.b.class, " is not found"));
                        }
                        y1l.b bVar = ((y1l.b) aVar2.b()).k;
                        TravelStatusPartnerActionBottomSheetScreenContract$InputData travelStatusPartnerActionBottomSheetScreenContract$InputData = travelStatusPartnerActionBottomSheetScreen.K;
                        travelStatusPartnerActionBottomSheetScreenContract$InputData.getClass();
                        return new y1l.f(bVar, travelStatusPartnerActionBottomSheetScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusPartnerActionBottomSheetScreen.Q;
                        return (g) ((y1l.f) travelStatusPartnerActionBottomSheetScreen.N.getValue()).f310410b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusPartnerActionBottomSheetScreen.Q;
                        TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen2 = this.f170907b;
                        return dli.f.a(travelStatusPartnerActionBottomSheetScreen2, (g) travelStatusPartnerActionBottomSheetScreen2.O.getValue(), f0.f322471a, R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusPartnerActionBottomSheetScreen f170907b;

            {
                this.f170907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen = this.f170907b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusPartnerActionBottomSheetScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(travelStatusPartnerActionBottomSheetScreen.m2()).a().get(y1l.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y1l.b.class, " is not found"));
                        }
                        y1l.b bVar = ((y1l.b) aVar2.b()).k;
                        TravelStatusPartnerActionBottomSheetScreenContract$InputData travelStatusPartnerActionBottomSheetScreenContract$InputData = travelStatusPartnerActionBottomSheetScreen.K;
                        travelStatusPartnerActionBottomSheetScreenContract$InputData.getClass();
                        return new y1l.f(bVar, travelStatusPartnerActionBottomSheetScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusPartnerActionBottomSheetScreen.Q;
                        return (g) ((y1l.f) travelStatusPartnerActionBottomSheetScreen.N.getValue()).f310410b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusPartnerActionBottomSheetScreen.Q;
                        TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen2 = this.f170907b;
                        return dli.f.a(travelStatusPartnerActionBottomSheetScreen2, (g) travelStatusPartnerActionBottomSheetScreen2.O.getValue(), f0.f322471a, R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: j2l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusPartnerActionBottomSheetScreen f170907b;

            {
                this.f170907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen = this.f170907b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusPartnerActionBottomSheetScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(travelStatusPartnerActionBottomSheetScreen.m2()).a().get(y1l.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y1l.b.class, " is not found"));
                        }
                        y1l.b bVar = ((y1l.b) aVar2.b()).k;
                        TravelStatusPartnerActionBottomSheetScreenContract$InputData travelStatusPartnerActionBottomSheetScreenContract$InputData = travelStatusPartnerActionBottomSheetScreen.K;
                        travelStatusPartnerActionBottomSheetScreenContract$InputData.getClass();
                        return new y1l.f(bVar, travelStatusPartnerActionBottomSheetScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusPartnerActionBottomSheetScreen.Q;
                        return (g) ((y1l.f) travelStatusPartnerActionBottomSheetScreen.N.getValue()).f310410b.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusPartnerActionBottomSheetScreen.Q;
                        TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen2 = this.f170907b;
                        return dli.f.a(travelStatusPartnerActionBottomSheetScreen2, (g) travelStatusPartnerActionBottomSheetScreen2.O.getValue(), f0.f322471a, R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j2l.h uiState = (j2l.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarBottomSheet navBarBottomSheet = d3().f174514c;
        TextClause textClause = new TextClause(uiState.f170912a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = uiState.f170913b;
        navBarBottomSheet.setHeaderModel(new lw0.a(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28));
        i iVar = uiState.f170914c;
        ActionFooterView bottomSheetControllerBaseFooterView = d3().f174513b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
        bottomSheetControllerBaseFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ActionFooterView bottomSheetControllerBaseFooterView2 = d3().f174513b;
            Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView2, "bottomSheetControllerBaseFooterView");
            bottomSheetControllerBaseFooterView2.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new d(rd0.e.b(d3().f174513b.f), 13), new j2l.e(this, null, 0), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f174513b.f58955g), 14), new j2l.e(this, null, 1), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
