package mll;

import bjl.j0;
import bjl.k0;
import bjl.l0;
import bjl.n0;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207051b;

    public /* synthetic */ e(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, int i) {
        this.f207050a = i;
        this.f207051b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f207050a;
        Continuation continuation = null;
        com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = this.f207051b;
        switch (i) {
            case 0:
                CombinedAuthenticationFlowContract$State update = (CombinedAuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CombinedAuthenticationFlowContract$State.a(update, cVar.f106426q.generate(), null, null, null, 14);
            case 1:
                gnl.i data = (gnl.i) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                cVar.n2(new s(data, cVar, null), new whi.b(6));
                return Unit.f186387a;
            case 2:
                qll.b0 result = (qll.b0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof qll.s;
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar2 = this.f207051b;
                if (z) {
                    oki.h.t2(cVar2, cVar2.H, new CombinedAuthenticationFlowContract$Step.OpenSignIn(((qll.s) result).f247601a), true, null, false, 12);
                    Unit unit = Unit.f186387a;
                } else {
                    int i2 = 0;
                    if (result instanceof qll.v) {
                        cVar2.l2(new n(cVar2, continuation, i2), new yi5.b(26));
                    } else {
                        int i3 = 1;
                        if (result instanceof qll.w) {
                            cVar2.l2(new n(cVar2, continuation, i3), new yi5.b(26));
                        } else if (result instanceof qll.y) {
                            oki.h.t2(cVar2, cVar2.H, new CombinedAuthenticationFlowContract$Step.LostAccount(((qll.y) result).f247607a), true, null, false, 12);
                            Unit unit2 = Unit.f186387a;
                        } else if (result instanceof qll.z) {
                            cVar2.l2(new o(cVar2, result, continuation, i2), new yi5.b(26));
                        } else if (result instanceof qll.a0) {
                            cVar2.l2(new o(cVar2, result, continuation, i3), new yi5.b(26));
                        } else if (result instanceof qll.t) {
                            cVar2.l2(new n(cVar2, continuation, 2), new yi5.b(26));
                        } else if (result instanceof qll.u) {
                            cVar2.l2(new n(cVar2, continuation, 3), new yi5.b(26));
                        } else {
                            if (!(result instanceof qll.x)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar2.l2(new n(cVar2, continuation, 4), new yi5.b(26));
                        }
                    }
                }
                return Unit.f186387a;
            case 3:
                oll.h result2 = (oll.h) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean zF = Intrinsics.f(result2, oll.f.f226457a);
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar3 = this.f207051b;
                if (zF) {
                    oki.h.t2(cVar3, cVar3.H, CombinedAuthenticationFlowContract$Step.OpenSignUp.f106419a, true, null, false, 12);
                } else {
                    if (!Intrinsics.f(result2, oll.g.f226458a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(cVar3, cVar3.H, new CombinedAuthenticationFlowContract$Step.OpenSignIn(null), true, null, false, 12);
                }
                return Unit.f186387a;
            case 4:
                l0 result3 = (l0) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof j0) {
                    com.revolut.sso.impl.ui.combined_authentication.flow.c cVar4 = this.f207051b;
                    oki.h.t2(cVar4, cVar4.H, new CombinedAuthenticationFlowContract$Step.OpenSignIn(((j0) result3).f16173a), true, null, false, 12);
                } else if (!(result3 instanceof k0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 5:
                bjl.d0 result4 = (bjl.d0) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                cVar.C2(new bjl.k(result4, cVar.T2()));
                return Unit.f186387a;
            default:
                n0 result5 = (n0) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                cVar.C2(new bjl.l(result5));
                return Unit.f186387a;
        }
    }
}
