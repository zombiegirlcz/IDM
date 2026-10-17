package mn8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo8.c f207426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f207427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f207428c;

    public f(o oVar, g gVar, bo8.c cVar) {
        this.f207427b = oVar;
        this.f207426a = cVar;
        this.f207428c = e4m.b.b(new d2h.b(oVar, 10, gVar, this));
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
