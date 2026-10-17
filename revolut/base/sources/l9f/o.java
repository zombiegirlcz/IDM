package l9f;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements xki.c, faf.a, daf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zaf.c f193205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f193206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f193207c = this;
    public final e4m.e d;
    public final e4m.e e;

    public o(k kVar, zaf.c cVar) {
        this.f193206b = kVar;
        this.f193205a = cVar;
        int i = 24;
        this.d = e4m.b.b(new kr9.m(kVar, this, 0, i));
        this.e = e4m.b.b(new kr9.m(kVar, this, 1, i));
    }

    @Override // faf.a
    public final v b() {
        return new v(this.f193206b, this.f193207c, 0);
    }

    @Override // daf.a
    public final t c() {
        return new t(this.f193206b, this.f193207c, 0);
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
