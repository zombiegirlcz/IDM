package k3k;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ k1j.a A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f180789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountId f180790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f180791y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, AccountId accountId, String str, String str2, k1j.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180789w = t0Var;
        this.f180790x = accountId;
        this.f180791y = str;
        this.z = str2;
        this.A = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s0(this.f180789w, this.f180790x, this.f180791y, this.z, this.A, continuation, 0);
            default:
                return new s0(this.f180789w, this.f180790x, this.f180791y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    k1j.a aVar2 = this.A;
                    t0 t0Var = this.f180789w;
                    r0 r0Var = new r0(t0Var, this.f180790x, this.f180791y, this.z, aVar2, null);
                    this.v = 1;
                    if (t0Var.p2(this, r0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    t0 t0Var2 = this.f180789w;
                    a5k.n nVar = new a5k.n((yji.l) t0Var2, this.f180790x, this.f180791y, this.z, this.A, (Continuation) null, 6);
                    this.v = 1;
                    if (t0Var2.p2(this, nVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
