package com.revolut.feature.masav.impl.ui.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.masav.api.R$string;
import com.revolut.feature.masav.impl.ui.review.MasavDirectDebitReviewScreen;
import com.revolut.feature.masav.impl.ui.review.MasavDirectDebitReviewScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import i69.b;
import i69.c;
import i69.d;
import i69.g;
import i69.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/review/MasavDirectDebitReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li69/g;", "Ldli/a;", "Li69/n;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MasavDirectDebitReviewScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(MasavDirectDebitReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final MasavDirectDebitReviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public MasavDirectDebitReviewScreen(MasavDirectDebitReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: i69.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavDirectDebitReviewScreen f158892b;

            {
                this.f158892b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MasavDirectDebitReviewScreen masavDirectDebitReviewScreen = this.f158892b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MasavDirectDebitReviewScreen.R;
                        return (h) ((w59.b) masavDirectDebitReviewScreen.P.getValue()).f294734c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MasavDirectDebitReviewScreen.R;
                        qji.b bVarU2 = masavDirectDebitReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.masav.impl.ui.review.di.MasavDirectDebitReviewScreenInjector");
                        w59.c cVar = (w59.c) bVarU2;
                        w59.d dVar = cVar.f294735a;
                        w59.c cVar2 = cVar.f294736b;
                        MasavDirectDebitReviewScreenContract$InputData masavDirectDebitReviewScreenContract$InputData = masavDirectDebitReviewScreen.K;
                        masavDirectDebitReviewScreenContract$InputData.getClass();
                        return new w59.b(dVar, cVar2, masavDirectDebitReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MasavDirectDebitReviewScreen.R;
                        MasavDirectDebitReviewScreen masavDirectDebitReviewScreen2 = this.f158892b;
                        return dli.f.a(masavDirectDebitReviewScreen2, masavDirectDebitReviewScreen2.R2(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate(), masavDirectDebitReviewScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: i69.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavDirectDebitReviewScreen f158892b;

            {
                this.f158892b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MasavDirectDebitReviewScreen masavDirectDebitReviewScreen = this.f158892b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MasavDirectDebitReviewScreen.R;
                        return (h) ((w59.b) masavDirectDebitReviewScreen.P.getValue()).f294734c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MasavDirectDebitReviewScreen.R;
                        qji.b bVarU2 = masavDirectDebitReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.masav.impl.ui.review.di.MasavDirectDebitReviewScreenInjector");
                        w59.c cVar = (w59.c) bVarU2;
                        w59.d dVar = cVar.f294735a;
                        w59.c cVar2 = cVar.f294736b;
                        MasavDirectDebitReviewScreenContract$InputData masavDirectDebitReviewScreenContract$InputData = masavDirectDebitReviewScreen.K;
                        masavDirectDebitReviewScreenContract$InputData.getClass();
                        return new w59.b(dVar, cVar2, masavDirectDebitReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MasavDirectDebitReviewScreen.R;
                        MasavDirectDebitReviewScreen masavDirectDebitReviewScreen2 = this.f158892b;
                        return dli.f.a(masavDirectDebitReviewScreen2, masavDirectDebitReviewScreen2.R2(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate(), masavDirectDebitReviewScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: i69.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavDirectDebitReviewScreen f158892b;

            {
                this.f158892b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MasavDirectDebitReviewScreen masavDirectDebitReviewScreen = this.f158892b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MasavDirectDebitReviewScreen.R;
                        return (h) ((w59.b) masavDirectDebitReviewScreen.P.getValue()).f294734c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MasavDirectDebitReviewScreen.R;
                        qji.b bVarU2 = masavDirectDebitReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.masav.impl.ui.review.di.MasavDirectDebitReviewScreenInjector");
                        w59.c cVar = (w59.c) bVarU2;
                        w59.d dVar = cVar.f294735a;
                        w59.c cVar2 = cVar.f294736b;
                        MasavDirectDebitReviewScreenContract$InputData masavDirectDebitReviewScreenContract$InputData = masavDirectDebitReviewScreen.K;
                        masavDirectDebitReviewScreenContract$InputData.getClass();
                        return new w59.b(dVar, cVar2, masavDirectDebitReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MasavDirectDebitReviewScreen.R;
                        MasavDirectDebitReviewScreen masavDirectDebitReviewScreen2 = this.f158892b;
                        return dli.f.a(masavDirectDebitReviewScreen2, masavDirectDebitReviewScreen2.R2(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate(), masavDirectDebitReviewScreen2.N), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w59.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_submit, null, null, 14, d3().f174557b);
        d3().f174558c.setContent(new c7(new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_footer, u.c(new TextLocalisedClause(R$string.masav_direct_debits_review_direct_debit_footer_link, null, new Click(30, (Integer) null, (Object) null, "TERMS_CONDITIONS_CLICK", false), 10)), null, 12), false, null, 6));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174558c.f58608l), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new c(this, null, 2), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new i69.e(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i69.h R2() {
        return (i69.h) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
