package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0h.b f191282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0h.a f191283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthDailyNewsScreenContract$InputData f191284c;
    public final c d;
    public final h e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f191285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f191286h;
    public final e4m.e i;

    public f(c cVar, h hVar, o0h.b bVar, n0h.a aVar, WealthDailyNewsScreenContract$InputData wealthDailyNewsScreenContract$InputData) {
        this.d = cVar;
        this.e = hVar;
        this.f191282a = bVar;
        this.f191283b = aVar;
        this.f191284c = wealthDailyNewsScreenContract$InputData;
        int i = 23;
        this.f = e4m.b.b(new il8.d(cVar, hVar, this, 0, i));
        this.f191285g = e4m.b.b(new il8.d(cVar, hVar, this, 2, i));
        this.f191286h = e4m.b.b(new il8.d(cVar, hVar, this, 3, i));
        this.i = e4m.b.b(new il8.d(cVar, hVar, this, 1, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
