package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoExternalEnrollmentCardScreenContract$InputData f159140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f159141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159142c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f159144h;

    public n(m mVar, ViewController viewController, MultibancoExternalEnrollmentCardScreenContract$InputData multibancoExternalEnrollmentCardScreenContract$InputData) {
        this.f159141b = mVar;
        this.f159140a = multibancoExternalEnrollmentCardScreenContract$InputData;
        this.f159142c = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.d = e4m.b.b(new j(this, 2, i));
        this.e = e4m.b.b(new j(this, 3, i));
        this.f = e4m.b.b(new j(this, 4, i));
        this.f159143g = e4m.b.b(new j(this, 1, i));
        this.f159144h = e4m.b.b(new j(this, 0, i));
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
