package com.revolut.feature.passcode;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.x5;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.passcode.PasscodeScreenContract$WallpaperBackground;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.screen.BaseScreen;
import de9.d;
import de9.f;
import de9.m;
import de9.n;
import de9.p;
import de9.q;
import de9.x;
import fe9.e;
import in0.g;
import ix0.n1;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import ny0.i;
import od0.l;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import te0.w;
import tx0.d0;
import vc.s;
import vkm.z1;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/passcode/PasscodeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lde9/q;", "Lcom/revolut/feature/passcode/PasscodeScreenContract$InputData;", "Lde9/m;", "Lno/k;", "Lno/m;", "Lin0/g;", "Lhx0/m;", "Lwii/b;", "Companion", "a", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasscodeScreen extends BaseScreen<q, PasscodeScreenContract$InputData, m> implements k, no.m, g, hx0.m, wii.b {
    public final Boolean M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final int T;
    public AnalyticsContext U;
    public final AnalyticsProduct V;
    public final ModalTransitionAnimation.Style.POPUP W;
    public WallpaperAssetSwitcher X;
    public n1 Y;
    public final z1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Lazy f78616a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Lazy f78617b0;
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(PasscodeScreen.class, "binding", "getBinding()Lcom/revolut/feature/passcode/databinding/FeatureScreenPasscodeBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeScreen(PasscodeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = inputData.f78627m;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: de9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f113320b;

            {
                this.f113320b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PasscodeScreen passcodeScreen = this.f113320b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.c0;
                        return passcodeScreen.S2().j();
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.c0;
                        return passcodeScreen.S2().i();
                    case 2:
                        KProperty[] kPropertyArr3 = PasscodeScreen.c0;
                        passcodeScreen.S2().k().b();
                        return null;
                    case 3:
                        KProperty[] kPropertyArr4 = PasscodeScreen.c0;
                        return passcodeScreen.S2().h().b0();
                    case 4:
                        KProperty[] kPropertyArr5 = PasscodeScreen.c0;
                        return passcodeScreen.m2().getIntent().getParcelableExtra("WALLPAPER_MODEL_EXTRAS_KEY");
                    default:
                        KProperty[] kPropertyArr6 = PasscodeScreen.c0;
                        return passcodeScreen.S2().a();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: de9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f113320b;

            {
                this.f113320b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PasscodeScreen passcodeScreen = this.f113320b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.c0;
                        return passcodeScreen.S2().j();
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.c0;
                        return passcodeScreen.S2().i();
                    case 2:
                        KProperty[] kPropertyArr3 = PasscodeScreen.c0;
                        passcodeScreen.S2().k().b();
                        return null;
                    case 3:
                        KProperty[] kPropertyArr4 = PasscodeScreen.c0;
                        return passcodeScreen.S2().h().b0();
                    case 4:
                        KProperty[] kPropertyArr5 = PasscodeScreen.c0;
                        return passcodeScreen.m2().getIntent().getParcelableExtra("WALLPAPER_MODEL_EXTRAS_KEY");
                    default:
                        KProperty[] kPropertyArr6 = PasscodeScreen.c0;
                        return passcodeScreen.S2().a();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: de9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f113320b;

            {
                this.f113320b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PasscodeScreen passcodeScreen = this.f113320b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.c0;
                        return passcodeScreen.S2().j();
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.c0;
                        return passcodeScreen.S2().i();
                    case 2:
                        KProperty[] kPropertyArr3 = PasscodeScreen.c0;
                        passcodeScreen.S2().k().b();
                        return null;
                    case 3:
                        KProperty[] kPropertyArr4 = PasscodeScreen.c0;
                        return passcodeScreen.S2().h().b0();
                    case 4:
                        KProperty[] kPropertyArr5 = PasscodeScreen.c0;
                        return passcodeScreen.m2().getIntent().getParcelableExtra("WALLPAPER_MODEL_EXTRAS_KEY");
                    default:
                        KProperty[] kPropertyArr6 = PasscodeScreen.c0;
                        return passcodeScreen.S2().a();
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: de9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f113320b;

            {
                this.f113320b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PasscodeScreen passcodeScreen = this.f113320b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.c0;
                        return passcodeScreen.S2().j();
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.c0;
                        return passcodeScreen.S2().i();
                    case 2:
                        KProperty[] kPropertyArr3 = PasscodeScreen.c0;
                        passcodeScreen.S2().k().b();
                        return null;
                    case 3:
                        KProperty[] kPropertyArr4 = PasscodeScreen.c0;
                        return passcodeScreen.S2().h().b0();
                    case 4:
                        KProperty[] kPropertyArr5 = PasscodeScreen.c0;
                        return passcodeScreen.m2().getIntent().getParcelableExtra("WALLPAPER_MODEL_EXTRAS_KEY");
                    default:
                        KProperty[] kPropertyArr6 = PasscodeScreen.c0;
                        return passcodeScreen.S2().a();
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: de9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f113320b;

            {
                this.f113320b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                PasscodeScreen passcodeScreen = this.f113320b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.c0;
                        return passcodeScreen.S2().j();
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.c0;
                        return passcodeScreen.S2().i();
                    case 2:
                        KProperty[] kPropertyArr3 = PasscodeScreen.c0;
                        passcodeScreen.S2().k().b();
                        return null;
                    case 3:
                        KProperty[] kPropertyArr4 = PasscodeScreen.c0;
                        return passcodeScreen.S2().h().b0();
                    case 4:
                        KProperty[] kPropertyArr5 = PasscodeScreen.c0;
                        return passcodeScreen.m2().getIntent().getParcelableExtra("WALLPAPER_MODEL_EXTRAS_KEY");
                    default:
                        KProperty[] kPropertyArr6 = PasscodeScreen.c0;
                        return passcodeScreen.S2().a();
                }
            }
        });
        this.S = s.t(this, d.f);
        this.T = R$layout.feature_screen_passcode;
        this.V = inputData.i;
        this.W = ModalTransitionAnimation.Style.POPUP.f98391a;
        this.Z = ta6.a.a(1);
        this.f78616a0 = j.b(new cvi.b(this, inputData, 24));
        final int i21 = 5;
        this.f78617b0 = j.b(new Function0(this) { // from class: de9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f113320b;

            {
                this.f113320b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                PasscodeScreen passcodeScreen = this.f113320b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.c0;
                        return passcodeScreen.S2().j();
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.c0;
                        return passcodeScreen.S2().i();
                    case 2:
                        KProperty[] kPropertyArr3 = PasscodeScreen.c0;
                        passcodeScreen.S2().k().b();
                        return null;
                    case 3:
                        KProperty[] kPropertyArr4 = PasscodeScreen.c0;
                        return passcodeScreen.S2().h().b0();
                    case 4:
                        KProperty[] kPropertyArr5 = PasscodeScreen.c0;
                        return passcodeScreen.m2().getIntent().getParcelableExtra("WALLPAPER_MODEL_EXTRAS_KEY");
                    default:
                        KProperty[] kPropertyArr6 = PasscodeScreen.c0;
                        return passcodeScreen.S2().a();
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        if (vkm.q.u(r11, r13, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(com.revolut.feature.passcode.PasscodeScreen r11, com.revolut.feature.passcode.PasscodeScreenContract$WallpaperBackground.WithBackground r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.passcode.PasscodeScreen.Z2(com.revolut.feature.passcode.PasscodeScreen, com.revolut.feature.passcode.PasscodeScreenContract$WallpaperBackground$WithBackground, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        PasscodeScreenContract$WallpaperBackground passcodeScreenContract$WallpaperBackground = ((PasscodeScreenContract$InputData) this.G).k;
        j70.a devicePerformance = (j70.a) this.O.getValue();
        passcodeScreenContract$WallpaperBackground.getClass();
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        if (((!(passcodeScreenContract$WallpaperBackground instanceof PasscodeScreenContract$WallpaperBackground.WithBackground) || ((j70.c) devicePerformance).a().compareTo(j70.d.LOW) <= 0) ? null : (PasscodeScreenContract$WallpaperBackground.WithBackground) passcodeScreenContract$WallpaperBackground) != null) {
            return Integer.valueOf(R$style.TransparentNavigationBarMarkerTheme);
        }
        return null;
    }

    @Override // hx0.m
    public final View H1() {
        PinCodeView passcodeScreenPasscode = a3().d;
        Intrinsics.checkNotNullExpressionValue(passcodeScreenPasscode, "passcodeScreenPasscode");
        return passcodeScreenPasscode;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        q uiState = (q) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        de9.o oVar2 = oVar instanceof de9.o ? (de9.o) oVar : null;
        if (oVar2 == null || oVar2.f113330a) {
            p pVar = uiState.f113333a;
            if (pVar != null) {
                a3().d.setDotsSelected(pVar.f113332a);
                a3().d.G0("passcodeInput");
                a3().f143273c.setEnabled(false);
                this.z = false;
            } else {
                a3().f143273c.setEnabled(true);
                this.z = true;
                a3().d.H0("passcodeInput");
            }
        }
        if (oVar2 == null || oVar2.f113331b) {
            a3().d.setHeader(uiState.f113335c);
        }
        a3().d.setWarningText(uiState.f113334b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getW() {
        return this.V;
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Boolean getM() {
        return this.M;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PinCodeView passcodeScreenPasscode = a3().d;
        Intrinsics.checkNotNullExpressionValue(passcodeScreenPasscode, "passcodeScreenPasscode");
        int i = 4;
        OneShotPreDrawListener.add(passcodeScreenPasscode, new x5(passcodeScreenPasscode, this, i));
        ?? r87 = this.N;
        fe9.a aVar = (fe9.a) r87.getValue();
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity activity = (FragmentActivity) activityM2;
        PinCodeView pinCodeView = a3().d;
        e eVar = (e) aVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(this, "analyticsContextHolder");
        eVar.i = activity;
        eVar.f134480j = pinCodeView;
        eVar.k = this;
        Continuation continuation = null;
        int i2 = 1;
        int i3 = 3;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(a3().f143273c.f59211b), null, new f(this, continuation, i2), 3);
        int i5 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(a3().d.v0()), null, new f(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(a3().d.t0()), null, new f(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(a3().d.x0()), null, new de9.e(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(a3().d.s0()), null, new de9.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(a3().d.u0()), null, new f(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, ((e) ((fe9.a) r87.getValue())).f, null, new de9.e(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, new dfj.f(((x) T2()).f113342r.c3(), 23), null, new de9.e(this, continuation, i), 3);
        int i6 = 0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(a3().d.w0()), null, new de9.e(this, continuation, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, ((x) T2()).f113345w, null, new f(this, continuation, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, this.Z, null, new de9.e(this, continuation, i2), 3);
        od0.a aVar2 = od0.a.f224253a;
        if (od0.a.c() == l.E2E) {
            a3().d.setDescendantFocusability(393216);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        je9.d dVar = (je9.d) this.Q.getValue();
        PinCodeView passcodeScreenPasscode = a3().d;
        Intrinsics.checkNotNullExpressionValue(passcodeScreenPasscode, "passcodeScreenPasscode");
        dVar.a(passcodeScreenPasscode);
        LinearLayout passcodeScreenInnerContainer = a3().f143272b;
        Intrinsics.checkNotNullExpressionValue(passcodeScreenInnerContainer, "passcodeScreenInnerContainer");
        i.e(passcodeScreenInnerContainer);
        BasicNavBar basicNavBar = a3().f143273c;
        PasscodeScreenContract$InputData passcodeScreenContract$InputData = (PasscodeScreenContract$InputData) this.G;
        basicNavBar.setNavigationButtonIcon(passcodeScreenContract$InputData.f ? Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow) : null);
        basicNavBar.setBackground(d0.TRANSPARENT);
        PinCodeView pinCodeView = a3().d;
        pinCodeView.setPinCodeHinter(passcodeScreenContract$InputData.d);
        pinCodeView.setHeader(passcodeScreenContract$InputData.f78620a.getF78619a());
        PinCodeView.setMode$default(pinCodeView, passcodeScreenContract$InputData.f78621b, null, 2, null);
        if (passcodeScreenContract$InputData.f78625j) {
            pinCodeView.setExtraBottomInfo(new TextLocalisedClause(R$string.passcode_have_no_six_digit_passcode_title, null, null, 14));
        } else {
            pinCodeView.setExtraBottomInfo(null);
        }
        if (passcodeScreenContract$InputData.e) {
            PinCodeView.setBottomInfo$default(pinCodeView, new TextLocalisedClause(R$string.revolut_passcode_action_forgot, null, null, 14), null, 2, null);
        } else {
            PinCodeView.setBottomInfo$default(pinCodeView, null, null, 2, null);
        }
        pinCodeView.setBiometricModeAndInvalidate(PinCodeView.a.C0445a.f59611a);
        PasscodeScreenContract$WallpaperBackground passcodeScreenContract$WallpaperBackground = passcodeScreenContract$InputData.k;
        j70.a devicePerformance = (j70.a) this.O.getValue();
        passcodeScreenContract$WallpaperBackground.getClass();
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        PasscodeScreenContract$WallpaperBackground.WithBackground withBackground = (!(passcodeScreenContract$WallpaperBackground instanceof PasscodeScreenContract$WallpaperBackground.WithBackground) || ((j70.c) devicePerformance).a().compareTo(j70.d.LOW) <= 0) ? null : (PasscodeScreenContract$WallpaperBackground.WithBackground) passcodeScreenContract$WallpaperBackground;
        if (withBackground != null) {
            e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(this, withBackground, null), 3);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        e eVar = (e) S2().j();
        eVar.i = null;
        eVar.f134480j = null;
        n1 n1Var = this.Y;
        if (n1Var != null) {
            n1Var.b();
        }
        this.Y = null;
    }

    public final ge9.a a3() {
        ViewBinding value = this.S.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ge9.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: b3, reason: merged with bridge method [inline-methods] */
    public final he9.j S2() {
        return (he9.j) this.f78616a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: c3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.f78617b0.getValue();
    }

    @Override // wii.b
    public final ModalTransitionAnimation.Style d2() {
        return this.W;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.T;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean r2() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    @Override // hx0.m
    public final View v() {
        return this.X;
    }
}
