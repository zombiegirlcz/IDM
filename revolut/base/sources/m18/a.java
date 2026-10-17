package m18;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$InputData;
import java.util.Set;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f201251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AllInsightsScreenContract$InputData f201252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f201253c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201255h;

    public a(e eVar, AllInsightsScreenContract$InputData allInsightsScreenContract$InputData, s1 s1Var) {
        this.f201253c = eVar;
        this.f201251a = s1Var;
        this.f201252b = allInsightsScreenContract$InputData;
        int i = 1;
        this.d = e4m.b.b(new lzk.b(eVar, this, 0, i));
        this.e = e4m.b.b(new lzk.b(eVar, this, 1, i));
        this.f = e4m.b.b(new lzk.b(eVar, this, 3, i));
        this.f201254g = e4m.b.b(new lzk.b(eVar, this, 4, i));
        this.f201255h = e4m.b.b(new lzk.b(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((yji.n) hVar, (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f201253c.i).d();
        s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f201251a, (aah.h) this.d.get()));
    }
}
