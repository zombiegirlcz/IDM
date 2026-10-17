package nqf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser.kompot.bridge.navigation.ChooserScreenKompotBridgeFeatureConfig;
import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReasonForTransferGoodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ReasonForTransferGoodsScreen reasonForTransferGoodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reasonForTransferGoodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarH3 = this.v.T2();
        Intrinsics.h(model);
        p pVar = (p) mVarH3;
        l lVar = pVar.f218448p;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52580a;
        if (Intrinsics.f(str, "SELECTOR_ORIGIN_COUNTRY_ID")) {
            c cVar = (c) lVar;
            ArrayList arrayListD = cVar.f218437b.d(cVar.a(), ((h) pVar.t2()).d);
            ChooserConfiguration.ConfigurationType.INSTANCE.getClass();
            pVar.C1(new BridgeDestination(new FeatureCommand(new ChooserScreenKompotBridgeFeatureConfig(new ChooserConfiguration(arrayListD, ChooserConfiguration.ConfigurationType.Companion.f65902c, "ReasonForTransferGoodsScreenContract", false, a10.b.o(R.string.countries_title, null, null, 14, cVar.f218438c), null, false, 0, null, false, 16360), 10001))));
        } else if (Intrinsics.f(str, "SELECTOR_DESTINATION_COUNTRY_ID")) {
            c cVar2 = (c) lVar;
            ArrayList arrayListD2 = cVar2.f218437b.d(cVar2.a(), ((h) pVar.t2()).e);
            ChooserConfiguration.ConfigurationType.INSTANCE.getClass();
            pVar.C1(new BridgeDestination(new FeatureCommand(new ChooserScreenKompotBridgeFeatureConfig(new ChooserConfiguration(arrayListD2, ChooserConfiguration.ConfigurationType.Companion.f65902c, "ReasonForTransferGoodsScreenContract", false, a10.b.o(R.string.countries_title, null, null, 14, cVar2.f218438c), null, false, 0, null, false, 16360), 10002))));
        }
        return Unit.f186387a;
    }
}
