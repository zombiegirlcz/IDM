package hc2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements xki.c, kx1.a, xc2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QvikNavigation$InputData f150816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f150817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f150818c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f150819g;

    public o(m mVar, QvikNavigation$InputData qvikNavigation$InputData) {
        this.f150817b = mVar;
        this.f150816a = qvikNavigation$InputData;
        int i = 18;
        this.d = e4m.b.b(new h08.e(mVar, this, 0, i));
        this.e = e4m.b.b(new h08.e(mVar, this, 1, i));
        this.f = e4m.b.b(new h08.e(mVar, this, 2, i));
        this.f150819g = e4m.b.b(new h08.e(mVar, this, 3, i));
    }

    @Override // xc2.b
    public final xc2.a b() {
        return new u(this.f150817b, this.f150818c, 1);
    }

    @Override // kx1.a
    public final j c() {
        return new j(this.f150817b, this.f150818c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
