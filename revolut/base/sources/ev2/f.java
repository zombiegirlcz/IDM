package ev2;

import com.google.common.collect.ImmutableSet;
import ea2.p;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv2.d f129696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f129697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f129698c;

    public f(c cVar, d dVar, mv2.d dVar2) {
        this.f129696a = dVar2;
        int i = 15;
        this.f129697b = e4m.b.b(new p(cVar, this, 1, i));
        this.f129698c = e4m.b.b(new p(cVar, this, 0, i));
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
