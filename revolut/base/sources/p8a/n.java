package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.pix_area.PixAreaFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements xki.c, uaa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixAreaFlowContract$InputData f234030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f234032c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n(d0 d0Var, PixAreaFlowContract$InputData pixAreaFlowContract$InputData) {
        this.f234031b = d0Var;
        this.f234030a = pixAreaFlowContract$InputData;
        this.d = e4m.b.b(new m(d0Var, this, 0, 0));
        this.e = e4m.b.b(new m(d0Var, this, 2, 0));
        this.f = e4m.b.b(new m(d0Var, this, 1, 0));
    }

    @Override // uaa.b
    public final f1 b() {
        return new f1(this.f234031b, this.f234032c, 1);
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
