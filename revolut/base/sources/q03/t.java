package q03;

import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = this.u;
        return bVar.C1(u0.b(new FeatureCommand(new CardManagementFeatureConfig.CardSelectReplaceReason(((i0) ((j2) bVar.E.f22677a).getValue()).f241080a, null))));
    }
}
