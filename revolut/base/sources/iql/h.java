package iql;

import bjl.a0;
import bjl.c0;
import bjl.d0;
import bjl.n0;
import bjl.z;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 p0 = (d0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.sso.impl.ui.signup.b bVar = (com.revolut.sso.impl.ui.signup.b) this.receiver;
        bVar.getClass();
        if (Intrinsics.f(p0, z.f16194a)) {
            throw new IllegalStateException("Unexpected access recovery request. It must be handled by sign-in flow");
        }
        if (p0 instanceof c0) {
            c0 c0Var = (c0) p0;
            bVar.C2(new n0(c0Var.f16160a, c0Var.f16161b, ((SignUpFlowContract$State) ((j2) bVar.z.f22677a).getValue()).f106755b, c0Var.f16162c));
        } else {
            if (!(p0 instanceof a0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((a0) p0).f16157a) {
                bVar.N2();
            } else {
                oki.h.D2(bVar.A);
            }
        }
        return Unit.f186387a;
    }
}
