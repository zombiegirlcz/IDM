package com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.PixAuthorisationPaymentInfoScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.PixAuthorisationPaymentInfoScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.n;
import k16.d;
import k9a.b;
import k9a.e;
import k9a.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import p8a.s;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/payment_info/PixAuthorisationPaymentInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lk9a/e;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAuthorisationPaymentInfoScreen extends ViewController<q> implements a, d1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PixAuthorisationPaymentInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final PixAuthorisationPaymentInfoScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public PixAuthorisationPaymentInfoScreen(PixAuthorisationPaymentInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: k9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationPaymentInfoScreen f182299b;

            {
                this.f182299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAuthorisationPaymentInfoScreen pixAuthorisationPaymentInfoScreen = this.f182299b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationPaymentInfoScreen.R;
                        return (f) ((p8a.q) pixAuthorisationPaymentInfoScreen.N.getValue()).f234059c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationPaymentInfoScreen.R;
                        qji.b bVarU2 = pixAuthorisationPaymentInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.di.PixAuthorisationPaymentInfoScreenInjector");
                        s sVar = (s) bVarU2;
                        d0 d0Var = sVar.f234079b;
                        s sVar2 = sVar.f234080c;
                        PixAuthorisationPaymentInfoScreenContract$InputData pixAuthorisationPaymentInfoScreenContract$InputData = pixAuthorisationPaymentInfoScreen.K;
                        pixAuthorisationPaymentInfoScreenContract$InputData.getClass();
                        return new p8a.q(d0Var, sVar2, pixAuthorisationPaymentInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationPaymentInfoScreen.R;
                        PixAuthorisationPaymentInfoScreen pixAuthorisationPaymentInfoScreen2 = this.f182299b;
                        return dli.f.a(pixAuthorisationPaymentInfoScreen2, (f) pixAuthorisationPaymentInfoScreen2.M.getValue(), u.c((CellDetailsAccountDelegate) pixAuthorisationPaymentInfoScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: k9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationPaymentInfoScreen f182299b;

            {
                this.f182299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAuthorisationPaymentInfoScreen pixAuthorisationPaymentInfoScreen = this.f182299b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationPaymentInfoScreen.R;
                        return (f) ((p8a.q) pixAuthorisationPaymentInfoScreen.N.getValue()).f234059c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationPaymentInfoScreen.R;
                        qji.b bVarU2 = pixAuthorisationPaymentInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.di.PixAuthorisationPaymentInfoScreenInjector");
                        s sVar = (s) bVarU2;
                        d0 d0Var = sVar.f234079b;
                        s sVar2 = sVar.f234080c;
                        PixAuthorisationPaymentInfoScreenContract$InputData pixAuthorisationPaymentInfoScreenContract$InputData = pixAuthorisationPaymentInfoScreen.K;
                        pixAuthorisationPaymentInfoScreenContract$InputData.getClass();
                        return new p8a.q(d0Var, sVar2, pixAuthorisationPaymentInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationPaymentInfoScreen.R;
                        PixAuthorisationPaymentInfoScreen pixAuthorisationPaymentInfoScreen2 = this.f182299b;
                        return dli.f.a(pixAuthorisationPaymentInfoScreen2, (f) pixAuthorisationPaymentInfoScreen2.M.getValue(), u.c((CellDetailsAccountDelegate) pixAuthorisationPaymentInfoScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: k9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationPaymentInfoScreen f182299b;

            {
                this.f182299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAuthorisationPaymentInfoScreen pixAuthorisationPaymentInfoScreen = this.f182299b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationPaymentInfoScreen.R;
                        return (f) ((p8a.q) pixAuthorisationPaymentInfoScreen.N.getValue()).f234059c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationPaymentInfoScreen.R;
                        qji.b bVarU2 = pixAuthorisationPaymentInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.di.PixAuthorisationPaymentInfoScreenInjector");
                        s sVar = (s) bVarU2;
                        d0 d0Var = sVar.f234079b;
                        s sVar2 = sVar.f234080c;
                        PixAuthorisationPaymentInfoScreenContract$InputData pixAuthorisationPaymentInfoScreenContract$InputData = pixAuthorisationPaymentInfoScreen.K;
                        pixAuthorisationPaymentInfoScreenContract$InputData.getClass();
                        return new p8a.q(d0Var, sVar2, pixAuthorisationPaymentInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationPaymentInfoScreen.R;
                        PixAuthorisationPaymentInfoScreen pixAuthorisationPaymentInfoScreen2 = this.f182299b;
                        return dli.f.a(pixAuthorisationPaymentInfoScreen2, (f) pixAuthorisationPaymentInfoScreen2.M.getValue(), u.c((CellDetailsAccountDelegate) pixAuthorisationPaymentInfoScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.P = vc.s.t(this, b.f);
        this.Q = w.y0(new d(29));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p8a.q) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pix_authorisation_request_payment_info_faq, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new jij.d(rd0.e.b(((CellDetailsAccountDelegate) this.Q.getValue()).d), 25), new jv.o(this, null, 26), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
