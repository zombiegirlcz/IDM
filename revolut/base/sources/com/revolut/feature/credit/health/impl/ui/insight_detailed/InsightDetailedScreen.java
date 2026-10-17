package com.revolut.feature.credit.health.impl.ui.insight_detailed;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.health.impl.R$id;
import com.revolut.feature.credit.health.impl.R$layout;
import com.revolut.feature.credit.health.impl.ui.insight_detailed.InsightDetailedScreen;
import com.revolut.feature.credit.health.impl.ui.insight_detailed.InsightDetailedScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.q1;
import vc.s;
import y05.b;
import y05.c;
import y05.e;
import y05.f;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/insight_detailed/InsightDetailedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ly05/e;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsightDetailedScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(InsightDetailedScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/health/impl/databinding/ScreenInsightDetailedBinding;", 0))};
    public final InsightDetailedScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public InsightDetailedScreen(InsightDetailedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_insight_detailed;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: y05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightDetailedScreen f310144b;

            {
                this.f310144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsightDetailedScreen insightDetailedScreen = this.f310144b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsightDetailedScreen.Q;
                        InsightDetailedScreen insightDetailedScreen2 = this.f310144b;
                        return dli.f.a(insightDetailedScreen2, (f) insightDetailedScreen2.P.getValue(), v.k(new FullScreenStateDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.insightDetailedScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsightDetailedScreen.Q;
                        qji.b bVarU2 = insightDetailedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.insight_detailed.di.InsightDetailedScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        q05.e eVar = fVar.f241152a;
                        q05.f fVar2 = fVar.f241153b;
                        InsightDetailedScreenContract$InputData insightDetailedScreenContract$InputData = insightDetailedScreen.K;
                        insightDetailedScreenContract$InputData.getClass();
                        return new q05.h(eVar, fVar2, insightDetailedScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsightDetailedScreen.Q;
                        return (f) ((q05.h) insightDetailedScreen.O.getValue()).f241158b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: y05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightDetailedScreen f310144b;

            {
                this.f310144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsightDetailedScreen insightDetailedScreen = this.f310144b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsightDetailedScreen.Q;
                        InsightDetailedScreen insightDetailedScreen2 = this.f310144b;
                        return dli.f.a(insightDetailedScreen2, (f) insightDetailedScreen2.P.getValue(), v.k(new FullScreenStateDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.insightDetailedScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsightDetailedScreen.Q;
                        qji.b bVarU2 = insightDetailedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.insight_detailed.di.InsightDetailedScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        q05.e eVar = fVar.f241152a;
                        q05.f fVar2 = fVar.f241153b;
                        InsightDetailedScreenContract$InputData insightDetailedScreenContract$InputData = insightDetailedScreen.K;
                        insightDetailedScreenContract$InputData.getClass();
                        return new q05.h(eVar, fVar2, insightDetailedScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsightDetailedScreen.Q;
                        return (f) ((q05.h) insightDetailedScreen.O.getValue()).f241158b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: y05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightDetailedScreen f310144b;

            {
                this.f310144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsightDetailedScreen insightDetailedScreen = this.f310144b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsightDetailedScreen.Q;
                        InsightDetailedScreen insightDetailedScreen2 = this.f310144b;
                        return dli.f.a(insightDetailedScreen2, (f) insightDetailedScreen2.P.getValue(), v.k(new FullScreenStateDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.insightDetailedScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsightDetailedScreen.Q;
                        qji.b bVarU2 = insightDetailedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.health.impl.ui.insight_detailed.di.InsightDetailedScreenInjector");
                        q05.f fVar = (q05.f) bVarU2;
                        q05.e eVar = fVar.f241152a;
                        q05.f fVar2 = fVar.f241153b;
                        InsightDetailedScreenContract$InputData insightDetailedScreenContract$InputData = insightDetailedScreen.K;
                        insightDetailedScreenContract$InputData.getClass();
                        return new q05.h(eVar, fVar2, insightDetailedScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsightDetailedScreen.Q;
                        return (f) ((q05.h) insightDetailedScreen.O.getValue()).f241158b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        o05.b bVarD3 = d3();
        bVarD3.f221156c.setModel(uiState.f310147b);
        bVarD3.f221155b.setModel(uiState.d);
        bVarD3.f221156c.setLargeImage(uiState.f310148c, q1.AVATAR);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q05.h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f221156c.f59292m), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f221155b.f), null, new c(this, null, 1), 3);
    }

    public final o05.b d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o05.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
