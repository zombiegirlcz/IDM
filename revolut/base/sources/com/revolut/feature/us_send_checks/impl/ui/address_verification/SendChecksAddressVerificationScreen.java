package com.revolut.feature.us_send_checks.impl.ui.address_verification;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.us_send_checks.impl.R$string;
import com.revolut.feature.us_send_checks.impl.ui.address_verification.SendChecksAddressVerificationScreen;
import com.revolut.feature.us_send_checks.impl.ui.address_verification.SendChecksAddressVerificationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.x;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tlg.b;
import tlg.c;
import tlg.e;
import tlg.f;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/us_send_checks/impl/ui/address_verification/SendChecksAddressVerificationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltlg/e;", "Ldli/a;", "Ltlg/f;", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SendChecksAddressVerificationScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SendChecksAddressVerificationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final SendChecksAddressVerificationScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Lazy P;
    public final Lazy Q;
    public final h R;

    public SendChecksAddressVerificationScreen(SendChecksAddressVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tlg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendChecksAddressVerificationScreen f272092b;

            {
                this.f272092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SendChecksAddressVerificationScreen sendChecksAddressVerificationScreen = this.f272092b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SendChecksAddressVerificationScreen.S;
                        return (h) ((mlg.a) sendChecksAddressVerificationScreen.O.getValue()).f206941c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SendChecksAddressVerificationScreen.S;
                        SendChecksAddressVerificationScreen sendChecksAddressVerificationScreen2 = this.f272092b;
                        return dli.f.a(sendChecksAddressVerificationScreen2, sendChecksAddressVerificationScreen2.d(), v.k((MapDelegate) sendChecksAddressVerificationScreen2.P.getValue(), (LargeActionButtonDelegate) sendChecksAddressVerificationScreen2.Q.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SendChecksAddressVerificationScreen.S;
                        qji.b bVarU2 = sendChecksAddressVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.us_send_checks.impl.ui.address_verification.di.SendChecksAddressVerificationScreenInjector");
                        mlg.c cVar = (mlg.c) bVarU2;
                        mlg.b bVar = cVar.f206953a;
                        mlg.c cVar2 = cVar.f206954b;
                        SendChecksAddressVerificationScreenContract$InputData sendChecksAddressVerificationScreenContract$InputData = sendChecksAddressVerificationScreen.K;
                        sendChecksAddressVerificationScreenContract$InputData.getClass();
                        return new mlg.a(bVar, cVar2, sendChecksAddressVerificationScreenContract$InputData);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_two_buttons;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: tlg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendChecksAddressVerificationScreen f272092b;

            {
                this.f272092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SendChecksAddressVerificationScreen sendChecksAddressVerificationScreen = this.f272092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SendChecksAddressVerificationScreen.S;
                        return (h) ((mlg.a) sendChecksAddressVerificationScreen.O.getValue()).f206941c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SendChecksAddressVerificationScreen.S;
                        SendChecksAddressVerificationScreen sendChecksAddressVerificationScreen2 = this.f272092b;
                        return dli.f.a(sendChecksAddressVerificationScreen2, sendChecksAddressVerificationScreen2.d(), v.k((MapDelegate) sendChecksAddressVerificationScreen2.P.getValue(), (LargeActionButtonDelegate) sendChecksAddressVerificationScreen2.Q.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SendChecksAddressVerificationScreen.S;
                        qji.b bVarU2 = sendChecksAddressVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.us_send_checks.impl.ui.address_verification.di.SendChecksAddressVerificationScreenInjector");
                        mlg.c cVar = (mlg.c) bVarU2;
                        mlg.b bVar = cVar.f206953a;
                        mlg.c cVar2 = cVar.f206954b;
                        SendChecksAddressVerificationScreenContract$InputData sendChecksAddressVerificationScreenContract$InputData = sendChecksAddressVerificationScreen.K;
                        sendChecksAddressVerificationScreenContract$InputData.getClass();
                        return new mlg.a(bVar, cVar2, sendChecksAddressVerificationScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: tlg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendChecksAddressVerificationScreen f272092b;

            {
                this.f272092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SendChecksAddressVerificationScreen sendChecksAddressVerificationScreen = this.f272092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SendChecksAddressVerificationScreen.S;
                        return (h) ((mlg.a) sendChecksAddressVerificationScreen.O.getValue()).f206941c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SendChecksAddressVerificationScreen.S;
                        SendChecksAddressVerificationScreen sendChecksAddressVerificationScreen2 = this.f272092b;
                        return dli.f.a(sendChecksAddressVerificationScreen2, sendChecksAddressVerificationScreen2.d(), v.k((MapDelegate) sendChecksAddressVerificationScreen2.P.getValue(), (LargeActionButtonDelegate) sendChecksAddressVerificationScreen2.Q.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SendChecksAddressVerificationScreen.S;
                        qji.b bVarU2 = sendChecksAddressVerificationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.us_send_checks.impl.ui.address_verification.di.SendChecksAddressVerificationScreenInjector");
                        mlg.c cVar = (mlg.c) bVarU2;
                        mlg.b bVar = cVar.f206953a;
                        mlg.c cVar2 = cVar.f206954b;
                        SendChecksAddressVerificationScreenContract$InputData sendChecksAddressVerificationScreenContract$InputData = sendChecksAddressVerificationScreen.K;
                        sendChecksAddressVerificationScreenContract$InputData.getClass();
                        return new mlg.a(bVar, cVar2, sendChecksAddressVerificationScreenContract$InputData);
                }
            }
        });
        this.P = j.b(new tl7.a(i3));
        this.Q = j.b(new tl7.a(3));
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mlg.a) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.send_checks_address_verification_title_long, null, null, 14);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = d3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174574c.setToolbarTitle(textLocalisedClause);
        d3().f174574c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174573b.setText(new TextLocalisedClause(R$string.send_checks_address_verification_cta_button_positive, null, null, 14));
        d3().f174573b.setLoadingButtonTag("ADDRESS_CONFIRMATION_BUTTON_TAG");
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
        d3().e.setText(new TextLocalisedClause(R$string.send_checks_address_verification_cta_button_negative, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((MapDelegate) this.P.getValue()).d), null, new c(this, null, 3), 3);
    }

    public final x d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final tlg.h d() {
        return (tlg.h) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
