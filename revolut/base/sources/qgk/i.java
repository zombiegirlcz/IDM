package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgk.c f246005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f246007c;
    public final i d = this;
    public final e4m.e e;

    public i(i0 i0Var, j jVar, wgk.c cVar) {
        this.f246006b = i0Var;
        this.f246007c = jVar;
        this.f246005a = cVar;
        this.e = e4m.b.b(new qbj.w(i0Var, this, 3));
    }

    @Override // xki.e
    public final Set f() {
        return this.f246007c.f();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
