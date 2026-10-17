package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.d;
import lu7.s;
import njj.n;
import nv7.b;
import nv7.f;
import nv7.i;
import nv7.j;
import nv7.l;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/cfac_coverage_selection/CfacCoverageSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lnv7/j;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfacCoverageSelectionScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CfacCoverageSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CfacCoverageSelectionScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final TextDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public CfacCoverageSelectionScreen(CfacCoverageSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new ns1.a(27));
        this.N = w.y0(new ns1.a(28));
        this.O = new TextDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: nv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfacCoverageSelectionScreen f219540b;

            {
                this.f219540b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfacCoverageSelectionScreen cfacCoverageSelectionScreen = this.f219540b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfacCoverageSelectionScreen.T;
                        CfacCoverageSelectionScreen cfacCoverageSelectionScreen2 = this.f219540b;
                        return dli.f.a(cfacCoverageSelectionScreen2, cfacCoverageSelectionScreen2.d(), v.k((FullScreenStateDelegate) cfacCoverageSelectionScreen2.M.getValue(), (RowDelegate) cfacCoverageSelectionScreen2.N.getValue(), cfacCoverageSelectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CfacCoverageSelectionScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cfacCoverageSelectionScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CfacCoverageSelectionScreenContract$InputData cfacCoverageSelectionScreenContract$InputData = cfacCoverageSelectionScreen.K;
                        cfacCoverageSelectionScreenContract$InputData.getClass();
                        return new lu7.d(sVar, cfacCoverageSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CfacCoverageSelectionScreen.T;
                        return (l) ((lu7.d) cfacCoverageSelectionScreen.R.getValue()).f200081c.get();
                }
            }
        });
        this.Q = vc.s.t(this, b.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: nv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfacCoverageSelectionScreen f219540b;

            {
                this.f219540b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfacCoverageSelectionScreen cfacCoverageSelectionScreen = this.f219540b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfacCoverageSelectionScreen.T;
                        CfacCoverageSelectionScreen cfacCoverageSelectionScreen2 = this.f219540b;
                        return dli.f.a(cfacCoverageSelectionScreen2, cfacCoverageSelectionScreen2.d(), v.k((FullScreenStateDelegate) cfacCoverageSelectionScreen2.M.getValue(), (RowDelegate) cfacCoverageSelectionScreen2.N.getValue(), cfacCoverageSelectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CfacCoverageSelectionScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cfacCoverageSelectionScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CfacCoverageSelectionScreenContract$InputData cfacCoverageSelectionScreenContract$InputData = cfacCoverageSelectionScreen.K;
                        cfacCoverageSelectionScreenContract$InputData.getClass();
                        return new lu7.d(sVar, cfacCoverageSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CfacCoverageSelectionScreen.T;
                        return (l) ((lu7.d) cfacCoverageSelectionScreen.R.getValue()).f200081c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: nv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfacCoverageSelectionScreen f219540b;

            {
                this.f219540b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CfacCoverageSelectionScreen cfacCoverageSelectionScreen = this.f219540b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfacCoverageSelectionScreen.T;
                        CfacCoverageSelectionScreen cfacCoverageSelectionScreen2 = this.f219540b;
                        return dli.f.a(cfacCoverageSelectionScreen2, cfacCoverageSelectionScreen2.d(), v.k((FullScreenStateDelegate) cfacCoverageSelectionScreen2.M.getValue(), (RowDelegate) cfacCoverageSelectionScreen2.N.getValue(), cfacCoverageSelectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CfacCoverageSelectionScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cfacCoverageSelectionScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        CfacCoverageSelectionScreenContract$InputData cfacCoverageSelectionScreenContract$InputData = cfacCoverageSelectionScreen.K;
                        cfacCoverageSelectionScreenContract$InputData.getClass();
                        return new lu7.d(sVar, cfacCoverageSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CfacCoverageSelectionScreen.T;
                        return (l) ((lu7.d) cfacCoverageSelectionScreen.R.getValue()).f200081c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        i iVar = uiState.f219550b;
        if (!(iVar instanceof nv7.h)) {
            if (iVar instanceof i.a) {
                navBarWithToolbar.setLoadingVisible(false);
                return;
            } else {
                if (!(iVar instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.setLoadingVisible(true);
                return;
            }
        }
        navBarWithToolbar.setLoadingVisible(false);
        nv7.h hVar = (nv7.h) iVar;
        TextClause textClause = hVar.f219544a;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setSecondDescriptionText(hVar.f219545b);
        navBarWithToolbar.setMenuItems(hVar.f219546c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new nuh.j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new nv7.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new nv7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new n(rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), 19), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d), null, new nv7.d(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
