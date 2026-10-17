package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0h.b f191287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0h.a f191288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f191289c;
    public final WealthNewsArticleReaderScreenContract$InputData d;
    public final c e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f191290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f191291h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f191292j;
    public final e4m.e k;

    public g(c cVar, h hVar, o0h.b bVar, n0h.a aVar, WealthNewsArticleReaderScreenContract$InputData wealthNewsArticleReaderScreenContract$InputData, ScreenContentRecyclerView screenContentRecyclerView) {
        this.e = cVar;
        this.f = hVar;
        this.f191287a = bVar;
        this.f191288b = aVar;
        this.f191289c = screenContentRecyclerView;
        this.d = wealthNewsArticleReaderScreenContract$InputData;
        this.f191290g = e4m.b.b(new il8.d(cVar, hVar, this, 0, 24));
        int i = 24;
        this.f191291h = e4m.b.b(new il8.d(cVar, hVar, this, 2, i));
        this.i = e4m.b.b(new il8.d(cVar, hVar, this, 1, i));
        this.f191292j = e4m.b.b(new il8.d(cVar, hVar, this, 4, i));
        this.k = e4m.b.b(new il8.d(cVar, hVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f191290g.get(), (yji.d) this.i.get());
    }
}
