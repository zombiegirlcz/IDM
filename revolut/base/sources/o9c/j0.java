package o9c;

import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.ui.summary_screen.f f223203b;

    public /* synthetic */ j0(com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar, int i) {
        this.f223202a = i;
        this.f223203b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f223202a) {
            case 0:
                ((tdc.r) this.f223203b.z).f269967q.k(tdc.o.f269962a);
                break;
            default:
                this.f223203b.C2(RevolutPaySummaryScreenContract$OutputData.BackPressed.f84555a);
                break;
        }
        return Unit.f186387a;
    }
}
