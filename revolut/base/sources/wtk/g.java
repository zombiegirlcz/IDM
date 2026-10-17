package wtk;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.FundamentalsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.FundamentalsScreenContract$ModalStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FundamentalsScreen f300012w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(FundamentalsScreen fundamentalsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300012w = fundamentalsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f300012w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f300012w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((fuk.u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FundamentalsScreen fundamentalsScreen = this.f300012w;
        switch (i) {
            case 0:
                l parcel = (l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a) ((j) fundamentalsScreen.M.getValue());
                aVar2.getClass();
                com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.u;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean zF = Intrinsics.f(parcel, k.f300017a);
                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                if (zF) {
                    oki.h.v2(aVar3, FundamentalsScreenContract$ModalStep.ExpectedAnnualReturnInfo.f103859a, popup);
                } else {
                    if (!Intrinsics.f(parcel, n.f300019a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(aVar3, FundamentalsScreenContract$ModalStep.SharpeRatioInfo.f103860a, popup);
                }
                return Unit.f186387a;
            default:
                fuk.u uVar = (fuk.u) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar = (j) fundamentalsScreen.M.getValue();
                fuk.b chart = uVar.f138273a;
                com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a aVar5 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a) jVar;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(chart, "chart");
                oki.h.v2(aVar5.u, new FundamentalsScreenContract$ModalStep.ExpectedAnnualReturnChartInfo(chart), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
        }
    }
}
