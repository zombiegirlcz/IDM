package bh8;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorMigrationAssetDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorMigrationAssetDetailsScreen juniorMigrationAssetDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorMigrationAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarI3 = this.v.T2();
        Intrinsics.h(model);
        u uVar = (u) iVarI3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "REPORT_AN_ISSUE_LIST_ITEM_ID")) {
            uVar.C1(new BridgeDestination(new FeatureCommand(SupportFeatureConfig.f89363a)));
        }
        return Unit.f186387a;
    }
}
