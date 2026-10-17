package com.revolut.feature.rev10_main_screen.impl.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.IntentCompat;
import androidx.core.util.Consumer;
import androidx.view.ComponentActivity;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.impl.R$id;
import com.revolut.feature.rev10_main_screen.impl.R$layout;
import com.revolut.feature.rev10_main_screen.impl.R$string;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlow;
import com.revolut.kompot.bridge.navigation.DeeplinkDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import eoi.r;
import ftb.c;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import ho.m0;
import java.util.concurrent.atomic.AtomicReference;
import kbb.o;
import kji.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import nkm.u;
import no.d1;
import no.m;
import pt4.d;
import ptb.b;
import ptb.j;
import rd0.e;
import rp0.l0;
import skm.p0;
import te0.w;
import vc.s;
import vkm.q;
import vkm.q0;
import xx9.p;
import yki.f;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lptb/j;", "Lyki/f;", "Landroidx/core/util/Consumer;", "Landroid/content/Intent;", "Lno/m;", "Lno/d1;", "Lkji/g;", "Lho/m0;", "Ljji/m;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainContainerFlow extends ViewController<j> implements f, Consumer<Intent>, m, d1, g, m0, jji.m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(MainContainerFlow.class, "binding", "getBinding()Lcom/revolut/feature/rev10_main_screen/impl/databinding/FlowMainContainerScreenBinding;", 0))};
    public final AnalyticsProduct.Shared K;
    public final int L;
    public final int M;
    public final h N;
    public final wx0.a O;
    public l0 P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public MainContainerFlow(MainContainerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new AnalyticsProduct.Shared(k9.Tab, x0.Tab, q6.Tab, w2.Tab, od.Terminal);
        this.L = R$layout.flow_main_container_screen;
        this.M = R$style.UiKitTheme_TransparentCompat;
        this.N = s.t(this, b.f);
        this.O = new wx0.a(R$id.main_screen_tab_content, R$id.main_screen_tabs);
        this.Q = w.y0(new d(this, inputData, 2));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ptb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainContainerFlow f239638b;

            {
                this.f239638b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = MainContainerFlow.T;
                        return (h) this.f239638b.R1().i.get();
                    default:
                        KProperty[] kPropertyArr2 = MainContainerFlow.T;
                        MainContainerFlow mainContainerFlow = this.f239638b;
                        return czi.c.b(mainContainerFlow, mainContainerFlow.d(), R$id.main_screen_tab_content, new plc.i(1, mainContainerFlow, MainContainerFlow.class, "onStepUpdated", "onStepUpdated(Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$Step;)V", 0, 19));
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ptb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainContainerFlow f239638b;

            {
                this.f239638b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MainContainerFlow.T;
                        return (h) this.f239638b.R1().i.get();
                    default:
                        KProperty[] kPropertyArr2 = MainContainerFlow.T;
                        MainContainerFlow mainContainerFlow = this.f239638b;
                        return czi.c.b(mainContainerFlow, mainContainerFlow.d(), R$id.main_screen_tab_content, new plc.i(1, mainContainerFlow, MainContainerFlow.class, "onStepUpdated", "onStepUpdated(Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$Step;)V", 0, 19));
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        nkm.g gVar = new nkm.g(u.i(d0.Q(((a) d()).f83439q), sbb.m.class));
        while (gVar.hasNext()) {
            ((sbb.m) gVar.next()).f261554m.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).addOnNewIntentListener(this);
        this.P = new l0(m2());
        pd.b.p(view, new TextLocalisedClause(R$string.tab_container, null, null, 14));
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f189514a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        c8g.a.a(controllerContainerCoordinatorLayout, ny0.a.f220589a, new pp5.d(this, 27));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).removeOnNewIntentListener(this);
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Intent intent) {
        Intent intent2 = intent;
        Intrinsics.checkNotNullParameter(intent2, "intent");
        KompotDestination destination = (KompotDestination) IntentCompat.getParcelableExtra(intent2, "intent_kompot_destination_key", KompotDestination.class);
        if (destination == null) {
            return;
        }
        a aVar = (a) d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof DeeplinkDestination) {
            return;
        }
        if (destination instanceof MainContainerScreenDestination.Action) {
            aVar.I2(((MainContainerScreenDestination.Action) destination).f83412a);
        } else if (destination instanceof MainContainerScreenDestination.JustShow) {
            aVar.J2(((MainContainerScreenDestination.JustShow) destination).f83414a);
        } else {
            Intrinsics.checkNotNullParameter(destination, "destination");
            aVar.C1(destination);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AtomicReference atomicReference = r.f127969a;
        int i = 0;
        r.e("flowOnShownStarted", false);
        Flow flowC = ((o) ((c) R1().f208795j.get())).c();
        wx0.a aVar = this.O;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, flowC, null, new ptb.d(this, aVar, null), 3);
        w4l.f fVar = ((akg.o) ((o) ((c) R1().f208795j.get())).d.f127161b).f5954h;
        Unit unit = Unit.f186387a;
        com.revolut.kompot.navigable.a.g2(this, e.b(fVar.f(unit, false)), null, new ptb.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((akg.o) ((o) ((c) R1().f208795j.get())).d.f127161b).i.f(unit, false)), null, new ptb.e(aVar, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, q.q(new g48.r(mo3.a.g(e.b(p.c(((o) ((c) R1().f208795j.get())).f, false, null, 3)), null, null, 3), 20)), null, new ptb.e(aVar, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(aVar.j()), null, new pnb.b(this, continuation, 10), 3);
        q0 q0Var = new q0(e.b(aVar.f()), new ptb.c(this, continuation, 2), 1);
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        com.revolut.kompot.navigable.a.g2(this, q.C(q0Var, oji.e.f225788b), null, null, 7);
        com.revolut.kompot.navigable.a.g2(this, e.b(aVar.a()), null, new ptb.c(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(aVar.k()), null, new ptb.c(this, continuation, 4), 3);
        l0 l0Var = this.P;
        if (l0Var == null) {
            Intrinsics.r("popupMenuDialogDisplayer");
            throw null;
        }
        com.revolut.kompot.navigable.a.g2(this, e.b(l0Var.f256113c), null, new ptb.c(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, ((a) d()).f83445y, null, new ptb.c(this, continuation, i), 3);
        r.e("flowOnShownFinished", false);
    }

    public final ktb.a d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ktb.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final mtb.b R1() {
        return (mtb.b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final ptb.h R2() {
        return (ptb.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        AtomicReference atomicReference = r.f127969a;
        r.e("flowCreateViewStarted", false);
        View viewH2 = super.h2(inflater);
        this.O.e((CoordinatorLayout) viewH2);
        return viewH2;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.S.getValue();
    }
}
