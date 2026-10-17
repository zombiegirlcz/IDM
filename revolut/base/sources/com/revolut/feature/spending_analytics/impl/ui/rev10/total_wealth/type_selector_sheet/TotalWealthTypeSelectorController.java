package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.TotalWealthTypeSelectorController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eq8.b;
import etd.c;
import etd.d;
import etd.f;
import etd.g;
import java.util.List;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.v0;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/type_selector_sheet/TotalWealthTypeSelectorController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Letd/c;", "Ldli/a;", "Letd/d;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TotalWealthTypeSelectorController extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TotalWealthTypeSelectorController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K;
    public final h L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TotalWealthTypeSelectorController(TotalWealthTypeSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet;
        this.L = s.t(this, f.f);
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: etd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthTypeSelectorController f129408b;

            {
                this.f129408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthTypeSelectorController.Q;
                        TotalWealthTypeSelectorController totalWealthTypeSelectorController = this.f129408b;
                        h hVar = (h) totalWealthTypeSelectorController.O.getValue();
                        List listC = u.c(totalWealthTypeSelectorController.M);
                        ViewBinding value = totalWealthTypeSelectorController.L.getValue(totalWealthTypeSelectorController, TotalWealthTypeSelectorController.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(totalWealthTypeSelectorController, hVar, listC, ((n) value).f174543c.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TotalWealthTypeSelectorController.Q;
                        return (h) ((v0) this.f129408b.P.getValue()).f238564c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: etd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthTypeSelectorController f129408b;

            {
                this.f129408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthTypeSelectorController.Q;
                        TotalWealthTypeSelectorController totalWealthTypeSelectorController = this.f129408b;
                        h hVar = (h) totalWealthTypeSelectorController.O.getValue();
                        List listC = u.c(totalWealthTypeSelectorController.M);
                        ViewBinding value = totalWealthTypeSelectorController.L.getValue(totalWealthTypeSelectorController, TotalWealthTypeSelectorController.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(totalWealthTypeSelectorController, hVar, listC, ((n) value).f174543c.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TotalWealthTypeSelectorController.Q;
                        return (h) ((v0) this.f129408b.P.getValue()).f238564c.get();
                }
            }
        });
        this.P = w.y0(new b(this, inputData, 8));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (etd.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
