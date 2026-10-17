package ok1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlipayPlusExpandedCodeScreenContract$InputData f225869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f225870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225871c;
    public final e4m.e d;

    public e(d dVar, f fVar, ViewController viewController, AlipayPlusExpandedCodeScreenContract$InputData alipayPlusExpandedCodeScreenContract$InputData) {
        this.f225869a = alipayPlusExpandedCodeScreenContract$InputData;
        this.f225870b = viewController;
        int i = 16;
        this.f225871c = e4m.b.b(new oi9.a(dVar, this, 1, i));
        this.d = e4m.b.b(new oi9.a(dVar, this, 0, i));
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
