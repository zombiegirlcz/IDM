package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.f;
import aw0.i;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import ce9.m;
import cli.o;
import cli.q;
import cnc.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.trading.orders.R$layout;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import cul.a0;
import cul.d0;
import cul.f0;
import cul.g0;
import cul.l;
import cul.n;
import cul.x;
import ful.j;
import isl.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kvl.g;
import no.k;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/screens/edit/InvestOrderEditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcul/x;", "", "Lisl/h;", "Lkvl/g;", "Lno/k;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderEditScreen extends ViewController<x> implements tki.c, h, g, k {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106875h0 = {o0.f186429a.j(new h0(InvestOrderEditScreen.class, "binding", "getBinding()Lcom/revolut/trading/orders/databinding/ScreenInvestOrderEditBinding;", 0))};
    public final InvestOrderEditScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final CenteredAmountDelegate T;
    public final AccountCellItemDelegate U;
    public final ListSubheaderDelegate V;
    public final LargeActionButtonDelegate W;
    public final CellDetailsDelegate X;
    public final CellDetailsLoadingDelegate Y;
    public final CellDetailsActionDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsSwitcherDelegate f106876a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f106877b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f106878d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f106879e0;
    public final Object f0;
    public AnalyticsContext g0;

    public InvestOrderEditScreen(InvestOrderEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_invest_order_edit;
        this.M = s.t(this, cul.e.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i2 = 3;
        this.O = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i3 = 4;
        this.P = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i5 = 5;
        this.Q = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i6 = 6;
        this.R = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i21 = 7;
        this.S = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        this.T = new CenteredAmountDelegate(new t(this, 21));
        this.U = new AccountCellItemDelegate();
        this.V = new ListSubheaderDelegate();
        this.W = new LargeActionButtonDelegate();
        this.X = new CellDetailsDelegate();
        this.Y = new CellDetailsLoadingDelegate();
        this.Z = new CellDetailsActionDelegate();
        this.f106876a0 = new CellDetailsSwitcherDelegate();
        this.f106877b0 = new RowDelegate(null, null, 7);
        final int i22 = 8;
        this.c0 = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i32 = 9;
        this.f106878d0 = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i32;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i33 = 1;
        this.f106879e0 = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i33;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
        final int i43 = 2;
        this.f0 = w.y0(new Function0(this) { // from class: cul.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderEditScreen f109074b;

            {
                this.f109074b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i43;
                InvestOrderEditScreen investOrderEditScreen = this.f109074b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderEditScreen.f106875h0;
                        qji.b bVarU2 = investOrderEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.trading.orders.ui.invest.placement.screens.edit.di.InvestOrderEditScreenComponent.Injector");
                        xsl.f fVar = (xsl.f) bVarU2;
                        xsl.p pVar = fVar.f308620b;
                        xsl.f fVar2 = fVar.f308621c;
                        InvestOrderEditScreenContract$InputData investOrderEditScreenContract$InputData = investOrderEditScreen.K;
                        investOrderEditScreenContract$InputData.getClass();
                        return new xsl.e(pVar, fVar2, investOrderEditScreen, investOrderEditScreenContract$InputData);
                    case 1:
                        return zhm.v.k(investOrderEditScreen.U, investOrderEditScreen.V, investOrderEditScreen.W, investOrderEditScreen.X, investOrderEditScreen.f106877b0, (SwipeToActionDelegate) investOrderEditScreen.c0.getValue());
                    case 2:
                        KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                        InvestOrderEditScreen investOrderEditScreen2 = this.f109074b;
                        return tki.g.a(investOrderEditScreen2, investOrderEditScreen2.d(), (List) investOrderEditScreen2.f106878d0.getValue(), investOrderEditScreen2.e3().d.getId(), null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr3 = InvestOrderEditScreen.f106875h0;
                        return (a0) investOrderEditScreen.R1().C.get();
                    case 4:
                        KProperty[] kPropertyArr4 = InvestOrderEditScreen.f106875h0;
                        qd0.b bVarN = investOrderEditScreen.R1().f308603b.f308697j.n();
                        vc.s.j(bVarN);
                        return bVarN;
                    case 5:
                        KProperty[] kPropertyArr5 = InvestOrderEditScreen.f106875h0;
                        return (KeyboardSuggestionsControllerExtension) investOrderEditScreen.R1().f308606h.get();
                    case 6:
                        KProperty[] kPropertyArr6 = InvestOrderEditScreen.f106875h0;
                        return (j60.a) investOrderEditScreen.R1().f.get();
                    case 7:
                        KProperty[] kPropertyArr7 = InvestOrderEditScreen.f106875h0;
                        return new ful.j(investOrderEditScreen.R1().f308603b.k.k());
                    case 8:
                        KProperty[] kPropertyArr8 = InvestOrderEditScreen.f106875h0;
                        return new SwipeToActionDelegate(investOrderEditScreen.U, false);
                    default:
                        return zhm.v.k(investOrderEditScreen.T, investOrderEditScreen.Y, investOrderEditScreen.Z, investOrderEditScreen.f106876a0);
                }
            }
        });
    }

    public static i d3(Clause clause, TextLocalisedClause textLocalisedClause, boolean z, boolean z3) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        n6 n6Var = new n6(textLocalisedClause, defaultFilledButton, null, "NEXT_BUTTON_LOADING_TAG", z, null, cul.c.f109077a, 460);
        if (!z3) {
            return new aw0.e(true, clause, null, n6Var, null, null, 52);
        }
        return new aw0.g(true, m6.b(n6.Companion, new yy0.h(new TextLocalisedClause(R$string.wealth_orders_order_type_button_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246)), defaultFilledButton, null, false, cul.d.f109084a, Constants.TAG_FC_SPEED_MODE), n6Var, clause, f.SMALL_PRIMARY_BUTTON);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g0 uiState = (g0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        srl.b bVarE3 = e3();
        NavBarWithToolbar navBarWithToolbar = bVarE3.f265250c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        f0 f0Var = uiState.f109105a;
        Clause clause = f0Var.f109099b;
        Clause clause2 = f0Var.f109098a;
        if (clause == null) {
            navBarWithToolbar.setToolbarTitle(clause2);
        } else {
            navBarWithToolbar.setToolbar(clause2, clause, null);
        }
        navBarWithToolbar.setMenuItems(f0Var.f109100c);
        ActionFooterView actionFooterView = bVarE3.f265249b;
        d0 d0Var = uiState.f109106b;
        actionFooterView.setModel(d3(uiState.f, d0Var.f109085a, d0Var.f109086b, uiState.f109107c != null));
        ((KeyboardSuggestionsControllerExtension) this.Q.getValue()).S("KEYBOARD_SUGGESTIONS_SOURCE_ID", uiState.d);
        this.g0 = uiState.f109108g;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.g0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.g0;
    }

    @Override // kvl.g
    /* JADX INFO: renamed from: U0, reason: from getter */
    public final AccountCellItemDelegate getF106937d0() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.R.getValue()).d((List) this.f106879e0.getValue());
        srl.b bVarE3 = e3();
        NavBarWithToolbar navBarWithToolbar = bVarE3.f265250c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
        j jVar = (j) this.S.getValue();
        bfl.g gVar = this.K.f106882c;
        jVar.getClass();
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        m70.a.c(t0.f186434a);
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClauseA, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 4, null);
        ActionFooterView actionFooterView = bVarE3.f265249b;
        actionFooterView.setModel(d3(null, null, false, false));
        Context context = actionFooterView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        actionFooterView.setDescriptionColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        ScreenContentRecyclerView recyclerView = bVarE3.d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        m.f(actionFooterView, recyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((KeyboardSuggestionsControllerExtension) this.Q.getValue()).S("KEYBOARD_SUGGESTIONS_SOURCE_ID", zhm.f0.f322471a);
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        srl.b bVarE3 = e3();
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(bVarE3.f265250c.f59410q), new co7.c(this, continuation, 12), 3);
        ViewController.P2(this, kii.e.t(bVarE3.f265250c.T0, "hide(...)"), new cul.f(this, continuation, 0), 3);
        ActionFooterView actionFooterView = bVarE3.f265249b;
        ViewController.P2(this, vkm.q.J(rd0.e.b(actionFooterView.f), rd0.e.b(actionFooterView.f58955g)), new cul.f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.e), new cul.f(this, continuation, 2), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.T;
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f51966j.f121375b), new cul.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.e.f121375b), new cul.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f51965h.f121375b), new cul.i(this, null), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.i.f121375b), new cul.j(this, null), 3);
        ViewController.P2(this, new cbf.c(rd0.e.b(centeredAmountDelegate.f.f121375b), 24), new cul.f(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f51967l.f121375b), new cul.f(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f51969n.f121375b), new cul.f(this, continuation, 5), 3);
        ViewController.P2(this, ((KeyboardSuggestionsControllerExtension) this.Q.getValue()).R("KEYBOARD_SUGGESTIONS_SOURCE_ID"), new cul.f(this, continuation, 6), 3);
        CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = this.f106876a0;
        ViewController.P2(this, new cbf.c(rd0.e.b(cellDetailsSwitcherDelegate.f51912c), 25), new cul.k(this, null), 3);
        ViewController.P2(this, new cbf.c(rd0.e.b(cellDetailsSwitcherDelegate.d), 26), new l(this, null), 3);
        LargeActionButtonDelegate largeActionButtonDelegate = this.W;
        ViewController.P2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), new cul.m(this, null), 3);
        ViewController.P2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(((j60.a) this.R.getValue()).C()), new cul.f(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(this.Z.d), new cul.o(this, null), 3);
    }

    @Override // kvl.g
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RowDelegate getF106877b0() {
        return this.f106877b0;
    }

    @Override // kvl.g
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final LargeActionButtonDelegate getW() {
        return this.W;
    }

    public final srl.b e3() {
        ViewBinding value = this.M.getValue(this, f106875h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (srl.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final xsl.e R1() {
        return (xsl.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final a0 R2() {
        return (a0) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    @Override // isl.h
    /* JADX INFO: renamed from: j, reason: from getter */
    public final CellDetailsDelegate getX() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.f0.getValue();
    }

    @Override // kvl.g
    /* JADX INFO: renamed from: p1, reason: from getter */
    public final CellDetailsActionDelegate getZ() {
        return this.Z;
    }
}
