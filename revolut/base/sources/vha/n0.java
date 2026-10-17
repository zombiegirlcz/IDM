package vha;

import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sfe.m f289410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f289411x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, sfe.m mVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = q0Var;
        this.f289410w = mVar;
        this.f289411x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.v, this.f289410w, this.f289411x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            io3.d dVarF3 = q0.f3(this.f289410w);
            if (dVarF3 == null) {
                throw new IllegalStateException("Pocket must be present");
            }
            StartUpPocket.ProAccount proAccount = new StartUpPocket.ProAccount(dVarF3.f163145a);
            long j2 = dVarF3.i;
            Action.MoveMoneyWithAccountPair moveMoneyWithAccountPair = new Action.MoveMoneyWithAccountPair(proAccount, StartUpPocket.ProAll.f104860a, new Long(j2), this.f289411x ? k8l.a.WITHDRAW : k8l.a.MOVE, 32);
            this.u = 1;
            if (q0.c3(this.v, moveMoneyWithAccountPair, this) == aVar) {
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
