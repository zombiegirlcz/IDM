package com.revolut.feature.spending_analytics.impl.ui.rev10.group_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import ppd.c0;
import qg4.d;
import qpd.c;
import qpd.g;
import qpd.i;
import qpd.j;
import qpd.k;
import qpd.l;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqpd/l;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(GroupDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final SwipeToActionDelegate Q;
    public final Object R;

    public GroupDetailsScreen(GroupDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, qpd.b.f);
        this.M = true;
        this.N = w.y0(new qba.b(this, inputData, 22));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qpd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailsScreen f248349b;

            {
                this.f248349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = GroupDetailsScreen.S;
                        return (g) ((c0) this.f248349b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = GroupDetailsScreen.S;
                        GroupDetailsScreen groupDetailsScreen = this.f248349b;
                        return dli.f.a(groupDetailsScreen, (g) groupDetailsScreen.O.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), groupDetailsScreen.Q), 0, null, null, null, 60);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SwipeToActionDelegate(rowDelegate, false);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: qpd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailsScreen f248349b;

            {
                this.f248349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GroupDetailsScreen.S;
                        return (g) ((c0) this.f248349b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = GroupDetailsScreen.S;
                        GroupDetailsScreen groupDetailsScreen = this.f248349b;
                        return dli.f.a(groupDetailsScreen, (g) groupDetailsScreen.O.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), groupDetailsScreen.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        Clause textClause;
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        int i = R$string.analytics_transactions_breakdown_name_placeholder;
        k kVar = uiState.f248361b;
        i iVar = kVar instanceof i ? (i) kVar : null;
        if (iVar != null) {
            textClause = iVar.f248356a;
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(textClause), null, 12);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        k kVar2 = uiState.f248361b;
        if (kVar2 instanceof i) {
            NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
            navBarWithToolbar2.l0();
            i iVar2 = (i) kVar2;
            navBarWithToolbar2.setEndIconImage(iVar2.f248358c);
            navBarWithToolbar2.setSecondDescriptionText(iVar2.f248357b);
            navBarWithToolbar2.setSecondDescriptionVisible(true);
            return;
        }
        if (kVar2 instanceof j) {
            NavBarWithToolbar navBarWithToolbar3 = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar3, "navBarWithToolbar");
            navBarWithToolbar3.I0(t3.PROFILE, false);
        } else {
            if (!(kVar2 instanceof qpd.h)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f174539b.setVisible(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f), null, new qpd.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
