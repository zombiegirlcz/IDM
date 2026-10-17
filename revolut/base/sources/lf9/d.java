package lf9;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh9.b f194704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f194705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194706c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public d(m mVar, b bVar, bh9.b bVar2) {
        this.f194704a = bVar2;
        int i = 16;
        this.f194705b = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.f194706c = e4m.b.b(new l9f.z(mVar, this, 0, i));
        this.d = e4m.b.b(new l9f.z(mVar, this, 3, i));
        this.e = e4m.b.b(new l9f.z(mVar, this, 2, i));
        this.f = e4m.b.b(new l9f.z(mVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f194706c.get(), (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
