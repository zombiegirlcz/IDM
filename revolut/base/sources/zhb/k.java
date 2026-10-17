package zhb;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import zfd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements c {

    @NotNull
    private static final j Companion = new j();
    public final PayrollPlatformEmailInputContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1j.b f322389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzl.c f322390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f322391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f322392s;

    public k(com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.b stateMapper, PayrollPlatformEmailInputContract$InputData inputData, t1j.b updatePayrollPlatformInteractor, zzl.c regexMatcher) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(updatePayrollPlatformInteractor, "updatePayrollPlatformInteractor");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.o = inputData;
        this.f322389p = updatePayrollPlatformInteractor;
        this.f322390q = regexMatcher;
        this.f322391r = mra.d.b(this, new a(0), stateMapper, null, false, 12);
        this.f322392s = ta6.a.a(0);
    }

    @Override // yji.l
    public final void I1() {
        b.Companion companion = kotlin.time.b.INSTANCE;
        yji.l.a1(this, t1.f(this.f322392s, kotlin.time.c.h(800L, pkm.e.MILLISECONDS)), null, null, new s(this, (Continuation) null, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f322391r;
    }
}
