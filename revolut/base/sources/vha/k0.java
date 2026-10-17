package vha;

import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ sfe.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f289399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(sfe.m mVar, q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f289399w = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k0(this.v, this.f289399w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StartUpPocket proAccount;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            sfe.m mVar = this.v;
            String str = mVar.f262420b.f89729a;
            t0.Companion.getClass();
            if (Intrinsics.f(str, t0.d)) {
                proAccount = StartUpPocket.ProAll.f104860a;
            } else {
                io3.d dVarF3 = q0.f3(mVar);
                if (dVarF3 == null) {
                    throw new IllegalStateException("Pocket must be present");
                }
                proAccount = new StartUpPocket.ProAccount(dVarF3.f163145a);
            }
            Action.MoveMoney moveMoney = new Action.MoveMoney(proAccount, (com.revolut.shared.feature.move_money.api.navigation.a) null, 6);
            this.u = 1;
            if (q0.c3(this.f289399w, moveMoney, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
