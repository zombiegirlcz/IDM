package vid;

import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$FlowState;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vgk.g;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.bid_flow.c f289572b;

    public /* synthetic */ c(com.revolut.feature.shops.impl.ui.bid_flow.c cVar, int i) {
        this.f289571a = i;
        this.f289572b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f289571a) {
            case 0:
                ((Boolean) obj2).getClass();
                com.revolut.feature.shops.impl.ui.bid_flow.c cVar = this.f289572b;
                qki.d dVar = cVar.f87143r;
                if (((ShopsBidFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f87130a) {
                    Double d = ((ShopsBidFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f87131b;
                    cVar.H2(dVar, new g(16));
                    h.w2(cVar.f87144s, new ShopsBidFlowContract$Step.PlaceBid(cVar.o.f87132a, d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            default:
                uid.c result = (uid.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof uid.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.shops.impl.ui.bid_flow.c cVar2 = this.f289572b;
                cVar2.H2(cVar2.f87143r, new g(18));
                h.w2(cVar2.f87144s, new ShopsBidFlowContract$Step.PlaceBid(cVar2.o.f87132a, Double.valueOf(((uid.b) result).f280381a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
        }
    }
}
