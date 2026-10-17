package m3c;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f202340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f202341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f202342c;

    public h(j jVar, g gVar) {
        this.f202340a = jVar;
        int i = 19;
        this.f202341b = e4m.b.b(new lzk.b(jVar, this, 0, i));
        this.f202342c = e4m.b.b(new lzk.b(jVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f202341b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
