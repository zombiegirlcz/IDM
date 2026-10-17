package dp4;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yn4.z;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f116595w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116595w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f116595w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f116595w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(this.f116595w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(this.f116595w, continuation, 3);
                a0Var4.v = obj2;
                return a0Var4;
            case 4:
                a0 a0Var5 = new a0(this.f116595w, continuation, 4);
                a0Var5.v = obj2;
                return a0Var5;
            default:
                a0 a0Var6 = new a0(this.f116595w, continuation, 5);
                a0Var6.v = obj2;
                return a0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((cp4.z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((cp4.a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((cp4.f0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a0) create((cp4.g0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a0) create((cp4.n0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((cp4.o0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c0 c0Var = this.f116595w;
        switch (i) {
            case 0:
                cp4.z zVar = (cp4.z) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yn4.s sVar = (yn4.s) c0Var.d.a(zVar);
                if (sVar != null) {
                    return zn4.c.e(sVar);
                }
                return null;
            case 1:
                cp4.a0 a0Var = (cp4.a0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) c0Var.d.a(a0Var);
                if (list == null) {
                    return null;
                }
                List<xo4.u> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (xo4.u uVar : list2) {
                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                    String id10 = uVar.getId();
                    String facilityId = uVar.getFacilityId();
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(uVar.getCreatedAt());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                    ql4.t tVarValueOf = ql4.t.valueOf(uVar.getState());
                    int term = uVar.getTerm();
                    int settledInstalments = uVar.getSettledInstalments();
                    dj0.d dVarO = mo3.a.o(uVar.getPrincipalAmount());
                    dj0.d dVarO2 = mo3.a.o(uVar.getRemainingTotalAmount());
                    jo3.a nextDueAmount = uVar.getNextDueAmount();
                    dj0.d dVarO3 = nextDueAmount != null ? mo3.a.o(nextDueAmount) : null;
                    LocalDate nextDueDate = uVar.getNextDueDate();
                    List transactionIds = uVar.getTransactionIds();
                    z.a cancellation = uVar.getCancellation();
                    ql4.l lVarF = cancellation != null ? zn4.c.f(cancellation) : null;
                    ql4.p0 p0Var = ql4.q0.Companion;
                    String strName = uVar.getType().name();
                    p0Var.getClass();
                    arrayList.add(new ql4.k(id10, facilityId, instantOfEpochMilli, tVarValueOf, term, settledInstalments, dVarO, dVarO2, dVarO3, nextDueDate, transactionIds, lVarF, ql4.p0.a(strName)));
                }
                return arrayList;
            case 2:
                cp4.f0 f0Var = (cp4.f0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yn4.z zVar2 = (yn4.z) c0Var.d.a(f0Var);
                if (zVar2 != null) {
                    return zn4.c.i(zVar2);
                }
                return null;
            case 3:
                cp4.g0 g0Var = (cp4.g0) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yn4.e0 e0Var = (yn4.e0) c0Var.d.a(g0Var);
                if (e0Var != null) {
                    return zn4.c.l(e0Var);
                }
                return null;
            case 4:
                cp4.n0 n0Var = (cp4.n0) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yn4.f0 f0Var2 = (yn4.f0) c0Var.d.a(n0Var);
                if (f0Var2 != null) {
                    return zn4.c.m(f0Var2);
                }
                return null;
            default:
                cp4.o0 o0Var = (cp4.o0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yn4.g0 g0Var2 = (yn4.g0) c0Var.d.a(o0Var);
                if (g0Var2 != null) {
                    return zn4.c.o(g0Var2);
                }
                return null;
        }
    }
}
