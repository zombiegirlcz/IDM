package v20;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f285528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v30.c0 f285529c;

    public /* synthetic */ r(f0 f0Var, v30.c0 c0Var, int i) {
        this.f285527a = i;
        this.f285528b = f0Var;
        this.f285529c = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f285527a) {
            case 0:
                List<m20.n> tickets = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                if (tickets.isEmpty()) {
                    return efm.d0.m(zhm.f0.f322471a);
                }
                ArrayList arrayList = new ArrayList();
                for (m20.n nVar : tickets) {
                    UUID assigned = nVar.getAssigned();
                    f20.b lastCallRequest = nVar.getLastCallRequest();
                    UUID agentId = null;
                    UUID scheduledAgentId = lastCallRequest != null ? lastCallRequest.getScheduledAgentId() : null;
                    f20.a lastCall = nVar.getLastCall();
                    if (lastCall != null) {
                        agentId = lastCall.getAgentId();
                    }
                    UUID[] elements = {assigned, scheduledAgentId, agentId};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    zhm.a0.x(kotlin.collections.d.L(elements), arrayList);
                }
                Set setI1 = zhm.d0.i1(arrayList);
                f0 f0Var = this.f285528b;
                return new ufm.i(f0Var.f285383a.b(setI1), new uz7.f(27, new uyh.w(tickets, 5, f0Var, this.f285529c)), 1);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f285528b.f285391n.g(this.f285529c, false);
            default:
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "entities");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : entities) {
                    u10.f fVar = (u10.f) obj3;
                    if (hx7.l.b(fVar) && fVar.f276273p == (!this.f285528b.d.b()) && fVar.f276275r == this.f285529c) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
        }
    }
}
