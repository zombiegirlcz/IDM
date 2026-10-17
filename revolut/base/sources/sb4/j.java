package sb4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e f261512w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261512w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f261512w, continuation, 0);
            default:
                return new j(this.f261512w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar = this.f261512w;
                i iVar = new i(eVar, null);
                this.v = 1;
                Object objB = pu7.a.B(eVar.k, "selectCoApplicantOnly", iVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar2 = this.f261512w;
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.d dVar = new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.d(eVar2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(eVar2.k, "load configuration", dVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
