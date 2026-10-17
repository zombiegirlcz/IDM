package ef5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenController;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.navigation.destination.StakeFeatureDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EarnAssetsScreenController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EarnAssetsScreenController earnAssetsScreenController, Continuation continuation) {
        super(2, continuation);
        this.v = earnAssetsScreenController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar2 = (com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a) aVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof we5.b) {
            aVar2.I2((we5.b) obj3);
        } else if (obj3 instanceof cf5.e) {
            StakingProduct stakingProduct = ((cf5.e) obj3).f23551a;
            if (stakingProduct.f88087b.k == vtd.b.AUTO) {
                aVar2.C1(aVar2.f70798s.a(null, stakingProduct.d));
            } else {
                aVar2.C1(new StakeFeatureDestination(null, stakingProduct, null));
            }
        }
        return Unit.f186387a;
    }
}
