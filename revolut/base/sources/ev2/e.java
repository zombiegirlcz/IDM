package ev2;

import com.google.common.collect.ImmutableSet;
import ea2.p;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ov2.d f129693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f129694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f129695c;

    public e(c cVar, d dVar, ov2.d dVar2) {
        this.f129693a = dVar2;
        int i = 14;
        this.f129694b = e4m.b.b(new p(cVar, this, 1, i));
        this.f129695c = e4m.b.b(new p(cVar, this, 0, i));
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
