package mib;

import cli.y;
import com.revolut.feature.retail.salary_account.impl.work_email.verification.screen.WorkEmailVerificationControllerContract$InputData;
import fib.m;
import fib.n;
import fib.o;
import fib.p;
import fib.q;
import fib.r;
import fib.s;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    public static final h Companion = new h();
    public final zjh.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cib.a f205644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f205645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kib.a f205646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f205647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f205648t;

    public k(WorkEmailVerificationControllerContract$InputData inputData, l stateMapper, zjh.f workEmailRepository, cib.a statusDialogProvider, s workEmailVerificationErrorMapper, kib.a workEmailVerificationTokenProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(workEmailRepository, "workEmailRepository");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        Intrinsics.checkNotNullParameter(workEmailVerificationErrorMapper, "workEmailVerificationErrorMapper");
        Intrinsics.checkNotNullParameter(workEmailVerificationTokenProvider, "workEmailVerificationTokenProvider");
        this.o = workEmailRepository;
        this.f205644p = statusDialogProvider;
        this.f205645q = workEmailVerificationErrorMapper;
        this.f205646r = workEmailVerificationTokenProvider;
        this.f205647s = mra.d.b(this, new c(inputData.f83071a, inputData.f83072b), stateMapper, null, false, 12);
    }

    public static final void I2(k kVar, Throwable th10) {
        kVar.f205648t = false;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "WorkEmailVerificationControllerModel", null, th10, h0Var);
        kVar.s1();
        cib.a aVar = kVar.f205644p;
        kVar.f205645q.getClass();
        r rVarA = s.a(th10);
        if (rVarA.equals(fib.l.f135375a) || rVarA.equals(m.f135376a)) {
            aVar.getClass();
            yji.l.a1(kVar, kVar.X1(cib.a.b(false)), null, null, new i(kVar, null, 0), 3);
        } else {
            if (!rVarA.equals(n.f135377a) && !rVarA.equals(o.f135378a) && !rVarA.equals(p.f135379a) && !rVarA.equals(q.f135380a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.getClass();
            yji.l.a1(kVar, kVar.X1(cib.a.b(true)), null, null, new i(kVar, null, 1), 3);
        }
    }

    public static final void J2(k kVar) {
        String str = ((c) ((j2) kVar.f205647s.f22677a).getValue()).f205636a;
        Continuation continuation = null;
        if (str == null) {
            kVar.C2(new d(null));
            return;
        }
        kVar.f205644p.getClass();
        kVar.X1(cib.a.a("ID_WORK_EMAIL_VERIFICATION_LOADING"));
        kVar.l2(new j(kVar, str, continuation, 1), new lrk.h(1, kVar, k.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 23));
    }

    @Override // yji.l
    public final void I1() {
        String str = ((c) ((j2) this.f205647s.f22677a).getValue()).f205637b;
        if (str != null) {
            K2(str);
        }
        yji.l.a1(this, this.f205646r.f184193a, null, null, new i(this, null, 2), 3);
    }

    public final void K2(String str) {
        if (this.f205648t) {
            return;
        }
        this.f205648t = true;
        H2(this.f205647s, new lu6.p(str, 19));
        this.f205644p.getClass();
        X1(cib.a.a("ID_WORK_EMAIL_VERIFICATION_LOADING"));
        l2(new j(this, str, null, 0), new lrk.h(1, this, k.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 22));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f205647s;
    }
}
