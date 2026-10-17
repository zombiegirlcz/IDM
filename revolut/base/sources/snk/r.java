package snk;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreenContract$InputData;
import ffk.e0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends oki.h implements k {

    @NotNull
    public static final n Companion = new n();
    public final StudentEmailValidationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n60.a f264649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzl.c f264650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f264651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cha.c f264652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ang.f f264653t;
    public final u u;
    public final mre.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f264654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f264655x;

    public r(m stateMapper, StudentEmailValidationScreenContract$InputData inputData, n60.a keyboardControllerExtension, zzl.c regexMatcher, e0 interactor, cha.c studentPlanInteractor, ang.f userInteractor, u studentInputFocusHandler, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(studentInputFocusHandler, "studentInputFocusHandler");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = inputData;
        this.f264649p = keyboardControllerExtension;
        this.f264650q = regexMatcher;
        this.f264651r = interactor;
        this.f264652s = studentPlanInteractor;
        this.f264653t = userInteractor;
        this.u = studentInputFocusHandler;
        this.v = termsNavigationFactory;
        String str = inputData.f103638a;
        str = (str == null || !regexMatcher.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str)) ? null : str;
        str = str == null ? "" : str;
        String str2 = inputData.f103638a;
        this.f264654w = mra.d.b(this, new f(str, regexMatcher.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str2 != null ? str2 : ""), inputData.f103640c && !((Boolean) studentInputFocusHandler.f264658a.getValue()).booleanValue()), stateMapper, null, false, 12);
        this.f264655x = ta6.a.a(0);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, t1.d(this.f264655x, 300L), null, null, new sek.q(this, continuation, 12), 3);
        if (!this.o.f103640c || ((f) ((j2) this.f264654w.f22677a).getValue()).f264636c) {
            return;
        }
        yji.l.a1(this, new rv6.e(new qij.s(this.u.f264658a, 11), 3), null, null, new se4.c(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f264654w;
    }
}
