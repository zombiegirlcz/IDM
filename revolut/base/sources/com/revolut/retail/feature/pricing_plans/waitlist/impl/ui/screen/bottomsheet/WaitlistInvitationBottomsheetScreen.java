package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import aw0.o9;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet.WaitlistInvitationBottomsheetScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet.WaitlistInvitationBottomsheetScreenContract$InputData;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lw0.c;
import t9l.f;
import te0.w;
import tok.b;
import tok.g;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/bottomsheet/WaitlistInvitationBottomsheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltok/g;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitlistInvitationBottomsheetScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(WaitlistInvitationBottomsheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final WaitlistInvitationBottomsheetScreenContract$InputData K;
    public final int L;
    public final int M;
    public final CounterTextDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public WaitlistInvitationBottomsheetScreen(WaitlistInvitationBottomsheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        this.M = R$style.UiKitTheme_Night;
        this.N = new CounterTextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistInvitationBottomsheetScreen f273232b;

            {
                this.f273232b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen = this.f273232b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistInvitationBottomsheetScreen.S;
                        WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen2 = this.f273232b;
                        return dli.f.a(waitlistInvitationBottomsheetScreen2, (h) waitlistInvitationBottomsheetScreen2.R.getValue(), v.k(new CellDetailsDelegate(), new GridBoxDelegate(u.c(waitlistInvitationBottomsheetScreen2.N), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistInvitationBottomsheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(waitlistInvitationBottomsheetScreen.m2()).a().get(jok.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jok.c.class, " is not found"));
                        }
                        jok.c cVar = ((jok.c) aVar2.b()).f177154g;
                        WaitlistInvitationBottomsheetScreenContract$InputData waitlistInvitationBottomsheetScreenContract$InputData = waitlistInvitationBottomsheetScreen.K;
                        waitlistInvitationBottomsheetScreenContract$InputData.getClass();
                        return new jok.e(cVar, waitlistInvitationBottomsheetScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistInvitationBottomsheetScreen.S;
                        return (h) ((jok.e) waitlistInvitationBottomsheetScreen.Q.getValue()).f177161c.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: tok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistInvitationBottomsheetScreen f273232b;

            {
                this.f273232b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen = this.f273232b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistInvitationBottomsheetScreen.S;
                        WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen2 = this.f273232b;
                        return dli.f.a(waitlistInvitationBottomsheetScreen2, (h) waitlistInvitationBottomsheetScreen2.R.getValue(), v.k(new CellDetailsDelegate(), new GridBoxDelegate(u.c(waitlistInvitationBottomsheetScreen2.N), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistInvitationBottomsheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(waitlistInvitationBottomsheetScreen.m2()).a().get(jok.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jok.c.class, " is not found"));
                        }
                        jok.c cVar = ((jok.c) aVar2.b()).f177154g;
                        WaitlistInvitationBottomsheetScreenContract$InputData waitlistInvitationBottomsheetScreenContract$InputData = waitlistInvitationBottomsheetScreen.K;
                        waitlistInvitationBottomsheetScreenContract$InputData.getClass();
                        return new jok.e(cVar, waitlistInvitationBottomsheetScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistInvitationBottomsheetScreen.S;
                        return (h) ((jok.e) waitlistInvitationBottomsheetScreen.Q.getValue()).f177161c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: tok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistInvitationBottomsheetScreen f273232b;

            {
                this.f273232b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen = this.f273232b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistInvitationBottomsheetScreen.S;
                        WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen2 = this.f273232b;
                        return dli.f.a(waitlistInvitationBottomsheetScreen2, (h) waitlistInvitationBottomsheetScreen2.R.getValue(), v.k(new CellDetailsDelegate(), new GridBoxDelegate(u.c(waitlistInvitationBottomsheetScreen2.N), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistInvitationBottomsheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(waitlistInvitationBottomsheetScreen.m2()).a().get(jok.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jok.c.class, " is not found"));
                        }
                        jok.c cVar = ((jok.c) aVar2.b()).f177154g;
                        WaitlistInvitationBottomsheetScreenContract$InputData waitlistInvitationBottomsheetScreenContract$InputData = waitlistInvitationBottomsheetScreen.K;
                        waitlistInvitationBottomsheetScreenContract$InputData.getClass();
                        return new jok.e(cVar, waitlistInvitationBottomsheetScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistInvitationBottomsheetScreen.S;
                        return (h) ((jok.e) waitlistInvitationBottomsheetScreen.Q.getValue()).f177161c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174514c.setHeaderModel(new lw0.a(new TextClause(uiState.f273237a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(uiState.f273238b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new c(new GlyphImage(R$drawable.uikit_icn_24_boost, null, null, 6)), null, false, 24));
        i iVar = uiState.f273239c;
        if (iVar == null) {
            ActionFooterView bottomSheetControllerBaseFooterView = d3().f174513b;
            Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
            bottomSheetControllerBaseFooterView.setVisibility(8);
        } else {
            ActionFooterView bottomSheetControllerBaseFooterView2 = d3().f174513b;
            Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView2, "bottomSheetControllerBaseFooterView");
            bottomSheetControllerBaseFooterView2.setVisibility(0);
            d3().f174513b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jok.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tok.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.e), new tok.e(this, null, 0), 3);
        ViewController.P2(this, new f(rd0.e.b(d3().f174513b.f), 12), new tok.e(this, null, 1), 3);
        ViewController.P2(this, new f(rd0.e.b(d3().f174513b.f58955g), 13), new tok.e(this, null, 2), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
