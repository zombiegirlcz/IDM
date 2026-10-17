package egh;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreenContract$Action;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FundInvestmentDetailsScreen f125648w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FundInvestmentDetailsScreen fundInvestmentDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f125648w = fundInvestmentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f125648w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f125648w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((FundInvestmentDetailsScreenContract$Action) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hdh.e eVar;
        int i = this.u;
        FundInvestmentDetailsScreen fundInvestmentDetailsScreen = this.f125648w;
        switch (i) {
            case 0:
                j actionParcel = (j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b bVar = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b) ((k) fundInvestmentDetailsScreen.N.getValue());
                bVar.getClass();
                Intrinsics.checkNotNullParameter(actionParcel, "actionParcel");
                Data data = ((g) ((j2) bVar.f95823x.f22677a).getValue()).d;
                if (data != null && (eVar = (hdh.e) data.getContent()) != null) {
                    h hVar = h.f125652a;
                    if (!Intrinsics.f(actionParcel, hVar) && !Intrinsics.f(actionParcel, i.f125653a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.f95821t.b3(Intrinsics.f(actionParcel, hVar) ? bfl.g.BUY : bfl.g.SELL, eVar, false);
                }
                return Unit.f186387a;
            default:
                FundInvestmentDetailsScreenContract$Action actionParcel2 = (FundInvestmentDetailsScreenContract$Action) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.kompot.navigable.vc.modal.a aVar3 = ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b) ((k) fundInvestmentDetailsScreen.N.getValue())).f95824y;
                Intrinsics.checkNotNullParameter(actionParcel2, "actionParcel");
                boolean z = actionParcel2 instanceof FundInvestmentDetailsScreenContract$Action.ShowLockupPeriodInfo;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    FundInvestmentDetailsScreenContract$Action.ShowLockupPeriodInfo showLockupPeriodInfo = (FundInvestmentDetailsScreenContract$Action.ShowLockupPeriodInfo) actionParcel2;
                    oki.h.v2(aVar3, new FundInvestmentDetailsScreenContract$ModalStep.ShowLockupPeriodInfo(showLockupPeriodInfo.f95807a, showLockupPeriodInfo.f95808b), bottom_dialog);
                } else {
                    if (!Intrinsics.f(actionParcel2, FundInvestmentDetailsScreenContract$Action.ShowAveragePriceInfo.f95806a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(aVar3, FundInvestmentDetailsScreenContract$ModalStep.ShowAveragePriceInfo.f95810a, bottom_dialog);
                }
                return Unit.f186387a;
        }
    }
}
