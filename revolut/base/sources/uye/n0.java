package uye;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f284308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f284309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f284310y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, AccountId.Joint joint, dj0.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f284308w = joint;
        this.f284309x = dVar;
        this.f284310y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.v, this.f284308w, this.f284309x, this.f284310y, continuation);
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
            String str = this.f284310y;
            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.v;
            m0 m0Var = new m0(iVar, this.f284308w, this.f284309x, str, null);
            this.u = 1;
            if (iVar.p2(this, m0Var) == aVar) {
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
