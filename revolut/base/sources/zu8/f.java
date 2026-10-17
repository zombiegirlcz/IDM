package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.cmd.flow.CmdFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CmdFlowContract$InputData f325269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f325271c = this;
    public final e4m.e d;

    public f(c0 c0Var, CmdFlowContract$InputData cmdFlowContract$InputData) {
        this.f325270b = c0Var;
        this.f325269a = cmdFlowContract$InputData;
        this.d = e4m.b.b(new yf3.d(c0Var, this, 29));
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
