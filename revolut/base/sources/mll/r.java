package mll;

import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.WebAuthnEvidence;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rl0.b;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        bjl.d0 p0 = (bjl.d0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = (com.revolut.sso.impl.ui.combined_authentication.flow.c) this.receiver;
        cVar.getClass();
        rl0.b bVar = null;
        if (Intrinsics.f(p0, bjl.z.f16194a)) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected access recovery request. It must be handled by sign-in flow");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, illegalStateException, h0Var);
            cVar.c3(new q(cVar, null, 3));
        } else if (p0 instanceof bjl.c0) {
            Set set = ((CombinedAuthenticationFlowContract$State) ((j2) cVar.G.f22677a).getValue()).f106407c;
            boolean z = false;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it8 = set.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (((Evidence) it8.next()) instanceof WebAuthnEvidence) {
                        z = true;
                        break;
                    }
                }
            }
            bjl.c0 c0Var = (bjl.c0) p0;
            rl0.b bVar2 = c0Var.f16161b;
            if (bVar2 != null) {
                bVar = bVar2;
            } else if (z) {
                bVar = b.a.f254907a;
            }
            String code = c0Var.f16160a;
            wi0.b bVar3 = c0Var.f16162c;
            Intrinsics.checkNotNullParameter(code, "code");
            cVar.C2(new bjl.k(new bjl.c0(code, bVar, bVar3), cVar.T2()));
        } else {
            if (!(p0 instanceof bjl.a0)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.b3();
        }
        return Unit.f186387a;
    }
}
