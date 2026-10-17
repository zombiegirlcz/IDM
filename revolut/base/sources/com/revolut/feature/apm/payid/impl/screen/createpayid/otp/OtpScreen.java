package com.revolut.feature.apm.payid.impl.screen.createpayid.otp;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.payid.impl.screen.createpayid.otp.OtpScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s56.i;
import sa2.b;
import sa2.c;
import sa2.e;
import sa2.f;
import sa2.g;
import sa2.l;
import sa2.m;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/createpayid/otp/OtpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsa2/f;", "Ldli/a;", "Lsa2/m;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OtpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final e K;
    public final int L;
    public final h M;
    public final Object N;
    public final CodeEditorDelegate O;
    public final TextDelegate P;
    public final Object Q;
    public final Object R;

    public OtpScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpScreen f261267b;

            {
                this.f261267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtpScreen otpScreen = this.f261267b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OtpScreen.S;
                        ea2.m mVar = (ea2.m) otpScreen.Q.getValue();
                        switch (mVar.f124096a) {
                            case 0:
                                return (g) mVar.e.get();
                            case 1:
                                return (g) mVar.e.get();
                            default:
                                return (g) mVar.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = OtpScreen.S;
                        qji.b bVarU2 = otpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.createpayid.otp.di.OtpScreenInjector");
                        ea2.l lVar = (ea2.l) ((ta2.a) bVarU2).b().mo3808a(otpScreen);
                        e eVar = otpScreen.K;
                        switch (lVar.f124093a) {
                            case 0:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                            case 1:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                        }
                        return (ea2.m) lVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = OtpScreen.S;
                        OtpScreen otpScreen2 = this.f261267b;
                        return dli.f.a(otpScreen2, (g) otpScreen2.N.getValue(), v.k(otpScreen2.O, otpScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new CodeEditorDelegate();
        this.P = new TextDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: sa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpScreen f261267b;

            {
                this.f261267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtpScreen otpScreen = this.f261267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpScreen.S;
                        ea2.m mVar = (ea2.m) otpScreen.Q.getValue();
                        switch (mVar.f124096a) {
                            case 0:
                                return (g) mVar.e.get();
                            case 1:
                                return (g) mVar.e.get();
                            default:
                                return (g) mVar.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = OtpScreen.S;
                        qji.b bVarU2 = otpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.createpayid.otp.di.OtpScreenInjector");
                        ea2.l lVar = (ea2.l) ((ta2.a) bVarU2).b().mo3808a(otpScreen);
                        e eVar = otpScreen.K;
                        switch (lVar.f124093a) {
                            case 0:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                            case 1:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                        }
                        return (ea2.m) lVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = OtpScreen.S;
                        OtpScreen otpScreen2 = this.f261267b;
                        return dli.f.a(otpScreen2, (g) otpScreen2.N.getValue(), v.k(otpScreen2.O, otpScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpScreen f261267b;

            {
                this.f261267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OtpScreen otpScreen = this.f261267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpScreen.S;
                        ea2.m mVar = (ea2.m) otpScreen.Q.getValue();
                        switch (mVar.f124096a) {
                            case 0:
                                return (g) mVar.e.get();
                            case 1:
                                return (g) mVar.e.get();
                            default:
                                return (g) mVar.e.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = OtpScreen.S;
                        qji.b bVarU2 = otpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.createpayid.otp.di.OtpScreenInjector");
                        ea2.l lVar = (ea2.l) ((ta2.a) bVarU2).b().mo3808a(otpScreen);
                        e eVar = otpScreen.K;
                        switch (lVar.f124093a) {
                            case 0:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                            case 1:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                lVar.d = eVar;
                                break;
                        }
                        return (ea2.m) lVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = OtpScreen.S;
                        OtpScreen otpScreen2 = this.f261267b;
                        return dli.f.a(otpScreen2, (g) otpScreen2.N.getValue(), v.k(otpScreen2.O, otpScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        l lVar = uiState.f261280a;
        if (lVar != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            navBarWithToolbar.setTitle(new TextLocalisedClause(lVar.f261277a, null, null, 14), null);
            navBarWithToolbar.setDescriptionText(new TextLocalisedClause(lVar.f261278b, u.c(lVar.f261279c), null, 12));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ea2.m) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new s1k.b(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new i(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53530c), null, new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
