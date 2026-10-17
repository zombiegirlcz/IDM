package com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import co7.c;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import d83.i;
import dce.b;
import dcf.n;
import dcf.o;
import dcf.p;
import dcf.r;
import dcf.y;
import h30.l;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import ubf.f;
import vc.s;
import vkm.d;
import z0h.s1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trading_add_ons/impl/ui/add_ons/main_screen/TradingAddOnsMainScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ldcf/y;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lz0h/s1;", "<init>", "()V", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingAddOnsMainScreen extends BaseRecyclerViewScreen<y, IOData$EmptyInput, q> implements s1 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91675h0 = {o0.f186429a.j(new h0(TradingAddOnsMainScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91676a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91677b0;
    public final int c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f91678d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f91679e0;
    public final Object f0;
    public final Object g0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public TradingAddOnsMainScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = w.y0(new b(3));
        this.V = w.y0(new b(4));
        this.W = w.y0(new b(5));
        this.X = w.y0(new b(6));
        this.Y = w.y0(new b(7));
        this.Z = s.t(this, a.f);
        final int i = 0;
        this.f91676a0 = w.y0(new Function0(this) { // from class: dcf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreen f112935b;

            {
                this.f112935b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradingAddOnsMainScreen tradingAddOnsMainScreen = this.f112935b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradingAddOnsMainScreen.f91675h0;
                        return (f) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278887p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TradingAddOnsMainScreen.f91675h0;
                        return (c) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278886n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TradingAddOnsMainScreen.f91675h0;
                        return zhm.v.k(tradingAddOnsMainScreen.i3().d, (FullScreenStateDelegate) tradingAddOnsMainScreen.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreen.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreen.W.getValue(), tradingAddOnsMainScreen.i3().f112920c, tradingAddOnsMainScreen.i3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreen.X.getValue(), (TextDelegate) tradingAddOnsMainScreen.Y.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = TradingAddOnsMainScreen.f91675h0;
                        qji.b bVarQ2 = tradingAddOnsMainScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        return new ubf.f(eVar.f278874b, eVar.f278875c, new zjh.c(tradingAddOnsMainScreen, 16), rd0.e.b(tradingAddOnsMainScreen.h3().f174564b.o));
                    default:
                        KProperty[] kPropertyArr5 = TradingAddOnsMainScreen.f91675h0;
                        return (w) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278885m.get();
                }
            }
        });
        final int i2 = 1;
        this.f91677b0 = w.y0(new Function0(this) { // from class: dcf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreen f112935b;

            {
                this.f112935b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradingAddOnsMainScreen tradingAddOnsMainScreen = this.f112935b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradingAddOnsMainScreen.f91675h0;
                        return (f) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278887p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TradingAddOnsMainScreen.f91675h0;
                        return (c) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278886n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TradingAddOnsMainScreen.f91675h0;
                        return zhm.v.k(tradingAddOnsMainScreen.i3().d, (FullScreenStateDelegate) tradingAddOnsMainScreen.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreen.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreen.W.getValue(), tradingAddOnsMainScreen.i3().f112920c, tradingAddOnsMainScreen.i3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreen.X.getValue(), (TextDelegate) tradingAddOnsMainScreen.Y.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = TradingAddOnsMainScreen.f91675h0;
                        qji.b bVarQ2 = tradingAddOnsMainScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        return new ubf.f(eVar.f278874b, eVar.f278875c, new zjh.c(tradingAddOnsMainScreen, 16), rd0.e.b(tradingAddOnsMainScreen.h3().f174564b.o));
                    default:
                        KProperty[] kPropertyArr5 = TradingAddOnsMainScreen.f91675h0;
                        return (w) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278885m.get();
                }
            }
        });
        this.c0 = R$layout.screen_recycler_navbar_nextbutton;
        this.f91678d0 = R$id.recyclerView;
        final int i3 = 2;
        this.f91679e0 = w.y0(new Function0(this) { // from class: dcf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreen f112935b;

            {
                this.f112935b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TradingAddOnsMainScreen tradingAddOnsMainScreen = this.f112935b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradingAddOnsMainScreen.f91675h0;
                        return (f) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278887p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TradingAddOnsMainScreen.f91675h0;
                        return (c) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278886n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TradingAddOnsMainScreen.f91675h0;
                        return zhm.v.k(tradingAddOnsMainScreen.i3().d, (FullScreenStateDelegate) tradingAddOnsMainScreen.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreen.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreen.W.getValue(), tradingAddOnsMainScreen.i3().f112920c, tradingAddOnsMainScreen.i3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreen.X.getValue(), (TextDelegate) tradingAddOnsMainScreen.Y.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = TradingAddOnsMainScreen.f91675h0;
                        qji.b bVarQ2 = tradingAddOnsMainScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        return new ubf.f(eVar.f278874b, eVar.f278875c, new zjh.c(tradingAddOnsMainScreen, 16), rd0.e.b(tradingAddOnsMainScreen.h3().f174564b.o));
                    default:
                        KProperty[] kPropertyArr5 = TradingAddOnsMainScreen.f91675h0;
                        return (w) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278885m.get();
                }
            }
        });
        final int i5 = 3;
        this.f0 = w.y0(new Function0(this) { // from class: dcf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreen f112935b;

            {
                this.f112935b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TradingAddOnsMainScreen tradingAddOnsMainScreen = this.f112935b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradingAddOnsMainScreen.f91675h0;
                        return (f) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278887p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TradingAddOnsMainScreen.f91675h0;
                        return (c) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278886n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TradingAddOnsMainScreen.f91675h0;
                        return zhm.v.k(tradingAddOnsMainScreen.i3().d, (FullScreenStateDelegate) tradingAddOnsMainScreen.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreen.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreen.W.getValue(), tradingAddOnsMainScreen.i3().f112920c, tradingAddOnsMainScreen.i3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreen.X.getValue(), (TextDelegate) tradingAddOnsMainScreen.Y.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = TradingAddOnsMainScreen.f91675h0;
                        qji.b bVarQ2 = tradingAddOnsMainScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        return new ubf.f(eVar.f278874b, eVar.f278875c, new zjh.c(tradingAddOnsMainScreen, 16), rd0.e.b(tradingAddOnsMainScreen.h3().f174564b.o));
                    default:
                        KProperty[] kPropertyArr5 = TradingAddOnsMainScreen.f91675h0;
                        return (w) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278885m.get();
                }
            }
        });
        final int i6 = 4;
        this.g0 = w.y0(new Function0(this) { // from class: dcf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingAddOnsMainScreen f112935b;

            {
                this.f112935b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TradingAddOnsMainScreen tradingAddOnsMainScreen = this.f112935b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradingAddOnsMainScreen.f91675h0;
                        return (f) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278887p.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TradingAddOnsMainScreen.f91675h0;
                        return (c) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278886n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TradingAddOnsMainScreen.f91675h0;
                        return zhm.v.k(tradingAddOnsMainScreen.i3().d, (FullScreenStateDelegate) tradingAddOnsMainScreen.U.getValue(), (ListSubheaderDelegate) tradingAddOnsMainScreen.V.getValue(), (RowLoadingDelegate) tradingAddOnsMainScreen.W.getValue(), tradingAddOnsMainScreen.i3().f112920c, tradingAddOnsMainScreen.i3().f112919b, (PlanTileDelegate) tradingAddOnsMainScreen.X.getValue(), (TextDelegate) tradingAddOnsMainScreen.Y.getValue());
                    case 3:
                        KProperty[] kPropertyArr4 = TradingAddOnsMainScreen.f91675h0;
                        qji.b bVarQ2 = tradingAddOnsMainScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.di.TradingAddOnsFlowComponent");
                        ubf.e eVar = (ubf.e) bVarQ2;
                        return new ubf.f(eVar.f278874b, eVar.f278875c, new zjh.c(tradingAddOnsMainScreen, 16), rd0.e.b(tradingAddOnsMainScreen.h3().f174564b.o));
                    default:
                        KProperty[] kPropertyArr5 = TradingAddOnsMainScreen.f91675h0;
                        return (w) ((ubf.f) tradingAddOnsMainScreen.f0.getValue()).f278885m.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v45, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ((dcf.f) this.f91676a0.getValue()).a();
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.U.getValue()).f52371h.f121375b), null, new p(this, null), 3);
        h3().f174564b.o(LargeActionButton.ButtonStyle.f58725a);
        h3().f174565c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(i3().d.f53218h), 8), null, new dcf.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(i3().d.f53218h), 9), null, new r(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new c(this, null, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(i3().f112919b.d.f121375b), 10), null, new dcf.s(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(i3().f112919b.d.f121375b), 11), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(l.y(i3().f112920c.d, i3().e.d, "merge(...)"), 12), null, new o(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(e.b(((TextDelegate) this.Y.getValue()).d), 13), null, new o(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174564b.setCustomE2ETestId("GetTradingProButton");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getC0() {
        return (List) this.f91679e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.f91678d0;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(y uiState, jki.o oVar) {
        n6 n6Var;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        dcf.f fVar = (dcf.f) this.f91676a0.getValue();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        fVar.f = uiState.f112976g;
        fVar.f112931g = uiState.d;
        fVar.f112932h = uiState.e;
        fVar.i = uiState.f;
        Clause clause = null;
        h3().f174565c.setTitle(uiState.f112974b.f112982a, null);
        LargeActionButton goToButton = h3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        aw0.e eVar = uiState.f112975c;
        goToButton.setVisibility(eVar != null ? 0 : 8);
        LargeActionButton largeActionButton = h3().f174564b;
        if (eVar != null && (n6Var = eVar.d) != null) {
            clause = n6Var.f10433a;
        }
        largeActionButton.setText(clause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.c0;
    }

    public final u h3() {
        ViewBinding value = this.Z.getValue(this, f91675h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dcf.c i3() {
        return (dcf.c) this.f91677b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final dcf.w T2() {
        return (dcf.w) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // z0h.s1
    public final d r() {
        return e.b(((TextDelegate) this.Y.getValue()).d);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
