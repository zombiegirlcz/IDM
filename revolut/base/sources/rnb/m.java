package rnb;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rlh.d0;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.n f255566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f255567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xvh.c f255568c;
    public final wzi.a d;
    public final kbb.c e;

    public m(djb.n savingsAccountsDetailsInteractor, xua.a recurringPaymentInteractor, xvh.c autoInvestInteractor, wzi.a incomeSorterInteractor, kbb.c savingsAutomationEligibilityInteractor) {
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(savingsAutomationEligibilityInteractor, "savingsAutomationEligibilityInteractor");
        this.f255566a = savingsAccountsDetailsInteractor;
        this.f255567b = recurringPaymentInteractor;
        this.f255568c = autoInvestInteractor;
        this.d = incomeSorterInteractor;
        this.e = savingsAutomationEligibilityInteractor;
    }

    public final akg.n a(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Continuation continuation = null;
        return nim.a.v(u0.i(vkm.q.Q(new v1(new k(this, continuation, 1)), new j(continuation, this, vaultId, 1)), vkm.q.Q(new v1(new k(this, continuation, 0)), new j(continuation, this, vaultId, 0)), boh.f.e(rd0.e.b(((i) this.f255566a).b(vaultId, w4l.h.f294642c)), new d0(this, 8))), new rm2.s(22));
    }
}
