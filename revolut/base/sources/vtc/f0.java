package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthProtectionLimitChangeScreenContract$InputData f291972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f291973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f291974c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f291975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f291976h;

    public f0(t tVar, ViewController viewController, WealthProtectionLimitChangeScreenContract$InputData wealthProtectionLimitChangeScreenContract$InputData) {
        this.f291973b = tVar;
        this.f291972a = wealthProtectionLimitChangeScreenContract$InputData;
        this.f291974c = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.d = e4m.b.b(new vn2.l(tVar, this, 2, i));
        this.e = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.f = e4m.b.b(new vn2.l(tVar, this, 0, i));
        this.f291975g = e4m.b.b(new vn2.l(tVar, this, 4, i));
        this.f291976h = e4m.b.b(new vn2.l(tVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
