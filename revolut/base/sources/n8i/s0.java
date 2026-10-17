package n8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.topup.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f213469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f213470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f213471y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.feature_move_money.impl.topup.a aVar, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, long j2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f213469w = accountWrapper;
        this.f213470x = accountWrapper2;
        this.f213471y = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s0(this.v, this.f213469w, this.f213470x, this.f213471y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.feature_move_money.impl.topup.a aVar2 = this.v;
        c7i.c0 c0Var = new c7i.c0(new vkm.t0(aVar2.M.B(new q0(0)), 1), aVar2, this.f213469w, this.f213470x, this.f213471y, 1);
        this.u = 1;
        Object objX = vkm.q.x(c0Var, this);
        return objX == aVar ? aVar : objX;
    }
}
