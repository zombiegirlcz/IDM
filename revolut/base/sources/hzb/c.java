package hzb;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f157091w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157091w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f157091w, continuation, 0);
            case 1:
                return new c(this.f157091w, continuation, 1);
            default:
                return new c(this.f157091w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                i iVar = this.f157091w;
                gca.l lVar = new gca.l(iVar, null, 19);
                this.v = 1;
                Object objY2 = iVar.Y2(this, lVar);
                return objY2 == aVar ? aVar : objY2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                i iVar2 = this.f157091w;
                d dVar = new d(iVar2, null);
                this.v = 1;
                Object objY22 = iVar2.Y2(this, dVar);
                return objY22 == aVar2 ? aVar2 : objY22;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                i iVar3 = this.f157091w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = iVar3.f157106m.a();
                    this.v = 1;
                    obj2 = nim.a.b(iVarA, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                FeatureCommand featureCommand = (FeatureCommand) obj2;
                Intrinsics.h(featureCommand);
                return iVar3.A2(new BridgeDestination(featureCommand));
        }
    }
}
