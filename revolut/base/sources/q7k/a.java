package q7k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsContract$InputData;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkDetailsContract$InputData f242868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f242869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f242870c;
    public final e4m.e d;
    public final e4m.e e;

    public a(c cVar, PaymentLinkDetailsContract$InputData paymentLinkDetailsContract$InputData) {
        this.f242869b = cVar;
        this.f242868a = paymentLinkDetailsContract$InputData;
        int i = 7;
        this.f242870c = e4m.b.b(new k0(cVar, this, 1, i));
        this.d = e4m.b.b(new k0(cVar, this, 0, i));
        this.e = e4m.b.b(new k0(cVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
