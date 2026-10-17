package paf;

import d67.q;
import d67.s;
import d67.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d f234554b;

    public /* synthetic */ d(com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d dVar, int i) {
        this.f234553a = i;
        this.f234554b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f234553a) {
            case 0:
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, q.f111462a) || Intrinsics.f(output, s.f111464a)) {
                    this.f234554b.f91624s.e(false);
                }
                return Unit.f186387a;
            default:
                raf.g output2 = (raf.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof raf.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d dVar = this.f234554b;
                dVar.l2(new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.a(dVar, output2, null), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
