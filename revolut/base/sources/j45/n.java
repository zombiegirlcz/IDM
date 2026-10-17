package j45;

import com.revolut.core.model.account.AccountId;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b f171307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j1j.d f171308x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar, j1j.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171307w = bVar;
        this.f171308x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f171307w, this.f171308x, continuation, 0);
            default:
                return new n(this.f171307w, this.f171308x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
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
                b45.h hVar = this.f171307w.f70302q;
                j1j.d dVar = this.f171308x;
                AccountId accountId = dVar.f170619c;
                xi0.b bVar = dVar.f170618b;
                this.v = 1;
                Serializable serializableD = hVar.d(accountId, this, bVar);
                return serializableD == aVar ? aVar : serializableD;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar2 = this.f171307w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar = new n(bVar2, this.f171308x, continuation, 0);
                    this.v = 1;
                    obj2 = bVar2.p2(this, nVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                x35.d dVar2 = (x35.d) obj2;
                if (dVar2 == null) {
                    return null;
                }
                bVar2.H2(bVar2.f70305t, new iyi.i(dVar2, 17));
                return Unit.f186387a;
        }
    }
}
