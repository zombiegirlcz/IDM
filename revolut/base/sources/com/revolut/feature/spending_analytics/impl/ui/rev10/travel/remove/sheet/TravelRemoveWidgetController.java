package com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.TravelRemoveWidgetController;
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
import mhd.b;
import mtd.c;
import mtd.d;
import mtd.f;
import ppd.x0;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/travel/remove/sheet/TravelRemoveWidgetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmtd/a;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelRemoveWidgetController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelRemoveWidgetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K;
    public final h L;
    public final TwinHorizontalButtonDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelRemoveWidgetController(TravelRemoveWidgetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet;
        this.L = s.t(this, c.f);
        this.M = new TwinHorizontalButtonDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mtd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelRemoveWidgetController f208821b;

            {
                this.f208821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelRemoveWidgetController.Q;
                        TravelRemoveWidgetController travelRemoveWidgetController = this.f208821b;
                        f fVar = (f) travelRemoveWidgetController.O.getValue();
                        List listC = u.c(travelRemoveWidgetController.M);
                        ViewBinding value = travelRemoveWidgetController.L.getValue(travelRemoveWidgetController, TravelRemoveWidgetController.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(travelRemoveWidgetController, fVar, listC, ((n) value).f174543c.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelRemoveWidgetController.Q;
                        return (f) ((x0) this.f208821b.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mtd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelRemoveWidgetController f208821b;

            {
                this.f208821b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelRemoveWidgetController.Q;
                        TravelRemoveWidgetController travelRemoveWidgetController = this.f208821b;
                        f fVar = (f) travelRemoveWidgetController.O.getValue();
                        List listC = u.c(travelRemoveWidgetController.M);
                        ViewBinding value = travelRemoveWidgetController.L.getValue(travelRemoveWidgetController, TravelRemoveWidgetController.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(travelRemoveWidgetController, fVar, listC, ((n) value).f174543c.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelRemoveWidgetController.Q;
                        return (f) ((x0) this.f208821b.P.getValue()).d.get();
                }
            }
        });
        this.P = w.y0(new b(this, inputData, 17));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((mtd.a) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.analytics_travel_mode_widget_remove_sheet_title, null, null, 14), new TextLocalisedClause(R$string.analytics_travel_mode_widget_remove_sheet_description, null, null, 14), null, null, false, 28));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
