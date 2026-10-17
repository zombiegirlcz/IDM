package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class n2 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ q2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ys3.a f210640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f210641x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(q2 q2Var, ys3.a aVar, PluginPayload pluginPayload, Continuation continuation) {
        super(2, continuation);
        this.v = q2Var;
        this.f210640w = aVar;
        this.f210641x = pluginPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n2(this.v, this.f210640w, this.f210641x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        PluginPayload pluginPayload = this.f210641x;
        if (i == 0) {
            yhm.o.b(obj2);
            it3.d dVar = pluginPayload.f66247a;
            this.u = 1;
            obj2 = this.v.g(this.f210640w, dVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return new FeatureCommand(new CreditApplicationKompotFeatureConfig.OfferV2((CreditApplicationKompotFeatureConfig.OfferV2.Config) obj2, io3.h.R(pluginPayload, ""), null));
    }
}
