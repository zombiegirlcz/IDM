package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.m0;
import au0.s0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.insurance_embedded.impl.R$id;
import com.revolut.feature.insurance_embedded.impl.R$layout;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p73.d;
import pv7.f;
import pv7.g;
import pv7.i;
import pv7.j;
import pv7.k;
import pv7.l;
import pv7.n;
import pv7.o;
import pv7.r;
import te0.w;
import tx0.o2;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/details/InsuranceDetailsLayoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/details/a;", "Ldli/a;", "Lpv7/r;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceDetailsLayoutScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(InsuranceDetailsLayoutScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_embedded/impl/databinding/ScreenEmbeddedInsuranceDetailsLayoutBinding;", 0))};
    public final InsuranceDetailsLayoutScreenContract$InputData K;
    public final int L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final HighlightTileDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final PlainTextWarningDelegate R;
    public final ActionWidgetDelegate S;
    public final TextDelegate T;
    public final Object U;
    public final h V;
    public final Object W;
    public final Object X;

    public InsuranceDetailsLayoutScreen(InsuranceDetailsLayoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_embedded_insurance_details_layout;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new HighlightTileDelegate();
        this.Q = new CellDetailsChevronDelegate();
        this.R = new PlainTextWarningDelegate();
        this.S = new ActionWidgetDelegate();
        this.T = new TextDelegate();
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: pv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDetailsLayoutScreen f239983b;

            {
                this.f239983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen = this.f239983b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDetailsLayoutScreen.Y;
                        InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen2 = this.f239983b;
                        return dli.f.a(insuranceDetailsLayoutScreen2, insuranceDetailsLayoutScreen2.d(), zhm.v.k(insuranceDetailsLayoutScreen2.N, insuranceDetailsLayoutScreen2.O, insuranceDetailsLayoutScreen2.P, insuranceDetailsLayoutScreen2.Q, insuranceDetailsLayoutScreen2.R, insuranceDetailsLayoutScreen2.S, insuranceDetailsLayoutScreen2.T, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.embeddedInsuranceDetails_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDetailsLayoutScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDetailsLayoutScreen.m2()).a().get(lu7.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lu7.s.class, " is not found"));
                        }
                        lu7.s sVar = ((lu7.s) aVar2.b()).o;
                        InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData = insuranceDetailsLayoutScreen.K;
                        insuranceDetailsLayoutScreenContract$InputData.getClass();
                        return new lu7.n(sVar, insuranceDetailsLayoutScreen, insuranceDetailsLayoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDetailsLayoutScreen.Y;
                        return (q) ((lu7.n) insuranceDetailsLayoutScreen.W.getValue()).f200143g.get();
                }
            }
        });
        this.V = s.t(this, pv7.b.f);
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: pv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDetailsLayoutScreen f239983b;

            {
                this.f239983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen = this.f239983b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDetailsLayoutScreen.Y;
                        InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen2 = this.f239983b;
                        return dli.f.a(insuranceDetailsLayoutScreen2, insuranceDetailsLayoutScreen2.d(), zhm.v.k(insuranceDetailsLayoutScreen2.N, insuranceDetailsLayoutScreen2.O, insuranceDetailsLayoutScreen2.P, insuranceDetailsLayoutScreen2.Q, insuranceDetailsLayoutScreen2.R, insuranceDetailsLayoutScreen2.S, insuranceDetailsLayoutScreen2.T, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.embeddedInsuranceDetails_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDetailsLayoutScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDetailsLayoutScreen.m2()).a().get(lu7.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lu7.s.class, " is not found"));
                        }
                        lu7.s sVar = ((lu7.s) aVar2.b()).o;
                        InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData = insuranceDetailsLayoutScreen.K;
                        insuranceDetailsLayoutScreenContract$InputData.getClass();
                        return new lu7.n(sVar, insuranceDetailsLayoutScreen, insuranceDetailsLayoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDetailsLayoutScreen.Y;
                        return (q) ((lu7.n) insuranceDetailsLayoutScreen.W.getValue()).f200143g.get();
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: pv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDetailsLayoutScreen f239983b;

            {
                this.f239983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen = this.f239983b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDetailsLayoutScreen.Y;
                        InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen2 = this.f239983b;
                        return dli.f.a(insuranceDetailsLayoutScreen2, insuranceDetailsLayoutScreen2.d(), zhm.v.k(insuranceDetailsLayoutScreen2.N, insuranceDetailsLayoutScreen2.O, insuranceDetailsLayoutScreen2.P, insuranceDetailsLayoutScreen2.Q, insuranceDetailsLayoutScreen2.R, insuranceDetailsLayoutScreen2.S, insuranceDetailsLayoutScreen2.T, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.embeddedInsuranceDetails_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDetailsLayoutScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDetailsLayoutScreen.m2()).a().get(lu7.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lu7.s.class, " is not found"));
                        }
                        lu7.s sVar = ((lu7.s) aVar2.b()).o;
                        InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData = insuranceDetailsLayoutScreen.K;
                        insuranceDetailsLayoutScreenContract$InputData.getClass();
                        return new lu7.n(sVar, insuranceDetailsLayoutScreen, insuranceDetailsLayoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDetailsLayoutScreen.Y;
                        return (q) ((lu7.n) insuranceDetailsLayoutScreen.W.getValue()).f200143g.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f168529c;
        Clause clause = uiState.f239997c;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        largeActionButton.setText(clause);
        NavBarWithBigTile navBarWithBigTile = d3().d;
        pv7.o oVar2 = uiState.f239996b;
        if (oVar2 instanceof n) {
            navBarWithBigTile.setLoadingState(false);
            n nVar = (n) oVar2;
            TextClause textClause = nVar.f239989a;
            navBarWithBigTile.setHeightMode(new o2(nVar.e));
            navBarWithBigTile.setTitle(textClause);
            navBarWithBigTile.setToolbarTitle(textClause);
            navBarWithBigTile.setDescription(nVar.f239990b);
            navBarWithBigTile.setMenuItems(nVar.d);
            navBarWithBigTile.setActions(nVar.f239991c);
        } else if (oVar2 instanceof o.a) {
            navBarWithBigTile.setLoadingState(false);
        } else {
            if (!(oVar2 instanceof o.b)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(true);
        }
        d3().f168528b.setBackgroundType(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lu7.n) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().d;
        navBarWithBigTile.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithBigTile.setTitleStyle(b1.DEFAULT);
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.NONE);
        d3().f168529c.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59357t), null, new g(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f168529c.o), null, new g(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.b()), null, new f(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.K()), null, new pv7.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52437c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(this.N.f52371h.f121375b), 29), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f51821c), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new pv7.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f51589c.f121375b), null, new pv7.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d), new f(this, continuation, 0), 3);
    }

    public final iu7.b d3() {
        ViewBinding value = this.V.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iu7.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pv7.q d() {
        return (pv7.q) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
