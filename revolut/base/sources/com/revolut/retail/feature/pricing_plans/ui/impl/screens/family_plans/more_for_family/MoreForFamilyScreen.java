package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$InputData;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import okk.l;
import qgk.i0;
import qgk.s;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lokk/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoreForFamilyScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(MoreForFamilyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final MoreForFamilyScreenContract$InputData K;
    public final RowDelegate L;
    public final Object M;
    public final Object N;
    public final int O;
    public final ao.h P;
    public final Object Q;

    public MoreForFamilyScreen(MoreForFamilyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: okk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreForFamilyScreen f226140b;

            {
                this.f226140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MoreForFamilyScreen moreForFamilyScreen = this.f226140b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoreForFamilyScreen.R;
                        MoreForFamilyScreen moreForFamilyScreen2 = this.f226140b;
                        return dli.f.a(moreForFamilyScreen2, (l) moreForFamilyScreen2.Q.getValue(), u.c(moreForFamilyScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = MoreForFamilyScreen.R;
                        qji.b bVarU2 = moreForFamilyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.di.MoreForFamilyScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        i0 i0Var = jVar.d;
                        qgk.j jVar2 = jVar.e;
                        MoreForFamilyScreenContract$InputData moreForFamilyScreenContract$InputData = moreForFamilyScreen.K;
                        moreForFamilyScreenContract$InputData.getClass();
                        return new s(i0Var, jVar2, moreForFamilyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoreForFamilyScreen.R;
                        return (l) ((s) moreForFamilyScreen.N.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: okk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreForFamilyScreen f226140b;

            {
                this.f226140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MoreForFamilyScreen moreForFamilyScreen = this.f226140b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoreForFamilyScreen.R;
                        MoreForFamilyScreen moreForFamilyScreen2 = this.f226140b;
                        return dli.f.a(moreForFamilyScreen2, (l) moreForFamilyScreen2.Q.getValue(), u.c(moreForFamilyScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = MoreForFamilyScreen.R;
                        qji.b bVarU2 = moreForFamilyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.di.MoreForFamilyScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        i0 i0Var = jVar.d;
                        qgk.j jVar2 = jVar.e;
                        MoreForFamilyScreenContract$InputData moreForFamilyScreenContract$InputData = moreForFamilyScreen.K;
                        moreForFamilyScreenContract$InputData.getClass();
                        return new s(i0Var, jVar2, moreForFamilyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoreForFamilyScreen.R;
                        return (l) ((s) moreForFamilyScreen.N.getValue()).f.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar;
        this.P = vc.s.t(this, okk.h.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: okk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoreForFamilyScreen f226140b;

            {
                this.f226140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MoreForFamilyScreen moreForFamilyScreen = this.f226140b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoreForFamilyScreen.R;
                        MoreForFamilyScreen moreForFamilyScreen2 = this.f226140b;
                        return dli.f.a(moreForFamilyScreen2, (l) moreForFamilyScreen2.Q.getValue(), u.c(moreForFamilyScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = MoreForFamilyScreen.R;
                        qji.b bVarU2 = moreForFamilyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.di.MoreForFamilyScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        i0 i0Var = jVar.d;
                        qgk.j jVar2 = jVar.e;
                        MoreForFamilyScreenContract$InputData moreForFamilyScreenContract$InputData = moreForFamilyScreen.K;
                        moreForFamilyScreenContract$InputData.getClass();
                        return new s(i0Var, jVar2, moreForFamilyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MoreForFamilyScreen.R;
                        return (l) ((s) moreForFamilyScreen.N.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((okk.k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.family_plans_more_for_family_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.family_plans_more_for_family_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new ocb.d(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.L.f53218h, new okk.d(2))), null, new o95.c(this, null, 27), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
