package f44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f132005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f132006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f132005w = cVar;
        this.f132006x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f132005w, this.f132006x, continuation, 0);
            default:
                return new b(this.f132005w, this.f132006x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f132005w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = cVar.f132008b;
                    String str = this.f132006x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.acceptRefinancingOffer(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar.f132007a.p((tt3.a) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f132005w;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = cVar2.f132008b;
                    String str2 = this.f132006x.f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService2.dismissRefinancingOfferIntro(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return cVar2.f132007a.p((tt3.a) obj2);
        }
    }
}
