package dc4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e f112796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f112796w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f112796w, continuation, 0);
            case 1:
                return new i(this.f112796w, continuation, 1);
            default:
                return new i(this.f112796w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar = this.f112796w;
                    Object objB = pu7.a.B(eVar.k, "getPartnerConfiguration", new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.c(eVar, null), this);
                    if (objB != obj3) {
                        objB = Unit.f186387a;
                    }
                    if (objB == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar2 = this.f112796w;
                    if (pu7.a.B(eVar2.k, "getDocumentsUploadConfiguration", new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.b(eVar2, null), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar3 = this.f112796w;
                    if (pu7.a.B(eVar3.k, "getDocumentsUploadConfiguration", new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.b(eVar3, null), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
