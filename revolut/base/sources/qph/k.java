package qph;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScreenerEmbeddedFiltersController f248406w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f248406w = screenerEmbeddedFiltersController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f248406w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f248406w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(this.f248406w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            default:
                k kVar4 = new k(this.f248406w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController = this.f248406w;
        switch (i) {
            case 0:
                wqh.a aVar = (wqh.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarD3 = screenerEmbeddedFiltersController.R2();
                ScreenerStatsGroup group = aVar.f299457a;
                com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar3 = (com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a) lVarD3;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                oki.h.v2(aVar3.C, new ScreenerEmbeddedFiltersControllerContract$ModalStep.StatsGroup(group, ((m) ((j2) aVar3.A.f22677a).getValue()).f248409c), popup);
                break;
            case 1:
                o oVar = (o) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a) screenerEmbeddedFiltersController.R2()).I2(oVar.f248413a);
                break;
            case 2:
                p pVar = (p) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a) screenerEmbeddedFiltersController.R2()).I2(pVar.f248416c);
                break;
            default:
                p parcel = (p) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar7 = (com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a) screenerEmbeddedFiltersController.R2();
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                oki.h.v2(aVar7.C, new ScreenerEmbeddedFiltersControllerContract$ModalStep.SeeAllOptions(parcel.f248414a, parcel.f248415b), popup);
                break;
        }
        return Unit.f186387a;
    }
}
