package com.revolut.feature.main_screen_ui_customization.impl.tabs_order_settings;

import a83.l;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.DraggableRowDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.main_screen_ui_customization.impl.R$string;
import com.revolut.feature.main_screen_ui_customization.impl.tabs_order_settings.TabsOrderSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.f0;
import p49.b;
import q2e.i0;
import q49.d;
import q49.e;
import te0.w;
import tw0.n;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/main_screen_ui_customization/impl/tabs_order_settings/TabsOrderSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lq49/e;", "<init>", "()V", "feature_main_screen_ui_customization_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabsOrderSettingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TabsOrderSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final ItemTouchHelper K;
    public final DraggableRowDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public TabsOrderSettingsScreen() {
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new n(new l(this, 1)));
        this.K = itemTouchHelper;
        this.L = new DraggableRowDelegate(itemTouchHelper);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: q49.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabsOrderSettingsScreen f242082b;

            {
                this.f242082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                TabsOrderSettingsScreen tabsOrderSettingsScreen = this.f242082b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TabsOrderSettingsScreen.Q;
                        TabsOrderSettingsScreen tabsOrderSettingsScreen2 = this.f242082b;
                        return dli.f.a(tabsOrderSettingsScreen2, tabsOrderSettingsScreen2.d(), v.k(tabsOrderSettingsScreen2.L, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TabsOrderSettingsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(tabsOrderSettingsScreen.m2()).a().get(p49.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p49.a.class, " is not found"));
                        }
                        p49.a aVar3 = ((p49.a) aVar2.b()).d;
                        p49.b bVar = new p49.b();
                        int i6 = 14;
                        bVar.f232860a = e4m.b.b(new f0(aVar3, bVar, i5, i6));
                        bVar.f232861b = e4m.b.b(new f0(aVar3, bVar, i3, i6));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = TabsOrderSettingsScreen.Q;
                        return (d) ((p49.b) tabsOrderSettingsScreen.O.getValue()).f232861b.get();
                }
            }
        });
        this.N = s.t(this, a.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: q49.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabsOrderSettingsScreen f242082b;

            {
                this.f242082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                TabsOrderSettingsScreen tabsOrderSettingsScreen = this.f242082b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabsOrderSettingsScreen.Q;
                        TabsOrderSettingsScreen tabsOrderSettingsScreen2 = this.f242082b;
                        return dli.f.a(tabsOrderSettingsScreen2, tabsOrderSettingsScreen2.d(), v.k(tabsOrderSettingsScreen2.L, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TabsOrderSettingsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(tabsOrderSettingsScreen.m2()).a().get(p49.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p49.a.class, " is not found"));
                        }
                        p49.a aVar3 = ((p49.a) aVar2.b()).d;
                        p49.b bVar = new p49.b();
                        int i6 = 14;
                        bVar.f232860a = e4m.b.b(new f0(aVar3, bVar, i5, i6));
                        bVar.f232861b = e4m.b.b(new f0(aVar3, bVar, i3, i6));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = TabsOrderSettingsScreen.Q;
                        return (d) ((p49.b) tabsOrderSettingsScreen.O.getValue()).f232861b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: q49.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabsOrderSettingsScreen f242082b;

            {
                this.f242082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                TabsOrderSettingsScreen tabsOrderSettingsScreen = this.f242082b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TabsOrderSettingsScreen.Q;
                        TabsOrderSettingsScreen tabsOrderSettingsScreen2 = this.f242082b;
                        return dli.f.a(tabsOrderSettingsScreen2, tabsOrderSettingsScreen2.d(), v.k(tabsOrderSettingsScreen2.L, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TabsOrderSettingsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(tabsOrderSettingsScreen.m2()).a().get(p49.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p49.a.class, " is not found"));
                        }
                        p49.a aVar3 = ((p49.a) aVar2.b()).d;
                        p49.b bVar = new p49.b();
                        int i6 = 14;
                        bVar.f232860a = e4m.b.b(new f0(aVar3, bVar, i5, i6));
                        bVar.f232861b = e4m.b.b(new f0(aVar3, bVar, i32, i6));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = TabsOrderSettingsScreen.Q;
                        return (d) ((p49.b) tabsOrderSettingsScreen.O.getValue()).f232861b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174533b.setModel(uiState.f242087b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_subtitle, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause2);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClause, textLocalisedClause2, null, 4, null);
        this.K.attachToRecyclerView(d3().d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new q49.b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.L.e), new i0(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new q49.b(this, continuation, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getM() {
        return R$layout.screen_recycler_navbar_action_footer;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
