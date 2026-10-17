package qwf;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f249929b;

    public /* synthetic */ s(z zVar, int i) {
        this.f249928a = i;
        this.f249929b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f249928a;
        z zVar = this.f249929b;
        switch (i) {
            case 0:
                w6c.e result = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof w6c.c) {
                    PaymentMethod paymentMethod = ((w6c.c) result).f295413a;
                    PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                    if (pocket == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TransitCheckoutScreenModel", "Error while payment method selection. Selected type is: " + paymentMethod, null, h0Var);
                    }
                    zVar.x2(new qna.p(pocket != null ? zi0.c.P(new ivf.f(pocket), false, null, 3) : new Data(null, null, false, 7, null), 18));
                }
                break;
            case 1:
                uwf.i outputData = (uwf.i) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                zVar.x2(new qtb.c(outputData, 12));
                break;
            default:
                zVar.x2(new nxc.a(((Long) obj2).longValue(), 6));
                break;
        }
        return Unit.f186387a;
    }
}
