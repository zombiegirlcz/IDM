package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation.TripsRemoveConfirmationController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.e1;
import sod.b;
import sod.c;
import sod.e;
import sod.f;
import sod.g;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/remove_confirmation/TripsRemoveConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsod/b;", "Ldli/a;", "Lsod/c;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripsRemoveConfirmationController extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TripsRemoveConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final LargeActionButtonDelegate P;
    public final Object Q;

    public TripsRemoveConfirmationController(TripsRemoveConfirmationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet;
        this.L = s.t(this, e.f);
        this.M = R$style.UiKitTheme_Night;
        this.N = w.y0(new s86.a(this, inputData, 22));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sod.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsRemoveConfirmationController f264822b;

            {
                this.f264822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TripsRemoveConfirmationController.R;
                        return (g) ((e1) this.f264822b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = TripsRemoveConfirmationController.R;
                        TripsRemoveConfirmationController tripsRemoveConfirmationController = this.f264822b;
                        g gVar = (g) tripsRemoveConfirmationController.O.getValue();
                        List listK = v.k(new HeaderDelegate(), tripsRemoveConfirmationController.P);
                        ViewBinding value = tripsRemoveConfirmationController.L.getValue(tripsRemoveConfirmationController, TripsRemoveConfirmationController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(tripsRemoveConfirmationController, gVar, listK, ((n) value).f174543c.getId(), null, null, null, 56);
                }
            }
        });
        this.P = new LargeActionButtonDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: sod.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsRemoveConfirmationController f264822b;

            {
                this.f264822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TripsRemoveConfirmationController.R;
                        return (g) ((e1) this.f264822b.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = TripsRemoveConfirmationController.R;
                        TripsRemoveConfirmationController tripsRemoveConfirmationController = this.f264822b;
                        g gVar = (g) tripsRemoveConfirmationController.O.getValue();
                        List listK = v.k(new HeaderDelegate(), tripsRemoveConfirmationController.P);
                        ViewBinding value = tripsRemoveConfirmationController.L.getValue(tripsRemoveConfirmationController, TripsRemoveConfirmationController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(tripsRemoveConfirmationController, gVar, listK, ((n) value).f174543c.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new f(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
