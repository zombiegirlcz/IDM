package rs2;

import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f256944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(n nVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f256944w = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new f(this.f256944w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new f(this.f256944w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
            case 2:
                f fVar = new f(this.f256944w, (Continuation) obj4, 2);
                Unit unit = Unit.f186387a;
                fVar.invokeSuspend(unit);
                return unit;
            case 3:
                return new f(this.f256944w, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
            case 4:
                return new f(this.f256944w, (Continuation) obj4, 4).invokeSuspend(Unit.f186387a);
            case 5:
                f fVar2 = new f(this.f256944w, (Continuation) obj4, 5);
                Unit unit2 = Unit.f186387a;
                fVar2.invokeSuspend(unit2);
                return unit2;
            case 6:
                f fVar3 = new f(this.f256944w, (Continuation) obj4, 6);
                Unit unit3 = Unit.f186387a;
                fVar3.invokeSuspend(unit3);
                return unit3;
            default:
                f fVar4 = new f(this.f256944w, (Continuation) obj4, 7);
                Unit unit4 = Unit.f186387a;
                fVar4.invokeSuspend(unit4);
                return unit4;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 25;
        n nVar = this.f256944w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    throw new IllegalStateException("C2B referrals don't support target accounts");
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                String str = (String) obj2;
                return str == null ? "" : str;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m5j.g gVar = nVar.f256954a;
                this.v = 1;
                r rVarA = mwa.b.a(gVar.f202948a, pwa.i.ACTIVE, pwa.n.RETAIL_TO_BUSINESS, 28);
                Intrinsics.checkNotNullParameter(rVarA, "<this>");
                Object objX = q.x(new m5j.c(mo3.a.g(rd0.e.b(zi0.c.v(rVarA, new zg6.c(i2))), null, null, 3), gVar, 0), this);
                return objX == aVar2 ? aVar2 : objX;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    throw new IllegalStateException("C2B referrals don't support target accounts");
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m5j.g gVar2 = nVar.f256954a;
                this.v = 1;
                r rVarB = mwa.b.b(gVar2.f202948a, pwa.n.RETAIL_TO_BUSINESS, true, 2);
                Intrinsics.checkNotNullParameter(rVarB, "<this>");
                Object objX2 = q.x(new m5j.c(mo3.a.g(rd0.e.b(zi0.c.v(rVarB, new zg6.c(i2))), null, null, 3), gVar2, 2), this);
                return objX2 == aVar4 ? aVar4 : objX2;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m5j.g gVar3 = nVar.f256954a;
                this.v = 1;
                r rVarA2 = mwa.b.a(gVar3.f202948a, pwa.i.PAST, pwa.n.RETAIL_TO_BUSINESS, 28);
                Intrinsics.checkNotNullParameter(rVarA2, "<this>");
                Object objX3 = q.x(new m5j.c(mo3.a.g(rd0.e.b(zi0.c.v(rVarA2, new zg6.c(i2))), null, null, 3), gVar3, 1), this);
                return objX3 == aVar5 ? aVar5 : objX3;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    throw new IllegalStateException("C2B referrals don't support target accounts");
                }
                if (i32 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    throw new IllegalStateException("C2B referrals don't support target accounts");
                }
                if (i33 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    throw new IllegalStateException("C2B referrals don't support target accounts");
                }
                if (i43 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
        }
    }
}
