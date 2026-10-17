package wbg;

import aqd.n1;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class y0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a f296216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296216w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y0(this.f296216w, continuation, 0);
            default:
                return new y0(this.f296216w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar2 = this.f296216w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarE = aVar2.A.e();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarE, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return aVar2.C1(new BridgeDestination((NaviCommand) obj2));
                    }
                    yhm.o.b(obj2);
                }
                hha.d dVar = (hha.d) obj2;
                jgk.v vVar = aVar2.B;
                Intrinsics.h(dVar);
                this.v = 2;
                obj2 = ((jjk.c) vVar).d(dVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                return aVar2.C1(new BridgeDestination((NaviCommand) obj2));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar4 = this.f296216w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarD = ((nyb.o) aVar4.u).d();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarD, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar4.H2(aVar4.O, new n1(26, (Boolean) obj2));
                return Unit.f186387a;
        }
    }
}
