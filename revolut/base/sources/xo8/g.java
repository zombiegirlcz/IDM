package xo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JuniorSettingsController juniorSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f53228a;
        h0 h0Var = (h0) nVarE3;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        oc8.n nVar = (oc8.n) h0Var.f307700r;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        nVar.A2(new BridgeDestination(new FeatureCommand(new CardManagementFeatureConfig.JuniorSettings(listId))));
        return Unit.f186387a;
    }
}
