package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.cmd.screen.CmdControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CmdControllerContract$InputData f325261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325263c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e(c0 c0Var, f fVar, CmdControllerContract$InputData cmdControllerContract$InputData) {
        this.f325262b = c0Var;
        this.f325261a = cmdControllerContract$InputData;
        this.f325263c = e4m.b.b(new zpc.m(c0Var, this, 0, 9));
        this.d = e4m.b.b(new zpc.m(c0Var, this, 2, 9));
        this.e = e4m.b.b(new zpc.m(c0Var, this, 1, 9));
        this.f = e4m.b.b(new zpc.m(c0Var, this, 3, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f325263c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
