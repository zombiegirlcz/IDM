package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtectionAndSafetyScreenContract$InputData f6652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f6653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6654c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f6655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f6656h;

    public k(n nVar, ViewController viewController, ProtectionAndSafetyScreenContract$InputData protectionAndSafetyScreenContract$InputData) {
        this.f6652a = protectionAndSafetyScreenContract$InputData;
        this.f6653b = e4m.b.b(e4m.c.a(viewController));
        int i = 8;
        this.f6654c = e4m.b.b(new ak5.f(nVar, this, 2, i));
        this.d = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.e = e4m.b.b(new ak5.f(nVar, this, 0, i));
        this.f = e4m.b.b(new ak5.f(nVar, this, 4, i));
        this.f6655g = e4m.b.b(new ak5.f(nVar, this, 5, i));
        this.f6656h = e4m.b.b(new ak5.f(nVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
