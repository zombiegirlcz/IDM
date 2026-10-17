package f23;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f131367w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i = this.u;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        Continuation continuation = (Continuation) obj4;
        switch (i) {
            case 0:
                g0 g0Var = new g0(3, 0, continuation);
                g0Var.v = zBooleanValue;
                g0Var.f131367w = zBooleanValue2;
                return g0Var.invokeSuspend(Unit.f186387a);
            case 1:
                g0 g0Var2 = new g0(3, 1, continuation);
                g0Var2.v = zBooleanValue;
                g0Var2.f131367w = zBooleanValue2;
                return g0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                g0 g0Var3 = new g0(3, 2, continuation);
                g0Var3.v = zBooleanValue;
                g0Var3.f131367w = zBooleanValue2;
                return g0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                g0 g0Var4 = new g0(3, 3, continuation);
                g0Var4.v = zBooleanValue;
                g0Var4.f131367w = zBooleanValue2;
                return g0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                g0 g0Var5 = new g0(3, 4, continuation);
                g0Var5.v = zBooleanValue;
                g0Var5.f131367w = zBooleanValue2;
                return g0Var5.invokeSuspend(Unit.f186387a);
            default:
                g0 g0Var6 = new g0(3, 5, continuation);
                g0Var6.v = zBooleanValue;
                g0Var6.f131367w = zBooleanValue2;
                return g0Var6.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = false;
        switch (this.u) {
            case 0:
                boolean z3 = this.v;
                boolean z4 = this.f131367w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z3 && z4) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                boolean z6 = this.v;
                boolean z11 = this.f131367w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z6 && z11) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                boolean z12 = this.v;
                boolean z29 = this.f131367w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z12 && z29) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                boolean z31 = this.v;
                boolean z41 = this.f131367w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z31 && z41) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                boolean z49 = this.v;
                boolean z54 = this.f131367w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new qtb.l(z49, z54);
            default:
                boolean z74 = this.v;
                boolean z83 = this.f131367w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z74 && z83) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
