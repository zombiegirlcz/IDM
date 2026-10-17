package com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.TimeframePickerContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.TimeframePickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ewg.g;
import ewg.k;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nyg.b;
import nyg.c;
import nyg.e;
import nyg.f;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/dashboard/timeframe_picker/TimeframePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnyg/b;", "Ldli/a;", "Lnyg/c;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimeframePickerScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TimeframePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final TimeframePickerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final h P;
    public final Object Q;

    public TimeframePickerScreen(TimeframePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nyg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimeframePickerScreen f220873b;

            {
                this.f220873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TimeframePickerScreen timeframePickerScreen = this.f220873b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TimeframePickerScreen.R;
                        return (g) ((ewg.g) timeframePickerScreen.M.getValue()).f130190c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TimeframePickerScreen.R;
                        qji.b bVarU2 = timeframePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.di.TimeframePickerScreenInjector");
                        k kVar = (k) bVarU2;
                        ewg.h hVar = kVar.d;
                        k kVar2 = kVar.e;
                        TimeframePickerContract$InputData timeframePickerContract$InputData = timeframePickerScreen.K;
                        timeframePickerContract$InputData.getClass();
                        return new ewg.g(hVar, kVar2, timeframePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TimeframePickerScreen.R;
                        TimeframePickerScreen timeframePickerScreen2 = this.f220873b;
                        return dli.f.a(timeframePickerScreen2, (g) timeframePickerScreen2.L.getValue(), v.k((SingleChoiceDelegate) timeframePickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nyg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimeframePickerScreen f220873b;

            {
                this.f220873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TimeframePickerScreen timeframePickerScreen = this.f220873b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TimeframePickerScreen.R;
                        return (g) ((ewg.g) timeframePickerScreen.M.getValue()).f130190c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TimeframePickerScreen.R;
                        qji.b bVarU2 = timeframePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.di.TimeframePickerScreenInjector");
                        k kVar = (k) bVarU2;
                        ewg.h hVar = kVar.d;
                        k kVar2 = kVar.e;
                        TimeframePickerContract$InputData timeframePickerContract$InputData = timeframePickerScreen.K;
                        timeframePickerContract$InputData.getClass();
                        return new ewg.g(hVar, kVar2, timeframePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TimeframePickerScreen.R;
                        TimeframePickerScreen timeframePickerScreen2 = this.f220873b;
                        return dli.f.a(timeframePickerScreen2, (g) timeframePickerScreen2.L.getValue(), v.k((SingleChoiceDelegate) timeframePickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_bottomsheet;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: nyg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TimeframePickerScreen f220873b;

            {
                this.f220873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TimeframePickerScreen timeframePickerScreen = this.f220873b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TimeframePickerScreen.R;
                        return (g) ((ewg.g) timeframePickerScreen.M.getValue()).f130190c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TimeframePickerScreen.R;
                        qji.b bVarU2 = timeframePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.di.TimeframePickerScreenInjector");
                        k kVar = (k) bVarU2;
                        ewg.h hVar = kVar.d;
                        k kVar2 = kVar.e;
                        TimeframePickerContract$InputData timeframePickerContract$InputData = timeframePickerScreen.K;
                        timeframePickerContract$InputData.getClass();
                        return new ewg.g(hVar, kVar2, timeframePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TimeframePickerScreen.R;
                        TimeframePickerScreen timeframePickerScreen2 = this.f220873b;
                        return dli.f.a(timeframePickerScreen2, (g) timeframePickerScreen2.L.getValue(), v.k((SingleChoiceDelegate) timeframePickerScreen2.Q.getValue(), new ListSubheaderDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, e.f);
        this.Q = w.y0(new nwf.b(11));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (nyg.g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.wealth_analytics_widgetised_timeframe_picker_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((SingleChoiceDelegate) this.Q.getValue()).p()), new f(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
