package com.revolut.feature.check_topup.impl.ui_kompot.screen.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.check_topup.impl.R$string;
import com.revolut.feature.check_topup.impl.ui_kompot.screen.review.CheckTopUpReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fed.a0;
import fg3.b;
import fg3.c;
import fg3.d;
import fg3.f;
import fg3.g;
import fg3.i;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/review/CheckTopUpReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfg3/c;", "Ldli/a;", "Lfg3/d;", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckTopUpReviewScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CheckTopUpReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;

    public CheckTopUpReviewScreen(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new a0(4));
        this.N = w.y0(new a0(5));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: fg3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpReviewScreen f134891b;

            {
                this.f134891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CheckTopUpReviewScreen checkTopUpReviewScreen = this.f134891b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CheckTopUpReviewScreen.S;
                        CheckTopUpReviewScreen checkTopUpReviewScreen2 = this.f134891b;
                        return dli.f.a(checkTopUpReviewScreen2, (i) checkTopUpReviewScreen2.Q.getValue(), v.k((ListSubheaderDelegate) checkTopUpReviewScreen2.M.getValue(), (CellDetailsDelegate) checkTopUpReviewScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckTopUpReviewScreen.S;
                        qji.b bVarU2 = checkTopUpReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.check_topup.impl.ui_kompot.screen.review.di.CheckTopUpReviewScreenInjector");
                        yf3.e eVar = (yf3.e) bVarU2;
                        yf3.c cVar = eVar.f313164b;
                        yf3.e eVar2 = eVar.f313165c;
                        b bVar = checkTopUpReviewScreen.K;
                        bVar.getClass();
                        return new yf3.f(cVar, eVar2, bVar);
                    default:
                        KProperty[] kPropertyArr3 = CheckTopUpReviewScreen.S;
                        return (i) ((yf3.f) checkTopUpReviewScreen.P.getValue()).f313167b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fg3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpReviewScreen f134891b;

            {
                this.f134891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CheckTopUpReviewScreen checkTopUpReviewScreen = this.f134891b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckTopUpReviewScreen.S;
                        CheckTopUpReviewScreen checkTopUpReviewScreen2 = this.f134891b;
                        return dli.f.a(checkTopUpReviewScreen2, (i) checkTopUpReviewScreen2.Q.getValue(), v.k((ListSubheaderDelegate) checkTopUpReviewScreen2.M.getValue(), (CellDetailsDelegate) checkTopUpReviewScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckTopUpReviewScreen.S;
                        qji.b bVarU2 = checkTopUpReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.check_topup.impl.ui_kompot.screen.review.di.CheckTopUpReviewScreenInjector");
                        yf3.e eVar = (yf3.e) bVarU2;
                        yf3.c cVar = eVar.f313164b;
                        yf3.e eVar2 = eVar.f313165c;
                        b bVar = checkTopUpReviewScreen.K;
                        bVar.getClass();
                        return new yf3.f(cVar, eVar2, bVar);
                    default:
                        KProperty[] kPropertyArr3 = CheckTopUpReviewScreen.S;
                        return (i) ((yf3.f) checkTopUpReviewScreen.P.getValue()).f313167b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fg3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpReviewScreen f134891b;

            {
                this.f134891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CheckTopUpReviewScreen checkTopUpReviewScreen = this.f134891b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckTopUpReviewScreen.S;
                        CheckTopUpReviewScreen checkTopUpReviewScreen2 = this.f134891b;
                        return dli.f.a(checkTopUpReviewScreen2, (i) checkTopUpReviewScreen2.Q.getValue(), v.k((ListSubheaderDelegate) checkTopUpReviewScreen2.M.getValue(), (CellDetailsDelegate) checkTopUpReviewScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckTopUpReviewScreen.S;
                        qji.b bVarU2 = checkTopUpReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.check_topup.impl.ui_kompot.screen.review.di.CheckTopUpReviewScreenInjector");
                        yf3.e eVar = (yf3.e) bVarU2;
                        yf3.c cVar = eVar.f313164b;
                        yf3.e eVar2 = eVar.f313165c;
                        b bVar = checkTopUpReviewScreen.K;
                        bVar.getClass();
                        return new yf3.f(cVar, eVar2, bVar);
                    default:
                        KProperty[] kPropertyArr3 = CheckTopUpReviewScreen.S;
                        return (i) ((yf3.f) checkTopUpReviewScreen.P.getValue()).f313167b.get();
                }
            }
        });
        this.R = s.t(this, f.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yf3.f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_check_confirmation_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f174564b.setText(new TextLocalisedClause(R$string.topup_check_confirmation_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
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
