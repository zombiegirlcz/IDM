package kd3;

import bbj.d;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od3.x0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CashbackPocketDetailsScreen f182780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CashbackPocketDetailsScreen cashbackPocketDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f182780w = cashbackPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f182780w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f182780w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f182780w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((bbj.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((x0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureConfig featureConfig;
        int i = this.u;
        CashbackPocketDetailsScreen cashbackPocketDetailsScreen = this.f182780w;
        switch (i) {
            case 0:
                bbj.d disclosuresLinkParcel = (bbj.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarT2 = cashbackPocketDetailsScreen.T2();
                Intrinsics.h(disclosuresLinkParcel);
                m mVar = (m) hVarT2;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(disclosuresLinkParcel, "disclosuresLinkParcel");
                if (Intrinsics.f(disclosuresLinkParcel, d.a.f14312a)) {
                    featureConfig = DisclosuresFeatureConfig.CommoditiesDisclosuresFeatureConfig.f95194a;
                } else {
                    if (!Intrinsics.f(disclosuresLinkParcel, d.b.f14313a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    featureConfig = DisclosuresFeatureConfig.CryptoDisclosuresFeatureConfig.f95195a;
                }
                mVar.C1(new BridgeDestination(new FeatureCommand(featureConfig)));
                return Unit.f186387a;
            case 1:
                String currentCashbackCurrency = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarT22 = cashbackPocketDetailsScreen.T2();
                Intrinsics.h(currentCashbackCurrency);
                m mVar2 = (m) hVarT22;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(currentCashbackCurrency, "currentCashbackCurrency");
                mVar2.n2(new kb7.c(mVar2, currentCashbackCurrency, null, 2), new whi.b(6));
                return Unit.f186387a;
            default:
                x0 parcel = (x0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarT23 = cashbackPocketDetailsScreen.T2();
                Intrinsics.h(parcel);
                m mVar3 = (m) hVarT23;
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                mVar3.v.x(mVar3.f182797t.a(parcel));
                return Unit.f186387a;
        }
    }
}
