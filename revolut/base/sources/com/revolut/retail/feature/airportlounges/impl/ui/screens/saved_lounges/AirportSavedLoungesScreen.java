package com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardSmallLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.AirportSavedLoungesScreen;
import cwi.m0;
import cwi.p0;
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
import rd0.e;
import te0.w;
import v0f.p;
import vc.s;
import vge.z1;
import vo8.b;
import vyi.g;
import vyi.k;
import vyi.l;
import vyi.r;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/saved_lounges/AirportSavedLoungesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvyi/l;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lvyi/k;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportSavedLoungesScreen extends BaseRecyclerViewScreen<l, IOData$EmptyInput, k> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(AirportSavedLoungesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99148a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f99149b0;

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

    public AirportSavedLoungesScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: vyi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportSavedLoungesScreen f293328b;

            {
                this.f293328b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportSavedLoungesScreen airportSavedLoungesScreen = this.f293328b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportSavedLoungesScreen.c0;
                        qji.b bVarQ2 = airportSavedLoungesScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.di.AirportSavedLoungesScreenInjector");
                        p0 p0Var = (p0) bVarQ2;
                        return new m0(p0Var.f109756a, p0Var.f109757b, airportSavedLoungesScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportSavedLoungesScreen.c0;
                        return (r) ((m0) airportSavedLoungesScreen.X.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportSavedLoungesScreen.c0;
                        return v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new ListingCardSmallLoadingDelegate(), (ListingCardBasicDelegate) airportSavedLoungesScreen.Z.getValue(), (FullScreenStateDelegate) airportSavedLoungesScreen.f99148a0.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: vyi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportSavedLoungesScreen f293328b;

            {
                this.f293328b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportSavedLoungesScreen airportSavedLoungesScreen = this.f293328b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportSavedLoungesScreen.c0;
                        qji.b bVarQ2 = airportSavedLoungesScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.di.AirportSavedLoungesScreenInjector");
                        p0 p0Var = (p0) bVarQ2;
                        return new m0(p0Var.f109756a, p0Var.f109757b, airportSavedLoungesScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportSavedLoungesScreen.c0;
                        return (r) ((m0) airportSavedLoungesScreen.X.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportSavedLoungesScreen.c0;
                        return v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new ListingCardSmallLoadingDelegate(), (ListingCardBasicDelegate) airportSavedLoungesScreen.Z.getValue(), (FullScreenStateDelegate) airportSavedLoungesScreen.f99148a0.getValue());
                }
            }
        });
        this.Z = w.y0(new b(17));
        this.f99148a0 = w.y0(new b(18));
        final int i3 = 2;
        this.f99149b0 = w.y0(new Function0(this) { // from class: vyi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportSavedLoungesScreen f293328b;

            {
                this.f293328b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportSavedLoungesScreen airportSavedLoungesScreen = this.f293328b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportSavedLoungesScreen.c0;
                        qji.b bVarQ2 = airportSavedLoungesScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.di.AirportSavedLoungesScreenInjector");
                        p0 p0Var = (p0) bVarQ2;
                        return new m0(p0Var.f109756a, p0Var.f109757b, airportSavedLoungesScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportSavedLoungesScreen.c0;
                        return (r) ((m0) airportSavedLoungesScreen.X.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = AirportSavedLoungesScreen.c0;
                        return v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new ListingCardSmallLoadingDelegate(), (ListingCardBasicDelegate) airportSavedLoungesScreen.Z.getValue(), (FullScreenStateDelegate) airportSavedLoungesScreen.f99148a0.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (m0) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (r) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new z1(this, null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, new v2e.h0(e.b(((FullScreenStateDelegate) this.f99148a0.getValue()).f52371h.f121375b), 22), null, new g(this, null), 3);
        ?? r62 = this.Z;
        com.revolut.kompot.navigable.a.g2(this, new p(new v2e.h0(e.b(((ListingCardBasicDelegate) r62.getValue()).f52729c), 23), 9), null, new vyi.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new p(new v2e.h0(e.b(((ListingCardBasicDelegate) r62.getValue()).d), 24), 10), null, new vyi.h(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF106400d0() {
        return (List) this.f99149b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.airport_lounges_saved_lounges_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.airport_lounges_saved_lounges_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF51191v0() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
