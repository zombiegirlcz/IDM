package com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import se4.c;
import sgg.b;
import sgg.e;
import sgg.f;
import sgg.g;
import te0.w;
import vc.s;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/account_registration_tax_id/TravelMilesAccountRegistrationTaxIdScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsgg/e;", "Ldli/a;", "Lsgg/g;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesAccountRegistrationTaxIdScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelMilesAccountRegistrationTaxIdScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final TravelMilesAccountRegistrationTaxIdScreenContract$InputData K;
    public final boolean L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelMilesAccountRegistrationTaxIdScreen(TravelMilesAccountRegistrationTaxIdScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAccountRegistrationTaxIdScreen f262651b;

            {
                this.f262651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesAccountRegistrationTaxIdScreen travelMilesAccountRegistrationTaxIdScreen = this.f262651b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAccountRegistrationTaxIdScreen.R;
                        TravelMilesAccountRegistrationTaxIdScreen travelMilesAccountRegistrationTaxIdScreen2 = this.f262651b;
                        return dli.f.a(travelMilesAccountRegistrationTaxIdScreen2, (f) travelMilesAccountRegistrationTaxIdScreen2.Q.getValue(), y.w(), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAccountRegistrationTaxIdScreen.R;
                        qji.b bVarU2 = travelMilesAccountRegistrationTaxIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.di.TravelMilesAccountRegistrationTaxIdScreenInjector");
                        ufg.b bVar = (ufg.b) bVarU2;
                        ufg.g gVar = bVar.f279668b;
                        ufg.b bVar2 = bVar.f279669c;
                        TravelMilesAccountRegistrationTaxIdScreenContract$InputData travelMilesAccountRegistrationTaxIdScreenContract$InputData = travelMilesAccountRegistrationTaxIdScreen.K;
                        travelMilesAccountRegistrationTaxIdScreenContract$InputData.getClass();
                        return new ufg.a(gVar, bVar2, travelMilesAccountRegistrationTaxIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesAccountRegistrationTaxIdScreen.R;
                        return (f) ((ufg.a) travelMilesAccountRegistrationTaxIdScreen.P.getValue()).f279663c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: sgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAccountRegistrationTaxIdScreen f262651b;

            {
                this.f262651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesAccountRegistrationTaxIdScreen travelMilesAccountRegistrationTaxIdScreen = this.f262651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAccountRegistrationTaxIdScreen.R;
                        TravelMilesAccountRegistrationTaxIdScreen travelMilesAccountRegistrationTaxIdScreen2 = this.f262651b;
                        return dli.f.a(travelMilesAccountRegistrationTaxIdScreen2, (f) travelMilesAccountRegistrationTaxIdScreen2.Q.getValue(), y.w(), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAccountRegistrationTaxIdScreen.R;
                        qji.b bVarU2 = travelMilesAccountRegistrationTaxIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.di.TravelMilesAccountRegistrationTaxIdScreenInjector");
                        ufg.b bVar = (ufg.b) bVarU2;
                        ufg.g gVar = bVar.f279668b;
                        ufg.b bVar2 = bVar.f279669c;
                        TravelMilesAccountRegistrationTaxIdScreenContract$InputData travelMilesAccountRegistrationTaxIdScreenContract$InputData = travelMilesAccountRegistrationTaxIdScreen.K;
                        travelMilesAccountRegistrationTaxIdScreenContract$InputData.getClass();
                        return new ufg.a(gVar, bVar2, travelMilesAccountRegistrationTaxIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesAccountRegistrationTaxIdScreen.R;
                        return (f) ((ufg.a) travelMilesAccountRegistrationTaxIdScreen.P.getValue()).f279663c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: sgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAccountRegistrationTaxIdScreen f262651b;

            {
                this.f262651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesAccountRegistrationTaxIdScreen travelMilesAccountRegistrationTaxIdScreen = this.f262651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAccountRegistrationTaxIdScreen.R;
                        TravelMilesAccountRegistrationTaxIdScreen travelMilesAccountRegistrationTaxIdScreen2 = this.f262651b;
                        return dli.f.a(travelMilesAccountRegistrationTaxIdScreen2, (f) travelMilesAccountRegistrationTaxIdScreen2.Q.getValue(), y.w(), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesAccountRegistrationTaxIdScreen.R;
                        qji.b bVarU2 = travelMilesAccountRegistrationTaxIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.di.TravelMilesAccountRegistrationTaxIdScreenInjector");
                        ufg.b bVar = (ufg.b) bVarU2;
                        ufg.g gVar = bVar.f279668b;
                        ufg.b bVar2 = bVar.f279669c;
                        TravelMilesAccountRegistrationTaxIdScreenContract$InputData travelMilesAccountRegistrationTaxIdScreenContract$InputData = travelMilesAccountRegistrationTaxIdScreen.K;
                        travelMilesAccountRegistrationTaxIdScreenContract$InputData.getClass();
                        return new ufg.a(gVar, bVar2, travelMilesAccountRegistrationTaxIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesAccountRegistrationTaxIdScreen.R;
                        return (f) ((ufg.a) travelMilesAccountRegistrationTaxIdScreen.P.getValue()).f279663c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174546c.setHeaderModel(uiState.f262655b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ufg.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = d3().f174545b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.miles_common_continue, null, null, 14));
        largeActionButton.setLoadingButtonTag("SUBMIT_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new c(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f174546c.F), new sek.q(this, null, 2), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
