package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mp7.b;
import mp7.c;
import mp7.d;
import mp7.f;
import mp7.i;
import mp7.j;
import mp7.k;
import ql7.c0;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/proof_of_driving_number/driver_number_input/DriverNumberInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmp7/i;", "Ldli/a;", "Lmp7/k;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DriverNumberInputScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DriverNumberInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final InputTextDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public DriverNumberInputScreen(DriverNumberInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = new InputTextDelegate(null);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mp7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DriverNumberInputScreen f207770b;

            {
                this.f207770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DriverNumberInputScreen.Q;
                        DriverNumberInputScreen driverNumberInputScreen = this.f207770b;
                        return dli.f.a(driverNumberInputScreen, driverNumberInputScreen.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), driverNumberInputScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DriverNumberInputScreen.Q;
                        return (j) ((c0) this.f207770b.O.getValue()).f247257c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new mhd.b(this, inputData, 11));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mp7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DriverNumberInputScreen f207770b;

            {
                this.f207770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DriverNumberInputScreen.Q;
                        DriverNumberInputScreen driverNumberInputScreen = this.f207770b;
                        return dli.f.a(driverNumberInputScreen, driverNumberInputScreen.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), driverNumberInputScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DriverNumberInputScreen.Q;
                        return (j) ((c0) this.f207770b.O.getValue()).f247257c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f207777b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.car_insurance_imid_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.car_insurance_imid_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.car_insurance_imid_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), null, new mp7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.i.f121375b), null, new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
