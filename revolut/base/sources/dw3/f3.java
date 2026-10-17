package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f3 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FamilyCreditCardSettingsScreenContract$InputData f118709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f118711c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118713h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118714j;

    public f3(c1 c1Var, e3 e3Var, ViewController viewController, FamilyCreditCardSettingsScreenContract$InputData familyCreditCardSettingsScreenContract$InputData) {
        this.f118709a = familyCreditCardSettingsScreenContract$InputData;
        this.f118710b = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, e3Var, this, 1, 17);
        this.f118711c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, e3Var, this, 0, 17));
        this.f = e4m.b.b(new e0(c1Var, e3Var, this, 2, 17));
        this.f118712g = e4m.b.b(new e0(c1Var, e3Var, this, 3, 17));
        this.f118713h = e4m.b.b(this.f118711c);
        this.i = e4m.b.b(new e0(c1Var, e3Var, this, 5, 17));
        this.f118714j = e4m.b.b(new e0(c1Var, e3Var, this, 4, 17));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118712g.get(), (yji.n) this.f118713h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
