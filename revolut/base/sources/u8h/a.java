package u8h;

import aah.h;
import aah.i;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import u45.w0;
import z0h.s1;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f278198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dah.g f278199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f278200c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(b bVar, dah.g gVar, s1 s1Var) {
        this.f278200c = bVar;
        this.f278198a = s1Var;
        this.f278199b = gVar;
        int i = 8;
        this.d = e4m.b.b(new w0(bVar, this, 0, i));
        this.e = e4m.b.b(new w0(bVar, this, 2, i));
        this.f = e4m.b.b(new w0(bVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        h hVar = (h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of(a0k.b.l((i) this.f278200c.f278210p.get(), this.f278198a, (h) this.d.get()));
    }
}
