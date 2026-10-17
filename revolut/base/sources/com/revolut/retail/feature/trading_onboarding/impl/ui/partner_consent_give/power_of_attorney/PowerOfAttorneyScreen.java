package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import kyk.r;
import ox5.p;
import p0l.c;
import p0l.d;
import p0l.f;
import p0l.j;
import p0l.k;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_give/power_of_attorney/PowerOfAttorneyScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lp0l/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lp0l/f;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PowerOfAttorneyScreen extends BaseRecyclerViewScreen<k, IOData$EmptyInput, f> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PowerOfAttorneyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f104252a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f104253b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f104254d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f104255e0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public PowerOfAttorneyScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = R$id.recyclerView;
        this.X = s.t(this, a.f);
        this.Y = w.y0(new p(27));
        this.Z = w.y0(new p(28));
        this.f104252a0 = w.y0(new p(29));
        final int i = 0;
        this.f104253b0 = w.y0(new p0l.a(0));
        this.c0 = w.y0(new Function0(this) { // from class: p0l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PowerOfAttorneyScreen f231550b;

            {
                this.f231550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PowerOfAttorneyScreen powerOfAttorneyScreen = this.f231550b;
                switch (i2) {
                    case 0:
                        return zhm.v.k((RowDelegate) powerOfAttorneyScreen.Y.getValue(), new RowLoadingDelegate(), (ListCellDelegate) powerOfAttorneyScreen.Z.getValue(), (PlainTextDelegate) powerOfAttorneyScreen.f104252a0.getValue(), new PlainTextLoadingDelegate(), (LargeActionButtonDelegate) powerOfAttorneyScreen.f104253b0.getValue());
                    case 1:
                        KProperty[] kPropertyArr = PowerOfAttorneyScreen.f0;
                        qji.b bVarQ2 = powerOfAttorneyScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreenInjector");
                        kyk.q qVar = (kyk.q) ((o0l.c) bVarQ2);
                        kyk.v vVar = qVar.f190969b;
                        kyk.q qVar2 = qVar.f190970c;
                        kyk.r rVar = new kyk.r();
                        rVar.f190971a = e4m.b.b(e4m.c.a(powerOfAttorneyScreen));
                        int i3 = 22;
                        rVar.f190972b = e4m.b.b(new il8.d(vVar, qVar2, rVar, 2, i3));
                        rVar.f190973c = e4m.b.b(new il8.d(vVar, qVar2, rVar, 1, i3));
                        rVar.d = e4m.b.b(new il8.d(vVar, qVar2, rVar, 0, i3));
                        rVar.e = e4m.b.b(new il8.d(vVar, qVar2, rVar, 5, i3));
                        rVar.f = e4m.b.b(new il8.d(vVar, qVar2, rVar, 4, i3));
                        rVar.f190974g = e4m.b.b(new il8.d(vVar, qVar2, rVar, 3, i3));
                        rVar.f190975h = e4m.b.b(new il8.d(vVar, qVar2, rVar, 7, i3));
                        rVar.i = e4m.b.b(new il8.d(vVar, qVar2, rVar, 6, i3));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr2 = PowerOfAttorneyScreen.f0;
                        return (j) ((kyk.r) powerOfAttorneyScreen.f104254d0.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.f104254d0 = w.y0(new Function0(this) { // from class: p0l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PowerOfAttorneyScreen f231550b;

            {
                this.f231550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PowerOfAttorneyScreen powerOfAttorneyScreen = this.f231550b;
                switch (i22) {
                    case 0:
                        return zhm.v.k((RowDelegate) powerOfAttorneyScreen.Y.getValue(), new RowLoadingDelegate(), (ListCellDelegate) powerOfAttorneyScreen.Z.getValue(), (PlainTextDelegate) powerOfAttorneyScreen.f104252a0.getValue(), new PlainTextLoadingDelegate(), (LargeActionButtonDelegate) powerOfAttorneyScreen.f104253b0.getValue());
                    case 1:
                        KProperty[] kPropertyArr = PowerOfAttorneyScreen.f0;
                        qji.b bVarQ2 = powerOfAttorneyScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreenInjector");
                        kyk.q qVar = (kyk.q) ((o0l.c) bVarQ2);
                        kyk.v vVar = qVar.f190969b;
                        kyk.q qVar2 = qVar.f190970c;
                        kyk.r rVar = new kyk.r();
                        rVar.f190971a = e4m.b.b(e4m.c.a(powerOfAttorneyScreen));
                        int i3 = 22;
                        rVar.f190972b = e4m.b.b(new il8.d(vVar, qVar2, rVar, 2, i3));
                        rVar.f190973c = e4m.b.b(new il8.d(vVar, qVar2, rVar, 1, i3));
                        rVar.d = e4m.b.b(new il8.d(vVar, qVar2, rVar, 0, i3));
                        rVar.e = e4m.b.b(new il8.d(vVar, qVar2, rVar, 5, i3));
                        rVar.f = e4m.b.b(new il8.d(vVar, qVar2, rVar, 4, i3));
                        rVar.f190974g = e4m.b.b(new il8.d(vVar, qVar2, rVar, 3, i3));
                        rVar.f190975h = e4m.b.b(new il8.d(vVar, qVar2, rVar, 7, i3));
                        rVar.i = e4m.b.b(new il8.d(vVar, qVar2, rVar, 6, i3));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr2 = PowerOfAttorneyScreen.f0;
                        return (j) ((kyk.r) powerOfAttorneyScreen.f104254d0.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.f104255e0 = w.y0(new Function0(this) { // from class: p0l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PowerOfAttorneyScreen f231550b;

            {
                this.f231550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PowerOfAttorneyScreen powerOfAttorneyScreen = this.f231550b;
                switch (i22) {
                    case 0:
                        return zhm.v.k((RowDelegate) powerOfAttorneyScreen.Y.getValue(), new RowLoadingDelegate(), (ListCellDelegate) powerOfAttorneyScreen.Z.getValue(), (PlainTextDelegate) powerOfAttorneyScreen.f104252a0.getValue(), new PlainTextLoadingDelegate(), (LargeActionButtonDelegate) powerOfAttorneyScreen.f104253b0.getValue());
                    case 1:
                        KProperty[] kPropertyArr = PowerOfAttorneyScreen.f0;
                        qji.b bVarQ2 = powerOfAttorneyScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreenInjector");
                        kyk.q qVar = (kyk.q) ((o0l.c) bVarQ2);
                        kyk.v vVar = qVar.f190969b;
                        kyk.q qVar2 = qVar.f190970c;
                        kyk.r rVar = new kyk.r();
                        rVar.f190971a = e4m.b.b(e4m.c.a(powerOfAttorneyScreen));
                        int i32 = 22;
                        rVar.f190972b = e4m.b.b(new il8.d(vVar, qVar2, rVar, 2, i32));
                        rVar.f190973c = e4m.b.b(new il8.d(vVar, qVar2, rVar, 1, i32));
                        rVar.d = e4m.b.b(new il8.d(vVar, qVar2, rVar, 0, i32));
                        rVar.e = e4m.b.b(new il8.d(vVar, qVar2, rVar, 5, i32));
                        rVar.f = e4m.b.b(new il8.d(vVar, qVar2, rVar, 4, i32));
                        rVar.f190974g = e4m.b.b(new il8.d(vVar, qVar2, rVar, 3, i32));
                        rVar.f190975h = e4m.b.b(new il8.d(vVar, qVar2, rVar, 7, i32));
                        rVar.i = e4m.b.b(new il8.d(vVar, qVar2, rVar, 6, i32));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr2 = PowerOfAttorneyScreen.f0;
                        return (j) ((kyk.r) powerOfAttorneyScreen.f104254d0.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r) this.f104254d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.f104255e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f104253b0.getValue()).d.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new d(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((r) this.f104254d0.getValue()).f.get()).d(u.c((LargeActionButtonDelegate) this.f104253b0.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getC0() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f231558a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f231559b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final m h3() {
        ViewBinding value = this.X.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
