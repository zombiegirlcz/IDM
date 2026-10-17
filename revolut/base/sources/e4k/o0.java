package e4k;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a f122624b;

    public /* synthetic */ o0(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, int i) {
        this.f122623a = i;
        this.f122624b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122623a) {
            case 0:
                x updateState = (x) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return x.a(updateState, null, null, null, ((x) this.f122624b.t2()).f + 1, null, null, null, false, 991);
            case 1:
                x updateState2 = (x) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return x.a(updateState2, null, null, null, ((x) this.f122624b.t2()).f + 1, null, null, null, false, 991);
            case 2:
                y2k.f output = (y2k.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof y2k.g) {
                    this.f122624b.H2(new n0(output, 0));
                }
                return Unit.f186387a;
            default:
                g1j.b output2 = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar = this.f122624b;
                aVar.x2(new o0(aVar, 0));
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                j1j.d dVar = output2.f139686a;
                String str = dVar.f170618b.f306286a;
                int i = 22;
                aVar.l2(new a31.w(i, aVar, dVar.f170619c, dVar.d, dVar.f170617a, str, (Continuation) null), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
