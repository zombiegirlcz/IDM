package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class u0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixTransferNavigation$InputData f234096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f234098c = this;
    public final m d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234100h;

    public u0(d0 d0Var, PixTransferNavigation$InputData pixTransferNavigation$InputData) {
        this.f234097b = d0Var;
        this.f234096a = pixTransferNavigation$InputData;
        int i = 16;
        m mVar = new m(d0Var, this, 1, i);
        this.d = mVar;
        this.e = e4m.b.b(mVar);
        this.f = e4m.b.b(new m(d0Var, this, 0, i));
        this.f234099g = e4m.b.b(new m(d0Var, this, 3, i));
        this.f234100h = e4m.b.b(new m(d0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
