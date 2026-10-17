package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class t1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StudentEmailValidationScreenContract$InputData f246241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246243c;
    public final e4m.e d;
    public final e4m.e e;

    public t1(i0 i0Var, y1 y1Var, ViewController viewController, StudentEmailValidationScreenContract$InputData studentEmailValidationScreenContract$InputData) {
        this.f246241a = studentEmailValidationScreenContract$InputData;
        this.f246242b = e4m.b.b(e4m.c.a(viewController));
        this.f246243c = e4m.b.b(new p1(i0Var, this, 1, 2));
        this.d = e4m.b.b(new p1(i0Var, this, 0, 2));
        this.e = e4m.b.b(new p1(i0Var, this, 2, 2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
