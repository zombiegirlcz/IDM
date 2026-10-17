package j6f;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f171748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171748w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f171748w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f171748w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            default:
                k kVar3 = new k(this.f171748w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((m6f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((m6f.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.f171748w;
        switch (i) {
            case 0:
                m6f.c parcel = (m6f.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) mVar.f171749g;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof m6f.a) {
                    tVar.X2(tVar.f171764t, new r((m6f.a) parcel, 0));
                } else {
                    if (!(parcel instanceof m6f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVar.A2(new AssetDetailsDestination(((m6f.b) parcel).f203054a, null, false, "ManagedPortfolioAllocationSection", null, null, 50));
                }
                return Unit.f186387a;
            case 1:
                g6 g6Var = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVar = mVar.f171749g;
                String selectedId = g6Var.f54199a;
                t tVar2 = (t) bVar;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                tVar2.X2(tVar2.f171764t, new ik3.a(selectedId, 24));
                return Unit.f186387a;
            default:
                m6f.s parcel2 = (m6f.s) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar3 = (t) mVar.f171749g;
                tVar3.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                if (parcel2.f203082a != xdh.b.NO_REBALANCE) {
                    tVar3.N2(new RebalanceDialogScreen(new RebalanceDialogScreenContract$InputData(parcel2.f203082a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new iyi.i(tVar3, 24));
                }
                return Unit.f186387a;
        }
    }
}
