package nui;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AsftPassDetailsLegacyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = asftPassDetailsLegacyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) asftPassDetailsLegacyScreen.R2();
                if (bVar.o.f98856b) {
                    bVar.C2(a.C0601a.f98859a);
                } else {
                    bVar.B2();
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) asftPassDetailsLegacyScreen.R2();
                bVar2.getClass();
                bVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                break;
        }
        return Unit.f186387a;
    }
}
