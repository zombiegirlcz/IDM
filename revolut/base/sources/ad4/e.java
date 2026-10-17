package ad4;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$Step;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d f3267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3267w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f3267w, continuation, 0);
            default:
                return new e(this.f3267w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar = this.f3267w;
                if (i == 0) {
                    o.b(obj2);
                    d dVar2 = new d(dVar, null, 1);
                    this.v = 1;
                    obj2 = dVar.p2(this, dVar2);
                    if (obj2 == aVar) {
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
                this.v = 2;
                if (t.N2(dVar, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar3 = this.f3267w;
                if (i2 == 0) {
                    o.b(obj2);
                    d dVar4 = new d(dVar3, null, 4);
                    this.v = 1;
                    obj2 = dVar3.p2(this, dVar4);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                List list = (List) obj2;
                if (list == null || list.isEmpty()) {
                    dVar3.l2(new com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.b(dVar3, false, null), new yi5.b(26));
                } else {
                    h.t2(dVar3, dVar3.f67845w, new CreditLinkedAccountsV2FlowContract$Step.LinkedAccountsHub(false), true, null, false, 12);
                }
                return Unit.f186387a;
        }
    }
}
