package t6a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayNowQrScreenContract$InputData f268280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f268281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268282c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f268283g;

    public d(b bVar, ViewController viewController, PayNowQrScreenContract$InputData payNowQrScreenContract$InputData) {
        this.f268281b = bVar;
        this.f268280a = payNowQrScreenContract$InputData;
        this.f268282c = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.d = e4m.b.b(new l(bVar, this, 1, i));
        this.e = e4m.b.b(new l(bVar, this, 2, i));
        this.f = e4m.b.b(new l(bVar, this, 3, i));
        this.f268283g = e4m.b.b(new l(bVar, this, 0, i));
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
