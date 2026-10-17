package sf1;

import com.google.common.collect.ImmutableSet;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f262297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf1.n f262298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f262299c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f262300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f262301h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f262302j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f262303l;

    public p(n nVar, yf1.n nVar2, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f262299c = nVar;
        this.f262297a = screenContentRecyclerView;
        this.f262298b = nVar2;
        int i = 12;
        this.d = e4m.b.b(new ryc.d(nVar, this, 1, i));
        this.e = e4m.b.b(new ryc.d(nVar, this, 0, i));
        this.f = e4m.b.b(new ryc.d(nVar, this, 4, i));
        this.f262300g = e4m.b.b(new ryc.d(nVar, this, 3, i));
        this.f262301h = e4m.b.b(new ryc.d(nVar, this, 2, i));
        this.i = e4m.b.b(new ryc.d(nVar, this, 5, i));
        this.f262302j = e4m.b.b(new ryc.d(nVar, this, 7, i));
        this.k = e4m.g.a(new ryc.d(nVar, this, 8, i));
        this.f262303l = e4m.b.b(new ryc.d(nVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f262301h.get());
    }
}
