package vsi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsContract$InputData;
import java.util.Set;
import vn2.l;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdjustAnalyticsContract$InputData f291812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f291813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f291814c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f291815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f291816h;

    public d(c cVar, ViewController viewController, AdjustAnalyticsContract$InputData adjustAnalyticsContract$InputData) {
        this.f291813b = cVar;
        this.f291812a = adjustAnalyticsContract$InputData;
        this.f291814c = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.d = e4m.b.b(new l(cVar, this, 2, i));
        this.e = e4m.b.b(new l(cVar, this, 1, i));
        this.f = e4m.b.b(new l(cVar, this, 0, i));
        this.f291815g = e4m.b.b(new l(cVar, this, 4, i));
        this.f291816h = e4m.b.b(new l(cVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
