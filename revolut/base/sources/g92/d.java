package g92;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnrollmentRegistrationScreenContract$InputData f141438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f141439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141440c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f141442h;

    public d(e eVar, f fVar, ViewController viewController, EnrollmentRegistrationScreenContract$InputData enrollmentRegistrationScreenContract$InputData) {
        this.f141438a = enrollmentRegistrationScreenContract$InputData;
        this.f141439b = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.f141440c = e4m.b.b(new fta.e(eVar, this, 1, i));
        this.d = e4m.b.b(new fta.e(eVar, this, 0, i));
        this.e = e4m.b.b(new fta.e(eVar, this, 3, i));
        this.f = e4m.b.b(new fta.e(eVar, this, 2, i));
        this.f141441g = e4m.b.b(new fta.e(eVar, this, 5, i));
        this.f141442h = e4m.b.b(new fta.e(eVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.f.get());
    }
}
