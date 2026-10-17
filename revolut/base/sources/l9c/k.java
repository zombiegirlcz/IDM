package l9c;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RequestCvvScreenContract$InputData f193129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f193130q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RequestCvvScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f193129p = inputData;
        PaymentMethod.Card card = inputData.f84516a;
        String str = card.f84372c;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar = card.d;
        int i = card.e;
        int i2 = card.f;
        String str2 = card.f84370a;
        m70.a.c(t0.f186434a);
        this.f193130q = new d(str, cVar, i, i2, str2, "");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f193130q;
    }
}
