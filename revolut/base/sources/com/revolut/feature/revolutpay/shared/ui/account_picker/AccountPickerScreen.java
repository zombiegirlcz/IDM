package com.revolut.feature.revolutpay.shared.ui.account_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.shared.R$string;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import edc.c;
import edc.e;
import edc.f;
import jii.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p7c.b;
import p7c.r;
import p7c.x;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerContract$OutputData;", "Ldli/a;", "Ledc/c;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountPickerScreen extends ViewController<AccountPickerContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final AccountPickerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final RowDelegate Q;

    public AccountPickerScreen(AccountPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: edc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerScreen f124975b;

            {
                this.f124975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountPickerScreen accountPickerScreen = this.f124975b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerScreen.R;
                        qji.b bVarU2 = accountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.account_picker.di.AccountPickerScreenInjector");
                        x xVar = (x) bVarU2;
                        r rVar = xVar.f233742b;
                        x xVar2 = xVar.f233743c;
                        AccountPickerContract$InputData accountPickerContract$InputData = accountPickerScreen.K;
                        accountPickerContract$InputData.getClass();
                        return new p7c.b(rVar, xVar2, accountPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerScreen.R;
                        return (b) ((p7c.b) accountPickerScreen.M.getValue()).f233582b.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerScreen.R;
                        AccountPickerScreen accountPickerScreen2 = this.f124975b;
                        return dli.f.a(accountPickerScreen2, (b) accountPickerScreen2.N.getValue(), u.c(accountPickerScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: edc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerScreen f124975b;

            {
                this.f124975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountPickerScreen accountPickerScreen = this.f124975b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerScreen.R;
                        qji.b bVarU2 = accountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.account_picker.di.AccountPickerScreenInjector");
                        x xVar = (x) bVarU2;
                        r rVar = xVar.f233742b;
                        x xVar2 = xVar.f233743c;
                        AccountPickerContract$InputData accountPickerContract$InputData = accountPickerScreen.K;
                        accountPickerContract$InputData.getClass();
                        return new p7c.b(rVar, xVar2, accountPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerScreen.R;
                        return (b) ((p7c.b) accountPickerScreen.M.getValue()).f233582b.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerScreen.R;
                        AccountPickerScreen accountPickerScreen2 = this.f124975b;
                        return dli.f.a(accountPickerScreen2, (b) accountPickerScreen2.N.getValue(), u.c(accountPickerScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: edc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountPickerScreen f124975b;

            {
                this.f124975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountPickerScreen accountPickerScreen = this.f124975b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountPickerScreen.R;
                        qji.b bVarU2 = accountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.account_picker.di.AccountPickerScreenInjector");
                        x xVar = (x) bVarU2;
                        r rVar = xVar.f233742b;
                        x xVar2 = xVar.f233743c;
                        AccountPickerContract$InputData accountPickerContract$InputData = accountPickerScreen.K;
                        accountPickerContract$InputData.getClass();
                        return new p7c.b(rVar, xVar2, accountPickerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountPickerScreen.R;
                        return (b) ((p7c.b) accountPickerScreen.M.getValue()).f233582b.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountPickerScreen.R;
                        AccountPickerScreen accountPickerScreen2 = this.f124975b;
                        return dli.f.a(accountPickerScreen2, (b) accountPickerScreen2.N.getValue(), u.c(accountPickerScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, e.f);
        this.Q = new RowDelegate(null, null, 7);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (edc.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174530b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174530b.setTitle(new TextLocalisedClause(R$string.revolut_pay_account_picker_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174530b.f59211b), new ec8.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new f(this, null), 3);
    }

    public final j d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
