package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KontomatikSignInControllerContract$InputData f119901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r3 f119902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119903c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public u3(c1 c1Var, r3 r3Var, ViewController viewController, KontomatikSignInControllerContract$InputData kontomatikSignInControllerContract$InputData) {
        this.f119902b = r3Var;
        this.f119901a = kontomatikSignInControllerContract$InputData;
        this.f119903c = e4m.b.b(e4m.c.a(viewController));
        int i = 8;
        this.d = e4m.b.b(new g3(c1Var, this, 2, i));
        this.e = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f = e4m.b.b(new g3(c1Var, this, 0, i));
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
