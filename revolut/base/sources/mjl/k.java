package mjl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f206091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206093c;

    public k(m mVar, j jVar) {
        this.f206091a = mVar;
        this.f206092b = e4m.b.b(new ld1.q(mVar, jVar, this, 1, 20));
        this.f206093c = e4m.b.b(new ld1.q(mVar, jVar, this, 0, 20));
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
