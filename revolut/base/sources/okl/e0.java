package okl;

import com.revolut.sso.api.models.OktaEvidence;
import com.revolut.sso.api.models.UaePassEvidence;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f226171x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(com.revolut.sso.impl.ui.auth.n nVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226170w = nVar;
        this.f226171x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(this.f226170w, this.f226171x, continuation, 0);
            default:
                return new e0(this.f226170w, this.f226171x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    OktaEvidence oktaEvidence = new OktaEvidence(this.f226171x);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226170w, null, oktaEvidence, null, this, 5) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    UaePassEvidence uaePassEvidence = new UaePassEvidence(this.f226171x);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226170w, null, uaePassEvidence, null, this, 5) == aVar2) {
                        return aVar2;
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
