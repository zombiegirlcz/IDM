package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ PluginPayload u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PluginPayload pluginPayload, Continuation continuation) {
        super(2, continuation);
        this.u = pluginPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        PluginPayload pluginPayload = this.u;
        return new FeatureCommand(new CreditApplicationKompotFeatureConfig.CardOrdering(new CreditApplicationKompotFeatureConfig.CardOrdering.Config.FromPayload(pluginPayload), io3.h.R(pluginPayload, ""), null));
    }
}
