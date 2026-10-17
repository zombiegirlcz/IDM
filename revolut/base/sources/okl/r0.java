package okl;

import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.PinEvidence;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.password_flow.a f226235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226236x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.sso.impl.ui.auth.n nVar, com.revolut.sso.impl.ui.password_flow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f226236x = nVar;
        this.f226235w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r0(this.f226236x, this.f226235w, continuation);
            default:
                return new r0(this.f226235w, this.f226236x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Evidence evidence = ((jol.e) this.f226235w).f177167a;
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226236x, null, evidence, null, this, 5) == aVar) {
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
                com.revolut.sso.impl.ui.auth.n nVar = this.f226236x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jol.f fVar = (jol.f) this.f226235w;
                    mcg.j jVar = new mcg.j(nVar, new mm0.b(fVar.f177168a, fVar.f177169b), null, 4);
                    this.v = 1;
                    obj2 = nVar.p2(this, jVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String secret = (String) obj2;
                Intrinsics.checkNotNullParameter(secret, "secret");
                PinEvidence pinEvidence = new PinEvidence(secret);
                this.v = 2;
                if (com.revolut.sso.impl.ui.auth.n.Q2(nVar, null, pinEvidence, null, this, 5) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.sso.impl.ui.password_flow.a aVar, com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f226235w = aVar;
        this.f226236x = nVar;
    }
}
