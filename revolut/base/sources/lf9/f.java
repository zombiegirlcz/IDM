package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormDetailsScreenContract$InputData f194710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194712c;
    public final e4m.e d;

    public f(m mVar, FormDetailsScreenContract$InputData formDetailsScreenContract$InputData) {
        this.f194711b = mVar;
        this.f194710a = formDetailsScreenContract$InputData;
        int i = 18;
        this.f194712c = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.d = e4m.b.b(new l9f.z(mVar, this, 0, i));
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
