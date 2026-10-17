package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormAmountScreenContract$InputData f194707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194709c;
    public final e4m.e d;
    public final e4m.e e;

    public e(m mVar, j jVar, FormAmountScreenContract$InputData formAmountScreenContract$InputData) {
        this.f194708b = mVar;
        this.f194707a = formAmountScreenContract$InputData;
        this.f194709c = e4m.b.b(new l9f.z(mVar, this, 2, 17));
        this.d = e4m.b.b(new l9f.z(mVar, this, 1, 17));
        this.e = e4m.b.b(new l9f.z(mVar, this, 0, 17));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
