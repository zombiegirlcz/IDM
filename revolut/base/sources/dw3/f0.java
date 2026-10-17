package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckEmailInboxScreenContract$InputData f118695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f118697c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118699h;

    public f0(c1 c1Var, u2 u2Var, ViewController viewController, CheckEmailInboxScreenContract$InputData checkEmailInboxScreenContract$InputData) {
        this.f118695a = checkEmailInboxScreenContract$InputData;
        this.f118696b = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        e0 e0Var = new e0(c1Var, u2Var, this, 1, i);
        this.f118697c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, u2Var, this, 0, i));
        this.f = e4m.b.b(this.f118697c);
        this.f118698g = e4m.b.b(new e0(c1Var, u2Var, this, 3, i));
        this.f118699h = e4m.b.b(new e0(c1Var, u2Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
