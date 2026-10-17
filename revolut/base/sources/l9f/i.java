package l9f;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements xki.c, faf.a, daf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9f.c f193176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f193177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f193178c = this;
    public final e4m.e d;
    public final e4m.e e;

    public i(k kVar, z9f.c cVar) {
        this.f193177b = kVar;
        this.f193176a = cVar;
        int i = 23;
        this.d = e4m.b.b(new kr9.m(kVar, this, 0, i));
        this.e = e4m.b.b(new kr9.m(kVar, this, 1, i));
    }

    @Override // faf.a
    public final v b() {
        return new v(this.f193177b, this.f193178c, 1);
    }

    @Override // daf.a
    public final t c() {
        return new t(this.f193177b, this.f193178c, 1);
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
