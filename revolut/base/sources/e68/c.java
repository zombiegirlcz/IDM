package e68;

import aii.r;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import d67.p;
import d67.q;
import d67.s;
import d67.t;
import d67.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mh8.h;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements qii.a {
    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlowModel) {
        u result = (u) rVar;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
        if (!(result instanceof p) && !Intrinsics.f(result, d67.r.f111463a) && !Intrinsics.f(result, t.f111465a)) {
            if (Intrinsics.f(result, s.f111464a)) {
                knm.b.j(wrapperFlowModel.l1(), new JuniorOnboardingDestination.Creation((h) null, 1));
                return;
            } else {
                if (!Intrinsics.f(result, q.f111462a)) {
                    throw new NoWhenBranchMatchedException();
                }
                wrapperFlowModel.J2();
                return;
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected result: " + result);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        wrapperFlowModel.B2();
    }
}
