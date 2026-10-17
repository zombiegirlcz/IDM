package com.revolut.feature.junior_allowance.impl.ui.screen.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.junior_allowance.impl.R$string;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ec8.b;
import ec8.c;
import ec8.h;
import ec8.i;
import ec8.j;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rb8.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_allowance/impl/ui/screen/list/JuniorAllowancesListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lec8/j;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAllowancesListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorAllowancesListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final RowDelegate Q;
    public final FullScreenStateDelegate R;

    public JuniorAllowancesListScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ec8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowancesListScreen f124458b;

            {
                this.f124458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorAllowancesListScreen juniorAllowancesListScreen = this.f124458b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAllowancesListScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowancesListScreen.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        h hVar = juniorAllowancesListScreen.K;
                        hVar.getClass();
                        return new rb8.d(aVar3, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAllowancesListScreen.S;
                        return (i) ((rb8.d) juniorAllowancesListScreen.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorAllowancesListScreen.S;
                        JuniorAllowancesListScreen juniorAllowancesListScreen2 = this.f124458b;
                        return dli.f.a(juniorAllowancesListScreen2, juniorAllowancesListScreen2.d(), v.k(juniorAllowancesListScreen2.Q, juniorAllowancesListScreen2.R, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ec8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowancesListScreen f124458b;

            {
                this.f124458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorAllowancesListScreen juniorAllowancesListScreen = this.f124458b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAllowancesListScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowancesListScreen.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        h hVar = juniorAllowancesListScreen.K;
                        hVar.getClass();
                        return new rb8.d(aVar3, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAllowancesListScreen.S;
                        return (i) ((rb8.d) juniorAllowancesListScreen.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorAllowancesListScreen.S;
                        JuniorAllowancesListScreen juniorAllowancesListScreen2 = this.f124458b;
                        return dli.f.a(juniorAllowancesListScreen2, juniorAllowancesListScreen2.d(), v.k(juniorAllowancesListScreen2.Q, juniorAllowancesListScreen2.R, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ec8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowancesListScreen f124458b;

            {
                this.f124458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorAllowancesListScreen juniorAllowancesListScreen = this.f124458b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAllowancesListScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowancesListScreen.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        h hVar = juniorAllowancesListScreen.K;
                        hVar.getClass();
                        return new rb8.d(aVar3, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAllowancesListScreen.S;
                        return (i) ((rb8.d) juniorAllowancesListScreen.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorAllowancesListScreen.S;
                        JuniorAllowancesListScreen juniorAllowancesListScreen2 = this.f124458b;
                        return dli.f.a(juniorAllowancesListScreen2, juniorAllowancesListScreen2.d(), v.k(juniorAllowancesListScreen2.Q, juniorAllowancesListScreen2.R, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new RowDelegate(null, null, 7);
        this.R = new FullScreenStateDelegate();
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_allowances_navbar_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_allowances_navbar_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((d) this.M.getValue()).getClass();
        navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.b(PlusActionNavBarMenuItem.INSTANCE, "PLUS_NAV_BAR_MENU_ITEM_ID", new TextLocalisedClause(R$string.junior_allowances_navbar_plus_button_content_description, null, null, 14))));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new ea4.d(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new ec8.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new ec8.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
