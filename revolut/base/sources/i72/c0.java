package i72;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4m.e f159065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f159066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159067c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159068g;

    public c0(m mVar, ari.b bVar) {
        int i = 28;
        this.f159065a = e4m.b.b(new hjg.b(mVar, this, 0, i));
        this.f159066b = e4m.b.b(new hjg.b(mVar, this, 2, i));
        this.f159067c = e4m.b.b(new hjg.b(mVar, this, 1, i));
        this.d = e4m.b.b(new hjg.b(mVar, this, 6, i));
        this.e = e4m.b.b(new hjg.b(mVar, this, 5, i));
        this.f = e4m.b.b(new hjg.b(mVar, this, 4, i));
        this.f159068g = e4m.b.b(new hjg.b(mVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f159065a.get(), (yji.n) this.f159067c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
