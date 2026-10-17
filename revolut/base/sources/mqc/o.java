package mqc;

import com.revolut.feature.salary_switch.impl.models.v2.CounterpartiesResult;
import com.revolut.feature.salary_switch.impl.models.v2.Employer;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusSummary;
import com.revolut.feature.salary_switch.impl.network.PayrollServiceV2;
import gqc.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f207968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f207968w = rVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new o(this.f207968w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new o(this.f207968w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [fim.a] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object counterparties;
        kqc.h hVar;
        Object payrollSwitches;
        Iterator it8;
        kqc.g gVar;
        kqc.g gVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PayrollServiceV2 payrollServiceV2 = this.f207968w.f207970a;
                    this.v = 1;
                    counterparties = payrollServiceV2.getCounterparties(this);
                    if (counterparties == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    counterparties = obj2;
                }
                gqc.i iVar = (gqc.i) counterparties;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                String str = iVar.f145637a;
                kqc.h[] hVarArrValues = kqc.h.values();
                int length = hVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        hVar = hVarArrValues[i2];
                        if (!a0.z(hVar.name(), str, true)) {
                            i2++;
                        }
                    } else {
                        hVar = null;
                    }
                }
                if (hVar == null) {
                    hVar = kqc.h.UNKNOWN;
                }
                List<gqc.l> list = iVar.f145638b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (gqc.l lVar : list) {
                    arrayList.add(new PayrollSwitchCounterparty(i2b.a.x(lVar.f145650a), lVar.f145651b, lVar.d, lVar.f145652c));
                }
                return new CounterpartiesResult(hVar, arrayList);
            default:
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    PayrollServiceV2 payrollServiceV22 = this.f207968w.f207970a;
                    this.v = 1;
                    payrollSwitches = payrollServiceV22.getPayrollSwitches(this);
                    if (payrollSwitches != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                payrollSwitches = obj2;
                Iterable iterable = (Iterable) payrollSwitches;
                arrayList2 = new ArrayList(w.t(iterable, 10));
                Iterator it9 = iterable.iterator();
                while (it9.hasNext()) {
                    g0 g0Var = (g0) it9.next();
                    Intrinsics.checkNotNullParameter(g0Var, "<this>");
                    String str2 = g0Var.f145630a;
                    bqc.k kVarU = i2b.a.u(g0Var.f145631b);
                    long j2 = g0Var.f145632c;
                    Long l2 = g0Var.d;
                    String str3 = g0Var.e;
                    gqc.r rVar = g0Var.f;
                    Employer employerW = rVar != null ? i2b.a.w(rVar) : null;
                    Long l3 = g0Var.f145633g;
                    Long l4 = g0Var.f145634h;
                    String str4 = g0Var.i;
                    if (str4 != null) {
                        kqc.g[] gVarArrValues = kqc.g.values();
                        int length2 = gVarArrValues.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length2) {
                                kqc.g gVar3 = gVarArrValues[i5];
                                it8 = it9;
                                int i6 = i5;
                                if (a0.z(gVar3.name(), str4, true)) {
                                    gVar2 = gVar3;
                                } else {
                                    i5 = i6 + 1;
                                    it9 = it8;
                                }
                            } else {
                                it8 = it9;
                                gVar2 = null;
                            }
                        }
                        if (gVar2 == null) {
                            gVar2 = kqc.g.UNKNOWN;
                        }
                        gVar = gVar2;
                    } else {
                        it8 = it9;
                        gVar = null;
                    }
                    arrayList2.add(new SalarySwitchV2StatusSummary(str2, kVarU, j2, l2, str3, employerW, l3, l4, gVar));
                    it9 = it8;
                }
                return arrayList2;
        }
    }
}
