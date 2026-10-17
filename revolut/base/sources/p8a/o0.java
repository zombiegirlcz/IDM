package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 implements xki.c, uaa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixQrRequestContract$InputData f234043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f234045c = this;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 14));

    public o0(d0 d0Var, PixQrRequestContract$InputData pixQrRequestContract$InputData) {
        this.f234044b = d0Var;
        this.f234043a = pixQrRequestContract$InputData;
    }

    @Override // uaa.b
    public final f1 b() {
        return new f1(this.f234044b, this.f234045c, 0);
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
