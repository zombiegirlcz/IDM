package fd4;

import a54.g;
import ad4.f;
import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$Step;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c f133918w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133918w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f133918w, continuation, 0);
            case 1:
                return new c(this.f133918w, continuation, 1);
            case 2:
                return new c(this.f133918w, continuation, 2);
            default:
                return new c(this.f133918w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar = this.f133918w;
                    g gVar = new g(cVar, null, 20);
                    this.v = 1;
                    if (cVar.p2(this, gVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar2 = this.f133918w;
                if (i2 == 0) {
                    o.b(obj2);
                    d dVar = new d(cVar2, null, 1);
                    this.v = 1;
                    obj2 = cVar2.p2(this, dVar);
                    if (obj2 == aVar2) {
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
                this.v = 2;
                if (t.N2(cVar2, (it3.d) obj2, this, 2) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                Continuation continuation = null;
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar3 = this.f133918w;
                if (i3 == 0) {
                    o.b(obj2);
                    d dVar2 = new d(cVar3, continuation, 2);
                    this.v = 1;
                    obj2 = cVar3.p2(this, dVar2);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                cVar3.H2(cVar3.v, new f((av3.f) obj2, 1));
                CreditLinkedAccountsV3FlowContract$InputData creditLinkedAccountsV3FlowContract$InputData = cVar3.f67870p;
                if (creditLinkedAccountsV3FlowContract$InputData.f67854b) {
                    cVar3.l2(new com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.a(cVar3, false, null), new yi5.b(26));
                } else if (creditLinkedAccountsV3FlowContract$InputData.f67855c) {
                    cVar3.R2(false, true, true);
                } else {
                    h.t2(cVar3, cVar3.f67875w, new CreditLinkedAccountsV3FlowContract$Step.Prompt(cVar3.P2().f9898b), true, null, false, 12);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                Continuation continuation2 = null;
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar4 = this.f133918w;
                if (i5 == 0) {
                    o.b(obj2);
                    d dVar3 = new d(cVar4, continuation2, 4);
                    this.v = 1;
                    obj2 = cVar4.p2(this, dVar3);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                List list = (List) obj2;
                if (list == null || list.isEmpty()) {
                    cVar4.l2(new com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.a(cVar4, false, null), new yi5.b(26));
                } else {
                    cVar4.R2(false, cVar4.f67870p.f67855c, true);
                }
                return Unit.f186387a;
        }
    }
}
