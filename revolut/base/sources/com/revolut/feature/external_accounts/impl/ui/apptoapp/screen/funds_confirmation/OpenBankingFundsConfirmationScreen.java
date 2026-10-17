package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cj6.b;
import cj6.c;
import cj6.e;
import cj6.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.z2;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/funds_confirmation/OpenBankingFundsConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcj6/e;", "Ldli/a;", "Lcj6/h;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OpenBankingFundsConfirmationScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(OpenBankingFundsConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;

    public OpenBankingFundsConfirmationScreen(OpenBankingFundsConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingFundsConfirmationScreen f24608b;

            {
                this.f24608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = OpenBankingFundsConfirmationScreen.P;
                        OpenBankingFundsConfirmationScreen openBankingFundsConfirmationScreen = this.f24608b;
                        return dli.f.a(openBankingFundsConfirmationScreen, (g) openBankingFundsConfirmationScreen.O.getValue(), v.k(new IconDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = OpenBankingFundsConfirmationScreen.P;
                        return (g) ((z2) this.f24608b.N.getValue()).d.get();
                }
            }
        });
        this.N = w.y0(new cf6.a(this, inputData, 6));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: cj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingFundsConfirmationScreen f24608b;

            {
                this.f24608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OpenBankingFundsConfirmationScreen.P;
                        OpenBankingFundsConfirmationScreen openBankingFundsConfirmationScreen = this.f24608b;
                        return dli.f.a(openBankingFundsConfirmationScreen, (g) openBankingFundsConfirmationScreen.O.getValue(), v.k(new IconDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new RowDelegate(null, null, 7)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = OpenBankingFundsConfirmationScreen.P;
                        return (g) ((z2) this.f24608b.N.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((cj6.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.oba_authorize_accounts_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
