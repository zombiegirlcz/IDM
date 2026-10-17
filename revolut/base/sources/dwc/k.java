package dwc;

import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.repository.ReadOnlyDialog;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120363a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionsDayNightLimitsScreenContract$ModalStep f120364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a f120365c;

    public /* synthetic */ k(TransactionsDayNightLimitsScreenContract$ModalStep transactionsDayNightLimitsScreenContract$ModalStep, com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar) {
        this.f120364b = transactionsDayNightLimitsScreenContract$ModalStep;
        this.f120365c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        ReadOnlyDialog.Button button;
        switch (this.f120363a) {
            case 0:
                dii.g it8 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof dii.f) {
                    this.f120365c.C2(new f(((TransactionsDayNightLimitsScreenContract$ModalStep.ChangeRequest) this.f120364b).f85722a));
                }
                break;
            default:
                eii.k result = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof eii.g) {
                    OutboundTransactionLimit outboundTransactionLimit = ((TransactionsDayNightLimitsScreenContract$ModalStep.ReadOnlyLimitDialog) this.f120364b).f85725a;
                    ReadOnlyDialog readOnlyDialog = outboundTransactionLimit.f85487s;
                    if (readOnlyDialog == null || (button = readOnlyDialog.d) == null || (str = button.f85498b) == null) {
                        str = outboundTransactionLimit.u;
                    }
                    if (str != null) {
                        com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar = this.f120365c;
                        aVar.n2(new dlk.k(aVar, str, null, 25), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ k(com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar, TransactionsDayNightLimitsScreenContract$ModalStep transactionsDayNightLimitsScreenContract$ModalStep) {
        this.f120365c = aVar;
        this.f120364b = transactionsDayNightLimitsScreenContract$ModalStep;
    }
}
