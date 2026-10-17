package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type;

import an9.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bfd.b;
import bfd.e;
import bfd.f;
import bfd.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/select_type/SelectAlertTypeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbfd/e;", "Ldli/a;", "Lbfd/f;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectAlertTypeController extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SelectAlertTypeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;

    public SelectAlertTypeController(SelectAlertTypeControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bfd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAlertTypeController f14959b;

            {
                this.f14959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAlertTypeController.Q;
                        return (g) ((ned.b) this.f14959b.P.getValue()).f214436c.get();
                    default:
                        KProperty[] kPropertyArr2 = SelectAlertTypeController.Q;
                        int i2 = R$id.navBarBottomSheet_RecyclerView;
                        SelectAlertTypeController selectAlertTypeController = this.f14959b;
                        return dli.f.a(selectAlertTypeController, (g) selectAlertTypeController.M.getValue(), v.k(new TextDelegate(), selectAlertTypeController.N), i2, null, null, null, 56);
                }
            }
        });
        this.N = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bfd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAlertTypeController f14959b;

            {
                this.f14959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAlertTypeController.Q;
                        return (g) ((ned.b) this.f14959b.P.getValue()).f214436c.get();
                    default:
                        KProperty[] kPropertyArr2 = SelectAlertTypeController.Q;
                        int i22 = R$id.navBarBottomSheet_RecyclerView;
                        SelectAlertTypeController selectAlertTypeController = this.f14959b;
                        return dli.f.a(selectAlertTypeController, (g) selectAlertTypeController.M.getValue(), v.k(new TextDelegate(), selectAlertTypeController.N), i22, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new bc1.a(this, inputData, 4));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f14964a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ned.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((c) this.O.getValue()).h().setTag("SELECT_ALERT_TYPE_CONTROLLER_RECYCLER_VIEW");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(this.N.f53218h), 27), null, new b74.e(this, null, 22), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
