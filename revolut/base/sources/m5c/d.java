package m5c;

import com.google.common.collect.ImmutableSet;
import e4m.e;
import java.util.Set;
import ljl.n;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f202897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f202898b;

    public d(c cVar) {
        this.f202897a = cVar;
        this.f202898b = e4m.b.b(new n(cVar, 29));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f202897a.f202895r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
