package com.revolut.core.backend_flow.impl.ui.base_form_screen;

import aim.e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import aw0.i;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.R$string;
import com.revolut.core.backend_flow.impl.R$id;
import com.revolut.core.backend_flow.impl.R$layout;
import com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import sa0.c;
import sa0.d;
import sa0.f;
import sa0.g;
import sa0.j;
import te0.w;
import tx0.j0;
import vc.s;
import ya0.a;
import ya0.b;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00070\u00062\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/base_form_screen/BaseFormController;", "Lya0/a;", "Lcom/revolut/feature/backend_flow/domain/models/FormScreen;", "D", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lya0/b;", "Ldli/a;", "Lsa0/d;", "Lno/k;", "Lno/m;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseFormController<D extends a> extends ViewController<b> implements dli.a, k, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(BaseFormController.class, "binding", "getBinding()Lcom/revolut/core/backend_flow/impl/databinding/ScreenFormRecyclerNavbarTwinButtonsBinding;", 0))};
    public final FormScreen K;
    public final h L;
    public final Object M;
    public final LargeActionButtonDelegate N;
    public final RowDelegate O;
    public final CellDetailsStandaloneNoteDelegate P;
    public final CellDetailsAccountDelegate Q;
    public final int R;
    public final boolean S;
    public final Object T;

    public BaseFormController(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.K = screen;
        this.L = s.t(this, f.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sa0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseFormController f261212b;

            {
                this.f261212b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = BaseFormController.U;
                        return this.f261212b.g3().P();
                    default:
                        KProperty[] kPropertyArr2 = BaseFormController.U;
                        BaseFormController baseFormController = this.f261212b;
                        return dli.f.a(baseFormController, baseFormController.h3(), baseFormController.i3(), R$id.screenRecyclerNavbarTwinButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new LargeActionButtonDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new CellDetailsStandaloneNoteDelegate();
        this.Q = new CellDetailsAccountDelegate();
        this.R = R$layout.screen_form_recycler_navbar_twin_buttons;
        this.S = true;
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: sa0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseFormController f261212b;

            {
                this.f261212b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BaseFormController.U;
                        return this.f261212b.g3().P();
                    default:
                        KProperty[] kPropertyArr2 = BaseFormController.U;
                        BaseFormController baseFormController = this.f261212b;
                        return dli.f.a(baseFormController, baseFormController.h3(), baseFormController.i3(), R$id.screenRecyclerNavbarTwinButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        Clause textClause;
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        c cVar = uiState.f261209b;
        NavBarWithToolbar navBarWithToolbarJ3 = j3();
        Clause clause = cVar.f261205a;
        Clause clause2 = cVar.f261206b;
        if (clause == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = clause;
        }
        navBarWithToolbarJ3.setToolbarTitle(textClause);
        navBarWithToolbarJ3.setTitle(clause, null);
        navBarWithToolbarJ3.setTitleVisible(clause != null);
        navBarWithToolbarJ3.setSecondDescriptionText(clause2);
        navBarWithToolbarJ3.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbarJ3.setNavigationButtonImage(cVar.d);
        navBarWithToolbarJ3.setMenuItems(cVar.e);
        navBarWithToolbarJ3.setSearchButtonActive(cVar.f261207c);
        i iVar = uiState.f261210c;
        if (iVar == null) {
            d3().setVisibility(8);
        } else {
            d3().setModel(iVar);
            d3().setVisibility(0);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!j3().f59421x0) {
            return super.F2();
        }
        NavBarWithToolbar navBarWithToolbarJ3 = j3();
        navBarWithToolbarJ3.m0(j4.FADE);
        navBarWithToolbarJ3.setExpanded(true);
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return g3().m().f312422a.getT();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getX() {
        return new AnalyticsContext(g3().m().a(this.K));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        qa0.a aVarF = g3().F();
        aVarF.getClass();
        FormScreen screen = this.K;
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.z = !aVarF.f243921a.J(screen) || aVarF.f243922b.e;
        j3().setHeaderTitleMode(j0.MULTILINE_LARGE);
        j3().setHint(new TextLocalisedClause(R$string.form_builder_search, null, null, 14));
        h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        d3().setVisibility(8);
        e eVarB = u.b();
        eVarB.add(this.O);
        eVarB.add(this.N);
        a0.x(getC0(), eVarB);
        e eVarA = u.a(eVarB);
        ((j60.a) this.M.getValue()).d(eVarA);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                break;
            }
            Object next = bVar.next();
            Class<?> cls = ((koi.k) next).getClass();
            Object arrayList = linkedHashMap.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cls, arrayList);
            }
            ((List) arrayList).add(next);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            if (((List) ((Map.Entry) it8.next()).getValue()).size() > 1) {
                r6.b.D("BottomExpandableDialogExtension contains duplicated delegates");
                return;
            }
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbarJ3 = j3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbarJ3.f59410q), null, new j(this, continuation, 2), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbarJ3.f59409p.f57337m), null, new ryj.f(i2, h3(), sa0.a.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", i, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbarJ3.o.f57403b), null, new ryj.f(i2, h3(), sa0.a.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", i, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbarJ3.x0()), null, new ryj.f(i2, h3(), sa0.a.class, "onSecondaryDescriptionClauseClicked", "onSecondaryDescriptionClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e), null, new sa0.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f58956h), null, new sa0.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f58955g), null, new j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d), null, new sa0.h(this, null, 1), 3);
    }

    public final ActionFooterView d3() {
        ActionFooterView screenRecyclerNavbarTwinButtonsActionFooterView = e3().f112421b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwinButtonsActionFooterView, "screenRecyclerNavbarTwinButtonsActionFooterView");
        return screenRecyclerNavbarTwinButtonsActionFooterView;
    }

    public final da0.a e3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (da0.a) value;
    }

    /* JADX INFO: renamed from: f3 */
    public abstract List getC0();

    public abstract ta0.a g3();

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.R;
    }

    public final RecyclerView h() {
        ScreenContentRecyclerView screenRecyclerNavbarTwinButtonsRecyclerView = e3().f112422c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwinButtonsRecyclerView, "screenRecyclerNavbarTwinButtonsRecyclerView");
        return screenRecyclerNavbarTwinButtonsRecyclerView;
    }

    public abstract sa0.a h3();

    public abstract List i3();

    public final NavBarWithToolbar j3() {
        NavBarWithToolbar screenRecyclerNavbarTwinButtonsToolbar = e3().d;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwinButtonsToolbar, "screenRecyclerNavbarTwinButtonsToolbar");
        return screenRecyclerNavbarTwinButtonsToolbar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.S);
    }
}
