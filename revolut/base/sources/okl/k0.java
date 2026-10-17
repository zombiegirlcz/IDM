package okl;

import com.revolut.sso.api.models.EmailEvidence;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ tni.f f226206x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(com.revolut.sso.impl.ui.auth.n nVar, tni.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226205w = nVar;
        this.f226206x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k0(this.f226205w, this.f226206x, continuation, 0);
            default:
                return new k0(this.f226205w, this.f226206x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jkl.i iVarD = yjl.d.d(((tni.d) this.f226206x).f272456a);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.U2(this.f226205w, iVarD, null, this, 6) == aVar) {
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
                    String secret = ((tni.e) this.f226206x).f272457a;
                    Intrinsics.checkNotNullParameter(secret, "secret");
                    EmailEvidence emailEvidence = new EmailEvidence(secret);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226205w, null, emailEvidence, null, this, 5) == aVar2) {
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
