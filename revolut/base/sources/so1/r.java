package so1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a f264687b;

    public /* synthetic */ r(com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar, int i) {
        this.f264686a = i;
        this.f264687b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f264686a) {
            case 0:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dpf.b) {
                    com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar = this.f264687b;
                    aVar.H2(aVar.f61244x, new bg2.p(output, 11));
                }
                return Unit.f186387a;
            default:
                po1.g result = (po1.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof po1.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar2 = this.f264687b;
                aVar2.H2(aVar2.f61244x, new sl5.a(result, 6));
                return Unit.f186387a;
        }
    }
}
