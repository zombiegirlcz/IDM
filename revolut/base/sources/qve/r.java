package qve;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements eze.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dze.d f249650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f249651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249652c;

    public r(k kVar, g gVar, dze.d dVar) {
        this.f249651b = kVar;
        this.f249650a = dVar;
        this.f249652c = e4m.b.b(new qbj.w(kVar, this, 25));
    }

    @Override // eze.a
    public final dze.g a() {
        return (dze.g) this.f249652c.get();
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
