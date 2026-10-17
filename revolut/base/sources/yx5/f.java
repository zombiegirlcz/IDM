package yx5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.CryptoDiscoverAllScreen;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoDiscoverAllScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoDiscoverAllScreen cryptoDiscoverAllScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoDiscoverAllScreen;
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
        yhm.o.b(obj2);
        b bVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) bVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        zv5.a aVar2 = obj3 instanceof zv5.a ? (zv5.a) obj3 : null;
        if (aVar2 != null) {
            xi0.a aVar3 = xi0.b.Companion;
            String str = aVar2.f325574a;
            aVar3.getClass();
            bVar.C1(u0.c(new CryptoCommodityDetailsFeatureConfig(xi0.a.a(str), null, null, null, 62)));
        }
        return Unit.f186387a;
    }
}
