package yna;

import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tx0.w1;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f315361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(c1 c1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f315361w = c1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m0 m0Var = new m0(this.f315361w, continuation, 0);
                m0Var.v = obj2;
                return m0Var;
            case 1:
                m0 m0Var2 = new m0(this.f315361w, continuation, 1);
                m0Var2.v = obj2;
                return m0Var2;
            case 2:
                m0 m0Var3 = new m0(this.f315361w, continuation, 2);
                m0Var3.v = obj2;
                return m0Var3;
            case 3:
                m0 m0Var4 = new m0(this.f315361w, continuation, 3);
                m0Var4.v = obj2;
                return m0Var4;
            case 4:
                m0 m0Var5 = new m0(this.f315361w, continuation, 4);
                m0Var5.v = obj2;
                return m0Var5;
            case 5:
                m0 m0Var6 = new m0(this.f315361w, continuation, 5);
                m0Var6.v = obj2;
                return m0Var6;
            case 6:
                m0 m0Var7 = new m0(this.f315361w, continuation, 6);
                m0Var7.v = obj2;
                return m0Var7;
            case 7:
                m0 m0Var8 = new m0(this.f315361w, continuation, 7);
                m0Var8.v = obj2;
                return m0Var8;
            case 8:
                m0 m0Var9 = new m0(this.f315361w, continuation, 8);
                m0Var9.v = obj2;
                return m0Var9;
            default:
                m0 m0Var10 = new m0(this.f315361w, continuation, 9);
                m0Var10.v = obj2;
                return m0Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((m0) create((PricingPlanWaitlistEntry) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((m0) create((qla.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((m0) create((w1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((m0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((m0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c1 c1Var = this.f315361w;
        switch (i) {
            case 0:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new djc.z(28, iVar));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new yfd.u(data, 16));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new yfd.u(data2, 17));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new yfd.u(data3, 18));
                return Unit.f186387a;
            case 4:
                PricingPlanWaitlistEntry pricingPlanWaitlistEntry = (PricingPlanWaitlistEntry) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new wok.l(pricingPlanWaitlistEntry, 1));
                return Unit.f186387a;
            case 5:
                qla.a aVar6 = (qla.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i2 = q0.f315369a[aVar6.ordinal()];
                if (i2 == 1) {
                    ((gld.f0) c1Var.L).c3(new mkd.a(new SlotContext(akd.s.PROFILE)));
                } else if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 6:
                w1 w1Var = (w1) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new yed.g0(w1Var, 24));
                return Unit.f186387a;
            case 7:
                Data data4 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new yfd.u(data4, 19));
                return Unit.f186387a;
            case 8:
                Pair pair = (Pair) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new yj2.b((do3.n) pair.f186385a, (qla.a) pair.f186386b, 10));
                return Unit.f186387a;
            default:
                String str = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.x2(new y9d.c(str, 13));
                return Unit.f186387a;
        }
    }
}
