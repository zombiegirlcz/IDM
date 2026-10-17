package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import g85.f;
import ghk.t;
import gqd.g;
import gqd.i;
import gqd.j;
import gqd.k;
import gqd.m;
import gqd.p;
import jii.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/execution/IncomeSorterExecutionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgqd/k;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterExecutionController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(IncomeSorterExecutionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final SwipeToActionDelegate R;
    public final Object S;

    public IncomeSorterExecutionController(IncomeSorterExecutionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_big_title_nextbutton;
        this.L = s.t(this, m.f);
        this.M = w.y0(new t(this, inputData, 17));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gqd.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterExecutionController f145689b;

            {
                this.f145689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterExecutionController.T;
                        return (f) ((ppd.h0) this.f145689b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterExecutionController.T;
                        IncomeSorterExecutionController incomeSorterExecutionController = this.f145689b;
                        return dli.f.a(incomeSorterExecutionController, incomeSorterExecutionController.d(), zhm.v.k(incomeSorterExecutionController.P, new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), incomeSorterExecutionController.O, incomeSorterExecutionController.R, incomeSorterExecutionController.Q), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new CellDetailsChevronDelegate();
        this.R = new SwipeToActionDelegate(rowDelegate, false);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: gqd.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterExecutionController f145689b;

            {
                this.f145689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterExecutionController.T;
                        return (f) ((ppd.h0) this.f145689b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterExecutionController.T;
                        IncomeSorterExecutionController incomeSorterExecutionController = this.f145689b;
                        return dli.f.a(incomeSorterExecutionController, incomeSorterExecutionController.d(), zhm.v.k(incomeSorterExecutionController.P, new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), incomeSorterExecutionController.O, incomeSorterExecutionController.R, incomeSorterExecutionController.Q), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        j jVar = uiState.f145687b;
        if (jVar instanceof g) {
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setAvatar(null, r0.DEFAULT);
        } else {
            if (jVar instanceof i) {
                navBarWithBigTile.setLoadingState(true);
                return;
            }
            if (!(jVar instanceof gqd.h)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setTitle(new TextLocalisedClause(R$string.analytics_income_sorter_execution_details_title, null, null, 14));
            navBarWithBigTile.setToolbarTitle(new TextLocalisedClause(R$string.analytics_income_sorter_execution_details_title, null, null, 14));
            navBarWithBigTile.setDescription(((gqd.h) jVar).f145684a);
            navBarWithBigTile.setAvatar(new AvatarModel.Default(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_split, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorForeground_10), null, null, null, null, null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ppd.h0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        navBarWithBigTile.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        d3().f174536b.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174537c.f59357t), null, new f(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, new g9j.q(rd0.e.b(this.O.f52371h.f121375b), 17), null, new gqd.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f51821c), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new gqd.q(this, null), 3);
    }

    public final l d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gqd.f d() {
        return (gqd.f) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
