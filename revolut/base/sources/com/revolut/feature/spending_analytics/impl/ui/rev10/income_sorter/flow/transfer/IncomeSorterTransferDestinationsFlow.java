package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.IncomeSorterTransferDestinationsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import jqd.c;
import jqd.d;
import jqd.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ppd.l0;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljqd/g;", "Lyki/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterTransferDestinationsFlow extends ViewController<g> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public IncomeSorterTransferDestinationsFlow(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: jqd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterTransferDestinationsFlow f177700b;

            {
                this.f177700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((l0) this.f177700b.M.getValue()).f238471b.get();
                    default:
                        IncomeSorterTransferDestinationsFlow incomeSorterTransferDestinationsFlow = this.f177700b;
                        return czi.c.d(0, 6, null, incomeSorterTransferDestinationsFlow, (c) incomeSorterTransferDestinationsFlow.K.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: jqd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterTransferDestinationsFlow f177700b;

            {
                this.f177700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((l0) this.f177700b.M.getValue()).f238471b.get();
                    default:
                        IncomeSorterTransferDestinationsFlow incomeSorterTransferDestinationsFlow = this.f177700b;
                        return czi.c.d(0, 6, null, incomeSorterTransferDestinationsFlow, (c) incomeSorterTransferDestinationsFlow.K.getValue());
                }
            }
        });
        this.M = w.y0(new jnf.a(this, inputData, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (l0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
