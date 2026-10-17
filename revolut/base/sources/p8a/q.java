package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.PixAuthorisationPaymentInfoScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixAuthorisationPaymentInfoScreenContract$InputData f234057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234059c;

    public q(d0 d0Var, s sVar, PixAuthorisationPaymentInfoScreenContract$InputData pixAuthorisationPaymentInfoScreenContract$InputData) {
        this.f234057a = pixAuthorisationPaymentInfoScreenContract$InputData;
        this.f234058b = e4m.b.b(new m(d0Var, this, 1, 1));
        this.f234059c = e4m.b.b(new m(d0Var, this, 0, 1));
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
