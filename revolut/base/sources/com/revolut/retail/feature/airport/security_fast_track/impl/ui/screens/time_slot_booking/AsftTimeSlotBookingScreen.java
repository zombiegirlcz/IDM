package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.c;
import h30.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yl6.b;
import yna.j1;
import yui.d;
import yui.f;
import yui.i;
import yui.j;
import yui.k;
import yui.o;
import yui.p;
import yui.t;
import yui.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyui/o;", "Ldli/a;", "Lyui/u;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftTimeSlotBookingScreen extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AsftTimeSlotBookingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final AsftTimeSlotBookingScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AsftTimeSlotBookingScreen(AsftTimeSlotBookingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, f.f);
        this.N = w.y0(new j1(29));
        final int i = 0;
        this.O = w.y0(new d(0));
        this.P = w.y0(new Function0(this) { // from class: yui.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTimeSlotBookingScreen f317025b;

            {
                this.f317025b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftTimeSlotBookingScreen asftTimeSlotBookingScreen = this.f317025b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTimeSlotBookingScreen.S;
                        AsftTimeSlotBookingScreen asftTimeSlotBookingScreen2 = this.f317025b;
                        return dli.f.a(asftTimeSlotBookingScreen2, asftTimeSlotBookingScreen2.d(), zhm.v.k(new EsimDelegate(), new EsimLoadingDelegate(), (InputTextDelegate) asftTimeSlotBookingScreen2.N.getValue(), (FullScreenStateDelegate) asftTimeSlotBookingScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTimeSlotBookingScreen.S;
                        qji.b bVarU2 = asftTimeSlotBookingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.di.AsftTimeSlotBookingScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData = asftTimeSlotBookingScreen.K;
                        asftTimeSlotBookingScreenContract$InputData.getClass();
                        return new lti.q(gVar, kVar2, asftTimeSlotBookingScreen, asftTimeSlotBookingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTimeSlotBookingScreen.S;
                        return (p) ((lti.q) asftTimeSlotBookingScreen.Q.getValue()).f199947g.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yui.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTimeSlotBookingScreen f317025b;

            {
                this.f317025b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftTimeSlotBookingScreen asftTimeSlotBookingScreen = this.f317025b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTimeSlotBookingScreen.S;
                        AsftTimeSlotBookingScreen asftTimeSlotBookingScreen2 = this.f317025b;
                        return dli.f.a(asftTimeSlotBookingScreen2, asftTimeSlotBookingScreen2.d(), zhm.v.k(new EsimDelegate(), new EsimLoadingDelegate(), (InputTextDelegate) asftTimeSlotBookingScreen2.N.getValue(), (FullScreenStateDelegate) asftTimeSlotBookingScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTimeSlotBookingScreen.S;
                        qji.b bVarU2 = asftTimeSlotBookingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.di.AsftTimeSlotBookingScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData = asftTimeSlotBookingScreen.K;
                        asftTimeSlotBookingScreenContract$InputData.getClass();
                        return new lti.q(gVar, kVar2, asftTimeSlotBookingScreen, asftTimeSlotBookingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTimeSlotBookingScreen.S;
                        return (p) ((lti.q) asftTimeSlotBookingScreen.Q.getValue()).f199947g.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yui.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTimeSlotBookingScreen f317025b;

            {
                this.f317025b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftTimeSlotBookingScreen asftTimeSlotBookingScreen = this.f317025b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTimeSlotBookingScreen.S;
                        AsftTimeSlotBookingScreen asftTimeSlotBookingScreen2 = this.f317025b;
                        return dli.f.a(asftTimeSlotBookingScreen2, asftTimeSlotBookingScreen2.d(), zhm.v.k(new EsimDelegate(), new EsimLoadingDelegate(), (InputTextDelegate) asftTimeSlotBookingScreen2.N.getValue(), (FullScreenStateDelegate) asftTimeSlotBookingScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTimeSlotBookingScreen.S;
                        qji.b bVarU2 = asftTimeSlotBookingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.di.AsftTimeSlotBookingScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData = asftTimeSlotBookingScreen.K;
                        asftTimeSlotBookingScreenContract$InputData.getClass();
                        return new lti.q(gVar, kVar2, asftTimeSlotBookingScreen, asftTimeSlotBookingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTimeSlotBookingScreen.S;
                        return (p) ((lti.q) asftTimeSlotBookingScreen.Q.getValue()).f199947g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        t tVar = uiState.f317050b;
        LargeActionButton largeActionButton = d3().f174557b;
        if (!(tVar instanceof yui.s)) {
            if (!tVar.equals(yui.q.f317045a)) {
                throw new NoWhenBranchMatchedException();
            }
            largeActionButton.setVisibility(8);
            d3().f174558c.setTextClause(null);
            return;
        }
        yui.s sVar = (yui.s) tVar;
        largeActionButton.setText(sVar.f317046a);
        largeActionButton.setEnabled(sVar.f317047b);
        largeActionButton.setVisibility(0);
        largeActionButton.L(sVar.f317048c);
        largeActionButton.setTag(sVar.e);
        d3().f174558c.setTextClause(sVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lti.q) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.asft_time_slot_picker_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174557b);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, new ymk.u(rd0.e.b(d3().f174557b.o), this, 4), null, new yui.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174558c.f58608l), null, new yui.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new b(this, continuation, 10), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52575g.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new k(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
