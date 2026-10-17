package com.revolut.retail.feature.learn.impl.ui.glossary;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.learn.impl.R$layout;
import com.revolut.retail.feature.learn.impl.R$string;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreen;
import frl.a;
import grl.k9;
import ip0.vc;
import ip0.xc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.o;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import p31.c;
import rd0.e;
import rl8.d;
import ryj.a0;
import ryj.b;
import ryj.f;
import ryj.g;
import ryj.r;
import ryj.s;
import ryj.x;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/learn/impl/ui/glossary/GlossaryHomeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lryj/s;", "Lcom/revolut/retail/feature/learn/impl/ui/glossary/GlossaryHomeScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_learn_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlossaryHomeScreen extends BaseScreen<s, GlossaryHomeScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(GlossaryHomeScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/learn/impl/databinding/ScreenGlossaryHomeBinding;", 0))};
    public final boolean M;
    public final int N;
    public final h O;
    public final ArrayList P;
    public final Object Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public final HashMap T;
    public final ContainerDelegate U;
    public final Object V;
    public final g W;
    public final AnalyticsProduct.Retail X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlossaryHomeScreen(GlossaryHomeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 1;
        this.M = true;
        this.N = R$layout.screen_glossary_home;
        this.O = vc.s.t(this, b.f);
        this.P = new ArrayList();
        this.Q = w.y0(new rxe.b(this, inputData, 5));
        final int i2 = 0;
        this.R = w.y0(new Function0(this) { // from class: ryj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlossaryHomeScreen f258390b;

            {
                this.f258390b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                GlossaryHomeScreen glossaryHomeScreen = this.f258390b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = GlossaryHomeScreen.Y;
                        return (x) ((nyj.a) glossaryHomeScreen.Q.getValue()).f220879c.get();
                    default:
                        return new z4l.j(7, zhm.u.c(glossaryHomeScreen.U), false);
                }
            }
        });
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.S = fullScreenStateDelegate;
        this.T = new HashMap();
        this.U = new ContainerDelegate(v.k(new PlainTextDelegate(), new PlainTextLoadingDelegate(), fullScreenStateDelegate, new RowDelegate(null, null, 7), new ListSubheaderDelegate()), null, 6);
        this.V = w.y0(new Function0(this) { // from class: ryj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlossaryHomeScreen f258390b;

            {
                this.f258390b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                GlossaryHomeScreen glossaryHomeScreen = this.f258390b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = GlossaryHomeScreen.Y;
                        return (x) ((nyj.a) glossaryHomeScreen.Q.getValue()).f220879c.get();
                    default:
                        return new z4l.j(7, zhm.u.c(glossaryHomeScreen.U), false);
                }
            }
        });
        this.W = new g(this);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137509x;
        this.X = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        s uiState = (s) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Tabs tabs = Z2().d;
        ArrayList arrayList = uiState.f258413b;
        int i = uiState.d;
        tabs.setItems(arrayList, uiState.f258414c);
        ArrayList<j> arrayList2 = uiState.f258412a;
        int i2 = 10;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (j xcVar : arrayList2) {
            if (xcVar instanceof xc) {
                xc xcVar2 = (xc) xcVar;
                List<j> list = xcVar2.f167123b;
                ArrayList items = new ArrayList(zhm.w.t(list, i2));
                for (j jVar : list) {
                    if (jVar instanceof a0) {
                        jVar = (j) ((a0) jVar).f258392b;
                    }
                    items.add(jVar);
                }
                String listId = xcVar2.f167122a;
                boolean z = xcVar2.f167124c;
                int i3 = xcVar2.d;
                vc layout = xcVar2.e;
                Object obj2 = xcVar2.f;
                c cVar = xcVar2.f167125g;
                c cVar2 = xcVar2.f167126h;
                c cVar3 = xcVar2.i;
                c cVar4 = xcVar2.f167127j;
                int i5 = xcVar2.k;
                int i6 = xcVar2.f167128l;
                int i21 = xcVar2.f167129m;
                int i22 = xcVar2.f167130n;
                qv0.c positionInBox = xcVar2.o;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(layout, "layout");
                Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
                xcVar = new xc(listId, items, z, i3, layout, obj2, cVar, cVar2, cVar3, cVar4, i5, i6, i21, i22, positionInBox);
            }
            arrayList3.add(xcVar);
            i2 = 10;
        }
        ((z4l.j) this.V.getValue()).c(arrayList3);
        if (oVar == null || !(oVar instanceof r)) {
            Tabs glossaryHomeTabs = Z2().d;
            Intrinsics.checkNotNullExpressionValue(glossaryHomeTabs, "glossaryHomeTabs");
            Tabs.u(glossaryHomeTabs, uiState.f258414c, false, false, false, 14);
            Z2().e.setCurrentItem(i);
        } else {
            r rVar = (r) oVar;
            if (rVar.f258411b) {
                Z2().e.setCurrentItem(i);
            }
            if (rVar.f258410a) {
                Tabs glossaryHomeTabs2 = Z2().d;
                Intrinsics.checkNotNullExpressionValue(glossaryHomeTabs2, "glossaryHomeTabs");
                Tabs.u(glossaryHomeTabs2, uiState.f258414c, false, false, false, 14);
            }
        }
        Object obj3 = arrayList2.get(Z2().e.getCurrentItem());
        xc xcVar3 = obj3 instanceof xc ? (xc) obj3 : null;
        if (xcVar3 == null) {
            return;
        }
        List<j> list2 = xcVar3.f167123b;
        ArrayList arrayList4 = new ArrayList();
        for (j jVar2 : list2) {
            TextClause textClause = jVar2 instanceof a0 ? ((a0) jVar2).f258391a : null;
            if (textClause != null) {
                arrayList4.add(textClause);
            }
        }
        ArrayList arrayList5 = this.P;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        RecyclerView recyclerView = (RecyclerView) this.T.get(Integer.valueOf(i));
        if (recyclerView != null) {
            LabeledVerticalScrollView labeledVerticalScrollView = Z2().f200844b;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            labeledVerticalScrollView.d = recyclerView;
            labeledVerticalScrollView.setLabels(arrayList5);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (nyj.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (x) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(Z2().f200845c.f59410q), null, new rlh.c(this, null, 25), 3);
        r7b.e eVar = new r7b.e(e.b(Z2().d.f58882b), 27);
        ?? r142 = this.R;
        com.revolut.kompot.navigable.a.g2(this, eVar, null, new f(2, (x) r142.getValue(), x.class, "onEvent", "onEvent(Lcom/revolut/retail/feature/learn/impl/ui/glossary/GlossaryHomeScreenContract$Event;)V", 4, 0), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(e.b(this.S.f52371h.f121375b), 28), null, new f(i2, (x) r142.getValue(), x.class, "onEvent", "onEvent(Lcom/revolut/retail/feature/learn/impl/ui/glossary/GlossaryHomeScreenContract$Event;)V", i, 1), 3);
        ihm.f fVar = Z2().f200845c.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(e.b(w.y(fVar, 300L)), 29), null, new q9c.v(i2, (x) r142.getValue(), x.class, "onEvent", "onEvent(Lcom/revolut/retail/feature/learn/impl/ui/glossary/GlossaryHomeScreenContract$Event;)V", i, 29), 3);
        Z2().e.registerOnPageChangeCallback(this.W);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = Z2().f200845c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.investmentlearn_home_tab_glossary, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.investmentlearn_home_tab_glossary, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.investmentlearn_home_header_search_hint, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        this.U.f52125h = new d(this, 25);
        Z2().e.setAdapter((z4l.j) this.V.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        Z2().e.unregisterOnPageChangeCallback(this.W);
    }

    public final lyj.a Z2() {
        ViewBinding value = this.O.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lyj.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
