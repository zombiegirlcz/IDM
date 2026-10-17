package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthProtectionScreenContract$InputData f291979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f291980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f291981c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f291982g;

    public g0(t tVar, u uVar, ViewController viewController, WealthProtectionScreenContract$InputData wealthProtectionScreenContract$InputData) {
        this.f291980b = tVar;
        this.f291979a = wealthProtectionScreenContract$InputData;
        this.f291981c = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.d = e4m.b.b(new vn2.l(tVar, this, 2, i));
        this.e = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.f = e4m.b.b(new vn2.l(tVar, this, 0, i));
        this.f291982g = e4m.b.b(new vn2.l(tVar, this, 3, i));
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
