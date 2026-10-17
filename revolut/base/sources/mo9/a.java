package mo9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentWidget f207568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResolvedRecipient f207569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f207570c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f207571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f207572h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f207573j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f207574l;

    public a(b bVar, ViewController viewController, PaymentWidget paymentWidget, ResolvedRecipient resolvedRecipient) {
        this.f207568a = paymentWidget;
        this.f207569b = resolvedRecipient;
        this.f207570c = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.d = e4m.b.b(new mjl.b(bVar, this, 1, i));
        this.e = e4m.b.b(new mjl.b(bVar, this, 0, i));
        this.f = e4m.b.b(new mjl.b(bVar, this, 3, i));
        this.f207571g = e4m.b.b(new mjl.b(bVar, this, 2, i));
        this.f207572h = e4m.b.b(new mjl.b(bVar, this, 5, i));
        this.i = e4m.b.b(new mjl.b(bVar, this, 4, i));
        this.f207573j = e4m.b.b(new mjl.b(bVar, this, 7, i));
        this.k = e4m.b.b(new mjl.b(bVar, this, 6, i));
        this.f207574l = e4m.b.b(new mjl.b(bVar, this, 8, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f207571g.get(), (n) this.i.get(), (n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
