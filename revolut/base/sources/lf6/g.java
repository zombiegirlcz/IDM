package lf6;

import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.OpenBankingBrazilService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f194644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f194645x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f194644w = jVar;
        this.f194645x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f194644w, this.f194645x, continuation, 0);
            case 1:
                return new g(this.f194644w, this.f194645x, continuation, 1);
            case 2:
                return new g(this.f194644w, this.f194645x, continuation, 2);
            default:
                return new g(this.f194644w, this.f194645x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                String str = this.f194645x;
                j jVar = this.f194644w;
                if (i == 0) {
                    o.b(obj2);
                    OpenBankingBrazilService openBankingBrazilService = jVar.f194653b;
                    this.v = 1;
                    if (openBankingBrazilService.deleteConsent(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                jVar.f194652a.remove("LINKED_ACCOUNTS_MEMORY_CACHE_KEY" + str);
                jVar.f194654c.I0("LINKED_ACCOUNTS_STORAGE_KEY" + str);
                x4l.c cVar = jVar.e;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar.d(unit, true, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String str2 = this.f194645x;
                j jVar2 = this.f194644w;
                if (i2 == 0) {
                    o.b(obj2);
                    OpenBankingBrazilService openBankingBrazilService2 = jVar2.f194653b;
                    this.v = 1;
                    if (openBankingBrazilService2.deleteConsent(str2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                jVar2.f194652a.remove("CONSENTS_MEMORY_CACHE_KEY" + str2);
                jVar2.f194654c.I0("CONSENTS_STORAGE_KEY" + str2);
                x4l.c cVar2 = jVar2.d;
                Unit unit2 = Unit.f186387a;
                this.v = 2;
                if (cVar2.d(unit2, true, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    OpenBankingBrazilService openBankingBrazilService3 = this.f194644w.f194653b;
                    mf6.h hVar = new mf6.h("REJECT", null, null, null);
                    this.v = 1;
                    obj2 = openBankingBrazilService3.consentAction(this.f194645x, hVar, new wj0.b("OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY"), this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return ((mf6.i) obj2).getRedirectUri();
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    j jVar3 = this.f194644w;
                    ne0.j jVar4 = jVar3.f194652a;
                    StringBuilder sb6 = new StringBuilder("CONSENTS_MEMORY_CACHE_KEY");
                    String str3 = this.f194645x;
                    sb6.append(str3);
                    jVar4.remove(sb6.toString());
                    jVar3.f194654c.I0("CONSENTS_STORAGE_KEY" + str3);
                    x4l.c cVar3 = jVar3.d;
                    Unit unit3 = Unit.f186387a;
                    this.v = 1;
                    if (cVar3.d(unit3, true, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
