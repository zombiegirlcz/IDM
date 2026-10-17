package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.FormPaymentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormPaymentFlowContract$InputData f194722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f194724c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(m mVar, FormPaymentFlowContract$InputData formPaymentFlowContract$InputData) {
        this.f194723b = mVar;
        this.f194722a = formPaymentFlowContract$InputData;
        int i = 21;
        this.d = e4m.b.b(new l9f.z(mVar, this, 0, i));
        this.e = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.f = e4m.b.b(new l9f.z(mVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get());
    }
}
