package pfk;

import com.revolut.retail.feature.pricing_plans.impl.network.FamilyPlanService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f235661w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f235661w = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new o(this.f235661w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new o(this.f235661w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new o(this.f235661w, (Continuation) obj4, 2).invokeSuspend(Unit.f186387a);
            default:
                return new o(this.f235661w, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService = this.f235661w.f235686b;
                    this.v = 1;
                    obj2 = familyPlanService.getFamilyLimits(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return nfk.c.b((lfk.b) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                s sVar = this.f235661w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService2 = sVar.f235686b;
                    this.v = 1;
                    obj2 = familyPlanService2.getFamilySubscribeInfo(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return nfk.c.h((lfk.l) obj2, sVar.d);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService3 = this.f235661w.f235686b;
                    this.v = 1;
                    obj2 = familyPlanService3.getFamilyPlanInvitations(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return nfk.c.a((mfk.a) obj2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                s sVar2 = this.f235661w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService4 = sVar2.f235686b;
                    this.v = 1;
                    obj2 = familyPlanService4.getFamilyPlanSubscribeInfo(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return nfk.c.h((lfk.l) obj2, sVar2.d);
        }
    }
}
