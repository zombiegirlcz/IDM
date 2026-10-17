package euh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlowContract$InputData;
import ea2.p;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreeningFlowContract$InputData f129582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f129583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f129584c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f129585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f129586h;

    public e(d dVar, ScreeningFlowContract$InputData screeningFlowContract$InputData) {
        this.f129583b = dVar;
        this.f129582a = screeningFlowContract$InputData;
        int i = 11;
        this.d = e4m.b.b(new p(dVar, this, 1, i));
        this.e = e4m.b.b(new p(dVar, this, 2, i));
        this.f = e4m.b.b(new p(dVar, this, 3, i));
        this.f129585g = e4m.b.b(new p(dVar, this, 0, i));
        this.f129586h = e4m.b.b(new p(dVar, this, 4, i));
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
