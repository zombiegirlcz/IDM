package q34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f241794w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f241795x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241794w = dVar;
        this.f241795x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f241794w, this.f241795x, continuation, 0);
            case 1:
                return new c(this.f241794w, this.f241795x, continuation, 1);
            default:
                return new c(this.f241794w, this.f241795x, continuation, 2);
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
                d dVar = this.f241794w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = dVar.f241797b;
                    String str = this.f241795x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.finishDocumentsUpload(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return dVar.f241796a.p((tt3.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                d dVar2 = this.f241794w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = dVar2.f241797b;
                    String str2 = this.f241795x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService2.switchToManualUnderwriting(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return dVar2.f241796a.p((tt3.a) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                d dVar3 = this.f241794w;
                if (i3 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService3 = dVar3.f241797b;
                    String str3 = this.f241795x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService3.switchToManualUnderwritingV2(str3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return dVar3.f241796a.p((tt3.a) obj2);
        }
    }
}
