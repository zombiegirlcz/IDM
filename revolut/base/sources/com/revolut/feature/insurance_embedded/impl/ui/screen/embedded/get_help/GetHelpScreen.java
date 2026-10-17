package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.j;
import lu7.s;
import te0.w;
import tv7.b;
import tv7.d;
import tv7.f;
import tv7.g;
import tv7.i;
import tx0.j0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/get_help/GetHelpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltv7/i;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GetHelpScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(GetHelpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final GetHelpScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final CounterTextDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public GetHelpScreen(GetHelpScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = new CounterTextDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: tv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GetHelpScreen f274719b;

            {
                this.f274719b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GetHelpScreen getHelpScreen = this.f274719b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GetHelpScreen.T;
                        GetHelpScreen getHelpScreen2 = this.f274719b;
                        return dli.f.a(getHelpScreen2, getHelpScreen2.d(), v.k(getHelpScreen2.M, getHelpScreen2.N, getHelpScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = GetHelpScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(getHelpScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        GetHelpScreenContract$InputData getHelpScreenContract$InputData = getHelpScreen.K;
                        getHelpScreenContract$InputData.getClass();
                        return new lu7.j(sVar, getHelpScreen, getHelpScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = GetHelpScreen.T;
                        return (j) ((lu7.j) getHelpScreen.R.getValue()).f200119h.get();
                }
            }
        });
        this.Q = vc.s.t(this, b.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: tv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GetHelpScreen f274719b;

            {
                this.f274719b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GetHelpScreen getHelpScreen = this.f274719b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GetHelpScreen.T;
                        GetHelpScreen getHelpScreen2 = this.f274719b;
                        return dli.f.a(getHelpScreen2, getHelpScreen2.d(), v.k(getHelpScreen2.M, getHelpScreen2.N, getHelpScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = GetHelpScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(getHelpScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        GetHelpScreenContract$InputData getHelpScreenContract$InputData = getHelpScreen.K;
                        getHelpScreenContract$InputData.getClass();
                        return new lu7.j(sVar, getHelpScreen, getHelpScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = GetHelpScreen.T;
                        return (j) ((lu7.j) getHelpScreen.R.getValue()).f200119h.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: tv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GetHelpScreen f274719b;

            {
                this.f274719b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GetHelpScreen getHelpScreen = this.f274719b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GetHelpScreen.T;
                        GetHelpScreen getHelpScreen2 = this.f274719b;
                        return dli.f.a(getHelpScreen2, getHelpScreen2.d(), v.k(getHelpScreen2.M, getHelpScreen2.N, getHelpScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = GetHelpScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(getHelpScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        GetHelpScreenContract$InputData getHelpScreenContract$InputData = getHelpScreen.K;
                        getHelpScreenContract$InputData.getClass();
                        return new lu7.j(sVar, getHelpScreen, getHelpScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = GetHelpScreen.T;
                        return (j) ((lu7.j) getHelpScreen.R.getValue()).f200119h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174565c.setLoadingVisible(uiState.f274723b);
        LargeActionButton largeActionButton = d3().f174564b;
        Clause clause = uiState.f274724c;
        largeActionButton.setText(clause);
        largeActionButton.setVisibility(clause != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        int i = R$string.embedded_insurance_contacts_title_getHelp;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(i, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(i, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setLoadingButtonTag("GET_HELP_LOADING_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new tv7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new t9l.f(rd0.e.b(this.M.f52371h.f121375b), 26), null, new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final tv7.j d() {
        return (tv7.j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
