package com.revolut.feature.sca_prompt.impl.learn_more;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.sca_prompt.impl.R$string;
import com.revolut.feature.sca_prompt.impl.learn_more.ScaLearnMoreScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ksc.b;
import ksc.d;
import ksc.f;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/sca_prompt/impl/learn_more/ScaLearnMoreScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lksc/f;", "Lno/m;", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScaLearnMoreScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ScaLearnMoreScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final d K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;

    public ScaLearnMoreScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ksc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScaLearnMoreScreen f189410b;

            {
                this.f189410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScaLearnMoreScreen scaLearnMoreScreen = this.f189410b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScaLearnMoreScreen.R;
                        qji.b bVarU2 = scaLearnMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.sca_prompt.impl.learn_more.di.ScaLearnMoreScreenComponent.Injector");
                        gsc.d dVar = (gsc.d) bVarU2;
                        gsc.c cVar = dVar.f146384b;
                        gsc.d dVar2 = dVar.f146385c;
                        d dVar3 = scaLearnMoreScreen.K;
                        dVar3.getClass();
                        return new gsc.a(cVar, dVar2, dVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = ScaLearnMoreScreen.R;
                        return (e) ((gsc.a) scaLearnMoreScreen.N.getValue()).f146372b.get();
                    default:
                        KProperty[] kPropertyArr3 = ScaLearnMoreScreen.R;
                        ScaLearnMoreScreen scaLearnMoreScreen2 = this.f189410b;
                        return dli.f.a(scaLearnMoreScreen2, (e) scaLearnMoreScreen2.O.getValue(), u.c(scaLearnMoreScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ksc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScaLearnMoreScreen f189410b;

            {
                this.f189410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScaLearnMoreScreen scaLearnMoreScreen = this.f189410b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScaLearnMoreScreen.R;
                        qji.b bVarU2 = scaLearnMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.sca_prompt.impl.learn_more.di.ScaLearnMoreScreenComponent.Injector");
                        gsc.d dVar = (gsc.d) bVarU2;
                        gsc.c cVar = dVar.f146384b;
                        gsc.d dVar2 = dVar.f146385c;
                        d dVar3 = scaLearnMoreScreen.K;
                        dVar3.getClass();
                        return new gsc.a(cVar, dVar2, dVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = ScaLearnMoreScreen.R;
                        return (e) ((gsc.a) scaLearnMoreScreen.N.getValue()).f146372b.get();
                    default:
                        KProperty[] kPropertyArr3 = ScaLearnMoreScreen.R;
                        ScaLearnMoreScreen scaLearnMoreScreen2 = this.f189410b;
                        return dli.f.a(scaLearnMoreScreen2, (e) scaLearnMoreScreen2.O.getValue(), u.c(scaLearnMoreScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ksc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScaLearnMoreScreen f189410b;

            {
                this.f189410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScaLearnMoreScreen scaLearnMoreScreen = this.f189410b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScaLearnMoreScreen.R;
                        qji.b bVarU2 = scaLearnMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.sca_prompt.impl.learn_more.di.ScaLearnMoreScreenComponent.Injector");
                        gsc.d dVar = (gsc.d) bVarU2;
                        gsc.c cVar = dVar.f146384b;
                        gsc.d dVar2 = dVar.f146385c;
                        d dVar3 = scaLearnMoreScreen.K;
                        dVar3.getClass();
                        return new gsc.a(cVar, dVar2, dVar3);
                    case 1:
                        KProperty[] kPropertyArr2 = ScaLearnMoreScreen.R;
                        return (e) ((gsc.a) scaLearnMoreScreen.N.getValue()).f146372b.get();
                    default:
                        KProperty[] kPropertyArr3 = ScaLearnMoreScreen.R;
                        ScaLearnMoreScreen scaLearnMoreScreen2 = this.f189410b;
                        return dli.f.a(scaLearnMoreScreen2, (e) scaLearnMoreScreen2.O.getValue(), u.c(scaLearnMoreScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.K.f189415c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gsc.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ksc.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_sca_learn_more_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_sca_learn_more_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new ko2.b(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53226s), new krc.h(this, continuation, 5), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
