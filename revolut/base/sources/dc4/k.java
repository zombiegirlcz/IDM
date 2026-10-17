package dc4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e f112798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f112799x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112798w = eVar;
        this.f112799x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f112798w, this.f112799x, continuation, 0);
            case 1:
                return new k(this.f112798w, this.f112799x, continuation, 1);
            default:
                return new k(this.f112798w, this.f112799x, continuation, 2);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar = this.f112798w;
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.d dVar = new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.d(eVar, this.f112799x, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(eVar.k, "handleDeeplink", dVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
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
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar2 = this.f112798w;
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.d dVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.d(eVar2, this.f112799x, null, 3);
                this.v = 1;
                Object objB2 = pu7.a.B(eVar2.k, "submitPartnerFailure", dVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar3 = this.f112798w;
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.d dVar3 = new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.d(eVar3, this.f112799x, null, 4);
                this.v = 1;
                Object objB3 = pu7.a.B(eVar3.k, "submitPartnerSuccess", dVar3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
        }
    }
}
