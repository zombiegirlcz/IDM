package vb3;

import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreenContract$InputData;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uyd.y;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends jki.g implements m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f287393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CashTopUpDetailsScreenContract$InputData f287394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f287395r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t1 barcodeInteractor, CashTopUpDetailsScreenContract$InputData inputData, v mapper) {
        super(mapper);
        Intrinsics.checkNotNullParameter(barcodeInteractor, "barcodeInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f287393p = barcodeInteractor;
        this.f287394q = inputData;
        this.f287395r = new g(inputData.f65626a, null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        int i = q.f287392a[this.f287394q.f65627b.ordinal()];
        int i2 = 15;
        if (i == 1) {
            efm.r rVarJ = this.f287393p.j();
            r rVar = r.f;
            efm.r map = rVarJ.map(new y(7));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            yji.l.b1(this, rd0.e.b(map), null, new v44.e(this, null, i2), 3);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                x2(new v80.a(15));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                x2(new v80.a(16));
            }
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f287395r;
    }
}
