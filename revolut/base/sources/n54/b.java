package n54;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$Step;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a;
import ek4.c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sk4.b;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a f212544b;

    public /* synthetic */ b(com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar, int i) {
        this.f212543a = i;
        this.f212544b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f212543a;
        com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar = this.f212544b;
        boolean z = true;
        switch (i) {
            case 0:
                com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a outputData = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof a.C0475a) {
                    aVar.l2(new e(aVar, null, 0), new b(aVar, 3));
                    return Unit.f186387a;
                }
                if ((outputData instanceof a.c) || (outputData instanceof a.b)) {
                    throw new IllegalStateException("Unsupported operation: Picker step is not implemented in this flow");
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                ek4.c output = (ek4.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z3 = output instanceof ek4.b;
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar2 = this.f212544b;
                if (z3) {
                    aVar2.H2(aVar2.v, new l54.c(output, 1));
                    h.t2(aVar2, aVar2.f67150x, AutopayFlowContract$Step.ConfirmAutopay.f67142a, true, null, false, 12);
                } else {
                    if (!(output instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.f67150x.e(false);
                }
                return Unit.f186387a;
            case 2:
                sk4.b outputData2 = (sk4.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                boolean zF = Intrinsics.f(outputData2, b.d.f263770a);
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a aVar3 = this.f212544b;
                if (zF) {
                    h.t2(aVar3, aVar3.f67150x, AutopayFlowContract$Step.ConfirmAutopay.f67142a, true, null, false, 12);
                } else if (Intrinsics.f(outputData2, b.C1467b.f263768a)) {
                    h.t2(aVar3, aVar3.f67150x, AutopayFlowContract$Step.AddExternalAccount.f67141a, true, null, false, 12);
                } else if (Intrinsics.f(outputData2, b.c.f263769a)) {
                    aVar3.l2(new e(aVar3, null, 1), new yi5.b(26));
                } else {
                    if (!Intrinsics.f(outputData2, b.a.f263767a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t.J2(aVar3, false, null, null, 7);
                }
                return Unit.f186387a;
            default:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar.f67148t.a(error)) {
                    z = false;
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                    aVar.f67145q.getClass();
                    aVar.X1(wj4.a.a());
                }
                return Boolean.valueOf(z);
        }
    }
}
