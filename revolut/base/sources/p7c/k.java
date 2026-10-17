package p7c;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f233633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233634c;

    public k(r rVar, j jVar) {
        this.f233632a = rVar;
        this.f233633b = jVar;
        this.f233634c = e4m.b.b(new d2h.b(rVar, 18, jVar, this));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233633b.f233628h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
