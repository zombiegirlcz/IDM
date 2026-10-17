package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsControllerContract$InputData;
import java.util.Set;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f191253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentNewsControllerContract$InputData f191254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final puk.d f191255c;
    public final c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f191256g;

    public a(c cVar, InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData, s1 s1Var, puk.d dVar) {
        this.d = cVar;
        this.f191253a = s1Var;
        this.f191254b = instrumentNewsControllerContract$InputData;
        this.f191255c = dVar;
        int i = 16;
        this.e = e4m.b.b(new kr9.m(cVar, this, 0, i));
        this.f = e4m.b.b(new kr9.m(cVar, this, 2, i));
        this.f191256g = e4m.b.b(new kr9.m(cVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.d.f191264j).d();
        s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f191253a, (aah.h) this.e.get()));
    }
}
