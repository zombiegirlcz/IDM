package com.revolut.feature.trading.impl.ui.holdings.information.section.info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.i;
import b5f.b;
import b5f.c;
import b5f.d;
import c4f.g;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.impl.ui.holdings.information.section.info.HoldingsInformationSectionInfoController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/impl/ui/holdings/information/section/info/HoldingsInformationSectionInfoController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lb5f/c;", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HoldingsInformationSectionInfoController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(HoldingsInformationSectionInfoController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public HoldingsInformationSectionInfoController(HoldingsInformationSectionInfoControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: b5f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationSectionInfoController f12515b;

            {
                this.f12515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsInformationSectionInfoController.Q;
                        return (d) ((c4f.g) this.f12515b.P.getValue()).f21215c.get();
                    default:
                        KProperty[] kPropertyArr2 = HoldingsInformationSectionInfoController.Q;
                        HoldingsInformationSectionInfoController holdingsInformationSectionInfoController = this.f12515b;
                        return dli.f.a(holdingsInformationSectionInfoController, (d) holdingsInformationSectionInfoController.L.getValue(), u.c((ListCellDelegate) holdingsInformationSectionInfoController.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar;
        this.N = w.y0(new aw1.a(21));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: b5f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationSectionInfoController f12515b;

            {
                this.f12515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsInformationSectionInfoController.Q;
                        return (d) ((c4f.g) this.f12515b.P.getValue()).f21215c.get();
                    default:
                        KProperty[] kPropertyArr2 = HoldingsInformationSectionInfoController.Q;
                        HoldingsInformationSectionInfoController holdingsInformationSectionInfoController = this.f12515b;
                        return dli.f.a(holdingsInformationSectionInfoController, (d) holdingsInformationSectionInfoController.L.getValue(), u.c((ListCellDelegate) holdingsInformationSectionInfoController.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new at4.b(this, inputData, 21));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(uiState.f12516a, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new i(this, null, 9), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
