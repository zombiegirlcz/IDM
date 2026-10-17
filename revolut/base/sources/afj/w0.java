package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimShareQrCodeScreenContract$InputData f4503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4505c;
    public final e4m.e d = e4m.b.b(new a1e.a(this, 1, 10));
    public final e4m.e e = e4m.b.b(new a1e.a(this, 3, 10));
    public final e4m.e f = e4m.b.b(new a1e.a(this, 2, 10));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4506g = e4m.b.b(new a1e.a(this, 0, 10));

    public w0(b bVar, ViewController viewController, EsimShareQrCodeScreenContract$InputData esimShareQrCodeScreenContract$InputData) {
        this.f4504b = bVar;
        this.f4503a = esimShareQrCodeScreenContract$InputData;
        this.f4505c = e4m.b.b(e4m.c.a(viewController));
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
