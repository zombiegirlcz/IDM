package yna;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class v0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public c1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f315377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c1 f315378x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(c1 c1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f315378x = c1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v0(this.f315378x, continuation, 0);
            case 1:
                return new v0(this.f315378x, continuation, 1);
            case 2:
                return new v0(this.f315378x, continuation, 2);
            default:
                return new v0(this.f315378x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c1 c1Var;
        c1 c1Var2;
        c1 c1Var3;
        c1 c1Var4;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f315377w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    c1 c1Var5 = this.f315378x;
                    cti.a aVar2 = c1Var5.Z;
                    this.v = c1Var5;
                    this.f315377w = 1;
                    FeatureCommand featureCommandA = ((nti.a) aVar2).a();
                    if (featureCommandA == aVar) {
                        return aVar;
                    }
                    c1Var = c1Var5;
                    obj2 = featureCommandA;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1Var = this.v;
                    yhm.o.b(obj2);
                }
                return c1Var.C1(new BridgeDestination((NaviCommand) obj2));
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f315377w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    c1 c1Var6 = this.f315378x;
                    s5b.a aVar4 = c1Var6.f315310h0;
                    this.v = c1Var6;
                    this.f315377w = 1;
                    Object objA = ((d6b.b) aVar4).a("ihg", this);
                    if (objA == aVar3) {
                        return aVar3;
                    }
                    c1Var2 = c1Var6;
                    obj2 = objA;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1Var2 = this.v;
                    yhm.o.b(obj2);
                }
                return c1Var2.C1((aii.u) obj2);
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f315377w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    c1 c1Var7 = this.f315378x;
                    fej.b bVar = c1Var7.f315306a0;
                    this.v = c1Var7;
                    this.f315377w = 1;
                    Object objC = ((ifj.f) bVar).c(true, this);
                    if (objC == aVar5) {
                        return aVar5;
                    }
                    c1Var3 = c1Var7;
                    obj2 = objC;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1Var3 = this.v;
                    yhm.o.b(obj2);
                }
                return c1Var3.C1(new BridgeDestination((NaviCommand) obj2));
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.f315377w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    c1 c1Var8 = this.f315378x;
                    tvi.a aVar7 = c1Var8.f315308d0;
                    this.v = c1Var8;
                    this.f315377w = 1;
                    FeatureCommand featureCommandA2 = ((fwi.a) aVar7).a();
                    if (featureCommandA2 == aVar6) {
                        return aVar6;
                    }
                    c1Var4 = c1Var8;
                    obj2 = featureCommandA2;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1Var4 = this.v;
                    yhm.o.b(obj2);
                }
                return c1Var4.C1(new BridgeDestination((NaviCommand) obj2));
        }
    }
}
