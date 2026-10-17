package cwj;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.flow.f f109840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.retail.feature.impl.userauth.flow.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f109840w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f109840w, continuation, 0);
            case 1:
                return new k(this.f109840w, continuation, 1);
            default:
                return new k(this.f109840w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q89.f fVar = q89.f.STORIES;
                    this.v = 1;
                    if (com.revolut.retail.feature.impl.userauth.flow.f.I2(this.f109840w, fVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarA = this.f109840w.v.a();
                    this.v = 1;
                    if (nim.a.a(aVarA, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.retail.feature.impl.userauth.flow.f fVar2 = this.f109840w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = com.revolut.retail.feature.api.userauth.navigation.a.a(fVar2.f101680w, false, null, 7);
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
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.h(naviCommand);
                return fVar2.C1(new BridgeDestination(naviCommand));
        }
    }
}
