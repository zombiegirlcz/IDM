package i25;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.impl.ui.account.collateral.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.credit.impl.ui.account.collateral.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((g6e.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g6e.c cVar = (g6e.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = cVar.f140918a;
        if (obj3 instanceof LargeActionButtonDelegate.Model) {
            LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj3;
            com.revolut.feature.credit.impl.ui.account.collateral.a aVar2 = this.v;
            aVar2.getClass();
            if (Intrinsics.f(model.f52613a, "SECURITY_DEPOSIT_GO_TO_CREDIT")) {
                Object obj4 = model.i;
                String str = obj4 instanceof String ? (String) obj4 : null;
                if (str == null) {
                    str = "";
                }
                aVar2.A2(new BridgeDestination(new FeatureCommand(new CreditCardHomeFeatureConfig(str))));
            }
        }
        return Unit.f186387a;
    }
}
