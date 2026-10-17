package wfb;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f297060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f297061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f297062c;
    public final e4m.e d;

    public l(i iVar, j jVar, mkd.g gVar) {
        this.f297061b = iVar;
        this.f297060a = gVar;
        int i = 24;
        this.f297062c = e4m.b.b(new vzc.j(iVar, this, 0, i));
        this.d = e4m.b.b(new vzc.j(iVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f297062c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
