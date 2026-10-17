package com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details;

import aii.q;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import avk.h;
import aw0.o9;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RatingBarDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import dli.c;
import i7d.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m5e.d;
import prk.n0;
import te0.w;
import tnb.g0;
import tul.b;
import tx0.j0;
import tx0.t3;
import tx0.u3;
import vc.s;
import vfg.p;
import wuk.e;
import wuk.f;
import wuk.g;
import wuk.k;
import wuk.l;
import wuk.m;
import wuk.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/bond_details/BondDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwuk/o;", "Li7d/i;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BondDetailsController extends ViewController<q> implements a, i {
    public static final /* synthetic */ KProperty[] H0 = {o0.f186429a.j(new h0(BondDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final d A0;
    public final b B0;
    public final h C0;
    public final p D0;
    public final g0 E0;
    public final f F0;
    public final g G0;
    public final BondDetailsControllerContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final ActionWidgetDelegate P;
    public final AirTipDelegate Q;
    public final CandleStickGraphDelegate R;
    public final CellDetailsDelegate S;
    public final CellDetailsLoadingDelegate T;
    public final CounterTextDelegate U;
    public final FixedTabsDelegate V;
    public final TabsDelegate W;
    public final HeaderDelegate X;
    public final HeaderLoadingDelegate Y;
    public final ListCellDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f103887a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ListSubheaderDelegate f103888b0;
    public final PlainTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final PlainTextWarningDelegate f103889d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final BannerDelegate f103890e0;
    public final RatingBarDelegate f0;
    public final RowDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final RowLoadingDelegate f103891h0;
    public final ReferralContactDelegate i0;
    public final SuggestionsBarDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ScrollerDelegate f103892k0;
    public final SwipeToActionDelegate l0;
    public final TextDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final TrendViewDelegate f103893n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final GridBoxDelegate f103894o0;
    public final ScrollerBoxDelegate p0;
    public final ProgressStepVerticalDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LargeActionButtonDelegate f103895r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final CalendarRowDelegate f103896s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f103897t0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final usc.a f103898v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final avk.b f103899w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final e f103900x0;
    public final fvk.f y0;
    public final wuk.d z0;

    public BondDetailsController(BondDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        this.M = s.t(this, wuk.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wuk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BondDetailsController f300175b;

            {
                this.f300175b = this;
            }

            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = BondDetailsController.H0;
                        BondDetailsController bondDetailsController = this.f300175b;
                        Activity activityM2 = bondDetailsController.m2();
                        CellDetailsDelegate cellDetailsDelegate = bondDetailsController.S;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = bondDetailsController.f103887a0;
                        ListSubheaderDelegate listSubheaderDelegate = bondDetailsController.f103888b0;
                        BondDetailsControllerContract$InputData bondDetailsControllerContract$InputData = bondDetailsController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        prk.g0 g0Var = ((prk.g0) ((n0) aVar2.b())).N;
                        String str = bondDetailsControllerContract$InputData.f103901a;
                        boolean z = bondDetailsControllerContract$InputData.f103902b;
                        ksk.e eVar = new ksk.e(str);
                        ksk.c cVar = new ksk.c(listSubheaderDelegate, listSubheaderLoadingDelegate, cellDetailsDelegate, bondDetailsController.T);
                        n2h.e eVar2 = new n2h.e(str, z);
                        vfg.p pVar = bondDetailsController.D0;
                        avk.b bVar = bondDetailsController.f103899w0;
                        psk.f fVar = new psk.f(str);
                        psk.d dVar = new psk.d(listSubheaderLoadingDelegate, listSubheaderDelegate, new psk.c(bondDetailsController.U, bondDetailsController.f103891h0));
                        g0 g0Var2 = bondDetailsController.E0;
                        usc.a aVar3 = bondDetailsController.f103898v0;
                        rsk.d dVar2 = new rsk.d(str);
                        d dVar3 = bondDetailsController.z0;
                        fvk.f fVar2 = bondDetailsController.y0;
                        e eVar3 = bondDetailsController.f103900x0;
                        atk.e eVar4 = new atk.e(str);
                        tul.b bVar2 = bondDetailsController.B0;
                        avk.h hVar = bondDetailsController.C0;
                        h3h.e eVar5 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(bondDetailsController.X, bondDetailsController.f103888b0, bondDetailsController.f103887a0, bondDetailsController.g0, bondDetailsController.f103891h0);
                        f fVar3 = bondDetailsController.F0;
                        dtk.d dVar4 = new dtk.d(cellDetailsDelegate, listSubheaderDelegate);
                        k3h.e eVar6 = new k3h.e(str, wdh.a.FITCH);
                        k3h.c cVar3 = new k3h.c(bondDetailsController.X, bondDetailsController.Y, bondDetailsController.f103887a0, bondDetailsController.f103888b0, bondDetailsController.f0);
                        ctk.g gVar = new ctk.g(listSubheaderDelegate, new ctk.f(bondDetailsController.i0));
                        ctk.h hVar2 = new ctk.h(str);
                        jtk.c cVar4 = new jtk.c(bondDetailsController.f103889d0, bondDetailsController.f103890e0, bondDetailsController.f103892k0);
                        jtk.d dVar5 = new jtk.d(str);
                        g gVar2 = bondDetailsController.G0;
                        m5e.d dVar6 = bondDetailsController.A0;
                        pVar.getClass();
                        bVar.getClass();
                        g0Var2.getClass();
                        aVar3.getClass();
                        dVar3.getClass();
                        fVar2.getClass();
                        eVar3.getClass();
                        bVar2.getClass();
                        hVar.getClass();
                        fVar3.getClass();
                        gVar2.getClass();
                        dVar6.getClass();
                        return new prk.j(g0Var, new xuk.c(), new f3h.b(), new f3h.a(), bondDetailsController, bondDetailsControllerContract$InputData, eVar, cVar, eVar2, pVar, bVar, fVar, dVar, g0Var2, aVar3, dVar2, bondDetailsController, dVar3, fVar2, eVar3, eVar4, bVar2, hVar, eVar5, cVar2, fVar3, dVar4, eVar6, cVar3, gVar, hVar2, cVar4, dVar5, gVar2, dVar6);
                    case 1:
                        KProperty[] kPropertyArr2 = BondDetailsController.H0;
                        return (h) ((prk.j) ((xuk.a) this.f300175b.N.getValue())).F0.get();
                    default:
                        KProperty[] kPropertyArr3 = BondDetailsController.H0;
                        BondDetailsController bondDetailsController2 = this.f300175b;
                        return dli.f.a(bondDetailsController2, (h) bondDetailsController2.O.getValue(), zhm.v.k(bondDetailsController2.P, bondDetailsController2.Q, bondDetailsController2.R, bondDetailsController2.S, bondDetailsController2.T, bondDetailsController2.V, bondDetailsController2.f103894o0, bondDetailsController2.X, bondDetailsController2.Y, bondDetailsController2.Z, bondDetailsController2.f103887a0, bondDetailsController2.f103888b0, bondDetailsController2.c0, bondDetailsController2.f103889d0, bondDetailsController2.f103890e0, bondDetailsController2.f0, bondDetailsController2.g0, bondDetailsController2.f103891h0, bondDetailsController2.f103892k0, bondDetailsController2.p0, bondDetailsController2.j0, bondDetailsController2.l0, bondDetailsController2.W, bondDetailsController2.m0, bondDetailsController2.f103893n0, bondDetailsController2.f103896s0, bondDetailsController2.f103897t0, bondDetailsController2.f103895r0, bondDetailsController2.q0), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wuk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BondDetailsController f300175b;

            {
                this.f300175b = this;
            }

            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BondDetailsController.H0;
                        BondDetailsController bondDetailsController = this.f300175b;
                        Activity activityM2 = bondDetailsController.m2();
                        CellDetailsDelegate cellDetailsDelegate = bondDetailsController.S;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = bondDetailsController.f103887a0;
                        ListSubheaderDelegate listSubheaderDelegate = bondDetailsController.f103888b0;
                        BondDetailsControllerContract$InputData bondDetailsControllerContract$InputData = bondDetailsController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        prk.g0 g0Var = ((prk.g0) ((n0) aVar2.b())).N;
                        String str = bondDetailsControllerContract$InputData.f103901a;
                        boolean z = bondDetailsControllerContract$InputData.f103902b;
                        ksk.e eVar = new ksk.e(str);
                        ksk.c cVar = new ksk.c(listSubheaderDelegate, listSubheaderLoadingDelegate, cellDetailsDelegate, bondDetailsController.T);
                        n2h.e eVar2 = new n2h.e(str, z);
                        vfg.p pVar = bondDetailsController.D0;
                        avk.b bVar = bondDetailsController.f103899w0;
                        psk.f fVar = new psk.f(str);
                        psk.d dVar = new psk.d(listSubheaderLoadingDelegate, listSubheaderDelegate, new psk.c(bondDetailsController.U, bondDetailsController.f103891h0));
                        g0 g0Var2 = bondDetailsController.E0;
                        usc.a aVar3 = bondDetailsController.f103898v0;
                        rsk.d dVar2 = new rsk.d(str);
                        d dVar3 = bondDetailsController.z0;
                        fvk.f fVar2 = bondDetailsController.y0;
                        e eVar3 = bondDetailsController.f103900x0;
                        atk.e eVar4 = new atk.e(str);
                        tul.b bVar2 = bondDetailsController.B0;
                        avk.h hVar = bondDetailsController.C0;
                        h3h.e eVar5 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(bondDetailsController.X, bondDetailsController.f103888b0, bondDetailsController.f103887a0, bondDetailsController.g0, bondDetailsController.f103891h0);
                        f fVar3 = bondDetailsController.F0;
                        dtk.d dVar4 = new dtk.d(cellDetailsDelegate, listSubheaderDelegate);
                        k3h.e eVar6 = new k3h.e(str, wdh.a.FITCH);
                        k3h.c cVar3 = new k3h.c(bondDetailsController.X, bondDetailsController.Y, bondDetailsController.f103887a0, bondDetailsController.f103888b0, bondDetailsController.f0);
                        ctk.g gVar = new ctk.g(listSubheaderDelegate, new ctk.f(bondDetailsController.i0));
                        ctk.h hVar2 = new ctk.h(str);
                        jtk.c cVar4 = new jtk.c(bondDetailsController.f103889d0, bondDetailsController.f103890e0, bondDetailsController.f103892k0);
                        jtk.d dVar5 = new jtk.d(str);
                        g gVar2 = bondDetailsController.G0;
                        m5e.d dVar6 = bondDetailsController.A0;
                        pVar.getClass();
                        bVar.getClass();
                        g0Var2.getClass();
                        aVar3.getClass();
                        dVar3.getClass();
                        fVar2.getClass();
                        eVar3.getClass();
                        bVar2.getClass();
                        hVar.getClass();
                        fVar3.getClass();
                        gVar2.getClass();
                        dVar6.getClass();
                        return new prk.j(g0Var, new xuk.c(), new f3h.b(), new f3h.a(), bondDetailsController, bondDetailsControllerContract$InputData, eVar, cVar, eVar2, pVar, bVar, fVar, dVar, g0Var2, aVar3, dVar2, bondDetailsController, dVar3, fVar2, eVar3, eVar4, bVar2, hVar, eVar5, cVar2, fVar3, dVar4, eVar6, cVar3, gVar, hVar2, cVar4, dVar5, gVar2, dVar6);
                    case 1:
                        KProperty[] kPropertyArr2 = BondDetailsController.H0;
                        return (h) ((prk.j) ((xuk.a) this.f300175b.N.getValue())).F0.get();
                    default:
                        KProperty[] kPropertyArr3 = BondDetailsController.H0;
                        BondDetailsController bondDetailsController2 = this.f300175b;
                        return dli.f.a(bondDetailsController2, (h) bondDetailsController2.O.getValue(), zhm.v.k(bondDetailsController2.P, bondDetailsController2.Q, bondDetailsController2.R, bondDetailsController2.S, bondDetailsController2.T, bondDetailsController2.V, bondDetailsController2.f103894o0, bondDetailsController2.X, bondDetailsController2.Y, bondDetailsController2.Z, bondDetailsController2.f103887a0, bondDetailsController2.f103888b0, bondDetailsController2.c0, bondDetailsController2.f103889d0, bondDetailsController2.f103890e0, bondDetailsController2.f0, bondDetailsController2.g0, bondDetailsController2.f103891h0, bondDetailsController2.f103892k0, bondDetailsController2.p0, bondDetailsController2.j0, bondDetailsController2.l0, bondDetailsController2.W, bondDetailsController2.m0, bondDetailsController2.f103893n0, bondDetailsController2.f103896s0, bondDetailsController2.f103897t0, bondDetailsController2.f103895r0, bondDetailsController2.q0), 0, null, null, null, 60);
                }
            }
        });
        this.P = new ActionWidgetDelegate();
        this.Q = new AirTipDelegate();
        this.R = new CandleStickGraphDelegate(yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_open, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_close, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_high, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_low, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_volume, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yoj.b.w(new TextLocalisedClause(R$string.candlestick_tooltip_change, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        this.S = new CellDetailsDelegate();
        this.T = new CellDetailsLoadingDelegate();
        CounterTextDelegate counterTextDelegate = new CounterTextDelegate();
        this.U = counterTextDelegate;
        this.V = new FixedTabsDelegate();
        this.W = new TabsDelegate();
        this.X = new HeaderDelegate();
        this.Y = new HeaderLoadingDelegate();
        this.Z = new ListCellDelegate();
        this.f103887a0 = new ListSubheaderLoadingDelegate();
        this.f103888b0 = new ListSubheaderDelegate();
        this.c0 = new PlainTextDelegate();
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.f103889d0 = plainTextWarningDelegate;
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.f103890e0 = bannerDelegate;
        this.f0 = new RatingBarDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.g0 = rowDelegate;
        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
        this.f103891h0 = rowLoadingDelegate;
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.i0 = referralContactDelegate;
        this.j0 = new SuggestionsBarDelegate();
        final int i3 = 2;
        this.f103892k0 = new ScrollerDelegate(v.k(plainTextWarningDelegate, bannerDelegate), false);
        this.l0 = new SwipeToActionDelegate(rowDelegate, false);
        this.m0 = new TextDelegate();
        this.f103893n0 = new TrendViewDelegate(1000L);
        this.f103894o0 = new GridBoxDelegate(v.k(counterTextDelegate, rowLoadingDelegate), 0, BitmapDescriptorFactory.HUE_RED, 8.0f, 6);
        this.p0 = new ScrollerBoxDelegate(u.c(referralContactDelegate));
        this.q0 = new ProgressStepVerticalDelegate();
        this.f103895r0 = new LargeActionButtonDelegate();
        this.f103896s0 = new CalendarRowDelegate();
        this.f103897t0 = new TwinHorizontalButtonDelegate();
        this.u0 = w.y0(new Function0(this) { // from class: wuk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BondDetailsController f300175b;

            {
                this.f300175b = this;
            }

            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = BondDetailsController.H0;
                        BondDetailsController bondDetailsController = this.f300175b;
                        Activity activityM2 = bondDetailsController.m2();
                        CellDetailsDelegate cellDetailsDelegate = bondDetailsController.S;
                        ListSubheaderLoadingDelegate listSubheaderLoadingDelegate = bondDetailsController.f103887a0;
                        ListSubheaderDelegate listSubheaderDelegate = bondDetailsController.f103888b0;
                        BondDetailsControllerContract$InputData bondDetailsControllerContract$InputData = bondDetailsController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        prk.g0 g0Var = ((prk.g0) ((n0) aVar2.b())).N;
                        String str = bondDetailsControllerContract$InputData.f103901a;
                        boolean z = bondDetailsControllerContract$InputData.f103902b;
                        ksk.e eVar = new ksk.e(str);
                        ksk.c cVar = new ksk.c(listSubheaderDelegate, listSubheaderLoadingDelegate, cellDetailsDelegate, bondDetailsController.T);
                        n2h.e eVar2 = new n2h.e(str, z);
                        vfg.p pVar = bondDetailsController.D0;
                        avk.b bVar = bondDetailsController.f103899w0;
                        psk.f fVar = new psk.f(str);
                        psk.d dVar = new psk.d(listSubheaderLoadingDelegate, listSubheaderDelegate, new psk.c(bondDetailsController.U, bondDetailsController.f103891h0));
                        g0 g0Var2 = bondDetailsController.E0;
                        usc.a aVar3 = bondDetailsController.f103898v0;
                        rsk.d dVar2 = new rsk.d(str);
                        d dVar3 = bondDetailsController.z0;
                        fvk.f fVar2 = bondDetailsController.y0;
                        e eVar3 = bondDetailsController.f103900x0;
                        atk.e eVar4 = new atk.e(str);
                        tul.b bVar2 = bondDetailsController.B0;
                        avk.h hVar = bondDetailsController.C0;
                        h3h.e eVar5 = new h3h.e(str, z);
                        h3h.c cVar2 = new h3h.c(bondDetailsController.X, bondDetailsController.f103888b0, bondDetailsController.f103887a0, bondDetailsController.g0, bondDetailsController.f103891h0);
                        f fVar3 = bondDetailsController.F0;
                        dtk.d dVar4 = new dtk.d(cellDetailsDelegate, listSubheaderDelegate);
                        k3h.e eVar6 = new k3h.e(str, wdh.a.FITCH);
                        k3h.c cVar3 = new k3h.c(bondDetailsController.X, bondDetailsController.Y, bondDetailsController.f103887a0, bondDetailsController.f103888b0, bondDetailsController.f0);
                        ctk.g gVar = new ctk.g(listSubheaderDelegate, new ctk.f(bondDetailsController.i0));
                        ctk.h hVar2 = new ctk.h(str);
                        jtk.c cVar4 = new jtk.c(bondDetailsController.f103889d0, bondDetailsController.f103890e0, bondDetailsController.f103892k0);
                        jtk.d dVar5 = new jtk.d(str);
                        g gVar2 = bondDetailsController.G0;
                        m5e.d dVar6 = bondDetailsController.A0;
                        pVar.getClass();
                        bVar.getClass();
                        g0Var2.getClass();
                        aVar3.getClass();
                        dVar3.getClass();
                        fVar2.getClass();
                        eVar3.getClass();
                        bVar2.getClass();
                        hVar.getClass();
                        fVar3.getClass();
                        gVar2.getClass();
                        dVar6.getClass();
                        return new prk.j(g0Var, new xuk.c(), new f3h.b(), new f3h.a(), bondDetailsController, bondDetailsControllerContract$InputData, eVar, cVar, eVar2, pVar, bVar, fVar, dVar, g0Var2, aVar3, dVar2, bondDetailsController, dVar3, fVar2, eVar3, eVar4, bVar2, hVar, eVar5, cVar2, fVar3, dVar4, eVar6, cVar3, gVar, hVar2, cVar4, dVar5, gVar2, dVar6);
                    case 1:
                        KProperty[] kPropertyArr2 = BondDetailsController.H0;
                        return (h) ((prk.j) ((xuk.a) this.f300175b.N.getValue())).F0.get();
                    default:
                        KProperty[] kPropertyArr3 = BondDetailsController.H0;
                        BondDetailsController bondDetailsController2 = this.f300175b;
                        return dli.f.a(bondDetailsController2, (h) bondDetailsController2.O.getValue(), zhm.v.k(bondDetailsController2.P, bondDetailsController2.Q, bondDetailsController2.R, bondDetailsController2.S, bondDetailsController2.T, bondDetailsController2.V, bondDetailsController2.f103894o0, bondDetailsController2.X, bondDetailsController2.Y, bondDetailsController2.Z, bondDetailsController2.f103887a0, bondDetailsController2.f103888b0, bondDetailsController2.c0, bondDetailsController2.f103889d0, bondDetailsController2.f103890e0, bondDetailsController2.f0, bondDetailsController2.g0, bondDetailsController2.f103891h0, bondDetailsController2.f103892k0, bondDetailsController2.p0, bondDetailsController2.j0, bondDetailsController2.l0, bondDetailsController2.W, bondDetailsController2.m0, bondDetailsController2.f103893n0, bondDetailsController2.f103896s0, bondDetailsController2.f103897t0, bondDetailsController2.f103895r0, bondDetailsController2.q0), 0, null, null, null, 60);
                }
            }
        });
        this.f103898v0 = new usc.a(this);
        this.f103899w0 = new avk.b(this, 4);
        this.f103900x0 = new e(this);
        this.y0 = new fvk.f(this);
        this.z0 = new wuk.d(this);
        this.A0 = new d(this);
        this.B0 = new b(this);
        this.C0 = new h(this);
        this.D0 = new p(this, 7);
        this.E0 = new g0(this);
        this.F0 = new f(this);
        this.G0 = new g(this, i);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        wuk.o uiState = (wuk.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        n nVar = uiState.f300202a;
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        if (nVar instanceof k) {
            navBarWithToolbar.l0();
            k kVar = (k) nVar;
            TextClause textClause = kVar.f300199c;
            navBarWithToolbar.setDescriptionText(kVar.f300197a);
            Clause clause = kVar.f300198b;
            if (clause != null) {
                navBarWithToolbar.setSecondDescriptionText(clause);
                navBarWithToolbar.setSecondDescriptionVisible(true);
            } else {
                navBarWithToolbar.setSecondDescriptionVisible(false);
            }
            Clause clause2 = kVar.d;
            if (clause2 == null) {
                navBarWithToolbar.setToolbarTitle(textClause);
            } else {
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textClause, clause2, null, 4, null);
            }
            navBarWithToolbar.setEndImage(kVar.e);
            navBarWithToolbar.setMenuItems(kVar.f);
        } else if (nVar instanceof l) {
            navBarWithToolbar.l0();
        } else {
            if (!(nVar instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        x2h.b bVar = uiState.f300204c;
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        n2h.h.a(bVar, twinHorizontalButton);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (xuk.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wuk.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_stock_details_tab_overview, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setToolbarTitleVisibilityMode(u3.COLLAPSING);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().d.setBackgroundResource(R$drawable.uikit_bottom_container_gradient);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((c) this.u0.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new wkg.e(this, null, 16), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new woc.p(2, (wuk.h) this.O.getValue(), wuk.h.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", 4, 2), 3);
    }

    public final jii.v d3() {
        ViewBinding value = this.M.getValue(this, H0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.u0.getValue();
    }
}
