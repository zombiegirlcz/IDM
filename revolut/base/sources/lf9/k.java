package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormReviewScreenContract$InputData f194725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194727c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public k(m mVar, j jVar, FormReviewScreenContract$InputData formReviewScreenContract$InputData) {
        this.f194726b = mVar;
        this.f194725a = formReviewScreenContract$InputData;
        int i = 22;
        this.f194727c = e4m.b.b(new l9f.z(mVar, this, 2, i));
        this.d = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.e = e4m.b.b(new l9f.z(mVar, this, 3, i));
        this.f = e4m.b.b(new l9f.z(mVar, this, 0, i));
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
