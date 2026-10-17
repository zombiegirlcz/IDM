package e8k;

import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureInputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.flow.PaymentLinksFlowContract$Step;
import cp5.d;
import e54.r;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements a {
    public final PaymentLinksFeatureInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f123744p;

    public b(PaymentLinksFeatureInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        r rVar = new r(this, 15);
        this.f123744p = d.a(this, PaymentLinksFlowContract$Step.f102216a, f0.f322471a, rVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f123744p;
    }
}
