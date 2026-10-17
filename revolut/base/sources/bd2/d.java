package bd2;

import cd2.f;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFeatureConfig;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.apm.services.ideal.impl.data.network.IDealService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14519x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f14518w = str;
        this.f14519x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f14518w, this.f14519x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            IDealService iDealService = this.v.f14520a;
            cd2.e eVar = new cd2.e(this.f14518w, this.f14519x);
            this.u = 1;
            obj2 = iDealService.authorise(eVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return new IDealFeatureConfig(new IDealFlowDestination(new IDealFlowDestination.StartType.SuccessAuth(((f) obj2).getReturnUrl())));
    }
}
