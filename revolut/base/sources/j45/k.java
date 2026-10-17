package j45;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b f171304w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171304w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f171304w, continuation, 0);
            default:
                return new k(this.f171304w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar = this.f171304w;
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.a aVar2 = new com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.a(bVar, null);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "load user details", aVar2, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar2 = this.f171304w;
                j jVar = new j(bVar2, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "check article availability", jVar, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
