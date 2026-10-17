package c43;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements xki.c, m43.a, k43.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkCardFlowInputData f21042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f21043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f21044c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(h hVar, ViewController viewController, LinkCardFlowInputData linkCardFlowInputData) {
        this.f21043b = hVar;
        this.f21042a = linkCardFlowInputData;
        this.d = e4m.b.b(new bt7.e(hVar, this, 0, 11));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new bt7.e(hVar, this, 1, 11));
    }

    @Override // m43.a
    public final p b() {
        return new p(this.f21043b, this.f21044c, 0);
    }

    @Override // k43.a
    public final n c() {
        return new n(this.f21043b, this.f21044c, 0);
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
