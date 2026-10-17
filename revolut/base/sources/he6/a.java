package he6;

import com.revolut.feature.extension_auth.api.ExtensionAuthFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.api.app_consent.RevolutSsoAppConsentDestination;
import f88.f;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yd6.b;
import yd6.c;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar = (c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = cVar instanceof b;
        f fVar = this.v;
        if (z) {
            fVar.A2(new RevolutSsoAppConsentDestination(new RevolutSsoAppConsentDestination.InputData(((b) cVar).f312640a)));
        } else {
            if (!Intrinsics.f(cVar, yd6.a.f312639a)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.A2(new BridgeDestination(new FeatureCommand(ExtensionAuthFeatureConfig.f72163a)));
        }
        return Unit.f186387a;
    }
}
