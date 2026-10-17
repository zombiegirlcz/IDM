package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.TimeframePickerScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.TimeframePickerScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx5.b;
import tx5.c;
import tx5.e;
import tx5.f;
import tx5.g;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trending/timeframe/TimeframePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltx5/e;", "Ldli/a;", "Ltx5/g;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimeframePickerScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TimeframePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final TimeframePickerScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final h P;
    public final Object Q;

    public TimeframePickerScreen(TimeframePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimeframePickerScreen f275332b;

            {
                this.f275332b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TimeframePickerScreen timeframePickerScreen = this.f275332b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TimeframePickerScreen.R;
                        qji.b bVarU2 = timeframePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.di.TimeframePickerScreenInjector");
                        ix5.e eVar = (ix5.e) bVarU2;
                        ix5.d dVar = eVar.f169360b;
                        ix5.e eVar2 = eVar.f169361c;
                        TimeframePickerScreenContract$InputData timeframePickerScreenContract$InputData = timeframePickerScreen.K;
                        timeframePickerScreenContract$InputData.getClass();
                        return new ix5.h(dVar, eVar2, timeframePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TimeframePickerScreen.R;
                        return (f) ((ix5.h) timeframePickerScreen.L.getValue()).f169375c.get();
                    default:
                        KProperty[] kPropertyArr3 = TimeframePickerScreen.R;
                        TimeframePickerScreen timeframePickerScreen2 = this.f275332b;
                        return dli.f.a(timeframePickerScreen2, (f) timeframePickerScreen2.M.getValue(), v.k((SingleChoiceDelegate) timeframePickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimeframePickerScreen f275332b;

            {
                this.f275332b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TimeframePickerScreen timeframePickerScreen = this.f275332b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TimeframePickerScreen.R;
                        qji.b bVarU2 = timeframePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.di.TimeframePickerScreenInjector");
                        ix5.e eVar = (ix5.e) bVarU2;
                        ix5.d dVar = eVar.f169360b;
                        ix5.e eVar2 = eVar.f169361c;
                        TimeframePickerScreenContract$InputData timeframePickerScreenContract$InputData = timeframePickerScreen.K;
                        timeframePickerScreenContract$InputData.getClass();
                        return new ix5.h(dVar, eVar2, timeframePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TimeframePickerScreen.R;
                        return (f) ((ix5.h) timeframePickerScreen.L.getValue()).f169375c.get();
                    default:
                        KProperty[] kPropertyArr3 = TimeframePickerScreen.R;
                        TimeframePickerScreen timeframePickerScreen2 = this.f275332b;
                        return dli.f.a(timeframePickerScreen2, (f) timeframePickerScreen2.M.getValue(), v.k((SingleChoiceDelegate) timeframePickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_bottomsheet;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: tx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimeframePickerScreen f275332b;

            {
                this.f275332b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TimeframePickerScreen timeframePickerScreen = this.f275332b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TimeframePickerScreen.R;
                        qji.b bVarU2 = timeframePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.di.TimeframePickerScreenInjector");
                        ix5.e eVar = (ix5.e) bVarU2;
                        ix5.d dVar = eVar.f169360b;
                        ix5.e eVar2 = eVar.f169361c;
                        TimeframePickerScreenContract$InputData timeframePickerScreenContract$InputData = timeframePickerScreen.K;
                        timeframePickerScreenContract$InputData.getClass();
                        return new ix5.h(dVar, eVar2, timeframePickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TimeframePickerScreen.R;
                        return (f) ((ix5.h) timeframePickerScreen.L.getValue()).f169375c.get();
                    default:
                        KProperty[] kPropertyArr3 = TimeframePickerScreen.R;
                        TimeframePickerScreen timeframePickerScreen2 = this.f275332b;
                        return dli.f.a(timeframePickerScreen2, (f) timeframePickerScreen2.M.getValue(), v.k((SingleChoiceDelegate) timeframePickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = w.y0(new ts1.h(29));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ix5.h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((SingleChoiceDelegate) this.Q.getValue()).p()), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
