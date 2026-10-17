package z52;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisPayFlowContract$InputData f319460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f319461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319462c;
    public final e4m.e d;
    public final e4m.e e;

    public n(j jVar, IrisPayFlowContract$InputData irisPayFlowContract$InputData) {
        this.f319461b = jVar;
        this.f319460a = irisPayFlowContract$InputData;
        int i = 8;
        this.f319462c = e4m.b.b(new k0(jVar, this, 1, i));
        this.d = e4m.b.b(new k0(jVar, this, 0, i));
        this.e = e4m.b.b(new k0(jVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
