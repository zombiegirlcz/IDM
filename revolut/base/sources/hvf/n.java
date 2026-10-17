package hvf;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f155933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155934c;

    public n(q qVar, o oVar) {
        this.f155932a = qVar;
        this.f155933b = e4m.b.b(new hjg.b(qVar, this, 1, 9));
        this.f155934c = e4m.b.b(new hjg.b(qVar, this, 0, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155932a.f155949n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
