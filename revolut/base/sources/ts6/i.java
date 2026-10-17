package ts6;

import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import et6.q1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f274010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(s0 s0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274010w = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f274010w, continuation, 0);
            case 1:
                return new i(this.f274010w, continuation, 1);
            case 2:
                return new i(this.f274010w, continuation, 2);
            default:
                return new i(this.f274010w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objD;
        Object objB;
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
                q1 q1Var = this.f274010w.i;
                this.v = 1;
                Boolean boolValueOf = Boolean.valueOf(pd.b.j((Boolean) q1Var.f129309a.f9580b.get("MEMORY_CACHE_KEY_NET_NEW_USER_JOINED")));
                return boolValueOf == aVar ? aVar : boolValueOf;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var2 = this.f274010w.i;
                    this.v = 1;
                    if (q1Var2.b(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objD = this.f274010w.d(null, null, this);
                    if (objD == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objB = obj2;
                        NaviCommand naviCommand = (NaviCommand) objB;
                        Intrinsics.h(naviCommand);
                        return new BridgeDestination(naviCommand);
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                NaviCommand onSuccessCommand = (NaviCommand) objD;
                Intrinsics.checkNotNullParameter(onSuccessCommand, "onSuccessCommand");
                ufm.b bVarM = efm.d0.m(new FeatureCommand(new CardOrderNewFeatureConfig(SelectedTab.FREELANCER, null, onSuccessCommand, null, null, false, null, null, null, null, null, null, 16370)));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                this.v = 2;
                objB = nim.a.b(bVarM, this);
                if (objB == aVar3) {
                    return aVar3;
                }
                NaviCommand naviCommand2 = (NaviCommand) objB;
                Intrinsics.h(naviCommand2);
                return new BridgeDestination(naviCommand2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gr6.e eVar = this.f274010w.d;
                this.v = 1;
                Object objA = ((et6.l0) eVar).a(yoj.c.FREELANCER_PHASE_1, this);
                return objA == aVar4 ? aVar4 : objA;
        }
    }
}
