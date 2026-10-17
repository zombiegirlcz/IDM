package h9h;

import aah.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f150287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentsCollectionControllerContract$InputData f150288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f150289c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f150290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f150291h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f150292j;

    public b(a aVar, ViewController viewController, InstrumentsCollectionControllerContract$InputData instrumentsCollectionControllerContract$InputData, s1 s1Var) {
        this.f150289c = aVar;
        this.f150287a = s1Var;
        this.f150288b = instrumentsCollectionControllerContract$InputData;
        this.d = e4m.b.b(new h08.e(aVar, this, 0, 17));
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 17;
        this.f = e4m.b.b(new h08.e(aVar, this, 3, i));
        this.f150290g = e4m.b.b(new h08.e(aVar, this, 2, i));
        this.f150291h = e4m.b.b(new h08.e(aVar, this, 1, i));
        this.i = e4m.b.b(new h08.e(aVar, this, 5, i));
        this.f150292j = e4m.b.b(new h08.e(aVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        i iVarD = ((u8h.b) this.f150289c.C).d();
        s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, this.f150287a, (aah.h) this.d.get()), (yji.d) this.f150291h.get());
    }
}
