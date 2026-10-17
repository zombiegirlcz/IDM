package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeScreenContract$InputData f325415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f325416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f325417c;
    public final e4m.e d;
    public final zpc.m e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f325418g;

    public z(c0 c0Var, y yVar, ViewController viewController, IncodeScreenContract$InputData incodeScreenContract$InputData) {
        this.f325417c = c0Var;
        this.f325415a = incodeScreenContract$InputData;
        this.f325416b = viewController;
        int i = 15;
        this.d = e4m.b.b(new zpc.m(c0Var, this, 2, i));
        this.e = new zpc.m(c0Var, this, 3, i);
        this.f = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.f325418g = e4m.b.b(new zpc.m(c0Var, this, 0, i));
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
