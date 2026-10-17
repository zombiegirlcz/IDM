package xab;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import grl.hc;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class p implements wl0.a, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f303841a;

    public p(q0 q0Var) {
        this.f303841a = q0Var;
    }

    @Override // wl0.a
    public final void a(wl0.n result) {
        Intrinsics.checkNotNullParameter(result, "p0");
        w0 w0Var = (w0) this.f303841a;
        ifm.b bVar = w0Var.f239031a;
        Intrinsics.checkNotNullParameter(result, "result");
        w0Var.f303862q = result;
        if (result instanceof wl0.m) {
            y0 y0Var = (y0) w0Var.L();
            if (y0Var != null) {
                wl0.m mVar = (wl0.m) result;
                ((LoginFragment) y0Var).b0(new mm0.a((Cipher) mVar.b(), mVar.a()));
                return;
            }
            return;
        }
        if (result instanceof wl0.k) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "LoginFragment", "BiometricResult.Failed", null, h0Var);
            ((com.revolut.analytics.tracking.v3.l) w0Var.i).r3(kli.a.D(((wl0.k) result).a()), hc.Failure);
            return;
        }
        int i = 0;
        if (result.equals(wl0.j.f298355a)) {
            skm.p0 p0Var = skm.p0.f264001a;
            ufm.n nVarI = o70.a.i(te0.w.o0(elm.f.f127540b, new v0(w0Var, null, 0)));
            r0 r0Var = new r0(w0Var, i);
            Function1 function1K = w0Var.K();
            ufm.i iVar = new ufm.i(nVarI, new nw8.d(23, new x94.q(new BreadcrumbException(), 20)), 2);
            Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
            ofm.i iVar2 = new ofm.i(new ly7.g(28, r0Var), new ly7.g(28, function1K), i);
            iVar.q(iVar2);
            Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
            te0.w.j0(bVar, iVar2);
            return;
        }
        if (!result.equals(wl0.l.f298357a)) {
            throw new NoWhenBranchMatchedException();
        }
        skm.p0 p0Var2 = skm.p0.f264001a;
        ufm.n nVarI2 = o70.a.i(te0.w.o0(elm.f.f127540b, new v0(w0Var, null, 1)));
        r0 r0Var2 = new r0(w0Var, 1);
        Function1 function1K2 = w0Var.K();
        ufm.i iVar3 = new ufm.i(nVarI2, new nw8.d(23, new x94.q(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar3, "onErrorResumeNext(...)");
        ofm.i iVar4 = new ofm.i(new ly7.g(28, r0Var2), new ly7.g(28, function1K2), i);
        iVar3.q(iVar4);
        Intrinsics.checkNotNullExpressionValue(iVar4, "subscribe(...)");
        te0.w.j0(bVar, iVar4);
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof wl0.a) && (obj2 instanceof kotlin.jvm.internal.n)) {
            return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.q(1, 0, q0.class, this.f303841a, "onBiometricResult", "onBiometricResult(Lcom/revolut/core/security/biometrics/prompt/BiometricResult;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
