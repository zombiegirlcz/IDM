package mll;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207072w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207072w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f207072w, continuation, 0);
            case 1:
                return new n(this.f207072w, continuation, 1);
            case 2:
                return new n(this.f207072w, continuation, 2);
            case 3:
                return new n(this.f207072w, continuation, 3);
            default:
                return new n(this.f207072w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = this.f207072w;
                m mVar = new m(cVar, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(cVar.k, "continueWithPasskey", mVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar2 = this.f207072w;
                m mVar2 = new m(cVar2, null, 2);
                this.v = 1;
                Object objB2 = pu7.a.B(cVar2.k, "continueWithQrCode", mVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar3 = this.f207072w;
                m mVar3 = new m(cVar3, null, 4);
                this.v = 1;
                Object objB3 = pu7.a.B(cVar3.k, "ContinueWithBankId", mVar3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
            case 3:
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
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar4 = this.f207072w;
                m mVar4 = new m(cVar4, null, 6);
                this.v = 1;
                Object objB4 = pu7.a.B(cVar4.k, "ContinueWithDAP", mVar4, this);
                return objB4 == aVar4 ? aVar4 : objB4;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar5 = this.f207072w;
                m mVar5 = new m(cVar5, null, 8);
                this.v = 1;
                Object objB5 = pu7.a.B(cVar5.k, "ContinueWithUAEPass", mVar5, this);
                return objB5 == aVar5 ? aVar5 : objB5;
        }
    }
}
