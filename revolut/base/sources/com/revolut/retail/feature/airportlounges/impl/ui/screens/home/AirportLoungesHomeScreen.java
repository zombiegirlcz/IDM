package com.revolut.retail.feature.airportlounges.impl.ui.screens.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import com.revolut.core.ui_kit.delegates.WalletWidgetLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import cwi.i0;
import cwi.p0;
import efm.r;
import i7d.i;
import jii.u;
import jij.d;
import jxi.j;
import jxi.k;
import jxi.l;
import jxi.m;
import jxi.n;
import jxi.p;
import jxi.x;
import jxi.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkd.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/AirportLoungesHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/a;", "Ldli/a;", "Ljxi/y;", "Lmkd/g;", "Li7d/i;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesHomeScreen extends ViewController<a> implements dli.a, g, i {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f99073d0 = {o0.f186429a.j(new h0(AirportLoungesHomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AirportLoungesHomeScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99074a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f99075b0;
    public final Object c0;

    public AirportLoungesHomeScreen(AirportLoungesHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, jxi.c.f);
        this.N = w.y0(new jsl.b(26));
        this.O = w.y0(new jxi.a(4));
        this.P = w.y0(new jxi.a(5));
        this.Q = w.y0(new jxi.a(6));
        this.R = w.y0(new jsl.b(27));
        this.S = w.y0(new jsl.b(28));
        this.T = w.y0(new jsl.b(29));
        this.U = w.y0(new jxi.a(0));
        this.V = w.y0(new jxi.a(1));
        this.W = w.y0(new jxi.a(2));
        this.X = w.y0(new jxi.a(3));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: jxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeScreen f179205b;

            {
                this.f179205b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesHomeScreen airportLoungesHomeScreen = this.f179205b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeScreen.f99073d0;
                        return new ScrollerDelegate(zhm.v.k((ReferralContactDelegate) airportLoungesHomeScreen.Q.getValue(), (SmallCardDelegate) airportLoungesHomeScreen.U.getValue(), (ActionWidgetDelegate) airportLoungesHomeScreen.V.getValue(), (HeroBannerDelegate) airportLoungesHomeScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen2 = this.f179205b;
                        return dli.f.a(airportLoungesHomeScreen2, airportLoungesHomeScreen2.d(), zhm.d0.E0(((fd6.a) airportLoungesHomeScreen2.c0.getValue()).e, zhm.v.k((SearchButtonDelegate) airportLoungesHomeScreen2.N.getValue(), (ListSubheaderDelegate) airportLoungesHomeScreen2.S.getValue(), new ListSubheaderLoadingDelegate(), (EsimDelegate) airportLoungesHomeScreen2.O.getValue(), (WalletWidgetDelegate) airportLoungesHomeScreen2.W.getValue(), new WalletWidgetLoadingDelegate(), (PlainTextWarningDelegate) airportLoungesHomeScreen2.P.getValue(), new EsimLoadingDelegate(), (ScrollerDelegate) airportLoungesHomeScreen2.Y.getValue(), (FullScreenStateDelegate) airportLoungesHomeScreen2.R.getValue(), (RowDelegate) airportLoungesHomeScreen2.T.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen3 = this.f179205b;
                        qji.b bVarU2 = airportLoungesHomeScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.di.AirportLoungesHomeScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        airportLoungesHomeScreen3.K.getClass();
                        return new i0(h0Var, p0Var2, airportLoungesHomeScreen3, airportLoungesHomeScreen3, airportLoungesHomeScreen3);
                    case 3:
                        KProperty[] kPropertyArr4 = AirportLoungesHomeScreen.f99073d0;
                        return (v) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).f109723n.get();
                    default:
                        KProperty[] kPropertyArr5 = AirportLoungesHomeScreen.f99073d0;
                        return (fd6.a) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: jxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeScreen f179205b;

            {
                this.f179205b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesHomeScreen airportLoungesHomeScreen = this.f179205b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeScreen.f99073d0;
                        return new ScrollerDelegate(zhm.v.k((ReferralContactDelegate) airportLoungesHomeScreen.Q.getValue(), (SmallCardDelegate) airportLoungesHomeScreen.U.getValue(), (ActionWidgetDelegate) airportLoungesHomeScreen.V.getValue(), (HeroBannerDelegate) airportLoungesHomeScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen2 = this.f179205b;
                        return dli.f.a(airportLoungesHomeScreen2, airportLoungesHomeScreen2.d(), zhm.d0.E0(((fd6.a) airportLoungesHomeScreen2.c0.getValue()).e, zhm.v.k((SearchButtonDelegate) airportLoungesHomeScreen2.N.getValue(), (ListSubheaderDelegate) airportLoungesHomeScreen2.S.getValue(), new ListSubheaderLoadingDelegate(), (EsimDelegate) airportLoungesHomeScreen2.O.getValue(), (WalletWidgetDelegate) airportLoungesHomeScreen2.W.getValue(), new WalletWidgetLoadingDelegate(), (PlainTextWarningDelegate) airportLoungesHomeScreen2.P.getValue(), new EsimLoadingDelegate(), (ScrollerDelegate) airportLoungesHomeScreen2.Y.getValue(), (FullScreenStateDelegate) airportLoungesHomeScreen2.R.getValue(), (RowDelegate) airportLoungesHomeScreen2.T.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen3 = this.f179205b;
                        qji.b bVarU2 = airportLoungesHomeScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.di.AirportLoungesHomeScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        airportLoungesHomeScreen3.K.getClass();
                        return new i0(h0Var, p0Var2, airportLoungesHomeScreen3, airportLoungesHomeScreen3, airportLoungesHomeScreen3);
                    case 3:
                        KProperty[] kPropertyArr4 = AirportLoungesHomeScreen.f99073d0;
                        return (v) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).f109723n.get();
                    default:
                        KProperty[] kPropertyArr5 = AirportLoungesHomeScreen.f99073d0;
                        return (fd6.a) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.f99074a0 = w.y0(new Function0(this) { // from class: jxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeScreen f179205b;

            {
                this.f179205b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungesHomeScreen airportLoungesHomeScreen = this.f179205b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeScreen.f99073d0;
                        return new ScrollerDelegate(zhm.v.k((ReferralContactDelegate) airportLoungesHomeScreen.Q.getValue(), (SmallCardDelegate) airportLoungesHomeScreen.U.getValue(), (ActionWidgetDelegate) airportLoungesHomeScreen.V.getValue(), (HeroBannerDelegate) airportLoungesHomeScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen2 = this.f179205b;
                        return dli.f.a(airportLoungesHomeScreen2, airportLoungesHomeScreen2.d(), zhm.d0.E0(((fd6.a) airportLoungesHomeScreen2.c0.getValue()).e, zhm.v.k((SearchButtonDelegate) airportLoungesHomeScreen2.N.getValue(), (ListSubheaderDelegate) airportLoungesHomeScreen2.S.getValue(), new ListSubheaderLoadingDelegate(), (EsimDelegate) airportLoungesHomeScreen2.O.getValue(), (WalletWidgetDelegate) airportLoungesHomeScreen2.W.getValue(), new WalletWidgetLoadingDelegate(), (PlainTextWarningDelegate) airportLoungesHomeScreen2.P.getValue(), new EsimLoadingDelegate(), (ScrollerDelegate) airportLoungesHomeScreen2.Y.getValue(), (FullScreenStateDelegate) airportLoungesHomeScreen2.R.getValue(), (RowDelegate) airportLoungesHomeScreen2.T.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen3 = this.f179205b;
                        qji.b bVarU2 = airportLoungesHomeScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.di.AirportLoungesHomeScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        airportLoungesHomeScreen3.K.getClass();
                        return new i0(h0Var, p0Var2, airportLoungesHomeScreen3, airportLoungesHomeScreen3, airportLoungesHomeScreen3);
                    case 3:
                        KProperty[] kPropertyArr4 = AirportLoungesHomeScreen.f99073d0;
                        return (v) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).f109723n.get();
                    default:
                        KProperty[] kPropertyArr5 = AirportLoungesHomeScreen.f99073d0;
                        return (fd6.a) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.f99075b0 = w.y0(new Function0(this) { // from class: jxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeScreen f179205b;

            {
                this.f179205b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AirportLoungesHomeScreen airportLoungesHomeScreen = this.f179205b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeScreen.f99073d0;
                        return new ScrollerDelegate(zhm.v.k((ReferralContactDelegate) airportLoungesHomeScreen.Q.getValue(), (SmallCardDelegate) airportLoungesHomeScreen.U.getValue(), (ActionWidgetDelegate) airportLoungesHomeScreen.V.getValue(), (HeroBannerDelegate) airportLoungesHomeScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen2 = this.f179205b;
                        return dli.f.a(airportLoungesHomeScreen2, airportLoungesHomeScreen2.d(), zhm.d0.E0(((fd6.a) airportLoungesHomeScreen2.c0.getValue()).e, zhm.v.k((SearchButtonDelegate) airportLoungesHomeScreen2.N.getValue(), (ListSubheaderDelegate) airportLoungesHomeScreen2.S.getValue(), new ListSubheaderLoadingDelegate(), (EsimDelegate) airportLoungesHomeScreen2.O.getValue(), (WalletWidgetDelegate) airportLoungesHomeScreen2.W.getValue(), new WalletWidgetLoadingDelegate(), (PlainTextWarningDelegate) airportLoungesHomeScreen2.P.getValue(), new EsimLoadingDelegate(), (ScrollerDelegate) airportLoungesHomeScreen2.Y.getValue(), (FullScreenStateDelegate) airportLoungesHomeScreen2.R.getValue(), (RowDelegate) airportLoungesHomeScreen2.T.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen3 = this.f179205b;
                        qji.b bVarU2 = airportLoungesHomeScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.di.AirportLoungesHomeScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        airportLoungesHomeScreen3.K.getClass();
                        return new i0(h0Var, p0Var2, airportLoungesHomeScreen3, airportLoungesHomeScreen3, airportLoungesHomeScreen3);
                    case 3:
                        KProperty[] kPropertyArr4 = AirportLoungesHomeScreen.f99073d0;
                        return (v) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).f109723n.get();
                    default:
                        KProperty[] kPropertyArr5 = AirportLoungesHomeScreen.f99073d0;
                        return (fd6.a) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).e.get();
                }
            }
        });
        final int i6 = 4;
        this.c0 = w.y0(new Function0(this) { // from class: jxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesHomeScreen f179205b;

            {
                this.f179205b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AirportLoungesHomeScreen airportLoungesHomeScreen = this.f179205b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesHomeScreen.f99073d0;
                        return new ScrollerDelegate(zhm.v.k((ReferralContactDelegate) airportLoungesHomeScreen.Q.getValue(), (SmallCardDelegate) airportLoungesHomeScreen.U.getValue(), (ActionWidgetDelegate) airportLoungesHomeScreen.V.getValue(), (HeroBannerDelegate) airportLoungesHomeScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen2 = this.f179205b;
                        return dli.f.a(airportLoungesHomeScreen2, airportLoungesHomeScreen2.d(), zhm.d0.E0(((fd6.a) airportLoungesHomeScreen2.c0.getValue()).e, zhm.v.k((SearchButtonDelegate) airportLoungesHomeScreen2.N.getValue(), (ListSubheaderDelegate) airportLoungesHomeScreen2.S.getValue(), new ListSubheaderLoadingDelegate(), (EsimDelegate) airportLoungesHomeScreen2.O.getValue(), (WalletWidgetDelegate) airportLoungesHomeScreen2.W.getValue(), new WalletWidgetLoadingDelegate(), (PlainTextWarningDelegate) airportLoungesHomeScreen2.P.getValue(), new EsimLoadingDelegate(), (ScrollerDelegate) airportLoungesHomeScreen2.Y.getValue(), (FullScreenStateDelegate) airportLoungesHomeScreen2.R.getValue(), (RowDelegate) airportLoungesHomeScreen2.T.getValue(), new RowLoadingDelegate())), 0, null, null, null, 60);
                    case 2:
                        KProperty[] kPropertyArr3 = AirportLoungesHomeScreen.f99073d0;
                        AirportLoungesHomeScreen airportLoungesHomeScreen3 = this.f179205b;
                        qji.b bVarU2 = airportLoungesHomeScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.home.di.AirportLoungesHomeScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        cwi.h0 h0Var = p0Var.f109756a;
                        p0 p0Var2 = p0Var.f109757b;
                        airportLoungesHomeScreen3.K.getClass();
                        return new i0(h0Var, p0Var2, airportLoungesHomeScreen3, airportLoungesHomeScreen3, airportLoungesHomeScreen3);
                    case 3:
                        KProperty[] kPropertyArr4 = AirportLoungesHomeScreen.f99073d0;
                        return (v) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).f109723n.get();
                    default:
                        KProperty[] kPropertyArr5 = AirportLoungesHomeScreen.f99073d0;
                        return (fd6.a) ((i0) airportLoungesHomeScreen.f99074a0.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        y uiState = (y) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        x xVar = uiState.f179236b;
        jxi.w wVar = uiState.f179237c;
        navBarWithToolbar.setMenuItems(v.l(xVar.f179232a));
        Clause clause = xVar.f179233b;
        Clause clause2 = xVar.f179234c;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(wVar == null ? 8 : 0);
        if (wVar != null) {
            largeActionButton.setText(wVar.f179230a);
            largeActionButton.o(wVar.f179231b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final r F1() {
        return ((ScrollerDelegate) this.Y.getValue()).i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.f99074a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_home_header_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.Z.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new l(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new l(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SearchButtonDelegate) this.N.getValue()).f53283c.f121375b), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ReferralContactDelegate) this.Q.getValue()).q()), new jxi.o(this, null), 3);
        ?? r62 = this.W;
        ViewController.P2(this, new d(rd0.e.b(((WalletWidgetDelegate) r62.getValue()).d), 18), new jxi.i(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((WalletWidgetDelegate) r62.getValue()).f53629c), new p(this, null), 3);
        ?? r64 = this.O;
        ViewController.P2(this, rd0.e.b(((EsimDelegate) r64.getValue()).d), new jxi.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(((EsimDelegate) r64.getValue()).f), new jxi.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((EsimDelegate) r64.getValue()).f52227g.f121375b), new jxi.h(this, null), 3);
        ViewController.P2(this, new d(rd0.e.b(((PlainTextWarningDelegate) this.P.getValue()).f52940c), 19), new jxi.i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.T.getValue()).f53218h), new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.S.getValue()).f52707c), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(((SmallCardDelegate) this.U.getValue()).d), 20), null, new jxi.i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new l(this, null, 0), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, f99073d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final jxi.v d() {
        return (jxi.v) this.f99075b0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((dli.c) this.Z.getValue()).w().f;
    }
}
