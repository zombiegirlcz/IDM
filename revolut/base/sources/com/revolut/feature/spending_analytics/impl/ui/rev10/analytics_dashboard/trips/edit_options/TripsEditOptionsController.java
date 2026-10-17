package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.TripsEditOptionsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kod.c;
import kod.d;
import kod.f;
import kod.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import ppd.b1;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/edit_options/TripsEditOptionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkod/c;", "Ldli/a;", "Lkod/d;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripsEditOptionsController extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TripsEditOptionsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final Object P;

    public TripsEditOptionsController(TripsEditOptionsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_bottom_sheet_list;
        this.L = s.t(this, f.f);
        this.M = w.y0(new k8e.a(this, inputData, 22));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: kod.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsEditOptionsController f186303b;

            {
                this.f186303b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TripsEditOptionsController.Q;
                        return (h) ((b1) this.f186303b.M.getValue()).f238381c.get();
                    default:
                        KProperty[] kPropertyArr2 = TripsEditOptionsController.Q;
                        TripsEditOptionsController tripsEditOptionsController = this.f186303b;
                        return dli.f.a(tripsEditOptionsController, (h) tripsEditOptionsController.N.getValue(), u.c(tripsEditOptionsController.O), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: kod.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripsEditOptionsController f186303b;

            {
                this.f186303b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TripsEditOptionsController.Q;
                        return (h) ((b1) this.f186303b.M.getValue()).f238381c.get();
                    default:
                        KProperty[] kPropertyArr2 = TripsEditOptionsController.Q;
                        TripsEditOptionsController tripsEditOptionsController = this.f186303b;
                        return dli.f.a(tripsEditOptionsController, (h) tripsEditOptionsController.N.getValue(), u.c(tripsEditOptionsController.O), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b1) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (kod.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.trips_edit_trip_options_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
