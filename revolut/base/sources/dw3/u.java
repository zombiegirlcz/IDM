package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c54.f f119872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f119873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119874c;
    public final e4m.e d;

    public u(c1 c1Var, v vVar, ViewController viewController, c54.f fVar) {
        this.f119872a = fVar;
        this.f119873b = viewController;
        int i = 4;
        this.f119874c = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.d = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
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
