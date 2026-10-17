package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f304948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cm6.e f304949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304950c;
    public final e4m.e d;
    public final e4m.e e;

    public m1(n1 n1Var, ViewController viewController, cm6.e eVar) {
        this.f304948a = viewController;
        this.f304949b = eVar;
        this.f304950c = e4m.b.b(new xb1.m(n1Var, this, 2, 28));
        this.d = e4m.b.b(new xb1.m(n1Var, this, 1, 28));
        this.e = e4m.b.b(new xb1.m(n1Var, this, 0, 28));
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
