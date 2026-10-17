package hib;

import cli.y;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputControllerContract$InputData;
import fib.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends oki.h implements f {

    @NotNull
    public static final m Companion = new m();
    public final WorkEmailInputControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzl.c f152590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zjh.f f152591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cib.a f152592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f152593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mre.c f152594t;
    public final y u;

    public q(WorkEmailInputControllerContract$InputData inputData, r stateMapper, zzl.c regexMatcher, zjh.f workEmailRepository, cib.a statusDialogProvider, s workEmailVerificationErrorMapper, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(workEmailRepository, "workEmailRepository");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        Intrinsics.checkNotNullParameter(workEmailVerificationErrorMapper, "workEmailVerificationErrorMapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = inputData;
        this.f152590p = regexMatcher;
        this.f152591q = workEmailRepository;
        this.f152592r = statusDialogProvider;
        this.f152593s = workEmailVerificationErrorMapper;
        this.f152594t = termsNavigationFactory;
        String str = inputData.f83069a;
        this.u = mra.d.b(this, new e(str, true ^ (str == null || d0.W(str))), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f83070b) {
            return;
        }
        this.f152592r.getClass();
        X1(cib.a.a("ID_VERIFY_EMPLOYMENT_LOADING"));
        l2(new o(this, null, 1), new l(this, 0));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
