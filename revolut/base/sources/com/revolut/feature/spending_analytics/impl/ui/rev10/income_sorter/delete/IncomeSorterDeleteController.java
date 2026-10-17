package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.d0;
import rgf.b;
import rpd.c;
import rpd.f;
import rpd.g;
import rpd.i;
import rpd.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/delete/IncomeSorterDeleteController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrpd/f;", "Ldli/a;", "Lrpd/g;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterDeleteController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(IncomeSorterDeleteController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ControllerIncomeSorterDeleteBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;

    public IncomeSorterDeleteController(IncomeSorterDeleteContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.controller_income_sorter_delete;
        this.L = s.t(this, i.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rpd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDeleteController f256371b;

            {
                this.f256371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterDeleteController.P;
                        return (c) ((d0) this.f256371b.N.getValue()).f238391c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterDeleteController.P;
                        IncomeSorterDeleteController incomeSorterDeleteController = this.f256371b;
                        return dli.f.a(incomeSorterDeleteController, (c) incomeSorterDeleteController.M.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate()), incomeSorterDeleteController.d3().f153674c.getId(), null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new b(this, inputData, 15));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: rpd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDeleteController f256371b;

            {
                this.f256371b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterDeleteController.P;
                        return (c) ((d0) this.f256371b.N.getValue()).f238391c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterDeleteController.P;
                        IncomeSorterDeleteController incomeSorterDeleteController = this.f256371b;
                        return dli.f.a(incomeSorterDeleteController, (c) incomeSorterDeleteController.M.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate()), incomeSorterDeleteController.d3().f153674c.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f153673b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.analytics_income_sorter_delete_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_delete_description, null, null, 14), null, null, false, 28));
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.analytics_income_sorter_delete_primary_cta, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.analytics_income_sorter_delete_secondary_cta, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o0()), null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.p0()), null, new j(this, null, 1), 3);
    }

    public final hmd.a d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hmd.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
