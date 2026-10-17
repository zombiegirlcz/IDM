package po9;

import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyDelegate;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f237909a;

    public a(e eVar) {
        this.f237909a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        ChatSmartTileSendMoneyDelegate.Model model = (ChatSmartTileSendMoneyDelegate.Model) obj2;
        String str = model.f53894a;
        e eVar = this.f237909a;
        if (Intrinsics.f(str, eVar.f237913a.c3().f310974a)) {
            Object obj3 = model.e;
            r parcel = obj3 instanceof r ? (r) obj3 : null;
            if (parcel == null) {
                return Unit.f186387a;
            }
            com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar = eVar.f237913a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PaymentWidget paymentWidget = parcel.f237930a;
            if (paymentWidget.f79073b != oo9.a.EXPIRED) {
                bVar.A2(new AirPaymentTransferDestination(paymentWidget, parcel.f237931b));
            }
        }
        return Unit.f186387a;
    }
}
