package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f214460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedAlertsScreenContract$InputData f214461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f214462c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f214463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f214464h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f214465j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f214466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f214467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f214468n;
    public final e4m.e o;

    public i(e eVar, g gVar, BaseScreen baseScreen, ScreenContentRecyclerView screenContentRecyclerView, SharedAlertsScreenContract$InputData sharedAlertsScreenContract$InputData) {
        this.f214460a = screenContentRecyclerView;
        this.f214461b = sharedAlertsScreenContract$InputData;
        this.f214462c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 0;
        this.d = e4m.b.b(new h(eVar, gVar, this, 2, i));
        this.e = e4m.b.b(new h(eVar, gVar, this, 1, i));
        this.f = e4m.b.b(new h(eVar, gVar, this, 0, i));
        this.f214463g = e4m.b.b(new h(eVar, gVar, this, 5, i));
        this.f214464h = e4m.b.b(new h(eVar, gVar, this, 4, i));
        this.i = e4m.b.b(new h(eVar, gVar, this, 3, i));
        this.f214465j = e4m.b.b(new h(eVar, gVar, this, 7, i));
        this.k = e4m.b.b(new h(eVar, gVar, this, 6, i));
        this.f214466l = e4m.b.b(new h(eVar, gVar, this, 9, i));
        this.f214467m = e4m.b.b(new h(eVar, gVar, this, 10, i));
        this.f214468n = e4m.b.b(new h(eVar, gVar, this, 11, i));
        this.o = e4m.b.b(new h(eVar, gVar, this, 8, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get(), (yji.d) this.k.get());
    }
}
