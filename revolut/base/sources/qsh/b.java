package qsh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.widgets.impl.ui.flow.carousel.WidgetCarouselFlowContract$InputData;
import csh.k;
import java.util.Set;
import ql7.d2;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xki.c, wsh.a, ysh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetCarouselFlowContract$InputData f248840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final osh.a f248841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hsh.b f248842c;
    public final k d;
    public final b e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f248843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f248844h;

    public b(osh.a aVar, hsh.b bVar, k kVar, WidgetCarouselFlowContract$InputData widgetCarouselFlowContract$InputData) {
        this.f248840a = widgetCarouselFlowContract$InputData;
        this.f248841b = aVar;
        this.f248842c = bVar;
        this.d = kVar;
        int i = 4;
        this.f = e4m.b.b(new d2(this, 0, i));
        this.f248843g = e4m.b.b(new d2(this, 2, i));
        this.f248844h = e4m.b.b(new d2(this, 1, i));
    }

    @Override // ysh.a
    public final c b() {
        return new c(this.e, 0);
    }

    @Override // wsh.a
    public final e c() {
        return new e(this.e, 0);
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
