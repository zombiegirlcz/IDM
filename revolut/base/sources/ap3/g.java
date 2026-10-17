package ap3;

import afj.r2;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CorporateEventsTypeFilterScreenContract$InputData f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f8083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f8084c;
    public final e4m.e d;
    public final e4m.e e;
    public final r2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f8085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f8086h;
    public final e4m.e i;

    public g(h hVar, e eVar, BaseScreen baseScreen, CorporateEventsTypeFilterScreenContract$InputData corporateEventsTypeFilterScreenContract$InputData) {
        this.f8082a = corporateEventsTypeFilterScreenContract$InputData;
        this.f8083b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 28;
        this.f8084c = e4m.b.b(new r2(this, 2, i));
        this.d = e4m.b.b(new r2(this, 1, i));
        this.e = e4m.b.b(new r2(this, 0, i));
        r2 r2Var = new r2(this, 4, i);
        this.f = r2Var;
        this.f8085g = e4m.b.b(r2Var);
        this.f8086h = e4m.b.b(this.f);
        this.i = e4m.b.b(new r2(this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
