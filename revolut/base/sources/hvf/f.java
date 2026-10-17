package hvf;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f155900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155901c;

    public f(q qVar, r rVar) {
        this.f155899a = qVar;
        int i = 3;
        this.f155900b = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.f155901c = e4m.b.b(new hjg.b(qVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155899a.f155949n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
