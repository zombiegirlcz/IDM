package com.revolut.feature.credit.health.impl.ui.learn_more;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c15.b;
import c15.d;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.health.impl.ui.learn_more.LearnMoreScreen;
import com.revolut.feature.credit.health.impl.ui.learn_more.LearnMoreScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import q05.j;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/learn_more/LearnMoreScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lc15/d;", "Lno/m;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LearnMoreScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LearnMoreScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LearnMoreScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public LearnMoreScreen(LearnMoreScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: c15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnMoreScreen f20378b;

            {
                this.f20378b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LearnMoreScreen learnMoreScreen = this.f20378b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LearnMoreScreen.R;
                        LearnMoreScreen learnMoreScreen2 = this.f20378b;
                        return dli.f.a(learnMoreScreen2, (e) learnMoreScreen2.Q.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LearnMoreScreen.R;
                        qji.b bVarU2 = learnMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.learn_more.di.LearnMoreScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        q05.e eVar = fVar.f241152a;
                        q05.f fVar2 = fVar.f241153b;
                        LearnMoreScreenContract$InputData learnMoreScreenContract$InputData = learnMoreScreen.K;
                        learnMoreScreenContract$InputData.getClass();
                        return new j(eVar, fVar2, learnMoreScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LearnMoreScreen.R;
                        return (e) ((j) learnMoreScreen.P.getValue()).f241162b.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: c15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnMoreScreen f20378b;

            {
                this.f20378b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LearnMoreScreen learnMoreScreen = this.f20378b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LearnMoreScreen.R;
                        LearnMoreScreen learnMoreScreen2 = this.f20378b;
                        return dli.f.a(learnMoreScreen2, (e) learnMoreScreen2.Q.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LearnMoreScreen.R;
                        qji.b bVarU2 = learnMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.learn_more.di.LearnMoreScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        q05.e eVar = fVar.f241152a;
                        q05.f fVar2 = fVar.f241153b;
                        LearnMoreScreenContract$InputData learnMoreScreenContract$InputData = learnMoreScreen.K;
                        learnMoreScreenContract$InputData.getClass();
                        return new j(eVar, fVar2, learnMoreScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LearnMoreScreen.R;
                        return (e) ((j) learnMoreScreen.P.getValue()).f241162b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: c15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnMoreScreen f20378b;

            {
                this.f20378b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LearnMoreScreen learnMoreScreen = this.f20378b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LearnMoreScreen.R;
                        LearnMoreScreen learnMoreScreen2 = this.f20378b;
                        return dli.f.a(learnMoreScreen2, (e) learnMoreScreen2.Q.getValue(), m72.b.v(null, null, 7), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LearnMoreScreen.R;
                        qji.b bVarU2 = learnMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.learn_more.di.LearnMoreScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        q05.e eVar = fVar.f241152a;
                        q05.f fVar2 = fVar.f241153b;
                        LearnMoreScreenContract$InputData learnMoreScreenContract$InputData = learnMoreScreen.K;
                        learnMoreScreenContract$InputData.getClass();
                        return new j(eVar, fVar2, learnMoreScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LearnMoreScreen.R;
                        return (e) ((j) learnMoreScreen.P.getValue()).f241162b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c15.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_score_learn_more_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_score_learn_more_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_score_learn_more_description, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new brc.h(this, null, 22), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
