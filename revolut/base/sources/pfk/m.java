package pfk;

import com.revolut.retail.feature.pricing_plans.impl.network.FamilyPlanService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om4.t3;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f235656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f235657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f235658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(s sVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235656w = sVar;
        this.f235657x = str;
        this.f235658y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f235656w, this.f235657x, this.f235658y, continuation, 0);
            case 1:
                return new m(this.f235656w, this.f235657x, this.f235658y, continuation, 1);
            case 2:
                return new m(this.f235656w, this.f235657x, this.f235658y, continuation, 2);
            case 3:
                return new m(this.f235656w, this.f235657x, this.f235658y, continuation, 3);
            case 4:
                return new m(this.f235656w, this.f235657x, this.f235658y, continuation, 4);
            default:
                return new m(this.f235656w, this.f235657x, this.f235658y, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f235658y;
        String str2 = this.f235657x;
        s sVar = this.f235656w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService = sVar.f235686b;
                    lfk.i iVar = new lfk.i(lfk.h.ACCEPTED);
                    this.v = 1;
                    if (familyPlanService.patchInvitation(str2, str, iVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (s.a(sVar, str2, str, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService2 = sVar.f235686b;
                    lfk.i iVar2 = new lfk.i(lfk.h.CANCELLED);
                    this.v = 1;
                    if (familyPlanService2.patchInvitation(str2, str, iVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (s.a(sVar, str2, str, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService3 = sVar.f235686b;
                    this.v = 1;
                    if (familyPlanService3.deleteFamily(str2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                h hVar = s.Companion;
                sVar.getClass();
                String strB = s.b(str);
                sVar.f235685a.remove(strB);
                sVar.f235687c.I0(strB);
                x4l.c.a(sVar.e, new t3(str, 25));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService4 = sVar.f235686b;
                    lfk.j jVar = new lfk.j(str);
                    this.v = 1;
                    if (familyPlanService4.inviteMember(str2, jVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar = sVar.f235688g;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar.d(unit, true, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService5 = sVar.f235686b;
                    lfk.i iVar3 = new lfk.i(lfk.h.REJECTED);
                    this.v = 1;
                    if (familyPlanService5.patchInvitation(str2, str, iVar3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (s.a(sVar, str2, str, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FamilyPlanService familyPlanService6 = sVar.f235686b;
                    this.v = 1;
                    if (familyPlanService6.removeMember(str2, str, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
