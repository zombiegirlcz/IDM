package joa;

import aii.u;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f176903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f176904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f176904x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f176904x, continuation, 0);
            default:
                return new g(this.f176904x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i iVar;
        i iVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f176903w;
                if (i == 0) {
                    o.b(obj2);
                    i iVar3 = this.f176904x;
                    f fVar = new f(iVar3, null, 1);
                    this.v = iVar3;
                    this.f176903w = 1;
                    obj2 = iVar3.p2(this, fVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    iVar = iVar3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = this.v;
                    o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "withLoading(...)");
                return iVar.C1(new BridgeDestination((NaviCommand) obj2));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f176903w;
                if (i2 == 0) {
                    o.b(obj2);
                    i iVar4 = this.f176904x;
                    sla.h hVar = iVar4.u;
                    this.v = iVar4;
                    this.f176903w = 1;
                    Object objA = ((yok.k) hVar).a(this);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                    iVar2 = iVar4;
                    obj2 = objA;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = this.v;
                    o.b(obj2);
                }
                return iVar2.C1((u) obj2);
        }
    }
}
