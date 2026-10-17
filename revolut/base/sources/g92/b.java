package g92;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnrollmentLabelScreenContract$InputData f141431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f141432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141433c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f141435h;

    public b(e eVar, f fVar, ViewController viewController, EnrollmentLabelScreenContract$InputData enrollmentLabelScreenContract$InputData) {
        this.f141431a = enrollmentLabelScreenContract$InputData;
        this.f141432b = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.f141433c = e4m.b.b(new fta.e(eVar, this, 1, i));
        this.d = e4m.b.b(new fta.e(eVar, this, 0, i));
        this.e = e4m.b.b(new fta.e(eVar, this, 3, i));
        this.f = e4m.b.b(new fta.e(eVar, this, 2, i));
        this.f141434g = e4m.b.b(new fta.e(eVar, this, 5, i));
        this.f141435h = e4m.b.b(new fta.e(eVar, this, 4, i));
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
