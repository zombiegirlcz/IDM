package xab;

import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f303847b;

    public /* synthetic */ r0(w0 w0Var, int i) {
        this.f303846a = i;
        this.f303847b = w0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303846a) {
            case 0:
                rl0.d primaryAuthCredentialsType = (rl0.d) obj2;
                Intrinsics.checkNotNullParameter(primaryAuthCredentialsType, "primaryAuthCredentialsType");
                int i = u0.f303853a[primaryAuthCredentialsType.ordinal()];
                w0 w0Var = this.f303847b;
                if (i == 1) {
                    y0 y0Var = (y0) w0Var.L();
                    if (y0Var != null) {
                        PinCodeView pinCodeView = ((LoginFragment) y0Var).m0;
                        if (pinCodeView == null) {
                            Intrinsics.r("pinCodeView");
                            throw null;
                        }
                        pinCodeView.r0();
                    }
                    y0 y0Var2 = (y0) w0Var.L();
                    if (y0Var2 != null) {
                        PinCodeView pinCodeView2 = ((LoginFragment) y0Var2).m0;
                        if (pinCodeView2 == null) {
                            Intrinsics.r("pinCodeView");
                            throw null;
                        }
                        pinCodeView2.F0(true);
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y0 y0Var3 = (y0) w0Var.L();
                    if (y0Var3 != null) {
                        ((LoginFragment) y0Var3).p0();
                    }
                }
                return Unit.f186387a;
            case 1:
                rl0.d primaryAuthCredentialsType2 = (rl0.d) obj2;
                Intrinsics.checkNotNullParameter(primaryAuthCredentialsType2, "primaryAuthCredentialsType");
                int i2 = u0.f303853a[primaryAuthCredentialsType2.ordinal()];
                w0 w0Var2 = this.f303847b;
                if (i2 == 1) {
                    y0 y0Var4 = (y0) w0Var2.L();
                    if (y0Var4 != null) {
                        ((LoginFragment) y0Var4).c0(PinCodeView.a.C0445a.f59611a);
                    }
                    y0 y0Var5 = (y0) w0Var2.L();
                    if (y0Var5 != null) {
                        PinCodeView pinCodeView3 = ((LoginFragment) y0Var5).m0;
                        if (pinCodeView3 == null) {
                            Intrinsics.r("pinCodeView");
                            throw null;
                        }
                        pinCodeView3.o0();
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y0 y0Var6 = (y0) w0Var2.L();
                    if (y0Var6 != null) {
                        ((LoginFragment) y0Var6).p0();
                    }
                }
                return Unit.f186387a;
            default:
                NaviCommand naviCommand = (NaviCommand) obj2;
                sri.m mVar = this.f303847b.k;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
        }
    }
}
