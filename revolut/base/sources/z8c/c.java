package z8c;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.ui.flow.summary.b f320069b;

    public /* synthetic */ c(com.revolut.feature.revolutpay.impl.ui.flow.summary.b bVar, int i) {
        this.f320068a = i;
        this.f320069b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f320068a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                com.revolut.feature.revolutpay.impl.ui.flow.summary.b bVar = this.f320069b;
                h.t2(bVar, bVar.f84495s, bVar.I2(), false, null, false, 12);
                return Boolean.TRUE;
            default:
                qa7.b outputData = (qa7.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof qa7.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.revolutpay.impl.ui.flow.summary.b bVar2 = this.f320069b;
                bVar2.l2(new yzb.c(bVar2, null, 6), new c(bVar2, 0));
                return Unit.f186387a;
        }
    }
}
