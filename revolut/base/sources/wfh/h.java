package wfh;

import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FundDetailsScreen f297119w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(FundDetailsScreen fundDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297119w = fundDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f297119w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f297119w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            default:
                h hVar3 = new h(this.f297119w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((FundDetailsScreenContract$Action) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FundDetailsScreen fundDetailsScreen = this.f297119w;
        switch (i) {
            case 0:
                FundDetailsScreenContract$Action fundDetailsScreenContract$Action = (FundDetailsScreenContract$Action) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d) fundDetailsScreen.e3()).I2(fundDetailsScreenContract$Action);
                break;
            case 1:
                Object obj3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (obj3 instanceof FundDetailsScreenContract$Action) {
                    ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d) fundDetailsScreen.e3()).I2((FundDetailsScreenContract$Action) obj3);
                }
                break;
            default:
                j section = (j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d) fundDetailsScreen.e3();
                dVar.getClass();
                Intrinsics.checkNotNullParameter(section, "section");
                dVar.H2(dVar.E, new wdb.b(section, 14));
                break;
        }
        return Unit.f186387a;
    }
}
