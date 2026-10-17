package com.revolut.feature.insurance_credit.impl.ui.screen.details;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.m0;
import au0.s0;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.insurance_credit.impl.R$id;
import com.revolut.feature.insurance_credit.impl.R$layout;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tk5.c;
import tt7.d;
import tt7.f;
import tt7.g;
import tt7.j;
import tt7.k;
import tt7.n;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/screen/details/InsuranceDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/insurance_credit/impl/ui/screen/details/a;", "Ldli/a;", "Ltt7/o;", "Lno/m;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceDetailsScreen extends ViewController<a> implements dli.a, m {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(InsuranceDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_credit/impl/databinding/ScreenInsuranceDetailsLayoutBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final int L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final CellDetailsDelegate P;
    public final CellDetailsNoteDelegate Q;
    public final RowLoadingDelegate R;
    public final ListSubheaderDelegate S;
    public final ListSubheaderLoadingDelegate T;
    public final Object U;
    public final h V;
    public final Object W;
    public final Object X;

    public InsuranceDetailsScreen(InsuranceDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.L = R$layout.screen_insurance_details_layout;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new CellDetailsDelegate();
        this.Q = new CellDetailsNoteDelegate();
        this.R = new RowLoadingDelegate();
        this.S = new ListSubheaderDelegate();
        this.T = new ListSubheaderLoadingDelegate();
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: tt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDetailsScreen f274241b;

            {
                this.f274241b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDetailsScreen.Y;
                        InsuranceDetailsScreen insuranceDetailsScreen = this.f274241b;
                        return dli.f.a(insuranceDetailsScreen, insuranceDetailsScreen.d(), v.k(insuranceDetailsScreen.N, insuranceDetailsScreen.O, insuranceDetailsScreen.P, insuranceDetailsScreen.Q, insuranceDetailsScreen.R, insuranceDetailsScreen.S, insuranceDetailsScreen.T), R$id.insuranceDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = InsuranceDetailsScreen.Y;
                        return (n) ((bt7.k) this.f274241b.W.getValue()).f.get();
                }
            }
        });
        this.V = s.t(this, tt7.b.f);
        this.W = w.y0(new tml.a(this, inputData, 13));
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: tt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDetailsScreen f274241b;

            {
                this.f274241b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDetailsScreen.Y;
                        InsuranceDetailsScreen insuranceDetailsScreen = this.f274241b;
                        return dli.f.a(insuranceDetailsScreen, insuranceDetailsScreen.d(), v.k(insuranceDetailsScreen.N, insuranceDetailsScreen.O, insuranceDetailsScreen.P, insuranceDetailsScreen.Q, insuranceDetailsScreen.R, insuranceDetailsScreen.S, insuranceDetailsScreen.T), R$id.insuranceDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = InsuranceDetailsScreen.Y;
                        return (n) ((bt7.k) this.f274241b.W.getValue()).f.get();
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
        tt7.o uiState = (tt7.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f324820c;
        k kVar = uiState.f274254b;
        if (kVar instanceof j) {
            navBarWithBigTile.setLoadingState(false);
            j jVar = (j) kVar;
            TextClause textClause = jVar.f274245a;
            navBarWithBigTile.setTitle(textClause);
            navBarWithBigTile.setToolbarTitle(textClause);
            navBarWithBigTile.setDescription(jVar.f274246b);
            navBarWithBigTile.setActions(jVar.f274247c);
        } else if (kVar instanceof k.a) {
            navBarWithBigTile.setLoadingState(false);
        } else {
            if (!(kVar instanceof k.b)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(true);
        }
        d3().f324819b.setBackgroundType(uiState.f274255c);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt7.k) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f324820c;
        navBarWithBigTile.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithBigTile.setTitleStyle(b1.DEFAULT);
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.NONE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f324820c.f59357t), new c(this, null, 14), 3);
        ViewController.P2(this, rd0.e.b(d3().f324820c.K()), new d(this, null), 3);
        CellDetailsDelegate cellDetailsDelegate = this.P;
        ViewController.P2(this, rd0.e.b(cellDetailsDelegate.e), new tt7.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(cellDetailsDelegate.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new g(this, null), 3);
        ViewController.P2(this, new t9l.f(rd0.e.b(this.N.f52371h.f121375b), 24), new tt7.h(this, null), 3);
    }

    public final zs7.a d3() {
        ViewBinding value = this.V.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (zs7.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
