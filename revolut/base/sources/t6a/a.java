package t6a;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7a.e f268271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f268272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268273c;
    public final e4m.e d;
    public final e4m.e e;

    public a(b bVar, b7a.e eVar) {
        this.f268272b = bVar;
        this.f268271a = eVar;
        int i = 11;
        this.f268273c = e4m.b.b(new l(bVar, this, 1, i));
        this.d = e4m.b.b(new l(bVar, this, 2, i));
        this.e = e4m.b.b(new l(bVar, this, 0, i));
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
