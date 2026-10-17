package s3c;

import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlowContract$Step;
import g4c.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.l;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259636a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f259637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolut_shop.ui.flow.order_history.a f259638c;

    public /* synthetic */ c(com.revolut.feature.revolut_shop.ui.flow.order_history.a aVar, l lVar) {
        this.f259638c = aVar;
        this.f259637b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f259636a) {
            case 0:
                k it8 = (k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                h.t2(this.f259638c, this.f259637b, new OrderHistoryFlowContract$Step.OrderConfirmation(it8.f140479a, true), true, null, false, 12);
                return Unit.f186387a;
            default:
                j4c.k it9 = (j4c.k) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!Intrinsics.f(it9, j4c.k.f171344a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l lVar = this.f259637b;
                if (lVar.c()) {
                    this.f259638c.B2();
                } else {
                    Intrinsics.checkNotNullParameter(lVar, "<this>");
                    lVar.n();
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c(l lVar, com.revolut.feature.revolut_shop.ui.flow.order_history.a aVar) {
        this.f259637b = lVar;
        this.f259638c = aVar;
    }
}
