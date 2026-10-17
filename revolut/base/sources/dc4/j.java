package dc4;

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
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e f112797w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112797w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f112797w, continuation, 0);
            case 1:
                return new j(this.f112797w, continuation, 1);
            case 2:
                return new j(this.f112797w, continuation, 2);
            default:
                return new j(this.f112797w, continuation, 3);
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
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar = this.f112797w;
                    i iVar = new i(eVar, null, 0);
                    this.v = 1;
                    if (eVar.p2(this, iVar) == aVar) {
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
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar2 = this.f112797w;
                    i iVar2 = new i(eVar2, null, 1);
                    this.v = 1;
                    if (eVar2.p2(this, iVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar3 = this.f112797w;
                    i iVar3 = new i(eVar3, null, 2);
                    this.v = 1;
                    if (eVar3.p2(this, iVar3) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar4 = this.f112797w;
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.a aVar5 = new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.a(eVar4, null);
                this.v = 1;
                Object objB = pu7.a.B(eVar4.k, "load configuration", aVar5, this);
                return objB == aVar4 ? aVar4 : objB;
        }
    }
}
